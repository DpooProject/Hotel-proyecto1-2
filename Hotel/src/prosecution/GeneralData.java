package prosecution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralData {
	
	private static Map<String, List<String>> userData= new HashMap<>();;
	
	public GeneralData() {
        
    }
	
	public void addusers(String name, List<String> userDataList) {
		userData.put(name, userDataList);
		
	}
	public String getUserType(String username, String password) { //preguntar al monitor
	    
		if (userData.containsKey(username)) {
	    	
	        List<String> userValues = userData.get(username);
	        if (userValues.get(0).equals(password)) {
	            return userValues.get(1);
	        }
	    }
	    return "erróneo, intentelo de nuevo";
	}
	

}
