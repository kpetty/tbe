
/*
 * Contractor attempts to sabotage company by billing and the google maps interface
 */

public class ExtendOverrideExample extends FinalExample{

	public ExtendOverrideExample() {
		super("some key", "some id");
	}
	
	
	// Override the waiveFee method... wink wink ;);)
	void waiveFee(long account, double fee, String reason, String supervisor_id){
		if(account == 123456789){
			// Contractor found out account info of someone they dislike
			// so they block waiving the fee 
			// and then the sabotage code is called
			this.changeValues();
		} else {
			// everybody else has correct logic applied 
			super.waiveFee(account, fee, reason, supervisor_id);
		}
	}

	// 
	private void changeValues(){
		this.EARTH_RADIUS = 4.3;
		this.MILES_PER_KM = 800;
		this.GOOGLE_API_KEY = "invalid key";
		this.GOOGLE_CLIENT_ID = "phony client id";
	}

	
	
}
