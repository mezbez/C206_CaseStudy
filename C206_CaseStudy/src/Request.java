
public class Request {
	private String propertyType;
	private int areaSize;
	private String requestName;
	private int contactNo;
	private String emailAddress;
	private int budgetAmount;
	private String targetCompletionDate;
	private String renovationType;
	private int roomRenovationAmount;
	private int toiletRenovationAmount;
	private String renovationString;
	private boolean isUrgent;
	
	public Request(String propertyType, int areaSize, String requestName, int contactNo, String emailAddress, int budgetAmount, String targetCompletionDate, String renovationType, int roomRenovationAmount, int toiletRenovationAmount, String renovationString, boolean isUrgent)
	{
		this.propertyType = propertyType;
		this.areaSize = areaSize;
		this.requestName = requestName;
		this.contactNo = contactNo;
		this.emailAddress = emailAddress;
		this.budgetAmount = budgetAmount;
		this.targetCompletionDate = targetCompletionDate;
		this.renovationType = renovationType;
		this.roomRenovationAmount = roomRenovationAmount;
		this.toiletRenovationAmount = toiletRenovationAmount;
		this.renovationString = renovationString;
		this.isUrgent = isUrgent;
	}
	
}

