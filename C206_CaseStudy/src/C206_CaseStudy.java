import java.util.ArrayList;

public class C206_CaseStudy {
	private static final String theOtherFormat = "%-10d %-30s %-10d %-10s %-20s\n";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Request> requestList = new ArrayList<Request>();


		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Package> packageList = new ArrayList<Package>();
		ArrayList<userAccount> userAccountList = new ArrayList<userAccount>();


		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
		
		Request request01 = new Request("RE0001", "HDB", 500, "RequestName01", 99999999, "no@thisisnotanemail.con", 50000, "31-FEBRUARY-2021", "Whole House", 3, 2, "Gangnam Style", true);
		Request request02 = new Request("RE0002", "Landed Property", 1000, "RequestName02", 88888888, "yes@thisisan.email", 99999, "31-SEPTEMBER-9999", "1 Bedroom", 1, 0, "Future Style", false);
		Request request03 = new Request("RE0003", "Condominium", 750, "RequestName03", 11111111, "maybe@thiscouldbean.email", 1, "1-JANUARY-0000", "1 Toilet", 0, 1, "Beyond of Style", true);
		
		Package package01 = new Package("PA0001", "This package packages packages into a package.", "21-January-2021", "29-January-2021", 2);
		Package package02 = new Package("PA0002", "This package packages packages into a package.", "30-December-9999", "31-December-9999", 2);
		Package package03 = new Package("PA0003", "This package packages packages into a package.", "21-January-2020", "29-January-2020", 2);
		
		userAccount userAccount01 = new userAccount("Li Ningxin", "Admin", "xxxxxx@rp.edu.sg", "thisisapassword", "New");
		userAccount userAccount02 = new userAccount("Muhammad Zaki", "Admin", "yyyyyy@rp.edu.sg", "thisisapassword", "New");
		userAccount userAccount03 = new userAccount("Syahid Tsaqif", "Designer", "zzzzzz@rp.edu.sg", "thisisapassword", "New");
		userAccount userAccount04 = new userAccount("Erya Syarafina", "Admin", "aaaaaa@rp.edu.sg", "thisisapassword", "New");

		Customer customer01 = new Customer(0001, "Din Tai Fung", 98888888, "dtf@uhh.com", "New");
		Customer customer02 = new Customer(0002, "East Coast Plan", 89999999, "wardrobe@tri.vago", "New");
		Customer customer03 = new Customer(0003, "Cockles of Heart", 10000000, "yes@okay.uhhuh", "New");

		Appointment appointment01 = new Appointment("28-February-2021", "11:00AM", "Block 229 Roxley Road", "AP0001");
		Appointment appointment02 = new Appointment("31-December-9999", "11:59PM", "Block 229 Roxley Road", "AP0002");
		Appointment appointment03 = new Appointment("1-January-2000", "11:60PM", "Block 229 Roxley Road", "AP0003");
		;

		requestList.add(request01);
		requestList.add(request02);

		requestList.add(request03);

		customerList.add(customer01);
		customerList.add(customer02);
		customerList.add(customer03);

		packageList.add(package01);
		packageList.add(package02);
		packageList.add(package03);

		userAccountList.add(userAccount01);
		userAccountList.add(userAccount02);
		userAccountList.add(userAccount03);
		userAccountList.add(userAccount04);

		appointmentList.add(appointment01);
		appointmentList.add(appointment02);
		appointmentList.add(appointment03);


		int option = 0;

