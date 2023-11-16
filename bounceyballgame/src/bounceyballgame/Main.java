package bounceyballgame;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.*;
import java.awt.*;
import javax.swing.JComponent;


public class Main {

	public static void main(String[] args) {
		createInterface();

	}
	
public static void createInterface() {
		

		// - Basic JFrame Set up
		   JFrame frame = new JFrame("Countdown Timer");
	       frame.setSize(600,600);
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
	       Paddle paddle = new Paddle();
	       frame.getContentPane().add(paddle);
	        frame.setVisible(true);  
	        
	        // - User Input Handling
	        frame.addKeyListener(new KeyListener() {
	            @Override
	            public void keyTyped(KeyEvent e) {
	                // Not used in this example
	            }

	            @Override
	            public void keyPressed(KeyEvent e) {
	                int keyCode = e.getKeyCode();

	                if (keyCode == KeyEvent.VK_LEFT) {
	                    System.out.println("Left arrow key pressed");
	                    frame.repaint();
	                    paddle.moveRight();
	                    
	                    
	                } else if (keyCode == KeyEvent.VK_RIGHT) {
	                    System.out.println("Right arrow key pressed");
	                    frame.repaint();
	                    paddle.moveLeft();
	                } 
	            }

	            @Override
	            public void keyReleased(KeyEvent e) {
	                // Not used in this example
	            }
	        });

	        frame.setFocusable(true);
	       
	        }


}

