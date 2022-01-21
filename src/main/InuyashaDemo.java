package main;

import javax.swing.JFrame;

import gameInterface.InuyashaStartPage;

public class InuyashaDemo extends JFrame
{
	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 635;

	public InuyashaDemo()
	{
		setTitle("Inuyasha");
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args)
	{
		new InuyashaStartPage(new InuyashaDemo());

	}
}
