package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class UpdateClass extends JPanel{
	JDialog dialog = new JDialog();
	JLabel donaridJLabel = new JLabel("Donar ID : ");
	JTextField donaridField = new JTextField(15);
	JLabel label = new JLabel("Enter Your ID Such As (1206XXX) To Update Your Information");
	ImageIcon ImageIconX1 = new ImageIcon(getClass().getResource(
			"/Icon/pic2.jpg"));
	JButton button = new JButton("OK",ImageIconX1);
	Image Imagex1;
	 int id;
	String stringid;
	public void  update() {
		dialog.setTitle("Update");
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.CENTER);
		Imagex1 = ImageIconX1.getImage();
		this.add(donaridField);
		this.add(button);
		this.add(donaridJLabel);
		this.add(label);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stringid = donaridField.getText();
				id = Integer.parseInt(stringid);
				stringid = null;
				dialog.dispose();
				
			}
		});
		dialog.add(this);
		dialog.setTitle("Update");
		
		dialog.setModal(true);
		dialog.add(this);
		dialog.setSize(900, 600);
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
		
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		donaridJLabel.setLocation(250,220);
		label.setLocation(100,100);
		label.setForeground(Color.white);
		label.setFont(new Font("nhk",Font.ITALIC,25));
		donaridJLabel.setForeground(Color.white);
		donaridJLabel.setFont(new Font("nhk",Font.ITALIC,25));
		donaridField.setLocation(380,230);
		button.setLocation(480,280);
		button.setBackground(Color.black);
		button.setForeground(Color.white);
		button.setSize(80, 25);
		button.setFont(new Font("nhk",Font.ITALIC,16));
		g.drawImage(Imagex1, 0, 0, 900, 600, Color.red, null);
		
	}

}
