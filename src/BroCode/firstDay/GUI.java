package BroCode.firstDay;

import javax.swing.*;

public class GUI {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null,"Hellow "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age ")) ;
        JOptionPane.showMessageDialog(null,"Your are "+ age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height "));
        JOptionPane.showMessageDialog(null,"Your are "+ height + " cm tail");
    }
}
