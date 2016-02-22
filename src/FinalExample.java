
/*
 * Class should apply best practices   
 */

public class FinalExample {
	
	 double EARTH_RADIUS = 6378.137; 			// i.e. a constant that should never change
	 double MILES_PER_KM = 0.621371192237334;	// i.e. a constant that should never change

	 String GOOGLE_API_KEY; 	// constant gets set during construction of the class
	 String GOOGLE_CLIENT_ID;	// constant gets set during construction of the class
	
	// constructor is used to set the key and id
	public FinalExample(String google_api_key, String google_client_id ){
		GOOGLE_API_KEY = google_api_key;
		GOOGLE_CLIENT_ID = google_client_id;		
	}
	
	 void waiveFee(long account, double fee, String reason, String supervisor_id ){
		 // TODO check supervisor_id to validate they have rights 
		 // i.e. authorized to waive the fee
		 // if authorized then do the waive of the fee
	}

}
