主配置文件
	
	1）<transactionManager type="JDBC" />
		该标签用于指定事务管理器。type的取值有两个：
		JDBC：使用JDBC事务管理器
		MANAGED：使用第三方事务管理器，例如使用Spring的事务管理器
	2）<dataSource type="POOLED">
		该标签用于指定数据源类型。type的取值有三个：
		POOLED：使用连接池技术（默认使用的是Mybatis内置连接池）
		UNPOOLED：不使用连接池技术
		JNDI：Java Naming-Directory Interface，Java命名与目录接口，这是一个容器。