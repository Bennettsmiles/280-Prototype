package MedicalSystem;

/**
 *
 * @author Jacob Kwan Luke Ryan
 */

public class Patient {

    private String firstName = ""; 
    private String lastName = ""; 
    private int age = 0; 
    private String gender = ""; 
    private int socialSecurity = 0;
    private int insurancePolicyNum = 0;
    private int bankAccountNum = 0;
    private String password = "";
    private String userName = "";
    
    public Patient (String first, 
            String last, 
            int age, 
            String gender, 
            int socialSecurity, 
            int insurancePolicyNum,
            int bankAccount,
            String password){
        
        setFirstName(first);
        setLastName(last);
        setAge(age);
        setGender(gender);
        setSocialSecurity(socialSecurity);
        setInsurancePolicyNum(insurancePolicyNum);
        setBankAccountNum(bankAccount);
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
     * @return the socialSecurity
     */
    public int getSocialSecurity() {
        return socialSecurity;
    }

    /**
     * @param socialSecurity the socialSecurity to set
     */
    public void setSocialSecurity(int socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    /**
     * @return the insurancePolicyNum
     */
    public int getInsurancePolicyNum() {
        return insurancePolicyNum;
    }

    /**
     * @param insurancePolicyNum the insurancePolicyNum to set
     */
    public void setInsurancePolicyNum(int insurancePolicyNum) {
        this.insurancePolicyNum = insurancePolicyNum;
    }
    
    /**
     * @return the bankAccountNum
     */
    public int getBankAccountNum() {
        return bankAccountNum;
    }

    /**
     * @param bankAccountNum the bankAccountNum to set
     */
    public void setBankAccountNum(int bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
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
