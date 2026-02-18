package com.techouts.SpringJdbcConnectivity.repository;

import com.techouts.SpringJdbcConnectivity.modal.Student;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.jdbc.core.JdbcOperationsExtensionsKt.query;

@Repository("studentRepository")
public class StudentRepository {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql= "insert into students(rollNo, name, marks)values(?,?,?)";
       int row = jdbc.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(row+" affected");
    }

    public List<Student> findAll() {

        String sql = "select * from student";
        RowMapper<Student> r = new RowMapper<>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRollNo(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setMarks(rs.getInt(3));
                return s;
            }
        };

        return jdbc.query(sql,r);


    }
}
