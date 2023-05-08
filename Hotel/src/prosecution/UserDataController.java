package prosecution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import console.Console;

public class UserDataController {
	//Attributes
	private static Map<String, List<String>> userData= new HashMap<>();
	
	//Methods
	public void addusers(String name, List<String> userDataList) {
		userData.put(name, userDataList);
		
	}
	public void print() {
		for (Map.Entry<String, List<String>> entry : userData.entrySet()) {
		    String key = entry.getKey();
		    List<String> value = entry.getValue();
		    System.out.println(key + " -> " + value);
		}
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
	


    public void readCSV(String fileName) throws IOException {
    	GeneralData general = new GeneralData();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            String user = values[0];
            String password = values[1];
            String type = values[2];
            List<String> userDataList = new ArrayList<>();
            userDataList.add(password);
            userDataList.add(type);
            general.addusers(user, userDataList);
           
        }
        reader.close();
        

        
        
    }

    
    
}

