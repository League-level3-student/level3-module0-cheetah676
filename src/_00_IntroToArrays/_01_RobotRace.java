package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[]args) {
		//2. create an array of 5 robots.
Robot[] robotArray=new Robot[9];
boolean win=false;
		//3. use a for loop to initialize the robots.
for(int i=0; i<robotArray.length; i++) {
	robotArray[i]=new Robot();
	robotArray[i].moveTo(100*i+50, 550);
	robotArray[i].setSpeed(120);
}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		while(win==false) {
    	for(int g=0; g<robotArray.length; g++) {
    		Random random=new Random();
    		robotArray[g].move(random.nextInt(5));
    		if(random.nextInt(5)==0) {
    			robotArray[g].move(-12);
    		}
    		if(robotArray[g].getY()<=0) {
    			win=true;
    			System.out.println("win");
    			g+=1;
    	    	JOptionPane.showMessageDialog(null, "Robot "+g+" is the winner!");
    	    	g-=1;
    	    	robotArray[g].sparkle();
    	    	break;
    		}
    		}
    	}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
		
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
