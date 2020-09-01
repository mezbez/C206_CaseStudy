
public class Request {
	private String quotationID;
	private String propertyType;
	private int areaSize;
	private String requestName;
	private int customerID;
	private int budgetAmount;
	private String targetCompletionDate;
	private String renovationType;
	private int roomRenovationAmount;
	private int toiletRenovationAmount;
	private String renovationString;
	private boolean isUrgent;

	public Request(String quotationID, String propertyType, int areaSize, String requestName, int customerID,
			int budgetAmount, String targetCompletionDate, String renovationType, int roomRenovationAmount,
			int toiletRenovationAmount, String renovationString, boolean isUrgent) {
		this.quotationID = quotationID;
		this.propertyType = propertyType;
		this.areaSize = areaSize;
		this.requestName = requestName;
		this.customerID = customerID;
		this.budgetAmount = budgetAmount;
		this.targetCompletionDate = targetCompletionDate;
		this.renovationType = renovationType;
		this.roomRenovationAmount = roomRenovationAmount;
		this.toiletRenovationAmount = toiletRenovationAmount;
		this.renovationString = renovationString;
		this.isUrgent = isUrgent;
	}
	
	public String getQuotationID()
	{
		return quotationID;
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

	public int getCustomerID(){
		return customerID;
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

	public void setPropertyType(String newPropertyType) {
		newPropertyType = propertyType;
	}

	public void setCustomerID(int newCustomerID) {
		newCustomerID = customerID;
	}
	
	public void setRequestName(String newRequestName) {
		newRequestName = requestName;
	}

	public void setTargetCompletionDate(String newTargetCompletionDate) {
		newTargetCompletionDate = targetCompletionDate;
	}

	public void setRenovationType(String newRenovationType) {
		newRenovationType = renovationType;
	}

	/**
	 * @param newRoomRenovationAmount
	 */
	public void setRoomRenovationAmount(int newRoomRenovationAmount) {
		// TODO Auto-generated method stub
		newRoomRenovationAmount = roomRenovationAmount;
	}
	
	public void setToiletRenovationAmount(int newToiletRenovationAmount) {
		// TODO Auto-generated method stub
		newToiletRenovationAmount = toiletRenovationAmount;
	}

	public void setRenovationString(String newRenovationStyle) {
		// TODO Auto-generated method stub
		newRenovationStyle = renovationString;
	}
	
	public void setIsUrgent(boolean isNowUrgent) {
		if (isNowUrgent == true)
		{
			isUrgent = false;
		}
		else
		{
			isUrgent = true;
		}
	}

}
