package prosecution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralData {
	
	private Map<String, List<String>> userData;
	
	public GeneralData() {
        userData = new HashMap<>();
        
    }
	
	public void addusers(String name, List<String> userDataList) {
		userData.put(name, userDataList);
		
	}
	public void pri() {
		for (Map.Entry<String, List<String>> entry : userData.entrySet()) {
		    String key = entry.getKey();
		    List<String> value = entry.getValue();
		    System.out.println(key + " -> " + value);
		}
	}
	
	public String getUserType(String username, String password) {
	    if (userData.containsKey(username)) {
	        List<String> userValues = userData.get(username);
	        if (userValues.get(0).equals(password)) {
	            return userValues.get(1);
	        }
	    }
	    return "erróneo";
	}
	

}
