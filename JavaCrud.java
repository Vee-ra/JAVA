import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JavaCrud {

	private JFrame frame;
	private JTextField txtbname;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCrud window = new JavaCrud();
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
	public JavaCrud() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 757, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Shop");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(261, 10, 188, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 84, 323, 163);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 30, 89, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Edition");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(21, 69, 89, 29);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Price");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(21, 108, 89, 29);
		panel.add(lblNewLabel_1_2);
		
		txtbname = new JTextField();
		txtbname.setBounds(130, 37, 173, 19);
		panel.add(txtbname);
		txtbname.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 76, 173, 19);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 115, 173, 19);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(22, 288, 77, 55);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(119, 288, 77, 55);
		frame.getContentPane().add(btnExit);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.setBounds(218, 288, 77, 55);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(343, 82, 390, 269);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(22, 401, 323, 88);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Book ID");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 28, 89, 29);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 35, 181, 22);
		panel_1.add(textField_2);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(425, 410, 101, 55);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnNewButton_1_2 = new JButton("Delete");
		btnNewButton_1_2.setBounds(547, 410, 101, 55);
		frame.getContentPane().add(btnNewButton_1_2);
	}
}
