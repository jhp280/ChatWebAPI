package chat.webapi.demo.model;

public class ResponseData {
	private String Code;
	private String Message;
	
	public ResponseData(String code,String msg){
		this.Code=code;
		this.Message=msg;
	}
	
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
}
