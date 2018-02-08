import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ExampleFrame extends JFrame {
	
	// PRIVATE INSTANCE VARIABLES
	private JPanel _contentPanel;
	private EmptyBorder _myEmptyBorder;
	private BorderLayout _myBorderLayout;
	private JLabel _firstNameLabel = new JLabel("First Name: ");
	private String _firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
	private String _secondNumber = JOptionPane.showInputDialog("Enter second integer: ");
	private int messageReturn;
	

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExampleFrame frame = new ExampleFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 */



	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public ExampleFrame() {
		_Initialize();
	}

	private void _Initialize() {
		
		this._myEmptyBorder = new EmptyBorder(5, 5, 5, 5);
		this._myBorderLayout = new BorderLayout(0, 0);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this._contentPanel = new JPanel();
		this._contentPanel.setBorder(this._myEmptyBorder);
		this._contentPanel.setLayout(this._myBorderLayout);
		setContentPane(this._contentPanel);
		
		//JLabel lblNewLabel = new JLabel("First Name: ");
		this._contentPanel.add(_firstNameLabel, BorderLayout.NORTH);
		
		int number1 = Integer.parseInt(this._firstNumber);
		int number2 = Integer.parseInt(this._secondNumber);
		
		int sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Intergers", JOptionPane.PLAIN_MESSAGE);
		messageReturn = JOptionPane.showConfirmDialog(null, "Error- Incorrect Input", "Error", JOptionPane.YES_NO_CANCEL_OPTION);
		String welcome = "You are welcome";
		String WhatUp = "What do you want to do?";
		String Bye = "Good Bye";
		
	/*	switch(messageReturn) {
		case 0: 
			welcome;
			break;
		case 1:
			WhatUp;
			break;
		case 2:
			Bye;
			break;
			
		} */
		
	}

}
