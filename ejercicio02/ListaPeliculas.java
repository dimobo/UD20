package ejercicio02;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaPeliculas {

	private JFrame frame;
	private JTextField textPelicula;
	private JComboBox<String> combListaPeliculas;
	private JButton btnAñadir;
	private JTextPane txtpnPeliculas, textEscPelicula;
	private JPanel panel;

	/**
	 * Create the application.
	 */
	public ListaPeliculas() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 484, 161);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		textEscPelicula = new JTextPane();
		textEscPelicula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textEscPelicula.setEditable(false);
		textEscPelicula.setBackground(Color.GRAY);
		textEscPelicula.setText("Escribe el titulo de una pelicula");
		textEscPelicula.setBounds(38, 32, 190, 20);
		panel.add(textEscPelicula);

		txtpnPeliculas = new JTextPane();
		txtpnPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnPeliculas.setEditable(false);
		txtpnPeliculas.setText("Peliculas");
		txtpnPeliculas.setBackground(Color.GRAY);
		txtpnPeliculas.setBounds(313, 32, 56, 20);
		panel.add(txtpnPeliculas);

		textPelicula = new JTextField();
		textPelicula.setBounds(38, 64, 180, 20);
		panel.add(textPelicula);
		textPelicula.setColumns(10);

		btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.setBounds(38, 94, 74, 23);
		panel.add(btnAñadir);

		combListaPeliculas = new JComboBox<String>();
		combListaPeliculas.setBounds(262, 63, 180, 22);
		panel.add(combListaPeliculas);

		// Evento boton añadir.
		btnAñadir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				combListaPeliculas.addItem(textPelicula.getText());
				textPelicula.setText("");
			}
		});
	}
}
