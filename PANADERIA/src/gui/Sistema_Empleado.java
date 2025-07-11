package gui;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import CLIENTES.ArrayClientes;
import CLIENTES.Clientes;
import EMPLEADOS.ArrayEmpleados;
import EMPLEADOS.Empleados;
import PRODUCTOS.ArrayProductos;
import PRODUCTOS.Productos;
import VENTAS.ArrayDetallesVenta;
import VENTAS.ArrayVentaDetallada;
import VENTAS.ArrayVentas;
import VENTAS.Detalles_Venta;
import VENTAS.VentaDetallada;
import VENTAS.Ventas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

public class Sistema_Empleado extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JButton btnSalir;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JTabbedPane tabbedPane;
	private JPanel panel_2;
	private JPanel panel_4;
	private JLabel lblNewLabel_4;
	private JTextField txtPrecio;
	private JLabel lblNewLabel_2_2;
	private JTextField txtStockDisponible;
	private JLabel label;
	private JTextField txtCantidadV;
	private JButton btnIngresar;
	private JLabel cboEmpleado;
	private JComboBox<String> cboEmple;
	private JComboBox cboProducto;
	private ArrayList<Productos> listaProductos = new ArrayList<>();
	private ArrayList<Empleados> listaEmpleados = new ArrayList<>();
	private ArrayList<Clientes> listaClientes = new ArrayList<>();
	private JLabel lblNewLabel_5;
	private JButton btnDesarrolladores;
	private JPanel panel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JTextField txtNombreC;
	private JTextField txtDni;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtEmail;
	private JButton btnProcesar;
	private JButton txtEditar;
	private JScrollPane scrollPane;
	private JTable tableCliente;
	private JScrollPane scrollPane_1;
	private JTable tableVenta;
	private JComboBox cboCliente;
	private JTextField txtCodV;
	private JPanel panel_3;
	private JLabel lblNewLabel_8;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema_Empleado frame = new Sistema_Empleado();
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
	public Sistema_Empleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("PANADERÍA DELICIAS");
			lblNewLabel.setBounds(98, 11, 387, 82);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
			contentPane.add(lblNewLabel);
		}
		{
			panel = new JPanel();
			panel.setBounds(0, 0, 179, 461);
			panel.setLayout(null);
			panel.setForeground(Color.WHITE);
			panel.setBackground(Color.ORANGE);
			contentPane.add(panel);
			{
				btnSalir = new JButton("SALIR");
				btnSalir.setBounds(27, 397, 142, 29);
				panel.add(btnSalir);
			}
			{
				btnDesarrolladores = new JButton("DESARROLLADORES");
				btnDesarrolladores.setBounds(27, 357, 142, 29);
				panel.add(btnDesarrolladores);
			}
		}
		{
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(498, 11, 145, 82);
			lblNewLabel_1.setIcon(new ImageIcon(Sistema_Empleado.class.getResource("/IMAGENES/panaderia_logo.png")));
			contentPane.add(lblNewLabel_1);
		}
		{
			panel_1 = new JPanel();
			panel_1.setBounds(178, 0, 565, 91);
			panel_1.setBackground(Color.WHITE);
			contentPane.add(panel_1);
		}
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(178, 88, 565, 373);
			contentPane.add(tabbedPane);
			{
				panel_2 = new JPanel();
				panel_2.setToolTipText("");
				tabbedPane.addTab("NUEVA VENTA", null, panel_2, null);
				panel_2.setLayout(null);
				
				JLabel lblNewLabel_2 = new JLabel("CODIGO DE VENTA");
				lblNewLabel_2.setBounds(10, 11, 101, 30);
				panel_2.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("PRODUCTO");
				lblNewLabel_3.setBounds(385, 11, 86, 30);
				panel_2.add(lblNewLabel_3);
				
				txtCodV = new JTextField();
				txtCodV.setBounds(10, 39, 86, 20);
				panel_2.add(txtCodV);
				txtCodV.setColumns(10);
				{
					lblNewLabel_4 = new JLabel("PRECIO");
					lblNewLabel_4.setBounds(127, 70, 86, 30);
					panel_2.add(lblNewLabel_4);
				}
				{
					txtPrecio = new JTextField();
					txtPrecio.setBounds(121, 103, 86, 20);
					panel_2.add(txtPrecio);
					txtPrecio.setColumns(10);
				}
				{
					lblNewLabel_2_2 = new JLabel("STOCK DISPONIBLE");
					lblNewLabel_2_2.setBounds(10, 70, 101, 30);
					panel_2.add(lblNewLabel_2_2);
				}
				{
					txtStockDisponible = new JTextField();
					txtStockDisponible.setBounds(10, 103, 86, 20);
					panel_2.add(txtStockDisponible);
					txtStockDisponible.setColumns(10);
				}
				{
					label = new JLabel("CANTIDAD");
					label.setBounds(217, 70, 101, 30);
					panel_2.add(label);
				}
				{
					txtCantidadV = new JTextField();
					txtCantidadV.addActionListener(this);
					txtCantidadV.setBounds(217, 103, 86, 20);
					panel_2.add(txtCantidadV);
					txtCantidadV.setColumns(10);
			}
				
				btnIngresar = new JButton("REGISTRAR");
				btnIngresar.setBounds(431, 102, 119, 23);
				btnIngresar.addActionListener(this);
				panel_2.add(btnIngresar);
				{
					cboEmpleado = new JLabel("ID EMPLEADO");
					cboEmpleado.setBounds(121, 11, 101, 30);
					panel_2.add(cboEmpleado);
				}
				{
					cboEmple = new JComboBox();
					cboEmple.setBounds(117, 38, 119, 22);
					cboEmple.addActionListener(this);
					panel_2.add(cboEmple);
				}
				{
					cboProducto = new JComboBox();
					cboProducto.setBounds(380, 38, 127, 22);
					cboProducto.addActionListener(this);
					panel_2.add(cboProducto);
										
				}
				{
					lblNewLabel_5 = new JLabel("ID CLIENTE");
					lblNewLabel_5.setBounds(260, 15, 86, 22);
					panel_2.add(lblNewLabel_5);
				}
				{
					scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(10, 135, 540, 199);
					panel_2.add(scrollPane_1);
					{
						tableVenta = new JTable();
						scrollPane_1.setViewportView(tableVenta);
					}
				}
				{
					cboCliente = new JComboBox();
					cboCliente.addActionListener(this);
					cboCliente.setBounds(260, 38, 101, 22);
					panel_2.add(cboCliente);
				}
				{
					txtTotal = new JTextField();
					txtTotal.setBounds(335, 103, 86, 20);
					panel_2.add(txtTotal);
					txtTotal.setColumns(10);
				}
				
			}	
			{
				panel_5 = new JPanel();
				tabbedPane.addTab("CLIENTE", null, panel_5, null);
				panel_5.setLayout(null);
				{
					lblNewLabel_6 = new JLabel("NOMBRE ");
					lblNewLabel_6.setBounds(20, 11, 59, 19);
					panel_5.add(lblNewLabel_6);
				}
				{
					lblNewLabel_7 = new JLabel("DNI");
					lblNewLabel_7.setBounds(127, 11, 59, 19);
					panel_5.add(lblNewLabel_7);
				}
				{
					lblNewLabel_9 = new JLabel("TELÉFONO");
					lblNewLabel_9.setBounds(20, 63, 59, 19);
					panel_5.add(lblNewLabel_9);
				}
				{
					lblNewLabel_10 = new JLabel("CORREO ELECTRÓNICO");
					lblNewLabel_10.setBounds(349, 11, 126, 19);
					panel_5.add(lblNewLabel_10);
				}
				{
					lblNewLabel_11 = new JLabel("DIRECCIÓN");
					lblNewLabel_11.setBounds(234, 11, 59, 19);
					panel_5.add(lblNewLabel_11);
				}
				{
					txtNombreC = new JTextField();
					txtNombreC.setBounds(20, 28, 86, 20);
					panel_5.add(txtNombreC);
					txtNombreC.setColumns(10);
				}
				{
					txtDni = new JTextField();
					txtDni.setBounds(125, 28, 86, 20);
					panel_5.add(txtDni);
					txtDni.setColumns(10);
				}
				{
					txtTelefono = new JTextField();
					txtTelefono.setBounds(20, 80, 86, 20);
					panel_5.add(txtTelefono);
					txtTelefono.setColumns(10);
				}
				{
					txtDireccion = new JTextField();
					txtDireccion.setBounds(234, 32, 86, 20);
					panel_5.add(txtDireccion);
					txtDireccion.setColumns(10);
				}
				{
					txtEmail = new JTextField();
					txtEmail.setBounds(349, 28, 126, 20);
					panel_5.add(txtEmail);
					txtEmail.setColumns(10);
				}
				{
					btnProcesar = new JButton("PROCESAR");
					btnProcesar.addActionListener(this);
					btnProcesar.setBounds(127, 79, 89, 23);
					panel_5.add(btnProcesar);
				}
				{
					txtEditar = new JButton("EDITAR");
					txtEditar.addActionListener(this);
					txtEditar.setBounds(234, 79, 89, 23);
					panel_5.add(txtEditar);
				}
				{
					scrollPane = new JScrollPane();
					scrollPane.setBounds(10, 112, 540, 222);
					panel_5.add(scrollPane);
					{
						tableCliente = new JTable();
						scrollPane.setViewportView(tableCliente);
					}
				}
				{
					panel_3 = new JPanel();
					tabbedPane.addTab("VENTA DETALLADA", null, panel_3, null);
					panel_3.setLayout(null);
					{
						lblNewLabel_8 = new JLabel("New label");
						lblNewLabel_8.setBounds(10, 11, 82, 22);
						panel_3.add(lblNewLabel_8);
					}
				}
				ListarVD("");
				ListarCli("");
			}
					
		}	
		
		ArrayProductos P = new ArrayProductos();
		listaProductos = P.listarProductos();  // ← Aquí llenas la lista
		for (Productos p : listaProductos) 
		{
		    cboProducto.addItem(p.getNombre_PRO());  // Agregas los nombres al combo
		}
		
		
		ArrayEmpleados ae = new ArrayEmpleados();
	    listaEmpleados = ae.ListarEmpleados();  // Usa tu método correcto
	    cboEmple.removeAllItems();  // Limpia por si ya tenía datos

	    for (Empleados emp : listaEmpleados) 
	    {
	        cboEmple.addItem(emp.getID_EMPLEADO());
	    }
	    
	    ArrayClientes cl = new ArrayClientes();
	    listaClientes  = cl.ListarClientes();  // Usa tu método correcto
	    cboCliente.removeAllItems();  // Limpia por si ya tenía datos

	    for (Clientes cli : listaClientes) 
	    {
	        cboCliente.addItem(cli.getID_CLIENTE());
	    }
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == txtCantidadV) {
			do_txtCantidadV_actionPerformed(e);
		}
		if (e.getSource() == cboCliente) {
			do_cboCliente_actionPerformed(e);
		}
		if (e.getSource() == txtEditar) {
			do_txtEditar_actionPerformed(e);
		}
		if (e.getSource() == btnProcesar) {
			do_btnProcesar_actionPerformed(e);
		}
		if (e.getSource() == cboEmple) {
			do_comboBox_actionPerformed(e);
		}
		if (e.getSource() == cboProducto) {
			do_cboProducto_actionPerformed(e);
		}
		if (e.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(e);
		}
	}
	
	private void do_txtCantidadV_actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	//LISTAR VENTA DETALLADA
	public void ListarVD(String id) 
	{
		DefaultTableModel modelo1 = new DefaultTableModel();
		ArrayVentaDetallada Vd = new ArrayVentaDetallada();
		ArrayList<VentaDetallada> listaVd = new ArrayList<VentaDetallada>();
		
		if(id.length()==0) listaVd =Vd.ListarVentas();
		else listaVd= Vd.ConsultarDetallesVentaID(id);	
		
		modelo1.setRowCount(listaVd.size());
		Iterator<VentaDetallada> it = listaVd.iterator();
		
	    modelo1.addColumn("ID VENTA");
	    modelo1.addColumn("ID EMPLEADO");
	    modelo1.addColumn("ID CLIENTE");
	    modelo1.addColumn("FECHA");
	    modelo1.addColumn("PRODUCTO");
	    modelo1.addColumn("CANTIDAD");
	    modelo1.addColumn("PRECIO UNITARIO");
	    modelo1.addColumn("SUBTOTAL");
		
		int i=0;
		while(it.hasNext())
		{
			Object obj= it.next();
			VentaDetallada v = (VentaDetallada) obj;
			modelo1.setValueAt(v.getIdVenta(), i, 0);
			modelo1.setValueAt(v.getIdEmpleado(), i, 1);
			modelo1.setValueAt(v.getIdCliente(), i, 2);
			modelo1.setValueAt(v.getFecha(), i, 3);
			modelo1.setValueAt(v.getProducto(), i, 4);
			modelo1.setValueAt(v.getCantidad(), i, 5);
			modelo1.setValueAt(v.getPrecioUnitario(), i, 6);
			modelo1.setValueAt(v.getSubtotal(), i, 7);
			
			i++;
		}
		tableVenta.setModel(modelo1);
	}
	
	//CALCULAR TOTAL

	//LISTAR CLIENTES
	public void ListarCli(String nom) 
	{
		DefaultTableModel modelo1 = new DefaultTableModel();
		ArrayClientes C = new ArrayClientes();
		ArrayList<Clientes> listaC = new ArrayList<Clientes>();
		
		if(nom.length()==0) listaC =C.ListarClientes();
		else listaC= C.ConsultarClientes(nom);	
		
		modelo1.setRowCount(listaC.size());
		Iterator<Clientes> it = listaC.iterator();
		
		modelo1.addColumn("DNI");
		modelo1.addColumn("Nombre");
		modelo1.addColumn("Teléfono");
		modelo1.addColumn("Dirección");
		modelo1.addColumn("Correo");
		
		int i=0;
		while(it.hasNext())
		{
			Object obj= it.next();
			Clientes cli = (Clientes) obj;
			modelo1.setValueAt(cli.getID_CLIENTE(), i, 0);
			modelo1.setValueAt(cli.getNombre_CLI(), i, 1);
			modelo1.setValueAt(cli.getTelefono_CLI(), i, 2);
			modelo1.setValueAt(cli.getDireccion_CLI(), i, 3);
			modelo1.setValueAt(cli.getEmail_CLI(), i, 4);
			i++;
		}
		tableCliente.setModel(modelo1);
	}
	
	//PROGRAMAMOS EL BOTÓN REGISTRAR VENTA
	protected void do_btnIngresar_actionPerformed(ActionEvent e) 
	{ 
		try 
		{	
			ArrayVentaDetallada V = new ArrayVentaDetallada();
			
			String CodV = txtCodV.getText().trim();	    
			int cant = Integer.parseInt(txtCantidadV.getText().trim());
			String pro= cboProducto.getSelectedItem().toString();
		    String Emple= cboEmple.getSelectedItem().toString();
		    String cli= cboCliente.getSelectedItem().toString();
		    LocalDateTime fecha = LocalDateTime.now();
		    Double precio = Double.parseDouble(txtPrecio.getText().trim());
		    Double total = Double.parseDouble(txtTotal.getText().trim());
		    
			VentaDetallada ven = new VentaDetallada(CodV, Emple, cli, fecha, pro, cant, precio, total);
			V.Insertar(ven); 
			ListarVD("");
			LimpiarV();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
	}
	
	private void LimpiarV() 
	{
		txtCodV.setText("");
		txtCantidadV.setText("");
	}

	//PROGRAMAMOS EL COMBO BOX PRODUCTO
	protected void do_cboProducto_actionPerformed(ActionEvent e) 
	{
		int index = cboProducto.getSelectedIndex();
        if (index >= 0) {
            Productos p = listaProductos.get(index);
            txtPrecio.setText(String.valueOf(p.getPrecio_venta()));
            txtStockDisponible.setText(String.valueOf(p.getStock_PRO()));
        }
	}	
	
	//PROGRAMAMOS EL COMBO BOX EMPLEADOS
	protected void do_comboBox_actionPerformed(ActionEvent e) 
	{
		int index = cboEmple.getSelectedIndex();
	    if (index >= 0 && index < listaEmpleados.size()) {
	        Empleados emp = listaEmpleados.get(index);
	    }
	}
	
	//PROGRAMAMOS EL BOTÓN CLIENTES
	protected void do_btnProcesar_actionPerformed(ActionEvent e) 
	{
		try {
		    String dni = txtDni.getText().trim();
		    String nombre = txtNombreC.getText().trim();
		    String telefono = txtTelefono.getText().trim();
		    String direccion = txtDireccion.getText().trim();
		    String email = txtEmail.getText().trim();

		    // VALIDAR SI LOS CAMPOS NO ESTÁN VACIOS
		    if (dni.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || email.isEmpty()) {
		        JOptionPane.showMessageDialog(null, "⚠️ Todos los campos deben estar llenos.");
		        return;
		    }

		    // VALIDAR SI EL DNI TIENE EXACTAMENTE 8 DÍGITOS
		    if (!dni.matches("\\d{8}")) {
		        JOptionPane.showMessageDialog(null, "⚠️ El DNI debe tener exactamente 8 dígitos.");
		        return;
		    }

		    // VALIDAR SI EL TELÉFONO TIENE EXACTAMENTE 9 DÍGITOS
		    if (!telefono.matches("\\d{9}")) {
		        JOptionPane.showMessageDialog(null, "⚠️ El teléfono debe tener exactamente 9 dígitos.");
		        return;
		    }

		    ArrayClientes C = new ArrayClientes();
		    Clientes cli = new Clientes(dni, nombre, telefono, direccion, email);
		    C.Insertar(cli);
		    C.ListarClientes();
		    ListarCli(""); 
		    LimpiarC();     
		    JOptionPane.showMessageDialog(null, "Cliente agregado correctamente.");

		} catch (Exception e2) {
		    JOptionPane.showMessageDialog(null, "Error al agregar cliente: " + e2.getMessage());
		}
	}
	
	//PROGRAMAMOS EL BOTÓN LIMPIAR CLIENTE	
	void LimpiarC() 
	{
		txtNombreC.setText("");
		txtDni.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");	
		txtEmail.setText("");
	}	
	
	//PROGRAMAMOS EL BOTÓN EDITAR
	protected void do_txtEditar_actionPerformed(ActionEvent e) 
	{
		try 
		{	
			String dni = txtDni.getText().trim();
			String nombre = txtNombreC.getText().trim();
			String telefono = txtTelefono.getText().trim();
			String direccion = txtDireccion.getText().trim();
			String email = txtEmail.getText().trim();
			Clientes cli = new Clientes(dni, nombre, telefono, direccion, email);
			ArrayClientes C = new ArrayClientes();
			C.Editar(cli);
			ListarCli("");
			LimpiarC();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
	}
	protected void do_cboCliente_actionPerformed(ActionEvent e) 
	{
		int index = cboCliente.getSelectedIndex();
	    if (index >= 0 && index < listaClientes.size()) {
	        Clientes cli = listaClientes.get(index);
	    }
	}
	
}
