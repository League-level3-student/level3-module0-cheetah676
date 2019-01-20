package _00_IntroToArrays;

import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.stream.IntStream;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		boolean run = false;
		int robotsRan=0;
		Robot[] robotArray = new Robot[5];
		boolean win = false;
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robotArray.length; i++) {
			robotArray[i] = new Robot();
			int startingPosition = 100 * i + 50;
			robotArray[i].moveTo(startingPosition, 400);
			robotArray[i].setSpeed(200);
			robotArray[i].miniaturize();
			robotArray[i].penDown();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		while (win == false) {
			for (int g = 0; g < robotArray.length; g++) {
				if (run==true && robotArray[g].getY() <= 400) {
					win = true;
					System.out.println("win");
					g += 1;
					JOptionPane.showMessageDialog(null, "Robot " + g + " is the winner!");
					g -= 1;
					robotArray[g].sparkle();
					break;
				}
				Random random = new Random();
				int randomValue = random.nextInt(3);
				int distance = 0;
				if (randomValue == 0) {
					distance = 2;
				} else if (randomValue == 1) {
					distance = 4;
				} else if (randomValue == 2) {
					distance = 6;
				}
				robotArray[g].move(distance);
				robotArray[g].turn((int) (distance / 2));
				robotsRan+=1;
				if(robotsRan>=600) {
					run=true;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

		}
	}
}
