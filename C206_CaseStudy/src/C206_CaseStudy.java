import java.util.ArrayList;

public class C206_CaseStudy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Request> requestList = new ArrayList<Request>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		
		Request request01 = new Request("HDB", 500, "How to Build an Atomic Bomb", 99999999, "no@thisisnotanemail.con", 50000, "31-FEBRUARY-2021", "Whole House", 3, 2, "Gangnam Style", true);
		Request request02 = new Request("Landed Property", 1000, "How to go to the toilet", 88888888, "yes@thisisan.email", 99999, "31-SEPTEMBER-9999", "1 Bedroom", 3, 2, "Future Style", false);
		
		requestList.add(request01);
		requestList.add(request02);
		
		int option = 0;

		while (option != 4) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				
			} else if (option == 2) {
				C206_CaseStudy.showMenuCustomer();
				int customerMenu = Helper.readInt("Enter an option which suits your needs: ");

				if (customerMenu == 1) {
					//Register Customer
					Customer cus = inputCustomer();
					C206_CaseStudy.addCustomer(customerList, cus);
				} else if (customerMenu == 2) {
					System.out.println("customerMenu1");
				} else if (customerMenu == 3) {
					System.out.println("customerMenu2");
				} else {
					System.out.println("Invalid option");
				}
			} else if (option == 3) {
				C206_CaseStudy.showMenuAD();
				int adMenu = Helper.readInt("Enter an option which suit your needs: ");

				if (adMenu == 1) {
					System.out.println("adMenu1");
				} else if (adMenu == 2) {
					System.out.println("adMenu2");
				} else if (adMenu == 3) {
					System.out.println("adMenu3");
				} else if (adMenu == 4) {
					System.out.println("adMenu4");
				} else if (adMenu == 5) {
					System.out.println("adMenu5");
				} else {
					System.out.println("Invalid options");
				}

			} else if (option == 4){
				System.out.println("Thank you for using RENOVATION ACE!");
			} else {
				System.out.println("Invalid option!");
			}
		}
	}

	public static void menu() {
		C206_CaseStudy.setHeader("RENOVATION ACE APP");
		System.out.println("1. View as a Visitor");
		System.out.println("2. Login as Customer");
		System.out.println("3. Login as Admin/Designers");
		System.out.println("4. Exit");
		Helper.line(80, "-");
	}

	private static void setHeader(String header) {
		// TODO Auto-generated method stub
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static void showMenuCustomer() {
		C206_CaseStudy.setHeader("Customer");
		System.out.println("1. Register");
		System.out.println("2. Request for Quotation");
		System.out.println("3. Manage Appointment");
	}

	public static void showMenuAD() {
		C206_CaseStudy.setHeader("Customer");
		System.out.println("1. Manage Customer");
		System.out.println("2. Manage Package");
		System.out.println("3. Manage Request for Quotation");
		System.out.println("4. Manage Quotation");
		System.out.println("5. Manage Appointment");
	}
	//===========Register Customer==========
	public static Customer inputCustomer()
	{
		String customerID = Helper.readString("Enter customer ID: ");
		String customerName = Helper.readString("Enter your name: ");
		int contactNumber = Helper.readInt("Enter your contact number: ");
		String emailAddress = Helper.readString("Enter your email address: ");
		String customerStatus = "New";
		
		Customer cus = new Customer(customerID, customerName, contactNumber, emailAddress, customerStatus);
		return cus;
	}
	
	public static void addCustomer(ArrayList<Customer> customerList, Customer cus)
	{
		customerList.add(cus);
		System.out.println("Customer added!");
	}
	
	//==========Add Customer Details========
	public static Request requestQuotation()
	{
		String quotationID = Helper.readString("Enter quotation ID: ");
		String propertyType = Helper.readString("Enter property type(HDB,Private,Landed):");
		int areaSize = Helper.readInt("Enter area size: ");
		String requestName = Helper.readString("Enter request name: ");
		int contactNo = Helper.readInt("Enter Contact Number: ");
		String emailAddress = Helper.readString("Enter email Address: ");
		int budgetAmount = Helper.readInt("Enter your budget: ");
		String targetCompletionDate = Helper.readString("Enter the targeted completion date: ");
		String renovationType = Helper.readString("Enter renovation type (whole house, room, kitchen, toilet)");
		int roomRenovationAmount = Helper.readInt("Enter number of room to renovate: ");
		int toiletRenovationAmount = Helper.readInt("Enter number of toilets to renovate");
		String renovationString = Helper.readString("Enter renovation style: ");
		boolean isUrgent = false;
		
		Request r = new Request(quotationID, propertyType, areaSize, requestName, contactNo, emailAddress, budgetAmount,
				targetCompletionDate, renovationType, roomRenovationAmount, toiletRenovationAmount,renovationString, isUrgent);
		return r;
	}

	
	public static void addQuotation(ArrayList<Request> requestList, Request r)
	{
		requestList.add(r);
		System.out.println("New quotation added!");
	}
}