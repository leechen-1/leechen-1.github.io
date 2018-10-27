
   1、什么框架？
   	百度百科：框架（Framework）是整个或部分系统的可重用设计，表现为一组抽象构件及构件实例间交互的方法;另一种定义认为，框架是可被应用开发者定制的应用骨架。
   	对于程序员来说，框架是一套资源，一套解决某一类问题所使用的资源。这套资源中包含：Jar包、文档、源码、示例等内容，或其中部分内容。
   
   2、什么MyBatis框架？
   	MyBatis框架的前身是Apache的一个项目，名称为iBaits。2010年，该项目迁移到了Google，更名为MyBatis。2013年，项目又交由GitHub托管。
   	我们要下载这个框架从GitHub官网下载    https://github.com/mybatis/mybatis-3/releases
   	
   	mybatis-3.4.2.jar  MyBatis的核心Jar包
   	lib                MyBatis核心Jar包所依赖的Jar包
   	mybatis-3.4.2.pdf  MyBatis官方帮助文档
   
   3、MyBatis框架的作用
   	 MyBatis在三层架构中处于Dao层，用于访问数据库。其作用类似于JDBC。
   
   4、MyBatis框架的系统结构
   	（对系统结构图的分析）
   
   5、MyBatis框架的运行原理
   	API：Application Programming Interface，应用程序接口
   	ORM：Object Ralationship Mapping，对象关系映射
   	MyBatis是一种ORM框架，是半自动ORM。MyBatis底层封装了JDBC，
   	Hibernate也是一种ORM框架，是全自动ORM。
   
   6、第一个MyBatis程序
          功能：将一个学生信息写入到DB
	1）导入Jar包
		* MyBatis的Jar包
		* MySql驱动Jar包
		
	2）定义一个Student类
		id，name，age，score	
		* 主键id要定义为包装类型，不要定义为基本数据类型，例如，不要定义为int，而要定义为Integer
		* 若显式地给出了带参构造器，则要显式地给出无参构造器。
			-- 若当前实体类有可能作父类，那么要创建子类对象时，JVM会调用其父类的无参构造器
			-- 若使用了Spring框架，那么要求由Spring容器所管理的类，必须要有无参构造器
	3）创建DB表
   		表名：student
   		字段：id,name,age,score
   		
   	4）定义Dao接口IStudentDao
	   	public interface IStudentDao {
			void insertStudent(Student student);
		}
	
	5）定义映射文件
		* 是一个XML文件，文件名随意，我们这里叫mapper.xml。
		* 该文件定义到Dao接口所在包。
		* 约束文件为mybatis-3.4.2.jar ! /org/apache/ibatis/builder/xml/mybatis-3-mapper.dtd
		
		<?xml version="1.0" encoding="UTF-8" ?>
		<!DOCTYPE mapper
		PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
		"http://mybatis.org/dtd/mybatis-3-mapper.dtd">
		<mapper>
			<insert id="insertStu" parameterType="com.abc.beans.Student">
				insert into student(name,age,score) values(#{name}, #{age}, #{score})
			</insert>
		</mapper>
		
	6）定义主配置文件
		* 是一个XML文件，文件名随意，我们这里叫mybatis.xml
		* 定义在src根下
		* 约束文件为mybatis-3.4.2.jar ! /org/apache/ibatis/builder/xml/mybatis-3-config.dtd
   	
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   