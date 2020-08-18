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
		
	}
}