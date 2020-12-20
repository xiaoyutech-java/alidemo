package com.xiaoyu.alidemo.comparison.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 具有表A和表B，表列字段名不一样，但具有映射关系
 * #多表连接查询语法(重点)
 * SELECT 字段列表
 * FROM 表1  INNER|LEFT|RIGHT JOIN  表2
 * ON 表1.字段 = 表2.字段;
 * 内连接查询与多表联合查询的效果是一样的
 */
public class ComparisonService {


    /**
     * 联表查询，查出交集
     */
    public void getIntersection(String srcEqual, String targetEqual) {
        String sql = "select table_A.*,table_B.* from table_A ,table_B where " + srcEqual + "=" + targetEqual + " and ";
        HashMap map = getColumnMap();
        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            sql = sql + entry.getKey() + "!=" + entry.getValue();
            sql = sql + " or ";
        }
        System.out.println(sql);
        // 执行sql，得出结果
    }

    private HashMap getColumnMap() {
        HashMap map = new HashMap<String, String>();
        map.put("Table_A.A1", "Table_B.B1");
        map.put("Table_A.A2", "Table_B.B2");
        map.put("Table_A.A3", "Table_B.B3");
        return map;
    }

    /*在得出的交集里做数据比对*/
    public void handleComparision() {

    }

}
