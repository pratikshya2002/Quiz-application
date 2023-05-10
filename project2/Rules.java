import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
	String name;
	JButton start, back;
	
    Rules(String name){
    	this.name = name;
    	getContentPane().setBackground(Color.WHITE);
    	setLayout(null);
    	
    	
    	JLabel heading = new JLabel("Welcome" + name + "to Simple Minds");
		heading.setBounds(50, 20, 700, 30);
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
		heading.setForeground(new Color(30, 144, 254));
		add(heading);
		
		JLabel rules = new JLabel();
		rules.setBounds(20, 90, 700, 350);
		rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rules.setText(
		      "<html>"+
		    		 "1. You must use a functioning webcam and microphone"+ "<br><br>"+
		    		 "2. No cell phones or other secondary devices in the room or test area"+ "<br><br>"+
		    		 "3. Your desk/table must be clear or any materials except your test-taking device"+ "<br><br>" +
		    		 "4. No one else can be in the room with you"+ "<br><br>" +
		    		 "5. No talking "+ "<br><br>" +
		    		 "6. The testing room must be well-lit and you must be clearly visible"+ "<br><br>" +
		    		 "7. No dual screens/monitors"+ "<br><br>" +
		    		 "8. Do not leave the camera "+ "<br><br>" +
		    		 "9. No use of additional applications or internet"+ "<br><br>" +
              "<html>"
	    );
		add(rules);
		
		 back = new JButton("back");
	        back.setBounds(250, 500, 100, 30);
	        back.setBackground(new Color(30, 144, 254));
	        back.setForeground(Color.WHITE);
	        back.addActionListener(this);
	        add(back);
	        
	        start = new JButton("start");
	        start.setBounds(400, 500, 100, 30);
	        start.setBackground(new Color(30, 144, 254));
	        start.setForeground(Color.WHITE);
	        start.addActionListener(this);
	        add(start);

    	setSize(800, 650);
    	setLocation(350, 100);
    	setVisible(true);
    	
    	
    }
    
    public void actionPerformed(ActionEvent ae) {
    	if(ae.getSource()== start) {
    		setVisible(false);
    		new Quiz(name);
    		
    	}else {
    		setVisible(false);
    		new Login();
    	}
    }
	public static void main(String[] args) {
		new Rules("User");
		
	}

}

