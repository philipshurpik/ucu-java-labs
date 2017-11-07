package hw2.enumsHTTPcodes;

import hw2.enumsMaritalStatus.Person;
import hw2.enumsMaritalStatus.PersonReader;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        HttpService httpService = new HttpService();
        int code = Integer.parseInt(JOptionPane.showInputDialog("Please enter http code :"));
        httpService.handleHttpCode(code);
    }
}