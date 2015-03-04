package com.java1234.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java1234.model.PageBean;

public class UserDao {

	public ResultSet userList(Connection con,PageBean pageBean)throws Exception{
		String sql="select * from t_user limit ?,?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, pageBean.getStart());
		pstmt.setInt(2, pageBean.getRows());
		return pstmt.executeQuery();
	}
	
	public int userCount(Connection con)throws Exception{
		String sql="select count(*) as total from t_user";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			return rs.getInt("total");
		}else{
			return 0;
		}
	}
}
