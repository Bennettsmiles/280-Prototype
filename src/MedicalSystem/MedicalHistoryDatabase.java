package MedicalSystem;

import java.util.ArrayList;

/**
 *
 * @author Smiles
 */
public class MedicalHistoryDatabase {
    
    private static final ArrayList<String[]> MEDICALHISTORY = new ArrayList<>();
    
    
    public static void addMedicalHistory(String userName, String date, String content, String location)
    {
        String[] medicalHistory = new String[4];
        medicalHistory[0] = userName.toUpperCase();
        medicalHistory[1] = date;
        medicalHistory[2] = content;
        medicalHistory[3] = location;
        
        MEDICALHISTORY.add(medicalHistory);
    }
    public static ArrayList<String> getMedicalHistoryDates(String userName)
    {
        ArrayList<String> userMedicalHistory = new ArrayList<>();
        
        for(int i = 0; i < MEDICALHISTORY.size(); i++)
        {
            if(MEDICALHISTORY.get(i)[0].equals(userName.toUpperCase()))
            {
                userMedicalHistory.add(MEDICALHISTORY.get(i)[1]);
            }
        }
        
        return userMedicalHistory;
    }
    public static String[] getMedicalHistoryContent(String userName, String date)
    {   
        String[] content = new String[3];
        for(int i = 0; i < MEDICALHISTORY.size(); i++)
        {
            if(MEDICALHISTORY.get(i)[0].equals(userName.toUpperCase()) && MEDICALHISTORY.get(i)[1].equals(date))
            {
                content[0] = MEDICALHISTORY.get(i)[1];
                content[1] = MEDICALHISTORY.get(i)[2];
                content[2] = MEDICALHISTORY.get(i)[3];
            }
        }
        
        return content;
    }
    
    public static ArrayList<String[]> getAllPatientHistory(String userName)
    {
        ArrayList<String[]> patientMedHistory = new ArrayList<>();
        
        for(int i = 0; i < MEDICALHISTORY.size(); i++)
        {
            String[] content = new String[3];
            
            if(MEDICALHISTORY.get(i)[0].equals(userName.toUpperCase())){
                content[0] = MEDICALHISTORY.get(i)[1];
                content[1] = MEDICALHISTORY.get(i)[2];
                content[2] = MEDICALHISTORY.get(i)[3];
                patientMedHistory.add(content);
            }
        }
        return patientMedHistory;
    }
}
