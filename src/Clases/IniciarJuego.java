package Clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IniciarJuego extends JFrame {

	private JPanel contentPane;
	private JTextField textCampo1;
	private JTextField textCampo2;
	private JTextField textCampo3;
	private JTextField textCampo4;
	private JTextField textCampo5;
	private JTextField textCampo6;
	private JTextField textCampo7;
	private JTextField textCampo8;
	private JTextField textCampo9;
	private JTextField textCampo10;
	
	String[] palabras = new String[] {
			
		"Hola", "Gato", "Libreta", "Mouse", "Computador"
	};
	
	String palabra = palabras[(int)(Math.random()*5)];
	
	int campo = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarJuego frame = new IniciarJuego();
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
	public IniciarJuego() {	
		
		setTitle("JUEGO AHORCADO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		IniciarTextField();
		
		JButton btnValidarLetra = new JButton("Validar Letra(s)");
		btnValidarLetra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ValidarLetra();
					
				
			}
		});
		
		
		btnValidarLetra.setBounds(53, 243, 169, 33);
		contentPane.add(btnValidarLetra);
		
		JButton btnGenerarPalabra = new JButton("Generar Nueva Palabra");
		btnGenerarPalabra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 
				 * Se utilizan los metodos.
				 */
				OcultarCasillero(false);
				ReiniciarPalabra();
				
			}
		});
		btnGenerarPalabra.setBounds(53, 83, 169, 33);
		contentPane.add(btnGenerarPalabra);
		
		
		
	}
	
	/*
	 * Con este metodo oculto los JtextFields. 
	 */
	
	public void OcultarCasillero(boolean visible) {
		
		
		
		textCampo1.setVisible(visible);
		textCampo2.setVisible(visible);
		textCampo3.setVisible(visible);
		textCampo4.setVisible(visible);
		textCampo5.setVisible(visible);
		textCampo6.setVisible(visible);
		textCampo7.setVisible(visible);
		textCampo8.setVisible(visible);
		textCampo9.setVisible(visible);
		textCampo10.setVisible(visible);
		
		
		
	} 
	
	/*
	 *  Se hacen visibles los casilleros segun la cantidad de letras obtenias de la palabra seleccionada.
	 */
	
	public void MostrarCasillero(String palabra) {
		
		OcultarCasillero(false);
		
		int CantidadLetras = palabra.length(); 
		
		if (CantidadLetras == 1) {
			
			textCampo1.setVisible(true);
			
		}
		
		else if (CantidadLetras == 2) {
			
			textCampo1.setVisible(true);
			textCampo2.setVisible(true);
			
		}
		else if (CantidadLetras == 3) {
			
			textCampo1.setVisible(true);
			textCampo2.setVisible(true);
			textCampo3.setVisible(true);
			
		}
		
		else if (CantidadLetras == 4) {
			
			textCampo1.setVisible(true);
			textCampo2.setVisible(true);
			textCampo3.setVisible(true);
			textCampo4.setVisible(true);
			
		}
		else if (CantidadLetras == 5) {
			
			textCampo1.setVisible(true);
			textCampo2.setVisible(true);
			textCampo3.setVisible(true);
			textCampo4.setVisible(true);
			textCampo5.setVisible(true);
		}
		
		else if (CantidadLetras == 6) {
			
			textCampo1.setVisible(true);
			textCampo2.setVisible(true);
			textCampo3.setVisible(true);
			textCampo4.setVisible(true);
			textCampo5.setVisible(true);
			textCampo6.setVisible(true);
			
			
		}
		
		else if (CantidadLetras == 7) {
			
			textCampo1.setVisible(true);
			textCampo2.setVisible(true);
			textCampo3.setVisible(true);
			textCampo4.setVisible(true);
			textCampo5.setVisible(true);
			textCampo6.setVisible(true);
			textCampo7.setVisible(true);
			
			
		} 
		
        else if (CantidadLetras == 8) {
			
			textCampo1.setVisible(true);
			textCampo2.setVisible(true);
			textCampo3.setVisible(true);
			textCampo4.setVisible(true);
			textCampo5.setVisible(true);
			textCampo6.setVisible(true);
			textCampo7.setVisible(true);
			textCampo8.setVisible(true);
			
			
		}
		
       else if (CantidadLetras == 9) {
			
			textCampo1.setVisible(true);
			textCampo2.setVisible(true);
			textCampo3.setVisible(true);
			textCampo4.setVisible(true);
			textCampo5.setVisible(true);
			textCampo6.setVisible(true);
			textCampo7.setVisible(true);
			textCampo8.setVisible(true);
			textCampo9.setVisible(true);

			
		}
		
       else if (CantidadLetras == 10) {
			
			textCampo1.setVisible(true);
			textCampo2.setVisible(true);
			textCampo3.setVisible(true);
			textCampo4.setVisible(true);
			textCampo5.setVisible(true);
			textCampo6.setVisible(true);
			textCampo7.setVisible(true);
			textCampo8.setVisible(true);
			textCampo9.setVisible(true);
			textCampo10.setVisible(true);

			
		}
	}
	
	/*
	 * Reinicia la palabra y asigna una nueva aleatoriamente
	 */
	public void ReiniciarPalabra() {
		
		/*limpiarCasillero();*/
				
		String palabra = palabras[(int)(Math.random()*5)];
		
		System.out.println(" "+palabra+" "+palabra.length());
		
		MostrarCasillero(palabra);
		
		
	}
	
	public void IniciarTextField() {
		
		textCampo1 = new JTextField();
		textCampo1.setText("1");
		textCampo1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				campo = 1;
			}
		});
		textCampo1.setHorizontalAlignment(SwingConstants.CENTER);
		textCampo1.setBounds(53, 167, 39, 20);
		contentPane.add(textCampo1);
		textCampo1.setColumns(10);
		
		textCampo2 = new JTextField();
		textCampo2.setText("2");
		textCampo2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				campo = 2;
			}
		});
		textCampo2.setHorizontalAlignment(SwingConstants.CENTER);
		textCampo2.setColumns(10);
		textCampo2.setBounds(102, 167, 39, 20);
		contentPane.add(textCampo2);
		
		textCampo3 = new JTextField();
		textCampo3.setText("3");
		textCampo3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				campo = 3;
			}
		});
		textCampo3.setHorizontalAlignment(SwingConstants.CENTER);
		textCampo3.setColumns(10);
		textCampo3.setBounds(151, 167, 39, 20);
		contentPane.add(textCampo3);
		
		textCampo4 = new JTextField();
		textCampo4.setText("4");
		textCampo4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				campo = 4;
			}
		});
		textCampo4.setHorizontalAlignment(SwingConstants.CENTER);
		textCampo4.setColumns(10);
		textCampo4.setBounds(200, 167, 39, 20);
		contentPane.add(textCampo4);
		
		textCampo5 = new JTextField();
		textCampo5.setText("5");
		textCampo5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				campo = 5;
			}
		});
		textCampo5.setHorizontalAlignment(SwingConstants.CENTER);
		textCampo5.setColumns(10);
		textCampo5.setBounds(249, 167, 39, 20);
		contentPane.add(textCampo5);
		
		textCampo6 = new JTextField();
		textCampo6.setText("6");
		textCampo6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				campo = 6;
			}
		});
		textCampo6.setHorizontalAlignment(SwingConstants.CENTER);
		textCampo6.setColumns(10);
		textCampo6.setBounds(298, 167, 39, 20);
		contentPane.add(textCampo6);
		
		textCampo7 = new JTextField();
		textCampo7.setText("7");
		textCampo7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				campo = 7;
			}
		});
		textCampo7.setHorizontalAlignment(SwingConstants.CENTER);
		textCampo7.setColumns(10);
		textCampo7.setBounds(347, 167, 39, 20);
		contentPane.add(textCampo7);
		
		textCampo8 = new JTextField();
		textCampo8.setText("8");
		textCampo8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				campo = 8;
			}
		});
		textCampo8.setHorizontalAlignment(SwingConstants.CENTER);
		textCampo8.setColumns(10);
		textCampo8.setBounds(396, 167, 39, 20);
		contentPane.add(textCampo8);
		
		textCampo9 = new JTextField();
		textCampo9.setText("9");
		textCampo9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				campo = 9;
			}
		});
		textCampo9.setHorizontalAlignment(SwingConstants.CENTER);
		textCampo9.setColumns(10);
		textCampo9.setBounds(445, 167, 39, 20);
		contentPane.add(textCampo9);
		
		textCampo10 = new JTextField();
		textCampo10.setText("10");
		textCampo10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				campo = 10;
			}
		});
		textCampo10.setHorizontalAlignment(SwingConstants.CENTER);
		textCampo10.setColumns(10);
		textCampo10.setBounds(494, 167, 39, 20);
		contentPane.add(textCampo10);
		
		/*OcultarCasillero(false);*/
		
	}
	
	public void ValidarLetra() {
		
		/*JTextField textCampo = new JTextField();*/
		
		String valorCampo = "";
		
		if (campo == 1) {
			
			valorCampo = textCampo1.getText();
		}
		else if (campo == 2) {
			
			 valorCampo = textCampo2.getText();
		}
		
		else if (campo == 3) {
			
			valorCampo = textCampo3.getText();
		}
		
		else if (campo == 4) {
			
			valorCampo = textCampo4.getText();
		}
		
		else if (campo == 5) {
			
			valorCampo = textCampo5.getText();
		}

		else if (campo == 6) {
			
			valorCampo = textCampo6.getText();
		}
		
		else if (campo == 7) {
			
			valorCampo = textCampo7.getText();
		}
		
		else if (campo == 8) {
			
			valorCampo = textCampo8.getText();
		}
		
		else if (campo == 9) {
			
			valorCampo = textCampo9.getText();
		}
		
		else if (campo == 10) {
			
			valorCampo = textCampo10.getText();
		}

		 
		boolean existe = palabra.contains(valorCampo);
		 
		 System.out.println(" "+existe);


		
		
		System.out.println("probando campo "+campo);
		
		/*campo = 0;*/
		
		//System.out.println(" inicializa "+campo);

	}
	
	public void limpiarCasillero() {
		
		textCampo1.setText("");
		textCampo2.setText("");
		textCampo3.setText("");
		textCampo4.setText("");
		textCampo5.setText("");
		textCampo6.setText("");
		textCampo7.setText("");
		textCampo8.setText("");
		textCampo9.setText("");
		textCampo10.setText("");
		
	}
	
}
