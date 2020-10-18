//what 
  //      the heck 
package MedicalSystem;

/**
 *
 * @author Jacob Kwan Luke Ryan
 */

public class Doctor {
    
    private String firstName = ""; 
    private String lastName = ""; 
    private int age = 0; 
    private String gender = "";
    private String education = "";
    private String hospital = "";
    private String password = "";
    private String userName = "";
    
    public Doctor (String first, 
            String last, 
            int age, 
            String gender,
            String education,
            String hospital,
            String password){
        
        setFirstName(first);
        setLastName(last);
        setAge(age);
        setGender(gender);
        setEducation(education);
        setHospital(hospital);
        setPassword(password);
        setUserName(first, last);
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender.toUpperCase();
    }
    /**
     * @return the education
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education the firstName to set
     */
    public void setEducation(String education) {
        this.education = education.toUpperCase();
    }
    
    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the age to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital.toUpperCase();
    }
    
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    private void setUserName(String first, String last) {
        String parsedName = first.substring(0, 1).toUpperCase() + last.toUpperCase();
        this.userName = parsedName;
    }
}
