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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class CalculatorLayout extends JFrame {

	private JPanel contentPane;
	private JButton btnButtonOne;
	private JButton btnButtonTwo; 
	private JButton btnButtonThree;
	private JButton btnButtonFour;
	private JButton btnButtonFive;
	private JButton btnButtonSix;
	private JButton btnButtonSeven;
	private JButton btnButtonEight;
	private JButton btnButtonNine;
	private JLabel display;
	
	
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
		setBounds(100, 100, 222, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnButtonZero = new JButton("0");
		btnButtonZero.setFont(new Font("Arial", Font.BOLD, 9));

		btnButtonOne = new JButton("1");
		btnButtonOne.setFont(new Font("Arial", Font.BOLD, 9));
		btnButtonTwo = new JButton("2");
		btnButtonTwo.setFont(new Font("Arial", Font.BOLD, 9));
		btnButtonThree = new JButton("3");
		btnButtonThree.setFont(new Font("Arial", Font.BOLD, 9));
		btnButtonFour = new JButton("4");
		btnButtonFour.setFont(new Font("Arial", Font.BOLD, 9));
		btnButtonFive = new JButton("5");
		btnButtonFive.setFont(new Font("Arial", Font.BOLD, 9));
		btnButtonSix = new JButton("6");
		btnButtonSix.setFont(new Font("Arial", Font.BOLD, 9));
		btnButtonSeven = new JButton("7");
		btnButtonSeven.setFont(new Font("Arial", Font.BOLD, 9));
		btnButtonEight = new JButton("8");
		btnButtonEight.setFont(new Font("Arial", Font.BOLD, 9));
		btnButtonNine = new JButton("9");
		btnButtonNine.setFont(new Font("Arial", Font.BOLD, 9));
		
		btnButtonTwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonTwoClicked(e);
			}
		});
		btnButtonOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonOneClicked(e);
			}
		});
		btnButtonThree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonThreeClicked(e);
			}
		});
		btnButtonFour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonFourClicked(e);
			}
		});
		btnButtonFive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonFiveClicked(e);
			}
		});
		btnButtonSix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonSixClicked(e);
			}
		});
		btnButtonSeven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonSevenClicked(e);
			}
		});
		btnButtonEight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonEightClicked(e);
			}
		});
		btnButtonNine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonNineClicked(e);
			}
		});
		btnButtonZero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonZeroClicked(e);
			}
		});
		JButton btnButtonDot = new JButton(".");
		btnButtonDot.setFont(new Font("Arial", Font.BOLD, 9));
		
		JButton btnButtonDivision = new JButton("/");
		btnButtonDivision.setFont(new Font("Arial", Font.BOLD, 9));
		
		JButton btnButtonMultply = new JButton("x\r\n");
		btnButtonMultply.setFont(new Font("Arial", Font.BOLD, 9));
		
		JButton btnButtonPlus = new JButton("+");
		btnButtonPlus.setFont(new Font("Arial", Font.BOLD, 9));
		
		JButton btnButtonMinus = new JButton("-");
		btnButtonMinus.setFont(new Font("Arial", Font.BOLD, 9));
		
		JButton btnButtonEqual = new JButton("=\r\n");
		btnButtonEqual.setFont(new Font("Arial", Font.BOLD, 9));
		
		btnButtonDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonDotClicked(e);
			}
		});
		btnButtonDivision.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonDivisionClicked(e);
			}
		});
		btnButtonMultply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonMultplyClicked(e);
			}
		});
		btnButtonPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonPlusClicked(e);
			}
		});
		btnButtonMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ifButtonMinusClicked(e);
			}
		});
		
		display = new JLabel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(display, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnButtonZero, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonFour, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonSeven, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonOne, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
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
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnButtonEqual)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnButtonDot)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnButtonMinus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonPlus, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonDivision, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonMultply, Alignment.TRAILING, 0, 0, Short.MAX_VALUE))))
					.addGap(100))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(display, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnButtonTwo)
								.addComponent(btnButtonOne)
								.addComponent(btnButtonThree))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnButtonFour)
								.addComponent(btnButtonFive)
								.addComponent(btnButtonSix))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnButtonSeven, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonEight, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnButtonNine, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnButtonZero)
								.addComponent(btnButtonDot)
								.addComponent(btnButtonEqual)
								.addComponent(btnButtonMinus)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnButtonDivision)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnButtonMultply, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnButtonPlus)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void ifButtonTwoClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "2");
	}
	private void ifButtonOneClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "1"); 
	}
	private void ifButtonThreeClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "3");
	} 
	private void ifButtonFourClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "4");
	} 
	private void ifButtonFiveClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "5");
	} 
	private void ifButtonSixClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "6");
	} 
	private void ifButtonSevenClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "7");
	} 
	private void ifButtonEightClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "8");
	} 
	private void ifButtonNineClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "9");
	} 
	private void ifButtonZeroClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "0");
	} 
	private void ifButtonDotClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + ".");
	} 
	private void ifButtonPlusClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "+");
	} 
	private void ifButtonMultplyClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "X");
	} 
	private void ifButtonMinusClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "-");
	} 
	private void ifButtonDivisionClicked(ActionEvent actionEvent) {
		String displayValue = display.getText();
		display.setText(displayValue + "/");
	} 
}
