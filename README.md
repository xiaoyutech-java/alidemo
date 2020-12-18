```
mybatis错误： Invalid bound statement (not found) 有感

@MapperScan 会导致@Mapper注解失效，即无需配置@Mapper，即使配置了也没用
如果没有@MapperScan ，使用@Mapper即可

如果是分开设置@MapperScan的话，可以设置多个，记得加上@Configuration
Application里添加@MapperScan不会覆盖掉其他class里的@MapperScan，相当于单独的class


mybatis.mapper-locations=classpath*:mapper/*Mapper.xml 用于查找对应的 mapper xml文件
如果是有子文件夹，需使用mybatis.mapper-locations=classpath*:mapper/**/*Mapper.xml


子模块中 用@PropertySource(“classpath:application.properties”)注解主动去加载application.properties,不过是在mybatis加载后才加载的，这里只是当做普通变量加载。

在Properties文件中，分隔符有两种存在方式：“=”（等于号）、“:”（英文冒号）
在Properties文件中，第一次出现的字符即为分割符，往后出现不需要转义


对于自定义数据源，java代码里配置的sessionFactory.setMapperLocations，会导致mybatis.mapper-locations失效，

多模块数据源配置，如果使用new PathMatchingResourcePatternResolver().getResources("classpath:mapper/**/*Mapper.xml")) 将会出现其他模块的mapper.xml找不见
原因是解析出来的是按加载顺序产生的mapper路径，与pom里依赖模块的顺序有关。 需要在失败的那个模块改成classpath*:mapper/**/*Mapper.xml

@Reource（默认按名称装配，当找不到与名称匹配的bean才会按类型装配） 
@Autowired（默认按类型装配，如果我们想使用按名称装配，可以结合@Qualifier注解一起使用）
```
