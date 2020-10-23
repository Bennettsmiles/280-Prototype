package MedicalSystem;

import java.util.ArrayList;

/**
 *
 * @author Jacob Kwan Luke Ryan
 */
public class PatientBillingStatementDatabase {
    
    private static final ArrayList<String[]> BILLINGHISTORY = new ArrayList<>();
    
    public static void addBillingHistory(String userName, String date, int cost, String content)
    {
        String[] billingHistory = new String[5];
        billingHistory[0] = userName.toUpperCase();
        billingHistory[1] = date;
        billingHistory[2] = Integer.toString(PatientDatabase.getPatientByUsername(userName).getBankAccountNum());
        billingHistory[3] = Integer.toString(cost);
        billingHistory[4] = content;
        
        
        BILLINGHISTORY.add(billingHistory);
    }
    
    public static ArrayList<String> getBillingHistoryDates(String userName)
    {
        ArrayList<String> userBillingHistory = new ArrayList<>();
        
        for(int i = 0; i < BILLINGHISTORY.size(); i++)
        {
            if(BILLINGHISTORY.get(i)[0].equals(userName.toUpperCase()))
            {
                userBillingHistory.add(BILLINGHISTORY.get(i)[1]);
            }
        }
        
        return userBillingHistory;
    }
    
    public static String[] getBillingHistoryContent(String userName, String date)
    {   
        String[] content = new String[3];
        for(int i = 0; i < BILLINGHISTORY.size(); i++)
        {
            if(BILLINGHISTORY.get(i)[0].equals(userName.toUpperCase()) && BILLINGHISTORY.get(i)[1].equals(date))
            {
                content[0] = BILLINGHISTORY.get(i)[2];
                content[1] = BILLINGHISTORY.get(i)[3];
                content[2] = BILLINGHISTORY.get(i)[4];
            }
        }
        
        return content;
    }
}
