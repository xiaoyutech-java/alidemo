mybatis错误： Invalid bound statement (not found) 有感

@MapperScan 会导致@Mapper注解失效，即无需配置@Mapper，即使配置了也没用
如果没有@MapperScan ，使用@Mapper即可

如果是分开设置@MapperScan的话，可以设置多个，记得加上@Configuration
Application里添加@MapperScan不会覆盖掉其他class里的@MapperScan，相当于单独的class


mybatis.mapper-locations=classpath*:mapper/*Mapper.xml 用于查找对应的 mapper xml文件
如果是有子文件夹，需使用mybatis.mapper-locations=classpath*:mapper/**/*Mapper.xml
