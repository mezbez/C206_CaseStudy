
public class Appointment {
	private String ADate;
	private String ATime;
	private String AVenue;
	private String AID;
	
	public Appointment(String aDate, String aTime, String aVenue, String aID) {
		ADate = aDate;
		ATime = aTime;
		AVenue = aVenue;
		AID = aID;
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
	public String getAID() {
		return AID;
	}

}
