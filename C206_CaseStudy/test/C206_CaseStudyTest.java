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
	
	private ArrayList<Request> requestList;
	private ArrayList<Customer> customerList;
	private ArrayList<Package> packageList;
	private ArrayList<userAccount> userAccountList;
	private ArrayList<Appointment> appointmentList;

	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		Request request01 = new Request("RE0001", "HDB", 500, "RequestName01", 99999999, "no@thisisnotanemail.con", 50000, "31-FEBRUARY-2021", "Whole House", 3, 2, "Gangnam Style", true);
		Request request02 = new Request("RE0002", "Landed Property", 1000, "RequestName02", 88888888, "yes@thisisan.email", 99999, "31-SEPTEMBER-9999", "1 Bedroom", 1, 0, "Future Style", false);
		Request request03 = new Request("RE0003", "Condominium", 750, "RequestName03", 11111111, "maybe@thiscouldbean.email", 1, "1-JANUARY-0000", "1 Toilet", 0, 1, "Beyond of Style", true);
		
		Customer customer01 = new Customer("CU0001", "Din Tai Fung", 98888888, "dtf@uhh.com", "New");
		Customer customer02 = new Customer("CU0002", "East Coast Plan", 89999999, "wardrobe@tri.vago", "New");
		Customer customer03 = new Customer("CU0003", "Cockles of Heart", 10000000, "yes@okay.uhhuh", "New");
		
		Package package01 = new Package("PA0001", "This package packages packages into a package.", "21-January-2021", "29-January-2021", 2);
		Package package02 = new Package("PA0002", "This package packages packages into a package.", "30-December-9999", "31-December-9999", 2);
		Package package03 = new Package("PA0003", "This package packages packages into a package.", "21-January-2020", "29-January-2020", 2);
		
		userAccount userAccount01 = new userAccount("Li Ningxin", "Admin", "xxxxxx@rp.edu.sg", "thisisapassword", "New");
		userAccount userAccount02 = new userAccount("Muhammad Zaki", "Admin", "yyyyyy@rp.edu.sg", "thisisapassword", "New");
		userAccount userAccount03 = new userAccount("Syahid Tsaqif", "Designer", "zzzzzz@rp.edu.sg", "thisisapassword", "New");
		userAccount userAccount04 = new userAccount("Erya Syarafina", "Admin", "aaaaaa@rp.edu.sg", "thisisapassword", "New");
		
		Appointment appointment01 = new Appointment("28-February-2021", "11:00AM", "Block 229 Roxley Road", "AP0001");
		Appointment appointment02 = new Appointment("31-December-9999", "11:59PM", "Block 229 Roxley Road", "AP0002");
		Appointment appointment03 = new Appointment("1-January-2000", "11:60PM", "Block 229 Roxley Road", "AP0003");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
