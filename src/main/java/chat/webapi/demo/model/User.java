package chat.webapi.demo.model;

public class User {
	private String ID;
	private String PassWord;
	
	
	public User(String ID,String PassWord) {
		this.ID=ID;
		this.PassWord=PassWord;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}


}
