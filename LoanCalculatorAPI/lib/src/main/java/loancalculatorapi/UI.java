package loancalculatorapi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField tfInterestRate;
	private JTextField tfNumberOfYears;
	private JTextField tfLoanAmount;
	private JTextField tfMonthlyPayment;
	private JTextField tfTotalPayment;
	private String InterestRate;
	private String NumberOfYears;
	private String LoanAmount;

	public UI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\FAbdu\\Downloads\\calc.png"));
		setTitle("LoanCalculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Annual Interest Rate:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 36, 165, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumberOfYears = new JLabel("Number of Years:");
		lblNumberOfYears.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumberOfYears.setBounds(10, 67, 165, 21);
		contentPane.add(lblNumberOfYears);
		
		JLabel lblNewLabel_1_1 = new JLabel("Loan Amount:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 98, 165, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Monthly Payment:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(10, 129, 165, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Total Payment:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(10, 160, 165, 21);
		contentPane.add(lblNewLabel_1_3);
		
		tfInterestRate = new JTextField();
		tfInterestRate.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfInterestRate.setBounds(226, 39, 174, 21);
		contentPane.add(tfInterestRate);
		tfInterestRate.setColumns(10);
		
		tfNumberOfYears = new JTextField();
		tfNumberOfYears.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfNumberOfYears.setColumns(10);
		tfNumberOfYears.setBounds(226, 70, 174, 21);
		contentPane.add(tfNumberOfYears);
		
		tfLoanAmount = new JTextField();
		tfLoanAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfLoanAmount.setColumns(10);
		tfLoanAmount.setBounds(226, 101, 174, 21);
		contentPane.add(tfLoanAmount);
		
		tfMonthlyPayment = new JTextField();
		tfMonthlyPayment.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfMonthlyPayment.setColumns(10);
		tfMonthlyPayment.setBounds(226, 132, 174, 21);
		contentPane.add(tfMonthlyPayment);
		
		tfTotalPayment = new JTextField();
		tfTotalPayment.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfTotalPayment.setColumns(10);
		tfTotalPayment.setBounds(226, 163, 174, 21);
		contentPane.add(tfTotalPayment);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				InterestRate = tfInterestRate.getText();
				NumberOfYears = tfNumberOfYears.getText();
				LoanAmount = tfLoanAmount.getText();
				
				LoanClass obj = new LoanClass(InterestRate, NumberOfYears, LoanAmount);
			
				tfMonthlyPayment.setText("$"+obj.resultMonthlyPayment());
				tfTotalPayment.setText("$"+obj.resultTotalPayment());
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalculate.setBounds(301, 207, 99, 31);
		contentPane.add(btnCalculate);
	}
}
