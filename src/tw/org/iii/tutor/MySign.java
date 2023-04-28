package tw.org.iii.tutor;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MySign extends JFrame{
	private MyDrawer myDrawer;
	
	
	
	
	public MySign() {
		super("簽名");
		myDrawer = new MyDrawer();
		setSize(800, 600);
		setLayout(new BorderLayout());
		add(myDrawer,BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MySign();
	}

}
