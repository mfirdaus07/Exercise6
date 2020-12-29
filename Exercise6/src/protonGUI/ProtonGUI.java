package protonGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;


public class ProtonGUI {

	private JFrame frmProton;
	private JTextField box_answer;
	private JTextArea txtrDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProtonGUI window = new ProtonGUI();
					window.frmProton.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProtonGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProton = new JFrame();
		frmProton.setResizable(false);
		frmProton.setIconImage(Toolkit.getDefaultToolkit().getImage(ProtonGUI.class.getResource("/img/icon.png")));
		frmProton.setTitle("Proton Car");
		frmProton.setBounds(100, 100, 662, 557);
		frmProton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton protonIriz = new JButton("");
		protonIriz.setBackground(new Color(0, 0, 205));
		protonIriz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String test; 
				test= ("Model: Proton Iriz | RM 36,700.00"); //set the string
				box_answer.setText(test); //display the string inside text field name box_answer
				
				txtrDisplay.setText("Proton Persona:" //set the string
						+ "\n\nBasic Salary: RM 2,500" //display the string inside text area name txtrDisplay
						+ "\n\nMonthly installment: RM 500"
						+ "\n\nSPECIFICATIONS"
						+ "\nVarian : 1.6 Standart MT/CVT | Executive CVT | Premium CVT"
						+ "\nTransmission Type: 5-Speed Manual | 4-Speed Automatic"
						+ "\nEngine Type : 4 Cylinder In-Line, 16 Valve Dohc, VVT"
						+ "\nDisplacement(cc) : 1.597"
						+ "\nFuel Tank Capacity : 40 L"
						+ "\n\nSafety Features: \t\r\n1.Front SRS Airbags \n2.Anti-Lock Braking System (ABS) \n3.Electronic Brake Distribution (EBD)"
						+ "\n\nAccesories: \n1.8 inch Touch Screen Monitor \n 2.Leather Seat \n3.Daylight Runing LED");

				
			}
		});
		protonIriz.setToolTipText("Proton Iriz");
		protonIriz.setIcon(new ImageIcon(ProtonGUI.class.getResource("/img/iriz3.png")));
		
		JButton protonPersona = new JButton("");
		protonPersona.setBackground(Color.ORANGE);
		protonPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String test; 
				test= ("Model: Proton Persona | RM 42,600.00");
				box_answer.setText(test);
				
				txtrDisplay.setText("Proton Persona:"
						+ "\n\nBasic Salary: RM 2,500"
						+ "\n\nMonthly installment: RM 500"
						+ "\n\nSPECIFICATIONS"
						+ "\nVarian : 1.6 Standart MT/CVT | Executive CVT | Premium CVT"
						+ "\nTransmission Type: 5-Speed Manual | 4-Speed Automatic"
						+ "\nEngine Type : 4 Cylinder In-Line, 16 Valve Dohc, VVT"
						+ "\nDisplacement(cc) : 1.597"
						+ "\nFuel Tank Capacity : 40 L"
						+ "\n\nSafety Features: \t\r\n1.Front SRS Airbags \n2.Anti-Lock Braking System (ABS) \n3.Electronic Brake Distribution (EBD)"
						+ "\n\nAccesories: \n1.8 inch Touch Screen Monitor \n 2.Leather Seat \n3.Daylight Runing LED");

				
			}
		});
		protonPersona.setToolTipText("Proton Persona");
		protonPersona.setIcon(new ImageIcon(ProtonGUI.class.getResource("/img/persona3.png")));
		
		JButton protonSaga = new JButton("");
		protonSaga.setBackground(new Color(255, 0, 0));
		protonSaga.setHorizontalAlignment(SwingConstants.TRAILING);
		protonSaga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String test; 
				test= ("Model: Proton Saga | Price : RM 32,000");
				box_answer.setText(test);
				
				txtrDisplay.setText("Proton Saga:"
						+ "\n\nBasic Salary: RM 1,500"
						+ "\n\nMonthly installment: RM 400"
						+ "\n\nSPECIFICATIONS"
						+ "\nVarian : 1.3 Standart MT/AT | Premium AT"
						+ "\nTransmission Type: 5-Speed Manual | 4-Speed Automatic"
						+ "\nEngine Type : 4 Cylinder In-Line, 16 Valve Dohc, VVT"
						+ "\nDisplacement(cc) : 1.332"
						+ "\nFuel Tank Capacity : 40 L"
						+ "\n\nSafety Features: \t\r\n1.Front SRS Airbags \n2.Anti-Lock Braking System (ABS) \n3.Electronic Brake Distribution (EBD)"
						+ "\n\nAccesories: \n1.7 inch Touch Screen Monitor \n 2.Leather Seat");

				/*JOptionPane.showMessageDialog(null, "Proton X50:"
						+ "\nBasic Salary: RM 4,500"
						+ "\nMonthly installment: RM 800"
						+ "\nHorsePower: 175PS"
						+ "\nFeatures: 1.Comprehensive ADAS suite and safety features \n2.Hi-tech infotainment system"
						+ "\nAccesories: 1.Electric Powered Tailgate | 2.Coil Mats | 3.Sunshades");*/
			}
		});
		protonSaga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		protonSaga.setToolTipText("Proton Saga");
		protonSaga.setIcon(new ImageIcon(ProtonGUI.class.getResource("/img/saga1.png")));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(ProtonGUI.class.getResource("/img/PROTON Static Logo (1).png")));
		
		JButton protonX70 = new JButton("");
		protonX70.setBackground(new Color(255, 255, 255));
		protonX70.setToolTipText("Proton X70");
		protonX70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String test; 
				test= ("Model: Proton X70 | RM 36,700.00");
				box_answer.setText(test);
				
				txtrDisplay.setText("Proton X70:"
						+ "\n\nBasic Salary: RM 3,500"
						+ "\n\nMonthly installment: RM 1000"
						+ "\n\nSPECIFICATIONS"
						+ "\nVarian : 1.8 TGHDI Standart 2WD | Executive 2WD | Premium X"
						+ "\nTransmission Type: 7-Speed Dual Clutch with Manual Mode"
						+ "\nEngine Type : 4 Cylinder In-Line, 16 Valve DOHC, TGDI"
						+ "\nDisplacement(cc) : 1.799"
						+ "\nFuel Tank Capacity : 60 L"
						+ "\n\nSafety Features: \t\r\n1.6 SRS Airbags (Front, Side & Curtain) \n2.Anti-Lock Braking System (ABS) \n3.Electronic Brake Distribution (EBD \n4.Auto Brake Hold \n5.Traction Control System(TCS))"
						+ "\n\nAccesories: \n1.Panoramic Sunroof \n 2.Leather Seat \n3.Daylight Runing LED \n4.9 speakers with power amplifier & subwoofer \n5.360 camera");

			}
		});
		protonX70.setIcon(new ImageIcon(ProtonGUI.class.getResource("/img/x70.png")));
		
		box_answer = new JTextField();
		box_answer.setText("Model");
		box_answer.setFont(new Font("Arial", Font.PLAIN, 12));
		box_answer.setEditable(false);
		box_answer.setHorizontalAlignment(SwingConstants.LEFT);
		box_answer.setColumns(5);
		
		txtrDisplay = new JTextArea();
		txtrDisplay.setEditable(false);
		txtrDisplay.setFont(new Font("Arial", Font.PLAIN, 12));
		txtrDisplay.setTabSize(10);
		txtrDisplay.setRows(10);
		txtrDisplay.setText("Spec Display");
		
		
		
		GroupLayout groupLayout = new GroupLayout(frmProton.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(153)
					.addComponent(lblNewLabel)
					.addContainerGap(153, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(protonX70, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(protonIriz, GroupLayout.PREFERRED_SIZE, 237, Short.MAX_VALUE)
						.addComponent(protonPersona, GroupLayout.PREFERRED_SIZE, 272, Short.MAX_VALUE)
						.addComponent(protonSaga, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(box_answer, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
						.addComponent(txtrDisplay, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(protonSaga, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(protonPersona, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(protonIriz, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(protonX70))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(box_answer, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addComponent(txtrDisplay, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)))
					.addGap(36))
		);
		frmProton.getContentPane().setLayout(groupLayout);
	}
}
