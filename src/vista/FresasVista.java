package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.component.FresasComponent;
import modelo.concrete_component.FresasBase;
import modelo.concrete_decorator.FresasConChispas;
import modelo.concrete_decorator.FresasConChocolate;
import modelo.concrete_decorator.FresasConCondensada;
import modelo.concrete_decorator.FresasConMora;
import modelo.concrete_decorator.FresasConOreo;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FresasVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private FresasComponent fresas;
	/**
	 * Create the frame.
	 */
	public FresasVista() {
		crearFresas();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(124, 252, 0));
		panelTitulo.setBounds(10, 11, 414, 50);
		panel.add(panelTitulo);
		panelTitulo.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel txtTitulo = new JLabel("¡ Arma Tus Fresas Con Crema :O !");
		txtTitulo.setForeground(new Color(139, 69, 19));
		txtTitulo.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		txtTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panelTitulo.add(txtTitulo);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1.setBounds(257, 72, 167, 178);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		//Boton de Consulta de Orden
		JButton btnConsultar = new JButton("Consultar Orden");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, infoFresas(), "Consulta", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnConsultar.setBounds(10, 57, 147, 23);
		panel_1_1.add(btnConsultar);
		
		//Boton para Pagar
		JButton btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, infoFresas(), "Pagar", JOptionPane.INFORMATION_MESSAGE);
				crearFresas();
			}
		});
		btnPagar.setBounds(10, 102, 147, 23);
		panel_1_1.add(btnPagar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(124, 252, 0));
		panel_1.setBounds(10, 72, 237, 98);
		panel.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel txtSalsas = new JLabel("SALSAS");
		GridBagConstraints gbc_txtSalsas = new GridBagConstraints();
		gbc_txtSalsas.insets = new Insets(0, 0, 5, 5);
		gbc_txtSalsas.gridx = 1;
		gbc_txtSalsas.gridy = 0;
		panel_1.add(txtSalsas, gbc_txtSalsas);
		
		JLabel txtCondensada = new JLabel("Condensada");
		GridBagConstraints gbc_txtCondensada = new GridBagConstraints();
		gbc_txtCondensada.insets = new Insets(0, 0, 5, 5);
		gbc_txtCondensada.gridx = 2;
		gbc_txtCondensada.gridy = 1;
		panel_1.add(txtCondensada, gbc_txtCondensada);
		
		//Boton para Agregar Leche Condensada
		JButton btnCondensada = new JButton("Añadir");
		btnCondensada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fresas = new FresasConCondensada(fresas);
				agregadoConExito();				
			}
		});
		GridBagConstraints gbc_btnCondensada = new GridBagConstraints();
		gbc_btnCondensada.insets = new Insets(0, 0, 5, 0);
		gbc_btnCondensada.gridx = 3;
		gbc_btnCondensada.gridy = 1;
		panel_1.add(btnCondensada, gbc_btnCondensada);
		
		JLabel txtChocolate = new JLabel("Chocolate");
		GridBagConstraints gbc_txtChocolate = new GridBagConstraints();
		gbc_txtChocolate.insets = new Insets(0, 0, 5, 5);
		gbc_txtChocolate.gridx = 2;
		gbc_txtChocolate.gridy = 2;
		panel_1.add(txtChocolate, gbc_txtChocolate);
		
		//Boton para Agregar Chocolate
		JButton btnChocolate = new JButton("Añadir");
		btnChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fresas = new FresasConChocolate(fresas);
				agregadoConExito();
			}
		});
		GridBagConstraints gbc_btnChocolate = new GridBagConstraints();
		gbc_btnChocolate.insets = new Insets(0, 0, 5, 0);
		gbc_btnChocolate.gridx = 3;
		gbc_btnChocolate.gridy = 2;
		panel_1.add(btnChocolate, gbc_btnChocolate);
		
		JLabel txtMora = new JLabel("Mora");
		GridBagConstraints gbc_txtMora = new GridBagConstraints();
		gbc_txtMora.insets = new Insets(0, 0, 0, 5);
		gbc_txtMora.gridx = 2;
		gbc_txtMora.gridy = 3;
		panel_1.add(txtMora, gbc_txtMora);
		
		//Boton para Agregar Salsa de Mora
		JButton btnMora = new JButton("Añadir");
		btnMora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fresas = new FresasConMora(fresas);
				agregadoConExito();
			}
		});
		GridBagConstraints gbc_btnMora = new GridBagConstraints();
		gbc_btnMora.gridx = 3;
		gbc_btnMora.gridy = 3;
		panel_1.add(btnMora, gbc_btnMora);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(124, 252, 0));
		panel_1_2.setBounds(10, 181, 237, 69);
		panel.add(panel_1_2);
		GridBagLayout gbl_panel_1_2 = new GridBagLayout();
		gbl_panel_1_2.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1_2.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1_2.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1_2.setLayout(gbl_panel_1_2);
		
		JLabel txtToppings = new JLabel("TOPPINGS");
		GridBagConstraints gbc_txtToppings = new GridBagConstraints();
		gbc_txtToppings.insets = new Insets(0, 0, 5, 5);
		gbc_txtToppings.gridx = 1;
		gbc_txtToppings.gridy = 0;
		panel_1_2.add(txtToppings, gbc_txtToppings);
		
		JLabel txtOreo = new JLabel("Oreo");
		GridBagConstraints gbc_txtOreo = new GridBagConstraints();
		gbc_txtOreo.insets = new Insets(0, 0, 5, 5);
		gbc_txtOreo.gridx = 2;
		gbc_txtOreo.gridy = 1;
		panel_1_2.add(txtOreo, gbc_txtOreo);
		
		//Boton para Agregar Oreo
		JButton btnOreo = new JButton("Añadir");
		btnOreo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fresas = new FresasConOreo(fresas);
				agregadoConExito();
			}
		});
		GridBagConstraints gbc_btnOreo = new GridBagConstraints();
		gbc_btnOreo.insets = new Insets(0, 0, 5, 0);
		gbc_btnOreo.gridx = 3;
		gbc_btnOreo.gridy = 1;
		panel_1_2.add(btnOreo, gbc_btnOreo);
		
		JLabel txtChispas = new JLabel("Chispas");
		GridBagConstraints gbc_txtChispas = new GridBagConstraints();
		gbc_txtChispas.insets = new Insets(0, 0, 0, 5);
		gbc_txtChispas.gridx = 2;
		gbc_txtChispas.gridy = 2;
		panel_1_2.add(txtChispas, gbc_txtChispas);
		
		//Boton para Agregar Chispas
		JButton btnChispas = new JButton("Añadir");
		btnChispas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fresas = new FresasConChispas(fresas);
				agregadoConExito();
			}
		});
		GridBagConstraints gbc_btnChispas = new GridBagConstraints();
		gbc_btnChispas.gridx = 3;
		gbc_btnChispas.gridy = 2;
		panel_1_2.add(btnChispas, gbc_btnChispas);
	}
	
	private void crearFresas() {
		this.fresas= new FresasBase(3500.00);
	}
	
	private String infoFresas(){
		String mensaje = "<html>";
		mensaje += fresas.obtenerDescripcion();
		mensaje += "<br> Precio: ";
		mensaje += fresas.obtenerPrecio();
		mensaje +="</html>";
		return mensaje;
	}
	
	private void agregadoConExito() {
		JOptionPane.showMessageDialog(null, "Se añadio el ingrediente con exito", "Añadido", JOptionPane.INFORMATION_MESSAGE);
	}
}
