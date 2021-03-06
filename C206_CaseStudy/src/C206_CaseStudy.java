import java.util.ArrayList;

public class C206_CaseStudy {
	private static final String theCustomerFormat = "%-10s %-20s %-8s %-20s %-10s\n";
	private static final String thePackageFormat = "%-6s %-60s %-20s %-20s %-5s \n";
	private static final String theAppointmentFormat = "%-6s %-20s %-20s %-60s \n";
	private static final String theRequestFormat = "%-5s %-10s %-5s %-30s %-5s %-5s %-15s %-10s %-5s %-5s %-10s \n";
	private static final String theUserAccountFormat = "%-10s %-10s %-20s %-15s %-10s \n";
	private static final String theQuotationFormat = "%-5s %-5s %-10s %-10s %-10s %-20s %-15s %-10s \n";

	public static void main(String[] args) {

		ArrayList<Request> requestList = new ArrayList<Request>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Package> packageList = new ArrayList<Package>();
		ArrayList<userAccount> userAccountList = new ArrayList<userAccount>();
		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
		ArrayList<Quotation> quotationList = new ArrayList<Quotation>();

		Request request01 = new Request("RE0001", "HDB", 500, "RequestName01", 0001, 50000, "31-FEBRUARY-2021",
				"Whole House", 3, 2, "Gangnam Style", true);
		Request request02 = new Request("RE0002", "Landed Property", 1000, "RequestName02", 0002, 99999,
				"31-SEPTEMBER-9999", "1 Bedroom", 1, 0, "Future Style", false);
		Request request03 = new Request("RE0003", "Condominium", 750, "RequestName03", 0003, 1, "1-JANUARY-0000",
				"1 Toilet", 0, 1, "Beyond of Style", true);

		Package package01 = new Package("PA0001", "This package packages packages into a package.", "21-January-2021",
				"29-January-2021", 2);
		Package package02 = new Package("PA0002", "This package packages packages into a package.", "30-December-9999",
				"31-December-9999", 2);
		Package package03 = new Package("PA0003", "This package packages packages into a package.", "21-January-2020",
				"29-January-2020", 2);

		userAccount userAccount01 = new userAccount("Li Ningxin", "Admin", "xxxxxx@rp.edu.sg", "thisisapassword",
				"New");
		userAccount userAccount02 = new userAccount("Muhammad Zaki", "Admin", "yyyyyy@rp.edu.sg", "thisisapassword",
				"New");
		userAccount userAccount03 = new userAccount("Syahid Tsaqif", "Designer", "zzzzzz@rp.edu.sg", "thisisapassword",
				"New");
		userAccount userAccount04 = new userAccount("Erya Syarafina", "Admin", "aaaaaa@rp.edu.sg", "thisisapassword",
				"New");

		Customer customer01 = new Customer(0001, "Din Tai Fung", "password", 98888888, "dtf@uhh.com", "New");
		Customer customer02 = new Customer(0002, "East Coast Plan", "password", 89999999, "wardrobe@tri.vago", "New");
		Customer customer03 = new Customer(0003, "Cockles of Heart", "password", 10000000, "yes@okay.uhhuh", "New");

		Appointment appointment01 = new Appointment("AP0001", "28-February-2021", "11:00AM", "Block 229 Roxley Road",
				"Ningxin");
		Appointment appointment02 = new Appointment("AP0002", "31-December-9999", "11:59PM", "Block 229 Roxley Road",
				"Syahid");
		Appointment appointment03 = new Appointment("AP0003", "1-January-2000", "11:60PM", "Block 229 Roxley Road",
				"Zaki");

		Quotation quotation01 = new Quotation(01, 001, "Kitchen", "tiles", "$100", "Syahid", "18-August-2020",
				"$20000");
		Quotation quotation02 = new Quotation(02, 002, "Bedroom", "cabinet", "$120", "Ningxin", "20-August-2020",
				"$25000");
		Quotation quotation03 = new Quotation(03, 003, "Living room", "windows", "$150", "Zaki", "24-August-2020",
				"$30000");

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

		quotationList.add(quotation01);
		quotationList.add(quotation02);
		quotationList.add(quotation03);

		int option = 0;

		while (option != 4) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				C206_CaseStudy.showMenuVisitor();
				int visitorMenu = Helper.readInt("Enter an option which suits your needs: ");
				if (visitorMenu == 1) {
					// View Packages
					C206_CaseStudy.viewAllPackages(packageList);
				} else if (visitorMenu == 2) {
					// Register Customer
					Customer cus = inputCust();
					C206_CaseStudy.addCust(customerList, cus);
				}

			} else if (option == 2) {
				C206_CaseStudy.showMenuCustomer();
				int customerMenu = Helper.readInt("Enter an option which suits your needs: ");
				if (customerMenu == 1) {
					// Request for Quotation
					C206_CaseStudy.authenticateCustomer(customerList);
					Request r = requestQuotation();
					C206_CaseStudy.addQuotation(requestList, r);
				} else if (customerMenu == 2) {
					// Manage Appointment
					C206_CaseStudy.authenticateCustomer(customerList);
					C206_CaseStudy.manageAppointment(appointmentList);
				} else {
					System.out.println("Invalid option");
				}
			} else if (option == 3) {
				C206_CaseStudy.authenticateAD(userAccountList);
				C206_CaseStudy.showMenuAD();
				int adMenu = Helper.readInt("Enter an option which suit your needs: ");

				if (adMenu == 1) {
					System.out.println("1. Add Customer");
					System.out.println("2. View all Customer");
					System.out.println("3. Delete Customer");
					System.out.println("4. Search Customer by ID ");
					int choices = Helper.readInt("Enter an option > ");
					if (choices == 1) {
						Customer cus = inputCust();
						C206_CaseStudy.addCust(customerList, cus);
					} else if (choices == 2) {
						C206_CaseStudy.viewAllCustomer(customerList);
					} else if (choices == 3) {
						C206_CaseStudy.DeleteCustomer(customerList);
					} else if (choices == 4) {
						C206_CaseStudy.SearchCustomer(customerList);
					} else {
						System.out.println("Invalid option!");
					}
				} else if (adMenu == 2) {
					System.out.println("1. Add package");
					System.out.println("2. View packages");
					System.out.println("3. Update package");
					System.out.println("4. Delete package");
					System.out.println("5. Search package by ID");
					int choices2 = Helper.readInt("Enter option > ");

					if (choices2 == 1) {
						C206_CaseStudy.addPackages(packageList);
					} else if (choices2 == 2) {
						C206_CaseStudy.viewAllPackages(packageList);
					} else if (choices2 == 3) {
						C206_CaseStudy.updatePackages(packageList);
					} else if (choices2 == 4) {
						C206_CaseStudy.deletePackages(packageList);
					} else if (choices2 == 5) {
						C206_CaseStudy.searchPackages(packageList);
					} else {
						System.out.println("Invalid option");
					}
				} else if (adMenu == 3) {
					System.out.println("1. Add a Request");
					System.out.println("2. View All Requests");
					System.out.println("3. Manage Requests");
					System.out.println("4. Search for Request");
					System.out.println("5. Delete a Request");
					int choices3 = Helper.readInt("Enter a choice > ");
					if (choices3 == 1) {
						C206_CaseStudy.requestQuotation();
					} else if (choices3 == 2) {
						C206_CaseStudy.viewAllRequests(requestList);
					} else if (choices3 == 3) {
						C206_CaseStudy.manageRequest(requestList);
					} else if (choices3 == 4) {
						C206_CaseStudy.SearchRequest(requestList);
					} else if (choices3 == 5) {
						C206_CaseStudy.DeleteRequest(requestList);
					}
				} else if (adMenu == 4) {
					System.out.println("1. Add Quotation");
					System.out.println("2. View all Quotation");
					System.out.println("3. Search a Quotation");
					System.out.println("4. Delete a Quotation");
					int choices4 = Helper.readInt("Enter a choice > ");
					if (choices4 == 1) {
						Quotation quot = inputQuot();
						C206_CaseStudy.addQuotation(quotationList, quot);
					} else if (choices4 == 2) {
						C206_CaseStudy.ViewAllQuoation(quotationList);
					} else if (choices4 == 3) {
						C206_CaseStudy.SearchQuotation(quotationList);
					} else if (choices4 == 4) {
						Quotation quot = inputQuot();
						C206_CaseStudy.deleteQuotation(quotationList, quot);
					} else {
						System.out.println("Invalid option! ");
					}
				} else if (adMenu == 5) {
					System.out.println("1. Add Appointment");
					System.out.println("2. View all Appointment");
					System.out.println("3. Edit Appointments");
					System.out.println("4. Delete Appointment");
					System.out.println("5. Search appointment by ID");
					int choices1 = Helper.readInt("Enter a choice > ");
					if (choices1 == 1) {
						Appointment App = inputApp();
						C206_CaseStudy.addAppointment(appointmentList, App);
					} else if (choices1 == 2) {
						C206_CaseStudy.ViewAllAppointment(appointmentList);
					} else if (choices1 == 3) {
						C206_CaseStudy.manageAppointment(appointmentList);
					} else if (choices1 == 4) {
						C206_CaseStudy.deleteAppointment(appointmentList);
					} else if (choices1 == 5) {
						C206_CaseStudy.SearchAppointment(appointmentList);
					} else {
						System.out.println("Invalid option !");
					}
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
		System.out.println("2. View as a Customer");
		System.out.println("3. Login as Admin/Designers");
		System.out.println("4. Exit");
		Helper.line(80, "-");
	}

	private static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static void authenticateCustomer(ArrayList<Customer> customerList) {
		boolean authenticated = false;
		int countToThree = 0;
		while (authenticated == false) {
			String userEmail = Helper.readString("Email Address: ");
			String userPassword = Helper.readString("Password: ");

			for (Customer c : customerList) {
				if (userEmail.contentEquals(c.getemailAddress())
						&& userPassword.contentEquals(c.getCustomerPasswrd())) {
					authenticated = true;
				} else if (countToThree == 3) {
					System.exit(0);
				} else {
					countToThree = countToThree++;
				}
			}
		}

	}

	public static void authenticateAD(ArrayList<userAccount> userAccountList) {
		boolean authenticated = false;
		int countToThree = 0;
		while (authenticated == false) {
			String userEmail = Helper.readString("Email Address: ");
			String userPassword = Helper.readString("Password: ");

			for (userAccount c : userAccountList) {
				if (userEmail.contentEquals(c.getemailAddress()) && userPassword.contentEquals(c.getStaffPassword())) {
					authenticated = true;
				} else if (countToThree == 3) {
					System.exit(0);
				} else {
					countToThree = countToThree++;
				}
			}
		}

	}

	public static void showMenuCustomer() {
		C206_CaseStudy.setHeader("Customer");
		System.out.println("1. Add Quotation");
		System.out.println("2. Manage Appointment");
	}

	public static void showMenuVisitor() {
		C206_CaseStudy.setHeader("Visitor");
		System.out.println("1. View Packages");
		System.out.println("2. Register");
	}

	public static void showMenuAD() {
		C206_CaseStudy.setHeader("Admin/Designer");
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
		String customerPassword = Helper.readString("Enter a password:");
		int contactNumber = Helper.readInt("Enter your contact number: ");
		String emailAddress = Helper.readString("Enter your email address: ");
		String customerStatus = "New";

		Customer cus = new Customer(customerID, customerName, customerPassword, contactNumber, emailAddress,
				customerStatus);
		return cus;
	}

	public static void addCust(ArrayList<Customer> customerList, Customer cus) {
		customerList.add(cus);
		System.out.println("Customer added!");
	}

	public static void DeleteCustomer(ArrayList<Customer> customerList) {
		int cID = Helper.readInt("Enter customer ID > ");
		boolean isFound = false;

		for (int i = 0; i < customerList.size(); i++) {
			if (cID == customerList.get(i).getCustomerID()) {
				System.out.println(customerList.get(i).getCustomerName() + " deleted ! ");

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

	// ==========Requesting for Quotation(CustomerMenu)========
	public static Request requestQuotation() {
		String quotationID = Helper.readString("Enter quotation ID: ");
		String propertyType = Helper.readString("Enter property type(HDB,Private,Landed):");
		int areaSize = Helper.readInt("Enter area size: ");
		String requestName = Helper.readString("Enter request name: ");
		int customerID = Helper.readInt("Enter customer ID: ");
		int budgetAmount = Helper.readInt("Enter your budget: ");
		String targetCompletionDate = Helper.readString("Enter the targeted completion date: ");
		String renovationType = Helper.readString("Enter renovation type (whole house, room, kitchen, toilet): ");

		int roomRenovationAmount = Helper.readInt("Enter number of room to renovate: ");
		int toiletRenovationAmount = Helper.readInt("Enter number of toilets to renovate: ");
		String renovationString = Helper.readString("Enter renovation style: ");

		boolean isUrgent = Helper.readBoolean("Do you need it done within three months?");

		Request r = new Request(quotationID, propertyType, areaSize, requestName, customerID, budgetAmount,
				targetCompletionDate, renovationType, roomRenovationAmount, toiletRenovationAmount, renovationString,
				isUrgent);
		return r;
	}

	public static void addQuotation(ArrayList<Request> requestList, Request r) {
		requestList.add(r);
		System.out.println("New quotation added!");
	}

	public static void addPackage(ArrayList<Package> packageList, Package p) {
		packageList.add(p);
		System.out.println("New package added!");
	}

	// ==========Requesting for Quotation(CustomerMenu)========

	public static String retrieveAllCustomer(ArrayList<Customer> customerList) {
		String output = "";
		for (int i = 0; i < customerList.size(); i++) {
			output += String.format(theCustomerFormat, customerList.get(i).getCustomerID(),
					customerList.get(i).getCustomerName(), customerList.get(i).getContactNumber(),
					customerList.get(i).getemailAddress(), customerList.get(i).getCustomerStatus());
		}
		System.out.println(output);
		return output;
	}

	public static String retrieveAllRequests(ArrayList<Request> requestList) {
		String output = "";
		for (int i = 0; i < requestList.size(); i++) {
			output += String.format(theRequestFormat, requestList.get(i).getQuotationID(),
					requestList.get(i).getPropertyType(), requestList.get(i).getAreaSize(),
					requestList.get(i).getRequestName(), requestList.get(i).getCustomerID(),
					requestList.get(i).getTargetCompletionDate(), requestList.get(i).getRenovationType(),
					requestList.get(i).getRoomRenovationAmount(), requestList.get(i).getToiletRenovationAmount(),
					requestList.get(i).getRenovationString(), requestList.get(i).isUrgent());
		}
		System.out.println(output);
		return output;
	}

	public static String retrieveAllPackages(ArrayList<Package> packageList) {
		String output = "";
		for (int i = 0; i < packageList.size(); i++) {
			output += String.format(thePackageFormat, packageList.get(i).getPackageCode(),
					packageList.get(i).getPackageDescription(), packageList.get(i).getStartDate(),
					packageList.get(i).getEndDate(), packageList.get(i).getPackageAmount());
		}
		System.out.println(output);
		return output;
	}

	public static String retrieveAllUserAccounts(ArrayList<userAccount> userAccountList) {
		String output = "";
		for (int i = 0; i < userAccountList.size(); i++) {
			output += String.format(theUserAccountFormat, userAccountList.get(i).getStaffName(),
					userAccountList.get(i).getStaffRole(), userAccountList.get(i).getemailAddress(),
					userAccountList.get(i).getStaffPassword(), userAccountList.get(i).getStaffStatus());
		}
		System.out.println(output);
		return output;
	}

	public static void viewAllCustomer(ArrayList<Customer> customerList) {
		C206_CaseStudy.setHeader("CUSTOMER LIST");
		System.out.println(String.format(theCustomerFormat, "ID", "NAME", "NUMBER", "EMAIL", "STATUS"));
		retrieveAllCustomer(customerList);
	}

	// Option 2: Manage Packages
	public static void addPackages(ArrayList<Package> packageList) {

		for (int i = 0; i < packageList.size(); i++) {
			String packageCode = Helper.readString("Enter package code > ");
			if (packageCode.equals(packageList.get(i).getPackageCode())) {
				System.out.println("Package code cannot be repeated");
			} else {
				String packageDescription = Helper.readString("Enter package description > ");
				String packageStartDate = Helper.readString("Enter package start date > ");
				String packageEndDate = Helper.readString("Enter package end date > ");
				int packageAmount = Helper.readInt("Enter package amount > ");
				Package packagetoAdd = new Package(packageCode, packageDescription, packageStartDate, packageEndDate,
						packageAmount);
				addPackage(packageList, packagetoAdd);
				System.out.println("Package has been successfully added");
			}
		}
	}

	public static void viewAllPackages(ArrayList<Package> packageList) {
		C206_CaseStudy.setHeader("PACKAGE LIST");
		System.out.println(String.format(thePackageFormat, "CODE", "DESCRIPTION", "START DATE", "END DATE", "AMOUNT"));
		retrieveAllPackages(packageList);
	}

	
	public static void updatePackages(ArrayList<Package> packageList) {
		
		String packageCode = Helper.readString("Enter package code > ");
		
		for (int i = 0; i < packageList.size(); i++) {
			if (packageCode.equals(packageList.get(i).getPackageCode())) {
				System.out.println("1. Update Package Description");
				System.out.println("2. Update Package Start Date");
				System.out.println("3. Update Package End Date");
				System.out.println("4. Update Package Amount");
				int updateChoices = Helper.readInt("Enter option > ");
				
				if (updateChoices == 1) {
					
					String newPackageDescription = Helper.readString("Enter new package description > ");
					packageList.get(i).setPackageDescription(newPackageDescription);
					System.out.println("Updated Successfully");
					
				} else if ( updateChoices == 2) {
					
					String newPackageStartDate = Helper.readString("Enter new package start date > ");
					packageList.get(i).setPackageStartDate(newPackageStartDate);
					System.out.println("Updated Successfully");
					
				} else if (updateChoices == 3) {
					
					String newPackageEndDate = Helper.readString("Enter new package end date > ");
					packageList.get(i).setPackageEndDate(newPackageEndDate);
					System.out.println("Updated Successfully");
					
				} else if (updateChoices == 4) {
					
					int newPackageAmount = Helper.readInt("Enter new package description > ");
					packageList.get(i).setPackageAmount(newPackageAmount);
					System.out.println("Updated Successfully");
					
				} else {
					System.out.println("Invalid Option");
				}
				
			}		
	}
}
	
	public static void deletePackages(ArrayList<Package> packageList) {
		String deletePackage = Helper.readString("Enter package code to delete package > ");
		boolean packageFound = false;

		for (int i = 0; i < packageList.size(); i++) {
			if (deletePackage.contentEquals(packageList.get(i).getPackageCode())) {
				packageList.remove(i);
				packageFound = true;
				System.out.println("Package has been successfully deleted");
			}
		}
		if (packageFound == false) {
			System.out.println("Invalid package code");
		} else {
			System.out.println("Invalid option");
		}
	}

	// Manage appointment
	public static Appointment inputApp() {
		String ID = Helper.readString("Enter appointment ID > ");
		String Date = Helper.readString("Enter appointment date (DAY-MONTH-YEAR) >");
		String Time = Helper.readString("Enter appointment time (HH:MM AM/PM) > ");
		String venue = Helper.readString("Enter appointment venue > ");
		String Designer = Helper.readString("Enter Designer Name > ");

		Appointment App = new Appointment(ID, Date, Time, venue, Designer);
		return App;
	}

	public static void manageAppointment(ArrayList<Appointment> appointmentList) {
		String ID = Helper.readString("Enter appointment ID > ");
		boolean gotIt = false;
		boolean changeDate = false;
		boolean changeTime = false;
		boolean changeVenue = false;
		int theIndex = 0;
		for (Appointment a : appointmentList) {
			if (a.getAID().contentEquals(ID)) {
				System.out.println("Appointment found!");
				gotIt = true;
			}
			if (gotIt == false) {
				theIndex = theIndex + 1;
			}
		}
		if (gotIt == true) {
			System.out.println(
					"The current date and time of appointment " + ID + " is " + appointmentList.get(theIndex).getADate()
							+ " at " + appointmentList.get(theIndex).getATime() + ".");
			changeDate = Helper.readBoolean("Would you like to change the date? >");
			if (changeDate == true) {
				String newDate = Helper.readString("Enter the new date.");
				appointmentList.get(theIndex).setADate(newDate);
			}
			changeTime = Helper.readBoolean("Would you like to change the time? >");
			if (changeTime == true) {
				String newTime = Helper.readString("Enter the new time.");
				appointmentList.get(theIndex).setATime(newTime);
			}
			changeVenue = Helper.readBoolean("Would you like to change the venue? >");
			if (changeVenue == true) {
				String newVenue = Helper.readString("Enter the new venue.");
				appointmentList.get(theIndex).setAVenue(newVenue);
			}
		} else {
			System.out.println("Sorry, not found.");
		}

	}

	public static void addAppointment(ArrayList<Appointment> appointmentList, Appointment App) {
		appointmentList.add(App);
		System.out.println("Appointment Added!");
	}

	public static String retrieveAllAppointment(ArrayList<Appointment> appointmentList) {
		String output = "";
		for (int i = 0; i < appointmentList.size(); i++) {
			output += String.format(theAppointmentFormat, appointmentList.get(i).getAID(),
					appointmentList.get(i).getADate(), appointmentList.get(i).getATime(),
					appointmentList.get(i).getAVenue());
		}
		System.out.println(output);
		return output;
	}

	public static void ViewAllAppointment(ArrayList<Appointment> appointmentList) {
		C206_CaseStudy.setHeader("APPOINTMENT LIST");
		System.out.println(String.format(theAppointmentFormat, "ID", "DATE", "TIME", "VENUE"));
		retrieveAllAppointment(appointmentList);
	}

	public static void viewAllRequests(ArrayList<Request> requestList) {
		C206_CaseStudy.setHeader("REQUEST LIST");
		System.out.println(String.format(theRequestFormat, "ID", "PROPERTY TYPE", "AREA SIZE", "REQUEST NAME",
				"CUSTOMER ID", "BUDGET AMOUNT", "TARGET COMPLETION DATE", "RENOVATION TYPE", "ROOM RENOVATIONS MOUNT",
				"TOILET RENOVATION AMOUNT", "RENOVATION STRING", "IS URGENT?"));
		retrieveAllRequests(requestList);
	}

	public static void deleteAppointment(ArrayList<Appointment> appointmentList) {
		String ID = Helper.readString("Enter Appointment ID > ");
		boolean isFound = false;

		for (int i = 0; i < appointmentList.size(); i++) {
			if (ID.contentEquals(appointmentList.get(i).getAID())) {
				System.out.println(appointmentList.get(i).getATime() + "deleted ! ");

				appointmentList.remove(i);
				isFound = true;
			}

		}
		if (isFound == false) {
			System.out.println("The appointment ID entered does not exist");
		} else {
			System.out.println("Invalid option");

		}
	}

	public static void DeleteRequest(ArrayList<Request> requestList) {
		String ID = Helper.readString("Enter Quotation ID > ");
		boolean isFound = false;

		for (int i = 0; i < requestList.size(); i++) {
			if (ID.contentEquals(requestList.get(i).getQuotationID())) {
				System.out.println(requestList.get(i).getQuotationID() + "deleted ! ");

				requestList.remove(i);
				isFound = true;
			}

		}
		if (isFound == false) {
			System.out.println("The quotation ID entered does not exist");
		} else {
			System.out.println("Invalid option");

		}
	}

	// Manage Quotation
	public static Quotation inputQuot() {
		int RID = Helper.readInt("Enter Request ID > ");
		int QID = Helper.readInt("Enter Quotation ID > ");
		String category = Helper.readString("Enter Category > ");
		String description = Helper.readString("Enter description > ");
		String price = Helper.readString("Enter price for the category > $");
		String name = Helper.readString("Enter Designer Name > ");
		String date = Helper.readString("Enter earliest start date > ");
		String totalAmount = Helper.readString("Enter total Amount > ");

		Quotation quot = new Quotation(RID, QID, category, description, price, name, date, totalAmount);
		return quot;
	}

	public Quotation inputQuotID(ArrayList<Quotation> quotationList) {
		int QID = Helper.readInt("Enter Quotation ID > ");
		Quotation quot = null;
		for (int i = 0; i < quotationList.size(); i++) {
			if (QID == quotationList.get(i).getQuotationID()) {
				int RID = quotationList.get(i).getRequestID();
				String category = quotationList.get(i).getCategory();
				String description = quotationList.get(i).getDescription();
				String price = quotationList.get(i).getPrice();
				String name = quotationList.get(i).getDesigner();
				String date = quotationList.get(i).getStartDate();
				String totalAmount = quotationList.get(i).getTotalAmount();

				quot = new Quotation(RID, QID, category, description, price, name, date, totalAmount);
			}

		}
		return quot;
	}

	public static void addQuotation(ArrayList<Quotation> quotationList, Quotation quot) {
		quotationList.add(quot);
		System.out.println("Quotation Added! ");
	}

	public static String retrieveAllQuotation(ArrayList<Quotation> quotationList) {
		String output = "";
		for (int i = 0; i < quotationList.size(); i++) {
			output += String.format(theQuotationFormat, quotationList.get(i).getRequestID(),
					quotationList.get(i).getQuotationID(), quotationList.get(i).getCategory(),
					quotationList.get(i).getDescription(), quotationList.get(i).getPrice(),
					quotationList.get(i).getDesigner(), quotationList.get(i).getStartDate(),
					quotationList.get(i).getTotalAmount());
		}
		System.out.println(output);
		return output;
	}

	public static void ViewAllQuoation(ArrayList<Quotation> quotationList) {
		C206_CaseStudy.setHeader("QUOTATION LIST");
		System.out.println(String.format(theQuotationFormat, "Request ID", "Quotation ID", "Category", "Description",
				"Price", "Designer Name", "Start Date", "Total Quotation amount"));
		retrieveAllQuotation(quotationList);
	}

	public static void deleteQuotation(ArrayList<Quotation> quotationList, Quotation quot) {
		quotationList.remove(quot);
	}

	public static void deleteRequests(ArrayList<Request> requestList, Request req) {
		requestList.remove(req);
	}

	public static void deleteCust(ArrayList<Customer> customerList, Customer cust) {
		customerList.remove(cust);
	}

	public static void SearchCustomer(ArrayList<Customer> customerList) {
		int CID = Helper.readInt("Enter Customer ID > ");
		String output = "";
		for (int i = 0; i < customerList.size(); i++) {
			if (CID == customerList.get(i).getCustomerID()) {
				output += String.format(theCustomerFormat, "ID", "NAME", "NUMBER", "EMAIL", "STATUS");
				output += String.format(theCustomerFormat, customerList.get(i).getCustomerID(),
						customerList.get(i).getCustomerName(), customerList.get(i).getContactNumber(),
						customerList.get(i).getemailAddress(), customerList.get(i).getCustomerStatus());

			} else {
				System.out.println("Invalid ID ! ");
			}

		}
		System.out.println(output);

	}

	public static void SearchAppointment(ArrayList<Appointment> appointmentList) {
		String aID = Helper.readString("Enter appointment ID > ");
		String output = "";
		for (int i = 0; i < appointmentList.size(); i++) {
			if (aID.equalsIgnoreCase(appointmentList.get(i).getAID())) {
				output += String.format(theAppointmentFormat, "ID", "DATE", "TIME", "VENUE");
				output += String.format(theAppointmentFormat, appointmentList.get(i).getAID(),
						appointmentList.get(i).getADate(), appointmentList.get(i).getATime(),
						appointmentList.get(i).getAVenue());

			} else {
				System.out.println("Invalid ID ! ");
			}

		}
		System.out.println(output);

	}
	
	public static void SearchQuotation(ArrayList<Quotation> quotationList) {
		int aID = Helper.readInt("Enter quotation ID > ");
		String output = "";
		for (int i = 0; i < quotationList.size(); i++) {
			if (aID == quotationList.get(i).getQuotationID()) {
				output += String.format(theQuotationFormat, "Request ID", "Quotation ID", "Category", "Description",
						"Price", "Designer Name", "Start Date", "Total Quotation amount");
				output += String.format(theQuotationFormat, quotationList.get(i).getRequestID(), quotationList.get(i).getQuotationID(), quotationList.get(i).getCategory(),
						quotationList.get(i).getDescription(), quotationList.get(i).getPrice(),
						quotationList.get(i).getDesigner(), quotationList.get(i).getStartDate(),
						quotationList.get(i).getTotalAmount());

			} else {
				System.out.println("Invalid ID ! ");
			}

		}
		System.out.println(output);

	}
	
	public static void SearchRequest(ArrayList<Request> requestList) {
		String aID = Helper.readString("Enter request ID > ");
		String output = "";
		for (int i = 0; i < requestList.size(); i++) {
			if (aID.equalsIgnoreCase(requestList.get(i).getQuotationID())) {
				output += String.format(theRequestFormat, "ID", "PROPERTY TYPE", "AREA SIZE", "REQUEST NAME",
						"CUSTOMER ID", "BUDGET AMOUNT", "TARGET COMPLETION DATE", "RENOVATION TYPE", "ROOM RENOVATIONS MOUNT",
						"TOILET RENOVATION AMOUNT", "RENOVATION STRING", "IS URGENT?");
				output += String.format(theRequestFormat, requestList.get(i).getQuotationID(),
						requestList.get(i).getPropertyType(), requestList.get(i).getAreaSize(),
						requestList.get(i).getRequestName(), requestList.get(i).getCustomerID(),
						requestList.get(i).getTargetCompletionDate(), requestList.get(i).getRenovationType(),
						requestList.get(i).getRoomRenovationAmount(), requestList.get(i).getToiletRenovationAmount(),
						requestList.get(i).getRenovationString(), requestList.get(i).isUrgent());
			}
			else
			{
				output += "Not found";
			}
			System.out.println(output);
		}
	}

	public static void searchPackages(ArrayList<Package> packageList) {
		String PID = Helper.readString("Enter package ID > ");
		String output = "";
		for (int i = 0; i < packageList.size(); i++) {
			if (PID.equalsIgnoreCase(packageList.get(i).getPackageCode())) {
				output += String.format(thePackageFormat, "CODE", "DESCRIPTION", "START DATE", "END DATE", "AMOUNT");
				output += String.format(thePackageFormat, packageList.get(i).getPackageCode(),
						packageList.get(i).getPackageDescription(), packageList.get(i).getStartDate(),
						packageList.get(i).getEndDate(), packageList.get(i).getPackageAmount());

			} else {
				output += "Invalid ID !";
			}

		}
		System.out.println(output);

	}
	
	public static void manageRequest(ArrayList<Request> requestList) {
		String ID = Helper.readString("Enter request ID > ");
		boolean gotIt = false;
		boolean changePropertyType = false;
		boolean changeAreaSize = false;
		boolean changeRequestName = false;
		boolean changeCustomerID = false;
		boolean changeBudgetAmount = false;
		boolean changeTargetCompletionDate = false;
		boolean changeRenovationType = false;
		boolean changeRoomRenovationAmount = false;
		boolean changeToiletRenovationAmount = false;
		boolean changeRenovationString = false;
		boolean changeIsUrgent = false;
		int theIndex = 0;
		for (Request r : requestList) {
			if (r.getQuotationID().contentEquals(ID)) {
				System.out.println("Request for Quotation found!");
				gotIt = true;
			}
			if (gotIt == false) {
				theIndex = theIndex + 1;
			}
		}
		if (gotIt == true) {
			System.out.println("The current property type is " + requestList.get(theIndex).getPropertyType() + ".");
			changePropertyType = Helper.readBoolean("Would you like to change the property type? >");
			if (changePropertyType == true) {
				String newPropertyType = Helper.readString("Enter the new property type.");
				requestList.get(theIndex).setPropertyType(newPropertyType);
			}
			System.out.println("The current area size is " + requestList.get(theIndex).getAreaSize() + ".");
			changeAreaSize = Helper.readBoolean("Would you like to change the area size? >");
			if (changeAreaSize == true) {
				int newAreaSize = Helper.readInt("Enter the new area size.");
				requestList.get(theIndex).setAreaSize(newAreaSize);
			}
			System.out.println("The current name of request is " + requestList.get(theIndex).getRequestName() + ".");
			changeRequestName = Helper.readBoolean("Would you like to change the request name? >");
			if (changeRequestName == true) {
				String newRequestName = Helper.readString("Enter the new request name.");
				requestList.get(theIndex).setRequestName(newRequestName);
			}
			System.out.println("The current Customer ID it is attributed to is " + requestList.get(theIndex).getCustomerID() + ".");
			changeCustomerID = Helper.readBoolean("Would you like to change it? >");
			if (changeCustomerID == true) {
				int newCustomerID = Helper.readInt("Enter the new Customer ID.");
				requestList.get(theIndex).setCustomerID(newCustomerID);
			}
			System.out.println("The current budget amount is " + requestList.get(theIndex).getBudgetAmount() + ".");
			changeBudgetAmount = Helper.readBoolean("Would you like to change it? >");
			if (changeBudgetAmount == true) {
				int newBudgetAmount = Helper.readInt("Enter the new budget amount.");
				requestList.get(theIndex).setBudgetAmount(newBudgetAmount);
			}
			System.out.println("The current target completion date is " + requestList.get(theIndex).getTargetCompletionDate() + ".");
			changeTargetCompletionDate = Helper.readBoolean("Would you like to change it? >");
			if (changeTargetCompletionDate == true) {
				String newTargetCompletionDate = Helper.readString("Enter the new target completion date.");
				requestList.get(theIndex).setTargetCompletionDate(newTargetCompletionDate);
			}
			System.out.println("The current renovation type is " + requestList.get(theIndex).getRenovationType() + ".");
			changeRenovationType = Helper.readBoolean("Would you like to change it? >");
			if (changeRenovationType == true) {
				String newRenovationType = Helper.readString("Enter the new renovation type.");
				requestList.get(theIndex).setRenovationType(newRenovationType);
			}
			System.out.println("The current room renovation amount is " + requestList.get(theIndex).getRoomRenovationAmount() + ".");
			changeRoomRenovationAmount = Helper.readBoolean("Would you like to change it? >");
			if (changeRoomRenovationAmount == true) {
				int newRoomRenovationAmount = Helper.readInt("Enter the new renovation type.");
				requestList.get(theIndex).setRoomRenovationAmount(newRoomRenovationAmount);
			}
			System.out.println("The current toilet renovation amount is " + requestList.get(theIndex).getToiletRenovationAmount() + ".");
			changeToiletRenovationAmount = Helper.readBoolean("Would you like to change it? >");
			if (changeToiletRenovationAmount == true) {
				int newToiletRenovationAmount = Helper.readInt("Enter the new renovation type.");
				requestList.get(theIndex).setToiletRenovationAmount(newToiletRenovationAmount);
			}
			System.out.println("The current toilet renovation amount is " + requestList.get(theIndex).getToiletRenovationAmount() + ".");
			changeToiletRenovationAmount = Helper.readBoolean("Would you like to change it? >");
			if (changeToiletRenovationAmount == true) {
				int newToiletRenovationAmount = Helper.readInt("Enter the new renovation type.");
				requestList.get(theIndex).setToiletRenovationAmount(newToiletRenovationAmount);
			}
			System.out.println("The current renovation style is " + requestList.get(theIndex).getRenovationString() + ".");
			changeRenovationString = Helper.readBoolean("Would you like to change it? >");
			if (changeRenovationString == true) {
				String newRenovationStyle = Helper.readString("Enter the new renovation style.");
				requestList.get(theIndex).setRenovationString(newRenovationStyle);
			}
			System.out.println("Currently, whether it is urgent or not is set to " + requestList.get(theIndex).isUrgent() + ".");
			changeIsUrgent = Helper.readBoolean("Would you like to change it? >");
			if (changeIsUrgent == true) {
				requestList.get(theIndex).setIsUrgent(requestList.get(theIndex).isUrgent());
			}
		} else {
			System.out.println("Sorry, not found.");
		}

	}
}