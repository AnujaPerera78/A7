import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;

public class Power extends JFrame {

	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textExponent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Power frame = new Power();
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
	public Power() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Power");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(198, 11, 109, 31);
		contentPane.add(lblNewLabel);

		JLabel lblEnterBase = new JLabel("Enter the Base");
		lblEnterBase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterBase.setBounds(43, 58, 98, 31);
		contentPane.add(lblEnterBase);

		JLabel lblEnterExp = new JLabel("Enter the Exponent ");
		lblEnterExp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterExp.setBounds(43, 90, 127, 31);
		contentPane.add(lblEnterExp);

		textBase = new JTextField();
		textBase.setBounds(180, 63, 86, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);

		textExponent = new JTextField();
		textExponent.setColumns(10);
		textExponent.setBounds(180, 97, 86, 20);
		contentPane.add(textExponent);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalculate.setBounds(302, 62, 89, 23);
		contentPane.add(btnCalculate);

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(302, 96, 89, 23);
		contentPane.add(btnExit);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(43, 145, 358, 243);
		contentPane.add(textArea);

		btnCalculate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					int base = Integer.parseInt(textBase.getText());
					int exponent = Integer.parseInt(textExponent.getText());
					String output = "";

					if (true) {
						for (int i = 1; i <= exponent; i++) {
							output = (output + base + " to the exponent " + i + " = " + (Math.pow(base, i)) + "\n");
							textArea.setText(output);

						}

					}
				}

				catch (NumberFormatException ex) {
					textArea.setText("Enter in correct format");
				}
			}
		});

		btnExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}
}
