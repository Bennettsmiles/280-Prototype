package MedicalSystem;

import java.util.ArrayList;

/**
 *
 * @author Jacob Kwan Luke Ryan
 */
public class DoctorDatabase {
    private static final ArrayList<Doctor> DOCTORLIST = new ArrayList<>();
    
    public static void addDoctor(Doctor doctor)
    {
        DOCTORLIST.add(doctor);
    }
    
    public static Doctor getDoctorByUsername(String userName){
        for(int i = 0; i < DOCTORLIST.size(); i++)
        {
            if(DOCTORLIST.get(i).getUserName().equals(userName.toUpperCase()))
            {
                return DOCTORLIST.get(i);
            }
        }
        return null;
    }
}