package day2;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot it = new Robot("batman");
	
	void makeStars() {
		
		
		// 13. Set the speed to 8
it.setSpeed(8);
		// 6. Make a variable to hold the X position of the Robot and set it to 10
int xposition=10;
		// 7. Make a variable to hold the Y position of the Robot and set it to 950
int yposition=300;
		// 8. Make a variable to hold the star size and set it to 25
int starSize=25;
		// 12. Repeat the steps #19 to #18, 30 times
for (int i = 0; i < 30; i++) {
	

			// 19. Set the pen width to i 
	it.setPenWidth(i);
			// 10. Set the X position of the robot to your X variable
	it.setX(xposition);
			// 11. Set the Y position of the robot to your Y variable
	it.setY(yposition);
			// 9. Call the drawStar() method with your star size variable
	
			// 14. Increase the X position by star size. See Figure 2
	xposition=xposition+starSize;
			// 15. decrease the Y position by star size. See Figure 3
	yposition=yposition+starSize;
			// 16. Increase the star size by 20
	starSize=starSize+20;
			// 17. Turn the robot 12 degrees
	it.turn(12);
			// 18. Make each star a different random color like in Figure 4
it.setRandomPenColor(); }
	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}



