
public class Appointment {
	private String AID;
	private String ADate;
	private String ATime;
	private String AVenue;
	private String Dname;

	public Appointment(String aID, String aDate, String aTime, String aVenue, String dname) {
		super();
		AID = aID;
		ADate = aDate;
		ATime = aTime;
		AVenue = aVenue;
		Dname = dname;
	}

	public String getAID() {
		return AID;
	}

	public void setAID(String aID) {
		AID = aID;
	}

	public String getADate() {
		return ADate;
	}

	public void setADate(String aDate) {
		ADate = aDate;
	}

	public String getATime() {
		return ATime;
	}

	public void setATime(String aTime) {
		ATime = aTime;
	}

	public String getAVenue() {
		return AVenue;
	}

	public void setAVenue(String aVenue) {
		AVenue = aVenue;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

}
