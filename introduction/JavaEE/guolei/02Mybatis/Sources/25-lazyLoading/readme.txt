
     延迟加载
     1. 什么是延迟加载？
     	也称为懒加载，LazyLoading。
     	当代码中执行到查询语句时，并不是直接到DB中执行select语句进行查询，而是根据设置好的延迟策略，将查询向后推迟。这就称为延迟加载。
     	使用延迟加载可以减轻DB服务器的压力。
     	
     2. MyBatis的延迟加载
     	1）只能对关联对象进行查询时，使用延迟加载策略。对于主加载对象，均采用直接加载。
     	2）要应用延迟加载查询，只能使用多表单独查询，而不能使用多表连接查询。因为多表连接查询的本质是查询一张表，将多张表首先连接为了一张表后，再进行的查询。
     	查询一个信息，就会将所有信息全部查询到。
     	
     3. 基本概念
     	1）主加载对象
     	
     	2）关联对象
     	
     	3）主表
     	
     	4）关联表，也称为从表
     
     4. 延迟加载策略
     	延迟加载策略是指到DB中真正执行select语句进行查询的时机设置。
     	MyBatis中的延迟加载策略共分三种：
     	1）直接加载：代码中执行到查询语句，马上就到DB中执行select查询。
     	2）侵入式延迟加载：将关联对象的详情侵入到了主加载对象详情之中，作为主加载对象的详情的一部分出现。当要访问主加载对象的详情时，需要将主加载对象所有详情进行查询，
     	     但由于关联对象详情作为主加载对象详情的一部分出现了，所以，这个查询不仅会查询主表，还会查询关联表。
     	3）深度延迟加载：当需要访问主加载对象详情时，只会查询主表，而不会查询关联表。只有当真正访问关联对象详情时，才会查询关联表。
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	