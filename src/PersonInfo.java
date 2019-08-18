import javax.swing.*;

/**
 * PersonInfo class describes person object variables
 * @ID - incremental ID
 * @fullNmae - person full name
 * @phoneNumber - person phone number
 * @birthDate - person date of birth
 *
 * method print displays person data to UI
 */

public class PersonInfo {

    int ID;
    String fullName;
    String phoneNumber;
    String birthDate;

    public PersonInfo(int ID, String fullName, String phoneNumber, String birthDate){
        this.ID = ID;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public void print(){

        JOptionPane.showMessageDialog(
            null,
            "Contact ID: " + ID + "\nFull name: " + fullName +"\nPhone No.: " + phoneNumber + "\nDate of birth: "+ birthDate);
    }

}
