package frontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CalculatorLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorLayout frame = new CalculatorLayout();
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
	public CalculatorLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 223, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnButtonTwo = new JButton("2");
		
		JButton btnButtonFour = new JButton("4");
		
		JButton btnButtonOne = new JButton("1");
		
		JButton btnButtonThree = new JButton("3");
		
		JButton btnButtonFive = new JButton("5");
		
		JButton btnButtonSix = new JButton("6");
		
		JButton btnButtonSeven = new JButton("7");
		
		JButton btnButtonEight = new JButton("8");
		
		JButton btnButtonNine = new JButton("9");
		
		JButton btnButtonZero = new JButton("0");
		btnButtonZero.setFont(new Font("Arial", Font.BOLD, 9));
		
		JButton btnButtonDot = new JButton(".");
		
		JButton btnButtonDivision = new JButton("/");
		btnButtonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnButtonMultply = new JButton("X");
		btnButtonMultply.setFont(new Font("Arial", Font.PLAIN, 9));
		
		JButton btnButtonPlus = new JButton("+");
		btnButtonPlus.setFont(new Font("Arial", Font.PLAIN, 9));
		
		JButton btnButtonMinus = new JButton("-");
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton btnButtonEqual = new JButton("=\r\n");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnButtonZero, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonFour, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonSeven, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonOne, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnButtonTwo)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnButtonThree))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnButtonFive)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnButtonSix))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnButtonEight)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnButtonNine)))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(btnButtonEqual)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnButtonDot)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnButtonMinus)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(btnButtonMultply, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
									.addComponent(btnButtonDivision, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(btnButtonPlus, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnButtonTwo)
						.addComponent(btnButtonOne)
						.addComponent(btnButtonThree)
						.addComponent(btnButtonDivision))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnButtonFour)
						.addComponent(btnButtonFive)
						.addComponent(btnButtonSix)
						.addComponent(btnButtonMultply))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnButtonSeven)
						.addComponent(btnButtonEight)
						.addComponent(btnButtonNine)
						.addComponent(btnButtonPlus))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnButtonZero)
						.addComponent(btnButtonDot)
						.addComponent(btnButtonMinus)
						.addComponent(btnButtonEqual))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
