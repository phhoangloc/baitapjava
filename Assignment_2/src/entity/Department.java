package entity;

public class Department {
	private byte departmentId;
	private String departmentName;
	
	public byte getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(byte departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	public Department(byte departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
}
