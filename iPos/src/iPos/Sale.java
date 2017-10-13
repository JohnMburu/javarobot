package iPos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import java.awt.Font;

public class Sale {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sale window = new Sale();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblCode = new JLabel("Code");
		lblCode.setBounds(10, 15, 25, 14);
		frame.getContentPane().add(lblCode);
		
		textField = new JTextField();
		textField.setBounds(35, 12, 213, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(258, 11, 65, 23);
		frame.getContentPane().add(btnSearch);
		
		JLabel lblTotal = new JLabel("");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotal.setBounds(259, 181, 78, 20);
		frame.getContentPane().add(lblTotal);
		
		JLabel Total = new JLabel("Total");
		Total.setFont(new Font("Tahoma", Font.BOLD, 16));
		Total.setBounds(202, 181, 46, 20);
		frame.getContentPane().add(Total);
	}
}
