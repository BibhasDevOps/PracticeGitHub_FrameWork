package com.nihilent.com.screenshot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ScreenShotTest {


	
	public static void printScreen() throws AWTException, IOException {
		
		
		Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			    Robot robot = new Robot();
			    BufferedImage img = robot.createScreenCapture(rec);
			     
			    ImageIO.write(img,"jpg", new File("C:\\Users\\bibhas.barman\\Desktop\\ScreenShot\\test.jpg"));
			    
			
		
	}

	
}