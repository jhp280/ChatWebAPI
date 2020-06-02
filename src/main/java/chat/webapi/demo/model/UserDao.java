package chat.webapi.demo.model;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {

	private JdbcOperations jdbcTemplate;

	@Autowired
	public UserDao(JdbcOperations jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void printUser() {
		List allUsers=jdbcTemplate.queryForList("select * from usertest");
		Iterator it = allUsers.iterator();
		while(it.hasNext()) {
		    Map userMap = (Map) it.next();
		    System.out.println(userMap.get("ID"));
		}
	}
	
	public int login(String id, String pwd) {
		int isExist = (int) this.jdbcTemplate.queryForObject(
				"select count(*) from rs_usertest where binary ID=? AND binary PASSWORD=?", new Object[] { id, pwd },
				Integer.class);
		return isExist;
	}
	
	//回傳值(0:註冊成功 1:表示ID已存在 9:資料庫執行錯誤)
	public int register(String id, String pwd) {
		//check ID 是否重複
		int isExist = (int) this.jdbcTemplate.queryForObject("select count(*) from rs_usertest where binary ID=?", new Object[] { id},
				Integer.class);
		if (isExist>0) return isExist;
		String sqlCmd="INSERT INTO rs_usertest(ID,PASSWORD) VALUES (?,?)";
		int exeResult=this.jdbcTemplate.update(sqlCmd, new Object[] {id,pwd});
	
		return exeResult>0?0:9;
	}

	
}
