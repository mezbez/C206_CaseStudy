
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

	public Request(String propertyType, int areaSize, String requestName, int contactNo, String emailAddress,
			int budgetAmount, String targetCompletionDate, String renovationType, int roomRenovationAmount,
			int toiletRenovationAmount, String renovationString, boolean isUrgent) {
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

	public int getAreaSize() {
		return areaSize;
	}

	public void setAreaSize(int areaSize) {
		this.areaSize = areaSize;
	}

	public int getBudgetAmount() {
		return budgetAmount;
	}

	public void setBudgetAmount(int budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public String getRequestName() {
		return requestName;
	}

	public int getContactNo() {
		return contactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTargetCompletionDate() {
		return targetCompletionDate;
	}

	public String getRenovationType() {
		return renovationType;
	}

	public int getRoomRenovationAmount() {
		return roomRenovationAmount;
	}

	public int getToiletRenovationAmount() {
		return toiletRenovationAmount;
	}

	public String getRenovationString() {
		return renovationString;
	}

	public boolean isUrgent() {
		return isUrgent;
	}

}
