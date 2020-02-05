package Case_Study_Stream_Api;

public class Department {
	private String departName;
	private Integer managerId;
    private Integer departmentId;
	public Department(String departName, Integer managerId, Integer departmentId) {
		super();
		this.departName = departName;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}
	public String getDepartName()
	{
		return departName;
	}
	public Integer getManagerId()
	{
		return managerId;
	}
	public Integer getDepartmentId()
	{
		return departmentId;
	}
	


}
