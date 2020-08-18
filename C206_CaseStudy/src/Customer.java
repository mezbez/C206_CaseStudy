
public class Customer {
	private int customerID;
	private String customerName;
	private int contactNumber;
	private String emailAddress;
	private String customerStatus;

	public Customer(int customerID, String customerName, int contactNumber, String emailAddress,
			String customerStatus) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
		this.customerStatus = "New";
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public String getemailAddress() {
		return emailAddress;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String newCustomerStatus) {
		this.customerStatus = newCustomerStatus;
	}

	public void display() {
		System.out.println("Customer ID: " + customerID);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Contact number: " + contactNumber);
		System.out.println("Email Address: " + emailAddress);
		System.out.println("Customer status: " + customerStatus);
	}

}
