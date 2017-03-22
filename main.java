package f;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class main extends JFrame {
	Container contentPane;
	main(){
		setTitle("GUIGUIGUIGUIGUIGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("<html>HELLO<br>EE</html>");
		ImageIcon beauty = new ImageIcon("megu.jpg");
		JLabel ImageLabel = new JLabel(beauty);
		ImageIcon normalIcon = new ImageIcon("kanna.gif");
		JLabel label = new JLabel("HOHOHOHO",normalIcon, SwingConstants.CENTER);
		contentPane.add(textLabel);
		contentPane.add(ImageLabel);
		contentPane.add(label);
		setSize(450,1000);
		setVisible(true);
		
	}
	public static void main(String a[]){
		new main();
}
}