package gui_awt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JLabel lbmsg;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("NIET Sports Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 10, 107, 19);
		contentPane.add(lblNewLabel);
		
		tfName = new JTextField();
		tfName.setBounds(127, 13, 262, 19);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Roll Number");
		lblNewLabel_1.setBounds(10, 39, 107, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setBounds(10, 62, 107, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Section");
		lblNewLabel_3.setBounds(10, 91, 107, 19);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile Number");
		lblNewLabel_4.setBounds(10, 120, 107, 19);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 39, 262, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 62, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(127, 91, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(127, 120, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(256, 90, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(256, 113, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Select your Gender");
		lblNewLabel_5.setBounds(262, 65, 127, 19);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Select Your Interest");
		lblNewLabel_6.setBounds(174, 149, 96, 30);
		contentPane.add(lblNewLabel_6);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cricket");
		chckbxNewCheckBox.setBounds(24, 175, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Football");
		chckbxNewCheckBox_1.setBounds(160, 175, 93, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Basketball");
		chckbxNewCheckBox_2.setBounds(296, 175, 93, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Badminton");
		chckbxNewCheckBox_3.setBounds(24, 198, 93, 21);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Volleyball");
		chckbxNewCheckBox_4.setBounds(160, 198, 93, 21);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Chess");
		chckbxNewCheckBox_5.setBounds(296, 198, 93, 21);
		contentPane.add(chckbxNewCheckBox_5);
		
		JLabel lblNewLabel_7 = new JLabel("Any other please specify");
		lblNewLabel_7.setBounds(24, 221, 119, 19);
		contentPane.add(lblNewLabel_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(144, 225, 248, 30);
		contentPane.add(textArea);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = tfName.getText();
				lbmsg.setText("Congrats"+ text +"!! you are successfully registered");
			}
		});
		btnSubmit.setBounds(10, 256, 127, 31);
		contentPane.add(btnSubmit);
		
		lbmsg = new JLabel("");
		lbmsg.setBounds(160, 260, 245, 22);
		contentPane.add(lbmsg);
	}
}
