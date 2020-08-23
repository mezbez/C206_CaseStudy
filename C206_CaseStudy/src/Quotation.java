
public class Quotation {
	private int RequestID;
	private int QuotationID;
	private String Category;
	private String description;
	private String price;
	private String Designer;
	private String StartDate;
	private String TotalAmount;

	public Quotation(int requestID, int quotationID, String category, String description, String price, String designer,
			String startDate, String totalAmount) {
		RequestID = requestID;
		QuotationID = quotationID;
		Category = category;
		this.description = description;
		this.price = price;
		Designer = designer;
		StartDate = startDate;
		TotalAmount = totalAmount;
	}

	public int getRequestID() {
		return RequestID;
	}

	public void setRequestID(int requestID) {
		RequestID = requestID;
	}

	public int getQuotationID() {
		return QuotationID;
	}

	public void setQuotationID(int quotationID) {
		QuotationID = quotationID;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDesigner() {
		return Designer;
	}

	public void setDesigner(String designer) {
		Designer = designer;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}

}