		while (option != 4) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {

			} else if (option == 2) {
				C206_CaseStudy.showMenuCustomer();
				int customerMenu = Helper.readInt("Enter an option which suits your needs: ");

				if (customerMenu == 1) {
					// Register Customer
					Customer cus = inputCust();
					C206_CaseStudy.addCust(customerList, cus);
				} else if (customerMenu == 2) {
					//Request for Quotation
					Request r = requestQuotation();
					C206_CaseStudy.addQuotation(requestList, r);
					
				} else if (customerMenu == 3) {
					//Manage Appointment
					
				} else {
					System.out.println("Invalid option");
				}
			} else if (option == 3) {
				C206_CaseStudy.showMenuAD();
				int adMenu = Helper.readInt("Enter an option which suit your needs: ");

				if (adMenu == 1) {
					System.out.println("1. Add Customer");
					System.out.println("2. View all Customer");
					System.out.println("3. Delete Customer");
					// System.out.println("4. Search customer by name");
					int choices = Helper.readInt("Enter an option > ");
					if (choices == 1) {
						Customer CU = inputCust();
						C206_CaseStudy.addCust(customerList, CU);

					} else if (choices == 2) {
						System.out.println("View all Customer");
						C206_CaseStudy.retrieveAllCustomer(customerList);

					} else if (choices == 3) {
						System.out.println("Delete Customer");
						int cID = Helper.readInt("Enter customer ID > ");
						boolean isFound = false;

						for (int i = 0; i < customerList.size(); i++) {
							if (cID == customerList.get(i).getCustomerID()) {
								System.out.println(customerList.get(i).getCustomerName() + "deleted ! ");

								customerList.remove(i);
								isFound = true;
							}

						}
						if (isFound == false) {
							System.out.println("The customer ID entered does not exist");
						} else {
							System.out.println("Invalid option");
						}
					}
				} else if (adMenu == 2) {
					System.out.println("1. Add package");
					System.out.println("2. Delete package");
					int manageOption = Helper.readInt("Enter option > ");

					if (manageOption == 1) {
						String packageCode = Helper.readString("Enter package code > ");
						String packageDescription = Helper.readString("Enter package description > ");
						String packageStartDate = Helper.readString("Enter package start date > ");
						String packageEndDate = Helper.readString("Enter package end date > ");
						int packageAmount = Helper.readInt("Enter package amount > ");
						Package packagetoAdd = new Package(packageCode, packageDescription, packageStartDate, packageEndDate, packageAmount);
						packageList.add(packagetoAdd);
						System.out.println("We've added your package for you!");

					} else if (manageOption == 2) {
						String deletePackage = Helper.readString("Enter package code to delete package  > ");
						boolean packageFound = false;

						for (int i = 0; i < packageList.size(); i++) {
							if (deletePackage.equals(packageList.get(i).getPackageCode())) {
								System.out.println("Package Deleted");
								packageList.remove(i);
								packageFound = true;
							}
						}
						if (packageFound == false) {
							System.out.println("Invalid package code");
						} else {
						System.out.println("Invalid Option");
						}
					}
				} else if (adMenu == 3) {
					System.out.println("adMenu3");
				} else if (adMenu == 4) {
					System.out.println("adMenu4");
				} else if (adMenu == 5) {
					System.out.println("adMenu5");
					System.out.println("adMenu5");
				} else {
					System.out.println("Invalid option!");
				}
				
			} else if (option == 4) {
				System.out.println("Thank you for using RENOVATION ACE!");
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
		System.out.println("2. Add Quotation");
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

	// ===========Register Customer(CustomerMenu)==========
	public static Customer inputCust() {
		int customerID = Helper.readInt("Enter customer ID: ");
		String customerName = Helper.readString("Enter your name: ");
		int contactNumber = Helper.readInt("Enter your contact number: ");
		String emailAddress = Helper.readString("Enter your email address: ");
		String customerStatus = "New";

		Customer cus = new Customer(customerID, customerName, contactNumber, emailAddress, customerStatus);
		return cus;
	}

	public static void addCust(ArrayList<Customer> customerList, Customer cus) {
		customerList.add(cus);
		System.out.println("Customer added!");
	}
	//===========Register Customer(CustomerMenu)============

	// ==========Requesting for Quotation(CustomerMenu)========
	public static Request requestQuotation() {
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

		boolean isUrgent = Helper.readBoolean("Do you need it done within three months?");
		
		Request r = new Request(quotationID, propertyType, areaSize, requestName, contactNo, emailAddress, budgetAmount,
				targetCompletionDate, renovationType, roomRenovationAmount, toiletRenovationAmount, renovationString,
				isUrgent);
		return r;
	}

	public static void addQuotation(ArrayList<Request> requestList, Request r) {
		requestList.add(r);
		System.out.println("New quotation added!");
	}
	// ==========Requesting for Quotation(CustomerMenu)========

	public static void retrieveAllCustomer(ArrayList<Customer> customerList) {
		String output = "";
		for (int i = 0; i < customerList.size(); i++) {
			output += String.format("%-84s\n", customerList.get(i).toString());
		}
		System.out.println(output);

	}

	public static void viewAllCustomer(ArrayList<Customer> customerList) {
		C206_CaseStudy.setHeader("CUSTOMER LIST");
		String output = String.format(theOtherFormat, "ID", "NAME", "NUMBER", "EMAIL", "STATUS");
		output += retrieveAllCustomer(customerList);
		System.out.println(output);

	}
}