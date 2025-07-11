package gui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Programadores extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblN;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblMallquiGuitierrezGiancarlo;
	private JLabel lblN_2;
	private JLabel lblNewLabel_3;
	private JLabel lblFerroanMelchorMarco;
	private JLabel lblN_1;
	private JLabel lblN_4;
	private JLabel lblDurandDurandLuis;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;
	private JLabel lblNewLabel_5;
	private JLabel lblFernandezReyesJulio;
	private JLabel lblN_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programadores frame = new Programadores();
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
	public Programadores() {
		setTitle("PROGRAMADORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel = new JPanel();
			panel.setLayout(null);
			panel.setForeground(Color.WHITE);
			panel.setBackground(Color.ORANGE);
			panel.setBounds(0, 0, 827, 397);
			contentPane.add(panel);
			{
				lblNewLabel = new JLabel("FLORES LÓPEZ, JOSÉ GREGORIO RAFAEL");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(34, 157, 248, 24);
				panel.add(lblNewLabel);
			}
			{
				lblN = new JLabel("N00365040");
				lblN.setHorizontalAlignment(SwingConstants.CENTER);
				lblN.setBounds(76, 174, 129, 24);
				panel.add(lblN);
			}
			{
				lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setIcon(new ImageIcon(Programadores.class.getResource("/imagenes/FLORES LÓPEZ.JPG")));
				lblNewLabel_1.setBounds(66, -1, 157, 164);
				panel.add(lblNewLabel_1);
				ImageIcon iconoOriginal = new ImageIcon(Programadores.class.getResource("/imagenes/FLORES LÓPEZ.JPG"));
				Image imagen = iconoOriginal.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH); // tamaño más pequeño
				ImageIcon iconoEscalado = new ImageIcon(imagen);
				lblNewLabel_1.setIcon(iconoEscalado);

				panel.add(lblNewLabel_1);
			}
			{
				lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon(Programadores.class.getResource("/imagenes/MALLQUI.jpeg.jpg")));
				lblNewLabel_2.setBounds(354, 5, 150, 152);
				panel.add(lblNewLabel_2);
				
				// Cargar la imagen original
				ImageIcon iconoOriginal2 = new ImageIcon(Programadores.class.getResource("/imagenes/MALLQUI.jpeg.jpg"));

				// Escalar la imagen al tamaño que deseas (ajusta si quieres)
				Image imagen2 = iconoOriginal2.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);

				// Asignar la imagen escalada al JLabel
				ImageIcon iconoEscalado2 = new ImageIcon(imagen2);
				lblNewLabel_2.setIcon(iconoEscalado2);

				panel.add(lblNewLabel_2);
			}
			{
				lblMallquiGuitierrezGiancarlo = new JLabel("MALLQUI GUITIERREZ, GIANCARLO SEBASTIAN");
				lblMallquiGuitierrezGiancarlo.setHorizontalAlignment(SwingConstants.CENTER);
				lblMallquiGuitierrezGiancarlo.setBounds(292, 157, 274, 24);
				panel.add(lblMallquiGuitierrezGiancarlo);
			}
			{
				lblN_2 = new JLabel("N00373761");
				lblN_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblN_2.setBounds(364, 174, 129, 24);
				panel.add(lblN_2);
			}
			{
				lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setIcon(new ImageIcon(Programadores.class.getResource("/imagenes/MARCO.jpg")));
				lblNewLabel_3.setBounds(627, 5, 150, 152);
				panel.add(lblNewLabel_3);
				
				ImageIcon iconoOriginal3 = new ImageIcon(Programadores.class.getResource("/imagenes/MARCO.jpg"));

				// Redimensionar imagen
				Image imagen3 = iconoOriginal3.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);

				// Aplicar imagen escalada
				ImageIcon iconoEscalado3 = new ImageIcon(imagen3);
				lblNewLabel_3.setIcon(iconoEscalado3);

				panel.add(lblNewLabel_3);
			}
			{
				lblFerroanMelchorMarco = new JLabel("FERROÑAN MELCHOR, MARCO ANTONIO");
				lblFerroanMelchorMarco.setHorizontalAlignment(SwingConstants.CENTER);
				lblFerroanMelchorMarco.setBounds(579, 157, 248, 24);
				panel.add(lblFerroanMelchorMarco);
			}
			{
				lblN_1 = new JLabel("N00379444");
				lblN_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblN_1.setBounds(637, 174, 129, 24);
				panel.add(lblN_1);
			}
			{
				lblN_4 = new JLabel("N00382841");
				lblN_4.setHorizontalAlignment(SwingConstants.CENTER);
				lblN_4.setBounds(230, 366, 129, 24);
				panel.add(lblN_4);
			}
			{
				lblDurandDurandLuis = new JLabel("DURAND DURAND, LUIS FABRICIO");
				lblDurandDurandLuis.setHorizontalAlignment(SwingConstants.CENTER);
				lblDurandDurandLuis.setBounds(177, 349, 225, 24);
				panel.add(lblDurandDurandLuis);
			}
			{
				lblNewLabel_4 = new JLabel("");
				lblNewLabel_4.setIcon(new ImageIcon(Programadores.class.getResource("/imagenes/LUIS DURAND.jpg")));
				lblNewLabel_4.setBounds(219, 209, 140, 140);
				panel.add(lblNewLabel_4);
				ImageIcon iconoOriginal4 = new ImageIcon(Programadores.class.getResource("/imagenes/LUIS DURAND.jpg"));

				// Redimensionar imagen
				Image imagen4 = iconoOriginal4.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);

				// Aplicar imagen escalada
				ImageIcon iconoEscalado4 = new ImageIcon(imagen4);
				lblNewLabel_4.setIcon(iconoEscalado4);

				panel.add(lblNewLabel_4);
			}
			{
				btnNewButton = new JButton("ATRÁS");
				btnNewButton.addActionListener(this);
				btnNewButton.setBounds(10, 345, 89, 33);
				panel.add(btnNewButton);
			}
			{
				lblNewLabel_5 = new JLabel("");
				lblNewLabel_5.setIcon(new ImageIcon(Programadores.class.getResource("/imagenes/JULIO.jpg")));
				lblNewLabel_5.setBounds(476, 209, 150, 140);
				panel.add(lblNewLabel_5);
				ImageIcon iconoOriginal5 = new ImageIcon(Programadores.class.getResource("/imagenes/JULIO.jpg"));

				// Redimensionar la imagen a un tamaño apropiado
				Image imagen5 = iconoOriginal5.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);

				// Crear nuevo ImageIcon con la imagen redimensionada
				ImageIcon iconoEscalado5 = new ImageIcon(imagen5);

				// Asignar imagen al JLabel
				lblNewLabel_5.setIcon(iconoEscalado5);

				panel.add(lblNewLabel_5);
			}
			{
				lblFernandezReyesJulio = new JLabel("FERNANDEZ REYES, JULIO JOAQUIN");
				lblFernandezReyesJulio.setHorizontalAlignment(SwingConstants.CENTER);
				lblFernandezReyesJulio.setBounds(434, 349, 225, 24);
				panel.add(lblFernandezReyesJulio);
			}
			{
				lblN_3 = new JLabel("N00377043");
				lblN_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblN_3.setBounds(487, 366, 129, 24);
				panel.add(lblN_3);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Sistema_Administrador S1 = new Sistema_Administrador();
		S1.setVisible(true);
		this.setVisible(false);
	}
}
