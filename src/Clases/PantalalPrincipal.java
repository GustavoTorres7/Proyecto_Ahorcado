package Clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;

public class PantalalPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantalalPrincipal frame = new PantalalPrincipal();
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
	public PantalalPrincipal() {
		setTitle("JUEGO AHORCADO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		mnOpciones.setHorizontalAlignment(SwingConstants.CENTER);
		mnOpciones.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnOpciones);
		
		JMenuItem mntmSallir = new JMenuItem("Salir");
		mntmSallir.setHorizontalAlignment(SwingConstants.CENTER);
		mntmSallir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnOpciones.add(mntmSallir);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("!BIENVENIDO AL JUEGO DEL AHORCADO!");
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 22));
		lblNewLabel.setBounds(193, 26, 443, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnIniciarJuego = new JButton("Iniciar Juego");
		btnIniciarJuego.setBackground(SystemColor.info);
		btnIniciarJuego.setForeground(SystemColor.controlText);
		btnIniciarJuego.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btnIniciarJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 *  Al accionar el boton "Iniciar Juego" abre una nueva ventana y se cierra la ventana principal
				 */
				
				IniciarJuego ventanaIniciarJuego = new IniciarJuego();
				
				ventanaIniciarJuego.setVisible(true);
				
				dispose();
				
			}
		});
		btnIniciarJuego.setBounds(332, 415, 136, 51);
		contentPane.add(btnIniciarJuego);
		
		JButton btnCargarPalabra = new JButton("Cargar Palabra");
		btnCargarPalabra.setBackground(SystemColor.info);
		btnCargarPalabra.setForeground(SystemColor.infoText);
		btnCargarPalabra.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btnCargarPalabra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Al accionar el boton "Cargar Palabra" se abre una nueva ventana y se cierra la ventana principal
				 */
				
				CargarPalabra ventanaCargarPalabra = new CargarPalabra();
				
				ventanaCargarPalabra.setVisible(true);
				
				dispose();
				
			}
		});
		btnCargarPalabra.setBounds(60, 328, 136, 51);
		contentPane.add(btnCargarPalabra);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Gustavo Torres\\eclipse-workspace\\Proyecto Ahorcado\\Media\\Imagen0.png"));
		lblNewLabel_1.setBounds(245, 121, 300, 258);
		contentPane.add(lblNewLabel_1);
		
		JButton btnInstrucciones = new JButton("Instrucciones");
		btnInstrucciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 *  El boton "Instrucciones" muestra un mensaje con las instrucciones del juego
				 * 
				 */
				
				JOptionPane.showMessageDialog(null, "El juego seleccionara una palabra automaticamente"
						+ " y \ntendras tantos casilleros a completar como letras tiene la palabra."
						+ " \nPodes ingresar mas de una letra por vez. Pero por cada letra incorrecta"
						+ " \nse completara una parte de la figura.\n(Tenes 7 oportunidades)");
				
				
			}
		});
		btnInstrucciones.setBackground(SystemColor.info);
		btnInstrucciones.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btnInstrucciones.setBounds(579, 328, 136, 51);
		contentPane.add(btnInstrucciones);
	}
}
