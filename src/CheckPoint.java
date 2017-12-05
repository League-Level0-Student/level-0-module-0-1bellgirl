

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
String color=JOptionPane.showInputDialog(null, "What is your favorite color?");
JOptionPane.showMessageDialog(null,color+ " is also my favorite color!");
Robot Sparky= new Robot();
for (int i = 0; i < 3; i++) {
	Sparky.penDown();
	Sparky.setPenColor(Color.YELLOW);
	Sparky.setSpeed(50);
	Sparky.turn(120);
	Sparky.move(100);
	
}


}
}
