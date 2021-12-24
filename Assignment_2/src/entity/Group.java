package entity;

public class Group {
	private byte groupId;
	private String roupName;
	private Account accountId;
	private String createDate;
	private Account[] account;
	public Group(byte groupId, String roupName, Account accountId, String createDate) {
		super();
		this.groupId = groupId;
		this.roupName = roupName;
		this.accountId = accountId;
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", roupName=" + roupName + ", accountId=" + accountId + ", createDate="
				+ createDate + "]";
	}
	public byte getGroupId() {
		return groupId;
	}
	public void setGroupId(byte groupId) {
		this.groupId = groupId;
	}
	public String getRoupName() {
		return roupName;
	}
	public void setRoupName(String roupName) {
		this.roupName = roupName;
	}
	public Account getAccountId() {
		return accountId;
	}
	public void setAccountId(Account accountId) {
		this.accountId = accountId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public Account[] getAccount() {
		return account;
	}
	public void setAccount(Account[] acc) {
		this.account = acc;
	}
}
