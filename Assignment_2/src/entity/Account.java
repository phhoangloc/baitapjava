package entity;

public class Account {
	private byte accountId;
	private String email;
	private String userName;
	private String fullName;
	private Department derpartment;
	private Position position;
	private String creatDate;
	private Group[] group;
	
	public Account(byte accountId, String email, String userName, String fullName, Department derpartment, Position position,
			String creatDate) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.derpartment = derpartment;
		this.position = position;
		this.creatDate = creatDate;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", derpartment=" + derpartment + ", position=" + position + ", creatDate="
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
	public String getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}
	public Group[] getGroup() {
		return group;
	}
	public void setGroup(Group[] group) {
		this.group = group;
	}
	public Department getDerpartment() {
		return derpartment;
	}
	public void setDerpartment(Department derpartment) {
		this.derpartment = derpartment;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
}
