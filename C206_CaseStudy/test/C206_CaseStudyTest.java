import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Request request01;
	private Request request02;
	private Request request03;
	private Customer customer01;
	private Customer customer02;
	private Customer customer03;
	private Package package01;
	private Package package02;
	private Package package03;
	private userAccount userAccount01;
	private userAccount userAccount02;
	private userAccount userAccount03;
	private Appointment appointment01;
	private Appointment appointment02;
	private Appointment appointment03;
	private Quotation quotation01;
	private Quotation quotation02;
	private Quotation quotation03;
	
	private ArrayList<Request> requestList;
	private ArrayList<Customer> customerList;
	private ArrayList<Package> packageList;
	private ArrayList<userAccount> userAccountList;
	private ArrayList<Appointment> appointmentList;
	private ArrayList<Quotation> quotationList;

	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		Request request01 = new Request("RE0001", "HDB", 500, "RequestName01", 0001, 50000, "31-FEBRUARY-2021", "Whole House", 3, 2, "Gangnam Style", true);
		Request request02 = new Request("RE0002", "Landed Property", 1000, "RequestName02", 0002, 99999, "31-SEPTEMBER-9999", "1 Bedroom", 1, 0, "Future Style", false);
		Request request03 = new Request("RE0003", "Condominium", 750, "RequestName03", 0003, 1, "1-JANUARY-0000", "1 Toilet", 0, 1, "Beyond of Style", true);
		
		Customer customer01 = new Customer(0001, "Din Tai Fung", "password", 98888888, "dtf@uhh.com", "New");
		Customer customer02 = new Customer(0002, "East Coast Plan", "password", 89999999, "wardrobe@tri.vago", "New");
		Customer customer03 = new Customer(0003, "Cockles of Heart", "password", 10000000, "yes@okay.uhhuh", "New");
		
		Package package01 = new Package("PA0001", "This package packages packages into a package.", "21-January-2021", "29-January-2021", 2);
		Package package02 = new Package("PA0002", "This package packages packages into a package.", "30-December-9999", "31-December-9999", 2);
		Package package03 = new Package("PA0003", "This package packages packages into a package.", "21-January-2020", "29-January-2020", 2);
		
		userAccount userAccount01 = new userAccount("Li Ningxin", "Admin", "xxxxxx@rp.edu.sg", "thisisapassword", "New");
		userAccount userAccount02 = new userAccount("Muhammad Zaki", "Admin", "yyyyyy@rp.edu.sg", "thisisapassword", "New");
		userAccount userAccount03 = new userAccount("Syahid Tsaqif", "Designer", "zzzzzz@rp.edu.sg", "thisisapassword", "New");
		userAccount userAccount04 = new userAccount("Erya Syarafina", "Admin", "aaaaaa@rp.edu.sg", "thisisapassword", "New");
		
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
		
		requestList = new ArrayList<Request>();
		customerList = new ArrayList<Customer>();
		packageList = new ArrayList<Package>();
		userAccountList = new ArrayList<userAccount>();
		appointmentList = new ArrayList<Appointment>();
	}

	@Test
	public void c206_test() {
		//Let's see if we can add new entities to their respective ArrayLists!
		assertNotNull("Paging for ArrayList to add Requests to", requestList);
		assertNotNull("Paging for ArrayList to add Customers to", customerList);
		assertNotNull("Paging for ArrayList to add Packages to", packageList);
		assertNotNull("Paging for ArrayList to add UserAccounts to", userAccountList);
		assertNotNull("Paging for ArrayList to add AppointmentLists to", appointmentList);
		
		//Let's try to retrieve nothing from the ArrayLists!
		String allRequests = C206_CaseStudy.retrieveAllRequests(requestList);
		String allCustomers = C206_CaseStudy.retrieveAllCustomer(customerList);
		String allPackages = C206_CaseStudy.retrieveAllPackages(packageList);
		String allUserAccounts = C206_CaseStudy.retrieveAllUserAccounts(userAccountList);
		String allAppointments = C206_CaseStudy.retrieveAllAppointment(appointmentList);
		String testOutput = "";
		assertEquals("Paging for the ArrayList of Requests to be empty", testOutput, allRequests);
		assertEquals("Paging for the ArrayList of Customers to be empty", testOutput, allCustomers);
		assertEquals("Paging for the ArrayList of Packages to be empty", testOutput, allPackages);
		assertEquals("Paging for the ArrayList of User Accounts to be empty", testOutput, allUserAccounts);
		assertEquals("Paging for the ArrayList of Appointments to be empty", testOutput, allAppointments);
		
		
		//Let's add an item and see if they have one item in them! (Kind of obvious in real life, but hey)
		C206_CaseStudy.addQuotation(requestList, request01);
		C206_CaseStudy.addCust(customerList, customer01);
		C206_CaseStudy.addPackage(packageList, package01);
		//C206_CaseStudy.addUserAccount(userAccountList, userAccount01);
		C206_CaseStudy.addAppointment(appointmentList, appointment01);
		assertEquals("Paging for the size of ArrayList for Requests to be 1", 1, requestList.size());
		assertEquals("Paging for the size of ArrayList for Customers to be 1", 1, customerList.size());
		assertEquals("Paging for the size of ArrayList for Packages to be 1", 1, packageList.size());
		//assertEquals("Paging for the size of ArrayList for UserAccounts to be 1", 1, userAccountList.size());
		assertEquals("Paging for the size of ArrayList for Appointments to be 1", 1, appointmentList.size());
		
		//Let's see if the item inside it is the same as what we just added!
		assertSame("Paging for ArrayList index 0 for Requests to be the same as item01", request01, requestList.get(0));
		assertSame("Paging for ArrayList index 0 for Customers to be the same as item01", customer01, customerList.get(0));
		assertSame("Paging for ArrayList index 0 for Packages to be the same as item01", package01, packageList.get(0));
		//assertSame("Paging for ArrayList index 0 for User Accounts to be the same as item01", userAccount01, userAccountList.get(0));
		assertSame("Paging for ArrayList index 0 for Appointment to be the same as item01", appointment01, appointmentList.get(0));
		
		//Let's delete the items we had just for fun!
		C206_CaseStudy.deleteRequests(requestList, request01);
		//C206_CaseStudy.deleteQuotation(quotationList, quotation01);
		C206_CaseStudy.deleteCust(customerList, customer01);
		//C206_CaseStudy.deletePackage(packageList,package01);
		//C206_CaseStudy.deleteUserAccounts(userAccountList, userAccount01);
		//C206_CaseStudy.deleteAppointment(appointmentList, appointment01);
	}
	
	@After
	public void tearDown() throws Exception {
		quotation01 = null;
		customer01 = null;
		package01 = null;
		userAccount01 = null;
		appointmentList = null;
		quotationList = null;
		customerList = null;
		packageList = null;
		userAccountList = null;
		appointmentList = null;
	}

}
