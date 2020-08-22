
public class Appointment {
	private String AID;
	private String ADate;
	private String ATime;
	private String AVenue;

	public Appointment(String aID, String aDate, String aTime, String aVenue) {
		AID = aID;
		ADate = aDate;
		ATime = aTime;
		AVenue = aVenue;
	}

	public String getAID() {
		return AID;
	}

	public String getADate() {
		return ADate;
	}

	public String getATime() {
		return ATime;
	}

	public String getAVenue() {
		return AVenue;
	}
	
	public void setADate(String newDate) {
		ADate = newDate;
	}
	
	public void setATime(String newTime) {
		ATime = newTime;
	}
	
	public void setAVenue(String newVenue) {
		AVenue = newVenue;
	}

}
