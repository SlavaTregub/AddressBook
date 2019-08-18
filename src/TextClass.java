import javax.swing.*;
/**
 * TextClass create simple UI for interaction with options to
 * ADD
 * DELETE
 * UPDATE
 * FIND
 * person in AdressBook
 * and
 * EXIT
 */
class TextClass{

    public static void main(String args[]){
        AddressBook add = new AddressBook();
        int ch;
        int ID;
        String option;

        while(true){
            option = JOptionPane.showInputDialog("Enter 1 to add contact\nEnter 2 to search\nEnter 3 to remove\nEnter 4 to update\nEnter 5 to exit program");
            ch = Integer.parseInt(option);
            switch(ch){
                case 1:
                    add.addPerson();
                    break;
                case 2:
                    option = JOptionPane.showInputDialog("Enter contact ID");
                    ID = Integer.parseInt(option);
                    add.search(ID);
                    break;
                case 3:
                    option = JOptionPane.showInputDialog("Enter contact ID");
                    ID = Integer.parseInt(option);
                    add.remove(ID);
                    break;
                case 4:
                    option = JOptionPane.showInputDialog("Enter contact ID");
                    ID = Integer.parseInt(option);
                    add.update(ID);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}