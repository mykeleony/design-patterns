package behavioral_patterns.observer.SwingLifeChangingApp;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;

public class SwingObserver {
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserver example = new SwingObserver();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		
		JButton button = new JButton("Should I do it?");
		
		button.addActionListener(event ->
             System.out.println("Angel: Don't do it, you might regret it!")
		);
		button.addActionListener(event ->
            System.out.println("Devil: Come on, do it!")
		);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		// Set frame properties
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}

