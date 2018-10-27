
	API详解：
	
	0.线程安全问题出现的条件
		1）只有单例对象才可能出现线程安全问题
		2）多线程环境，即多个线程会共享这个单例对象
		3）单例对象中具有可修改的成员变量
	
	1. SqlSession接口
		SqlSession接口的实现类是org.apache.ibatis.session.defaults.DefaultSqlSession。该对象是多例的。
		
	2. SqlSessionFactory接口
		SqlSessionFactory接口的实现类是org.apache.ibatis.session.defaults.DefaultSqlSessionFactory。
		这个对象的作用就是为了创建SqlSession对象，而由于SqlSession对象是多例的，每创建一次SqlSession对象，都
		需要一个SqlSessionFacotry对象去创建。
		但SqlSessionFacotry对象是重量级组件，且DefaultSqlSessionFactory类中不存在可修改的成员变量。所以
		SqlSessionFacotry对象可以定义为单例的。其生命周期与整个应用的相同。
	
	3. SqlSessionFactoryBuilder类
		该类对象的作用仅仅就是为了创建SqlSessionFactory对象。由于SqlSessionFacotry是单例对象，一旦创建完毕，
		SqlSessionFactoryBuilder对象就可以定义为一个局部变量。SqlSessionFacotry创建完毕，就可以销毁了。