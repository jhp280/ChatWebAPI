package chat.webapi.demo.model;

public class Message {
	private String fromOrigin;
	private String toDestination;
	private String message;
	private String sendType;
	private String msgType;
	private String time;
	
	public Message(String fromOrigin,String toDestination,String message,String sendType,String msgType,String time){
		this.setFromOrigin(fromOrigin);
		this.setToDestination(toDestination);
		this.setMessage(message);
		this.setSendType(sendType);
	}

	public String getToDestination() {
		return toDestination;
	}

	public void setToDestination(String toDestination) {
		this.toDestination = toDestination;
	}

	public String getFromOrigin() {
		return fromOrigin;
	}

	public void setFromOrigin(String fromOrigin) {
		this.fromOrigin = fromOrigin;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
