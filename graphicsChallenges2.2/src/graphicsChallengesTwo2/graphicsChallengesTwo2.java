package graphicsChallengesTwo2;
import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
public class graphicsChallengesTwo2 extends Canvas 
	{

	private static final long	serialVersionUID	= 1L;

    	public static void main(String[] args) 
    		{
    		
	        graphicsChallengesTwo2 canvas = new graphicsChallengesTwo2();
	        JFrame frame = new JFrame();
	        frame.setSize(640, 668);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null);
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			for (int i = 0; i < 640; i = i + 160)
    				{
  					
    					for(int j = 0; j < 640; j = j + 160)
    						{
    							graphics.setColor(Color.black);
								graphics.fillRect(i, j, 80, 80);
    						}
    				}
    			
    			for (int i = 80; i < 640; i = i + 160)
    				{
    					for(int j = 80; j < 640; j = j + 160)
    						{
    							graphics.setColor(Color.black);
								graphics.fillRect(i, j, 80, 80);
    						}
    				}

    		}
    	
    	
    }