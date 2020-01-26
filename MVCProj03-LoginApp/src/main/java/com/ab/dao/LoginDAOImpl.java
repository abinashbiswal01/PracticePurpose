package com.ab.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ab.bo.LoginBO;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
private static final String MVC_Login="SELECT COUNT(*) FROM MVC_LOGIN WHERE USERNAME=? AND PASSWORD=?";

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int validate(LoginBO bo) {
		int result=0;
		
		result=jt.queryForObject(MVC_Login, Integer.class, bo.getUserName(),bo.getPassword());
				
		return result;
	}

}
