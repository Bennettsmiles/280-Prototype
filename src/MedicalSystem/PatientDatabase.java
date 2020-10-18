package MedicalSystem;

import java.util.ArrayList;

/**
 *
 * @author Jacob Kwan Luke Ryan
 */
public class PatientDatabase {
    private static final ArrayList<Patient> PATIENTLIST = new ArrayList<>();
    
    public static void addPatient(Patient patient)
    {
        PATIENTLIST.add(patient);
    }
    
    public static Patient getPatientByUsername(String userName){
        for(int i = 0; i < PATIENTLIST.size(); i++)
        {
            if(PATIENTLIST.get(i).getUserName().equals(userName.toUpperCase()))
            {
                return PATIENTLIST.get(i);
            }
        }
        return null;
    }
    
    public static ArrayList<String> getPatientList (){
        
        ArrayList<String> Patients = new ArrayList<>();
        
        for(int i = 0; i < PATIENTLIST.size(); i++)
        {
            String Username = PATIENTLIST.get(i).getUserName();
            Patients.add(Username);
        }
        
        return Patients;
    }
}