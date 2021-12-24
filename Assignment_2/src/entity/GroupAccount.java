package entity;

public class GroupAccount {
	private Group groupId;
	private Account accountId;
	private String joinDate;
	
	public GroupAccount(Group groupId, Account accountId, String joinDate) {
		super();
		this.groupId = groupId;
		this.accountId = accountId;
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "GroupAccount [groupId=" + groupId + ", accountId=" + accountId + ", joinDate=" + joinDate + "]";
	}
	public Group getGroupId() {
		return groupId;
	}
	public void setGroupId(Group groupId) {
		this.groupId = groupId;
	}
	public Account getAccountId() {
		return accountId;
	}
	public void setAccountId(Account accountId) {
		this.accountId = accountId;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
}
