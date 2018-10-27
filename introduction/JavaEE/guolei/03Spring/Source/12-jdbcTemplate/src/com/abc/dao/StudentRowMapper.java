package com.abc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.abc.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {
	// 该方法的功能是：将查询结果集中的一行记录数据转换为指定的对象。该方法是由框架自动调用执行的。
	// 当查询出总的结果集后，框架会自动遍历这个总的结果集。每遍历一行记录，就会调用一次这个方法。
	// 也就是说，只要调用该方法了，就说明当前的结果集中还有数据。
	// rs：并非是查询出的总的结果集，而是这个总的结果集中的一行记录。
	// rowNum：当前遍历行在查询出的总结果集的索引
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}

}
