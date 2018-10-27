
	EHCache二级查询缓存：
	
	1. EHCache二级缓存的开启方式分为两步
		1）导入两个Jar包：ehcache核心Jar包与mybytis与ehcache整合的Jar包
		2）在映射文件中添加<cache type="org.mybatis.caches.ehcache.EhcacheCache"/>标签
		
		
	2. 二级缓存的关闭分为两类
		1）全局性关闭
			当前应用中所有的查询均不能使用二级缓存。
		2）局部性关闭
			可以指定某一个查询不使用二级缓存。在该查询对应的<select/>标签中添加useCache="false"属性，即可关闭
			当前的select的二级缓存。但并不影响其它select语句使用二级缓存。
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	