package hw2.enumsMaritalStatus;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Person oldPerson = null;

        while (true) {
            Person newPerson = PersonReader.read();
            if (newPerson.equals(oldPerson)) {
                JOptionPane.showMessageDialog(null,"You again??");
            }
            JOptionPane.showMessageDialog(null, "Result: " + newPerson.toString());
            oldPerson = newPerson;
        }
    }
}
