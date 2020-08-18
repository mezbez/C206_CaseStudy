
public class Package {
	private String packageCode;
	private String packageDescription;
	private String packageStartDate;
	private String packageEndDate;
	private int packageAmount;

	public Package (String packageCode, String packageDescription, String packageStartDate, String packageEndDate, int packageAmount)
	{
		this.packageCode = packageCode;
		this.packageDescription = packageDescription;
		this.packageStartDate = packageStartDate;
		this.packageEndDate = packageEndDate;
		this.packageAmount = packageAmount;
	}
	
	public String getPackageCode()
	{
		return packageCode;
	}
	
	public String getPackageDescription()
	{
		return packageDescription;
	}
	
	public String getStartDate()
	{
		return packageStartDate;
	}
	
	public String getEndDate()
	{
		return packageEndDate;
	}
	
	public int getPackageAmount()
	{
		return packageAmount;
	}
}
