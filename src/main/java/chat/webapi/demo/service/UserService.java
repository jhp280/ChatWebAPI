package chat.webapi.demo.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import chat.webapi.demo.model.ResponseData;
import chat.webapi.demo.model.User;
import chat.webapi.demo.model.UserDao;

@Service
public class UserService {

	private UserDao userDao;

	@Autowired
	public UserService(UserDao userDao) {
		this.userDao=userDao;
	}
	
	
	public ResponseData login(String id, String pwd) {
		 if (userDao.login(id,pwd)>0) {
			 return new ResponseData("0","登入成功");
		 }
		 return new ResponseData("1","ID不存在或密碼錯誤");
	}
	
	public ResponseData register(String id, String pwd) {
		 int result=userDao.register(id,pwd);
		 if (result==1) {
			 return new ResponseData("1","ID重複");
		 }else if(result==9) {
			 return new ResponseData("9","不明錯誤");
		 }
		 return new ResponseData("0","註冊成功");
	}

}
