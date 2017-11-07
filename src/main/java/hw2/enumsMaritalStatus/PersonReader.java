package hw2.enumsMaritalStatus;

import javax.swing.*;

public class PersonReader {
    public static Person read() {
        String name = readValue("name");
        int age = Integer.parseInt(readValue("age"));

        MaritalStatus maritalStatus = null;
        while (maritalStatus == null) {
            try {
                int ms = Integer.parseInt(readValue("marital status (1..4)"));
                maritalStatus = MaritalStatus.findByDbCode(ms);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Please enter correct value for marital status (1..4)");
            }
        }
        return new Person(name, age, maritalStatus);
    }

    private static String readValue(String text) {
        return JOptionPane.showInputDialog("Please enter " + text + " :");
    }
}
