package com.secure.rahul;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentJDBCTemplate implements StudentDAO {

	private DataSource dataSource;
	private SimpleJdbcCall jdbccall;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbccall = new SimpleJdbcCall(dataSource).withProcedureName("getRecordById");
	}

	@Override
	public void create(String name, Integer age) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		String SQL = "insert into student(name,age) values(?,?)";
		jdbcTemplate.update(SQL, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);
		return;
	}

	@Override
	public Student getStudent(Integer id) {
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> out = jdbccall.execute(in);
		Student student = new Student();
		student.setId(id);
		student.setName((String) out.get("out_name"));
		student.setAge((Integer) out.get("out_age"));
		return student;
	}

	@Override
	public List<Student> listStudents() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());
		return students;
	}

}
