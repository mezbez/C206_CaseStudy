
public class userAccount {
	private String staffName;
	private String staffRole;
	private String emailAddress;
	private String staffPassword;
	private String staffStatus;
	
	public userAccount (String staffName, String staffRole, String emailAddress, String staffPassword, String staffStatus)
	{
		this.staffName = staffName;
		this.staffRole = staffRole;
		this.emailAddress = emailAddress;
		this.staffPassword = staffPassword;
		this.staffStatus = "New";
	}
	
	public String getStaffName()
	{
		return staffName;
	}
	
	public String getStaffRole()
	{
		return staffRole;
	}
	
	public String getemailAddress()
	{
		return emailAddress;
	}
	
	public String getStaffPassword()
	{
		return staffPassword;
	}
	
	public String getStaffStatus()
	{
		return staffStatus;
	}
	
	public void setStaffStatus(String newStaffStatus)
	{
		this.staffStatus = newStaffStatus;
	}
	///

}
