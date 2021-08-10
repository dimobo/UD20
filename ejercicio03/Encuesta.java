package ejercicio03;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;

public class Encuesta {

	private JFrame frame;
	private JPanel panel;
	private JTextPane txtpnSo, txtpnEsp;
	private JRadioButton rdbtnW, rdbtnL, rdbtnM;
	private ButtonGroup groupR;
	private JCheckBox chckbxPro, chckbxAdmin, chckbxDis;
	private JTextPane txtpnHoras;
	private JSlider sliderHoras;
	private JButton btnEnviar;

	/**
	 * Create the application.
	 */
	public Encuesta() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 464, 311);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txtpnSo = new JTextPane();
		txtpnSo.setEditable(false);
		txtpnSo.setBackground(Color.GRAY);
		txtpnSo.setText("Elija un sistema operativo:");
		txtpnSo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnSo.setBounds(21, 34, 166, 23);
		panel.add(txtpnSo);

		rdbtnW = new JRadioButton("Windows");
		rdbtnW.setBackground(Color.GRAY);
		rdbtnW.setBounds(31, 64, 109, 23);
		panel.add(rdbtnW);

		rdbtnL = new JRadioButton("Linux");
		rdbtnL.setBackground(Color.GRAY);
		rdbtnL.setBounds(31, 90, 109, 23);
		panel.add(rdbtnL);

		rdbtnM = new JRadioButton("Mac");
		rdbtnM.setBackground(Color.GRAY);
		rdbtnM.setBounds(31, 116, 109, 23);
		panel.add(rdbtnM);

		groupR = new ButtonGroup();
		groupR.add(rdbtnL);
		groupR.add(rdbtnW);
		groupR.add(rdbtnM);

		txtpnEsp = new JTextPane();
		txtpnEsp.setEditable(false);
		txtpnEsp.setText("Elije tu especialidad:");
		txtpnEsp.setBackground(Color.GRAY);
		txtpnEsp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnEsp.setBounds(237, 34, 127, 23);
		panel.add(txtpnEsp);

		chckbxPro = new JCheckBox("Programaci\u00F3n");
		chckbxPro.setBackground(Color.GRAY);
		chckbxPro.setBounds(247, 64, 135, 23);
		panel.add(chckbxPro);

		chckbxAdmin = new JCheckBox("Administraci\u00F3n");
		chckbxAdmin.setBackground(Color.GRAY);
		chckbxAdmin.setBounds(247, 116, 117, 23);
		panel.add(chckbxAdmin);

		chckbxDis = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		chckbxDis.setBackground(Color.GRAY);
		chckbxDis.setBounds(247, 90, 117, 23);
		panel.add(chckbxDis);

		txtpnHoras = new JTextPane();
		txtpnHoras.setBackground(Color.GRAY);
		txtpnHoras.setText("Horas dedicadas en el ordenador:");
		txtpnHoras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnHoras.setBounds(21, 154, 253, 20);
		panel.add(txtpnHoras);

		sliderHoras = new JSlider();
		sliderHoras.setToolTipText("");
		sliderHoras.setValue(0);
		sliderHoras.setMaximum(10);
		sliderHoras.setBounds(21, 185, 211, 23);
		panel.add(sliderHoras);

		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(171, 245, 122, 35);
		panel.add(btnEnviar);

		// Evento boton enviar.
		btnEnviar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Sistema Operativo: ");
				if (rdbtnW.isSelected() == true) {
					System.out.println(rdbtnW.getText());
				}
				if (rdbtnL.isSelected() == true) {
					System.out.println(rdbtnL.getText());
				}
				if (rdbtnM.isSelected() == true) {
					System.out.println(rdbtnM.getText());
				}

				System.out.println("\nEspecialidades: ");
				if (chckbxPro.isSelected() == true) {
					System.out.println(chckbxPro.getText());
				}
				if (chckbxDis.isSelected() == true) {
					System.out.println(chckbxDis.getText());
				}
				if (chckbxAdmin.isSelected() == true) {
					System.out.println(chckbxAdmin.getText());
				}

				System.out.println("\nHoras dedicadas en el ordenador:");
				System.out.println(sliderHoras.getValue());

			}
		});
	}
}
