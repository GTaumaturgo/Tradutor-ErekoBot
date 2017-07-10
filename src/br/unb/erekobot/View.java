package br.unb.erekobot;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class View extends JFrame{
	public JPanel mPanel = new JPanel();
	public JTextArea mIn = new JTextArea();
	public JTextArea mOut = new JTextArea();
	public JButton mBut = new JButton();
	
	public View(){
		mPanel.add(mIn);
		mPanel.add(mBut);
		mPanel.add(mOut);
		this.setVisible(true);
		this.add(mPanel);
	}
}
