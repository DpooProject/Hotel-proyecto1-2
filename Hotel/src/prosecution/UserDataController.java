package prosecution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import console.Console;

public class Loader {
 

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
        
        general.pri();
        
        
    }

    
    
}

