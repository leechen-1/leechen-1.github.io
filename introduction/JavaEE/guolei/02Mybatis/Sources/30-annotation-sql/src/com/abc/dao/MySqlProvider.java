package com.abc.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.ibatis.jdbc.SQL;

import com.abc.beans.Student;

public class MySqlProvider {
	
	public String getSelectSql() {
		return "select id,name,age,score from student";
	}
	
	public String getSelectSql2() {
		return "select id,name,age,score from student where id=#{ooo}";
	}
	
	public String getSelectSql3(Student student) {
		
		StringBuffer sql = new StringBuffer(); 
		
		sql.append("select id,name,age,score from student where 1=1");
		if(student.getName() != null && !student.getName().equals("")) {
			sql.append(" and name like '%' #{name} '%'");
		}
		if(student.getAge() > 0) {
			sql.append(" and age > #{age}");
		}
		if(student.getScore() > 0) {
			sql.append(" and score < #{score}");
		}
		
		return sql.toString();
	}
	
	public String getSelectSql4() {
		return  "select id,name,age,score from student where name like '%' #{ccname} '%' and age > #{ccage} and score < #{ccscore}";
	}
	
	public String getInsertSql() {
		return  "insert into student(name,age,score) values(#{name}, #{age}, #{score})";
	}
	
	public String getDeleteSql() {
		return  "delete from student where id=#{xxx}";
	}
	
	public String getUpdateSql() {
		return  "update student set name=#{name},age=#{age},score=#{score} where id=#{id}";
	}
	
	public String getUpdateSql2(Student student) {
		StringBuffer sql = new StringBuffer();
		sql.append("update student set id=#{id}");
		
		if(student.getName() != null && !student.getName().equals("")) {
			sql.append(",name=#{name}");
		}
		
		if(student.getAge() > 0) {
			sql.append(",age=#{age}");
		}
		
		if(student.getScore() > 0) {
			sql.append(",score=#{score}");
		}
		
		sql.append(" where id=#{id}");
		return  sql.toString();
	}
	
	public String getUpdateSql3(Student student) {
		// new SQL(){} 表示创建一个SQL类的子类对象，只不过这个子类叫什么名称不知道，没有指定。
		// 所以，这种写法是匿名内部类的写法。
		return  new SQL(){
			
			// 下面的代码在何时会被执行？
			// 当当前类（SQL类的子类）的无参构造器被调用时，会自动执行这段{}代码。
			// 在类中的{}称为实例代码块
			{
				this.UPDATE("student");
				this.SET("id=#{id}");
				if(student.getName() != null && !student.getName().equals("")) {
					this.SET("name=#{name}");
				}
				
				if(student.getAge() > 0) {
					this.SET("age=#{age}");
				}
				
				if(student.getScore() > 0) {
					this.SET("score=#{score}");
				}
				
				this.WHERE("id=#{id}");
			}
		}.toString();
		
	}
	
	
	
	
	
	
	
	
	
}
