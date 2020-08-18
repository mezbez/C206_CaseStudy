public class C206_CaseStudy
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int option = 0;
		
		while (option != 3)
		{
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1)
			{
				C206_CaseStudy.showMenuCustomer();
				int customerMenu = Helper.readInt("Enter an option which suits your needs: ");
				
				if (customerMenu == 1)
				{
					
				}
				else if (customerMenu == 2)
				{
					
				}
				else
				{
					System.out.println("Invalid option");
				}
			}
			else if(option == 2)
			{
				
				
			}
		}
	}
	
	
	public static void menu()
	{
		C206_CaseStudy.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. Login as Customer");
		System.out.println("2. Login as Admin/Designers");
		System.out.println("3. Exit");
		Helper.line(80, "-");
	}


	private static void setHeader(String header)
	{
		// TODO Auto-generated method stub
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	public static void showMenuCustomer()
	{
		C206_CaseStudy.setHeader("Customer");
		System.out.println("1. Request for Quotation");
		System.out.println("2. Manage Appointment");
		
		int customerOption = Helper.readInt("Enter option > ");
		
		if (customerOption == 1) {
			
		} else if (customerOption == 2) {
			
		} else {
			System.out.println("Invalid option");
		}
	}
	
	public static void showMenuAD()
	{
		C206_CaseStudy.setHeader("Customer");
		System.out.println("1. Manage Customer");
		System.out.println("2. Manage Appointment");
		
		int adminOption = Helper.readInt("Enter option to select manage type > ");

		if (adminOption == 1) {
			
		} else if (adminOption == 2) {
			
		} else {
			System.out.println("Invalid type");
		}
	}
}