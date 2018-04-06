package authenticationServer;

import java.io.IOException;
import java.util.Date;

public class AuthenticationToken {

	private String userType;
	private Integer tokenID;
	private Integer SessionID;
	private static Integer count = 0;
	
	public AuthenticationToken(String userType) {
		this.userType = userType;
		this.tokenID = getNextTokenID(); //sets it, then it will increment it by 1 for the next unique token ID 
		this.SessionID = (int) new Date().getTime();
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Integer getTokenID() {
		return tokenID;
	}
	public void setTokenID(Integer tokenID) {
		this.tokenID = tokenID;
	}
	public Integer getSessionID() {
		return SessionID;
	}
	public void setSessionID(Integer sessionID) {
		SessionID = sessionID;
	}
	
	private static Integer getNextTokenID(){
		count++;
		return count;
	}
	
}
