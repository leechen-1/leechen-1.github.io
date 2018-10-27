package com.abc.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.abc.beans.Student;

public interface IStudentDao {
	// 1. 注解的首字母是大写的。因为注解是Java中类层级的成员之一。类层级成员：类、接口、枚举，及注解。
	// 2. 对于数组类型的属性赋值，使用{元素,元素,……}形式
	// 3. 若数组类型属性只有一个元素值，那么，{}可以省略
	// 4. 若一个注解只使用到了一个属性，且为value属性，那么这个属性名value可以省略
	
	@Insert(value={"insert into student(name,age,score) values(#{name}, #{age}, #{score})"})
	void insertStudent(Student student);
	
	@Insert(value={"insert into student(name,age,score) values(#{name}, #{age}, #{score})"})
	@SelectKey(statement="select last_insert_id()", keyProperty="id", before=false, resultType=int.class)
	void insertStudentCatcheId(Student student);
	
	@Delete("delete from student where id=#{xxx}")
	void deleteById(int id);
	
	@Update("update student set name=#{name}, age=#{age}, score=#{score} where id=#{id}")
	void updateStudent(Student student);
	
	@Select("select id,name,age,score from student where id=#{ooo}")
	Student selectStudentById(int id);
}



