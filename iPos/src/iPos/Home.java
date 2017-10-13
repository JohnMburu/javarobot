package iPos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
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
		
		JButton btnIpos = new JButton("Sale");
		btnIpos.setIcon(new ImageIcon(Home.class.getResource("/Resources/Oxygen-Icons.org-Oxygen-Actions-system-switch-user.ico")));
		btnIpos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIpos.setBounds(10, 36, 133, 181);
		frame.getContentPane().add(btnIpos);
		
		JButton btnBackOffice = new JButton("Back Office");
		btnBackOffice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBackOffice.setBounds(153, 35, 133, 79);
		frame.getContentPane().add(btnBackOffice);
		
		JButton btnReports = new JButton("Reports");
		btnReports.setBounds(153, 138, 133, 79);
		frame.getContentPane().add(btnReports);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setBounds(296, 36, 133, 181);
		frame.getContentPane().add(btnSettings);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
