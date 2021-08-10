package ejercicio01;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Saludador {

	private JFrame frame;
	private JTextField textNombre;
	private JButton btnSaludar;
	private JTextPane txtTitulo;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 */
	public Saludador() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 434, 161);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txtTitulo = new JTextPane();
		txtTitulo.setEnabled(true);
		txtTitulo.setEditable(false);
		txtTitulo.setBackground(Color.GRAY);
		txtTitulo.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtTitulo.setText("Escribe un nombre para saludar");
		txtTitulo.setBounds(62, 31, 309, 34);
		panel.add(txtTitulo);

		textNombre = new JTextField();
		textNombre.setBounds(54, 76, 325, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);

		btnSaludar = new JButton("¡Saludar!");
		btnSaludar.setBounds(172, 107, 89, 23);
		panel.add(btnSaludar);

		// Evento boton saludar.
		btnSaludar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola " + textNombre.getText() + "!");
			}
		});

	}
}
