
public class Customer {
	private String customerID;
	private String customerName;
	private int contactNumber;
	private String emailAddress;
	private String customerStatus;
	
	public Customer (String customerID, String customerName, int contactNumber, String emailAddress, String customerStatus)
	{
		this.customerID = customerID;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
		this.customerStatus = "New";
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	public int getContactNumber()
	{
		return contactNumber;
	}
	
	public String getemailAddress()
	{
		return emailAddress;
	}
	
	public String getCustomerStatus()
	{
		return customerStatus;
	}
	
	public void setCustomerStatus(String newCustomerStatus)
	{
		this.customerStatus = newCustomerStatus;
	}
	///

}
