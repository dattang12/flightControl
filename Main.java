package flightControl;

import java.util.Scanner;
import flightControl.logic.FlightControl;
import flightControl.ui.UserInterface;
import javax.swing.plaf.TextUI;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl control = new FlightControl();
        UserInterface ui = new TextUI.java(control, scanner);
        ui.start();
    }
}