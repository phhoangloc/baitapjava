package Assignment_1;

public class Account {
	private byte accountId;
	private String email;
	private String userName;
	private String fullName;
	private Department derpartmentId;
	private Position positionId;
	private String creatDate;
	
	public Account(byte accountId, String email, String userName, String fullName, Department derpartmentId, Position positionId,
			String creatDate) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.derpartmentId = derpartmentId;
		this.positionId = positionId;
		this.creatDate = creatDate;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", derpartmentId=" + derpartmentId + ", positionId=" + positionId + ", creatDate="
				+ creatDate + "]";
	}
	public byte getAccountId() {
		return accountId;
	}
	public void setAccountId(byte accountId) {
		this.accountId = accountId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Department getDerpartmentId() {
		return derpartmentId;
	}
	public void setDerpartmentId(Department derpartmentId) {
		this.derpartmentId = derpartmentId;
	}
	public Position getPositionId() {
		return positionId;
	}
	public void setPositionId(Position positionId) {
		this.positionId = positionId;
	}
	public String getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}
	
}
