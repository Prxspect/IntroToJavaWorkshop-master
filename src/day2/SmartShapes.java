package day2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot r2d2=new Robot ();

        // 3. Put the robot's pen down

r2d2.penDown();
        // 6. Make the robot move as fast as possible

r2d2.setSpeed(10);
        // 5. Do everything below here 4 times

for (int i = 0; i < 5; i++) {
	

        //         2. Move your robot 200 pixels
r2d2.move(200);

        //         4. Turn the robot 90 degrees to the right
r2d2.turn(360/5);  }
    	r2d2.sparkle();
    	r2d2.penDown();
    	r2d2.move(100)
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
    }
}
