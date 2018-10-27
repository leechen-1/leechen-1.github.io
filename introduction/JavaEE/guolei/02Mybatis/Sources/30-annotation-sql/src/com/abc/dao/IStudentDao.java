package com.abc.dao;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.abc.beans.Student;

public interface IStudentDao {
	
	@SelectProvider(type=MySqlProvider.class, method="getSelectSql")
	List<Student> selectAllStudents();
	
	@SelectProvider(type=MySqlProvider.class, method="getSelectSql2")
	Student selectStudentById(int id);
	
	@SelectProvider(type=MySqlProvider.class, method="getSelectSql3")
	List<Student> selectStudentByCondition(Student student);
	
	@SelectProvider(type=MySqlProvider.class, method="getSelectSql4")
	List<Student> selectStudentByCondition2(@Param("ccname") String cname, @Param("ccage") int cage, @Param("ccscore") double cscore);
	
	@InsertProvider(type=MySqlProvider.class, method="getInsertSql")
	void insertStudent(Student student);
	
	@InsertProvider(type=MySqlProvider.class, method="getInsertSql")
	@SelectKey(statement="select last_insert_id()", keyProperty="id", before=false, resultType=int.class)
	void insertStudentCatcheId(Student student);
	
	@DeleteProvider(type=MySqlProvider.class, method="getDeleteSql")
	void deleteById(int id);
	
	@UpdateProvider(type=MySqlProvider.class, method="getUpdateSql")
	void updateStudent(Student student);
	
	@UpdateProvider(type=MySqlProvider.class, method="getUpdateSql2")
	void updateStudent2(Student student);
	
	@UpdateProvider(type=MySqlProvider.class, method="getUpdateSql3")
	void updateStudent3(Student student);
}



