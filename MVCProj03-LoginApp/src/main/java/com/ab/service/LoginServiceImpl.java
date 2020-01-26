package com.ab.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.bo.LoginBO;
import com.ab.dao.LoginDAO;
import com.ab.dto.LoginDTO;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO dao;
	
	@Override
	public String authenticate(LoginDTO dto) {
		LoginBO bo=null;
		int report=0;
		
		//create LoginBO
		bo=new LoginBO();
		
		//copy dto to bo
		BeanUtils.copyProperties(dto, bo);
		
		//use dao
		report= dao.validate(bo);
		
		if(report==0)
		   return "Please check your username and password.";
		else
			return "Authentication is successful";
				   
	}

}
