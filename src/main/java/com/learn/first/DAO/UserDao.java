package com.learn.first.DAO;

import com.learn.first.ValueObject.StudentVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao extends configurConnection implements DaoList<StudentVO> {


    @Override
    public List<StudentVO> loadAll() {
        Connection connection=null;
        StudentVO student=null;
        List<StudentVO> studentVOS=new ArrayList<>();
        ResultSet rs=null;
        PreparedStatement pst=null;
        try {
            connection=getConnection();
            String sql="SELECT * FROM USER";

            pst=connection.prepareStatement(sql);
            rs=pst.executeQuery();

            while (rs.next()){
                student=new StudentVO();
                student.setId(rs.getInt("Id"));
                student.setUserName(rs.getString("userName"));
                student.setPassword(rs.getString("password"));
                student.setFirstName(rs.getString("firstName"));

                studentVOS.add(student);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return studentVOS;
    }

    @Override
    public StudentVO getDataById(int id) {
        return null;
    }

    @Override
    public int insert(StudentVO studentVO) {
        return 0;
    }

    @Override
    public int update(StudentVO studentVO) {
        return 0;
    }

    @Override
    public int delete(StudentVO studentVO) {
        return 0;
    }
}
