package Assignment_1;

public class Department {
	private static byte departmentId;
	private String departmentName;
	public static byte getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(byte departmentId) {
		Department.departmentId = departmentId;
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
		Department.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
}
