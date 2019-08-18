import javax.swing.*;
import java.util.*;
/**
 * AdressBook class represents in-session DB for Person storage
 *
 * method addPerson insert new person data to AdressBook. Shows to user ID, by which user can perform search or delete action
 * method search search Person in AdressBoook by given ID
 * method remove delete Person from AdressBook by given ID
 */
class AddressBook {
    ArrayList<PersonInfo> persons;

    //constructor
    public AddressBook ( ) {
        persons = new ArrayList<PersonInfo>();
    }

    private void noPersonFound(int ID) {
        JOptionPane.showMessageDialog(
                null,
                "No person with ID: " + ID + " were found. Please try again."
        );
    }

    private void findPerson(){

    }

    //add new person record to arraylist after taking input
    public void addPerson( ) {

        int ID = Generator.generateId();
        String fullName = JOptionPane.showInputDialog("Enter Full Name");
        String phoneNumber = JOptionPane.showInputDialog("Enter phone number");
        String birthDate = JOptionPane.showInputDialog("Enter date of birth");

        //construct new person object
        PersonInfo p = new PersonInfo(ID, fullName, phoneNumber, birthDate);

        //add the above PersonInfo object to arraylist
        persons.add(p);

        JOptionPane.showMessageDialog(
                null,
                "Contact successfully created!\nContact ID is " + ID + "\nuse it for search/update/delete contact functionality"
        );
    }

    //search person record in arraylist by ID
    public void search(int ID){

        for(int i = 0; i < persons.size(); i++){
            PersonInfo p = (PersonInfo)persons.get(i);
            if(ID == p.ID){
                p.print();
            } else {
                noPersonFound(ID);
            }
        }

    }

    //delete person record from arraylist by ID
    public void remove(int ID){
        for(int i = 0; i < persons.size(); i++){
            PersonInfo p = (PersonInfo)persons.get(i);
            if(ID == p.ID){
                persons.remove(i);
            } else {
                noPersonFound(ID);
            }
        }

    }

    //update person record from arraylist by ID
    public void update(int ID){
        for(int i = 0; i < persons.size(); i++){
            PersonInfo p = (PersonInfo)persons.get(i);
            if(ID == p.ID){
                String fullName = JOptionPane.showInputDialog("Update Full Name");
                String phoneNumber = JOptionPane.showInputDialog("Update phone number");
                String birthDate = JOptionPane.showInputDialog("Update date of birth");

                p.fullName = fullName;
                p.phoneNumber = phoneNumber;
                p.birthDate = birthDate;

                JOptionPane.showMessageDialog(
                        null,
                        "Contact successfully updated!\nContact ID is " + ID + "\nuse it for search/update/delete contact functionality"
                );
            } else {
                noPersonFound(ID);
            }
        }

    }

}