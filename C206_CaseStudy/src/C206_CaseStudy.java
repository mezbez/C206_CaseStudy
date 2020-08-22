import java.util.ArrayList;

public class C206_CaseStudy {
	private static final String theOtherFormat = "%-10s %-20s %-8s %-20s %-10s\n";
	private static final String thePackageFormat = "%-6s %-60s %-20s %-20s %-5s \n";
	private static final String theAppointmentFormat = "%-6s %-10s %-10s %-60s \n";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Request> requestList = new ArrayList<Request>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Package> packageList = new ArrayList<Package>();
		ArrayList<userAccount> userAccountList = new ArrayList<userAccount>();
		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

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

		Appointment appointment01 = new Appointment("AP0001", "28-February-2021", "11:00AM", "Block 229 Roxley Road");
		Appointment appointment02 = new Appointment("AP0002", "31-December-9999", "11:59PM", "Block 229 Roxley Road");
		Appointment appointment03 = new Appointment("AP0003", "1-January-2000", "11:60PM", "Block 229 Roxley Road");

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
					// System.out.println("4. Search customer by name");
					int choices = Helper.readInt("Enter an option > ");
					if (choices == 1) {
						Customer CU = inputCust();
						C206_CaseStudy.addCust(customerList, CU);

					} else if (choices == 2) {
						C206_CaseStudy.viewAllCustomer(customerList);

					} else if (choices == 3) {
						C206_CaseStudy.DeleteCustomer(customerList);
					} else {
						System.out.println("Invalid option");
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
						Package packagetoAdd = new Package(packageCode, packageDescription, packageStartDate,
								packageEndDate, packageAmount);
						addPackage(packageList, packagetoAdd);
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
					System.out.println("1. Add Appointment");
					System.out.println("2. View all Appointment");
					System.out.println("3. Edit Appointments");
					System.out.println("3. Delete Appointment");
					int choices1 = Helper.readInt("Enter a choice > ");
					if (choices1 == 1) {
						Appointment App = inputApp();
						C206_CaseStudy.addAppointment(appointmentList, App);
					} else if (choices1 == 2) {
						C206_CaseStudy.ViewAllAppointment(appointmentList);
					} else if (choices1 == 3) {
						C206_CaseStudy.manageAppointment(appointmentList);
					} else if (choices1 == 4) {
						C206_CaseStudy.DeleteAppointment(appointmentList);
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
		// TODO Auto-generated method stub
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
				if (userEmail.contentEquals(c.getemailAddress()) && userPassword.contentEquals(c.getCustomerPasswrd())) {
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
			output += String.format("%-10s %-20s %-8s %-20s %-10s \n", customerList.get(i).getCustomerID(),
					customerList.get(i).getCustomerName(), customerList.get(i).getContactNumber(),
					customerList.get(i).getemailAddress(), customerList.get(i).getCustomerStatus());
		}
		System.out.println(output);
		return output;
	}

	public static String retrieveAllRequests(ArrayList<Request> requestList) {
		String output = "";
		for (int i = 0; i < requestList.size(); i++) {
			output += String.format("%-5s %-10s %-5d %-30s %-4d %-5d %-15s %-10s %-5d %5-d %-10s %-5b \n",
					requestList.get(i).getQuotationID(), requestList.get(i).getPropertyType(),
					requestList.get(i).getAreaSize(), requestList.get(i).getRequestName(),
					requestList.get(i).getCustomerID(), requestList.get(i).getTargetCompletionDate(),
					requestList.get(i).getRenovationType(), requestList.get(i).getRoomRenovationAmount(),
					requestList.get(i).getToiletRenovationAmount(), requestList.get(i).getRenovationString(),
					requestList.get(i).isUrgent());
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
			output += String.format("%-10s %-10s %-20s %-15s %-10s \n", userAccountList.get(i).getStaffName(),
					userAccountList.get(i).getStaffRole(), userAccountList.get(i).getemailAddress(),
					userAccountList.get(i).getStaffPassword(), userAccountList.get(i).getStaffStatus());
		}
		System.out.println(output);
		return output;
	}

	public static void viewAllCustomer(ArrayList<Customer> customerList) {
		C206_CaseStudy.setHeader("CUSTOMER LIST");
		System.out.println(String.format(theOtherFormat, "ID", "NAME", "NUMBER", "EMAIL", "STATUS"));
		retrieveAllCustomer(customerList);
	}

	public static void viewAllPackages(ArrayList<Package> packageList) {
		C206_CaseStudy.setHeader("PACKAGE LIST");
		System.out.println(String.format(thePackageFormat, "CODE", "DESCRIPTION", "START DATE", "END DATE", "AMOUNT"));
		retrieveAllPackages(packageList);
	}

	// Manage appointment
	public static Appointment inputApp() {
		String ID = Helper.readString("Enter appointment ID > ");
		String Date = Helper.readString("Enter appointment date (DAY-MONTH-YEAR) >");
		String Time = Helper.readString("Enter appointment time (HH:MM AM/PM) > ");
		String venue = Helper.readString("Enter appointment venue > ");

		Appointment App = new Appointment(ID, Date, Time, venue);
		return App;
	}
	
	public static void manageAppointment(ArrayList<Appointment> appointmentList) {
		String ID = Helper.readString("Enter appointment ID > ");
		boolean gotIt = false;
		boolean changeDate = false;
		boolean changeTime = false;
		boolean changeVenue = false;
		int theIndex = 0;
		for (Appointment a : appointmentList)
		{
			if (a.getAID().contentEquals(ID))
			{
				System.out.println("Appointment found!");
				gotIt = true;
			}
			if (gotIt == false)
			{
				theIndex = theIndex + 1;
			}
		}
		if (gotIt == true)
		{
			System.out.println("The current date and time of appointment " + ID + " is " + appointmentList.get(theIndex).getADate() + " at " + appointmentList.get(theIndex).getATime() + ".");
			changeDate = Helper.readBoolean("Would you like to change the date? >");
			if (changeDate == true)
			{
				String newDate = Helper.readString("Enter the new date.");
				appointmentList.get(theIndex).setADate(newDate);
			}
			changeTime = Helper.readBoolean("Would you like to change the time? >");
			if (changeTime == true)
			{
				String newTime = Helper.readString("Enter the new time.");
				appointmentList.get(theIndex).setATime(newTime);
			}
			changeVenue = Helper.readBoolean("Would you like to change the venue? >");
			if (changeVenue == true)
			{
				String newVenue = Helper.readString("Enter the new venue.");
				appointmentList.get(theIndex).setAVenue(newVenue);
			}
		}
		else
		{
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

	public static void DeleteAppointment(ArrayList<Appointment> appointmentList) {
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
}