package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import COMPRAS.ArrayComprasProductos;
import COMPRAS.ComprasProductos;
import EMPLEADOS.ArrayEmpleados;
import EMPLEADOS.Empleados;
import PRODUCTOS.ArrayProductos;
import PRODUCTOS.Productos;
import PROVEEDORES.ArrayProveedor;
import PROVEEDORES.Proveedor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.KeyListener;

public class Sistema_Administrador extends JFrame implements ActionListener, KeyListener 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblAdministrador;
	private JPanel panel;
	private JButton btnSalir;
	private JPanel panel_1;
	private JTabbedPane tabbedPane;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JTextField txtNomPro;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtDescripcion;
	private JLabel lblNewLabel_4;
	private JTextField txtPrecio;
	private JLabel lblNewLabel_5;
	private JTextField txtStock;
	private JButton btnAgregarProductos;
	private JButton btnModificarProducto;
	private JButton btnEliminarProducto;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_12;
	private JTextField txtCodE;
	private JTextField txtNomE;
	private JTextField txtApelli;
	private JComboBox cboCargo;
	private JTextField txtSalario;
	private JComboBox cboAfiliacion;
	private JButton btnAgregarE;
	private JButton btnModificarE;
	private JButton btnEliminarE;
	private JTable table_1;
	private JTable table;
	private JPanel panel_4;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JTextField txtRuc;
	private JTextField txtEmpresa;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JButton btnAgregarProve;
	private JButton btnModificarProve;
	private JButton btnEliminarProve;
	private JTable table_2;
	private JTextField txtEmail;
	private JTextField txtDistrito;
	private JTextField txtNombreProveedor;
	private JTable tablaCompras;
	private JTextField txtNombreEmpleado;
	private JTextField txtCargoEmpleado;
	private JComboBox<String> cmbProveedor;
	private JComboBox<String> cmbEmpleado;
	private JButton btnNewButton;
	private JTextField txtNOMPRO;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JTextField txtPREVEN;
	private JLabel lblNewLabel_22;
	private JTextField txtDES;
	private JLabel lblNewLabel_23;
	private JTextField txtCANT;
	private JLabel lblNewLabel_24;
	private JTextField txtPRECOM;
	private JButton btnEliminarCompra;
	private JButton btnModificarCompraP;
	private JButton btnBuscarComP;
	private JLabel lblNewLabel_11;
	private JButton btnBuscarProducto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema_Administrador frame = new Sistema_Administrador();
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
	public Sistema_Administrador() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1029, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel = new JPanel();
			panel.setForeground(Color.WHITE);
			panel.setBackground(Color.ORANGE);
			panel.setBounds(0, 0, 179, 545);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				btnSalir = new JButton("SALIR");
				btnSalir.setBounds(29, 511, 89, 23);
				panel.add(btnSalir);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(179, 2, 824, 91);
			contentPane.add(panel_1);
			panel_1.setLayout(null);
			{
				lblNewLabel = new JLabel("");
				lblNewLabel.setBounds(551, 11, 145, 82);
				panel_1.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon(Sistema_Administrador.class.getResource("/IMAGENES/panaderia_logo.png")));
			}
			{
				lblAdministrador = new JLabel("ADMINISTRADOR ");
				lblAdministrador.setBounds(70, 11, 387, 82);
				panel_1.add(lblAdministrador);
				lblAdministrador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
			}
		}
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(179, 94, 824, 451);
			contentPane.add(tabbedPane);
			{
				panel_2 = new JPanel();
				tabbedPane.addTab("EMPLEADOS", null, panel_2, null);
				panel_2.setLayout(null);
				{
					lblNewLabel_6 = new JLabel("DNI:");
					lblNewLabel_6.setBounds(10, 11, 79, 14);
					panel_2.add(lblNewLabel_6);
				}
				{
					lblNewLabel_7 = new JLabel("NOMBRE:");
					lblNewLabel_7.setBounds(10, 36, 89, 25);
					panel_2.add(lblNewLabel_7);
				}
				{
					lblNewLabel_8 = new JLabel("APELLIDO:");
					lblNewLabel_8.setBounds(10, 66, 79, 25);
					panel_2.add(lblNewLabel_8);
				}
				{
					lblNewLabel_9 = new JLabel("CARGO:");
					lblNewLabel_9.setBounds(221, 6, 77, 25);
					panel_2.add(lblNewLabel_9);
				}
				{
					lblNewLabel_10 = new JLabel("SALARIO:");
					lblNewLabel_10.setBounds(218, 36, 89, 25);
					panel_2.add(lblNewLabel_10);
				}
				{
					lblNewLabel_12 = new JLabel("AFILIACIÓN:");
					lblNewLabel_12.setBounds(221, 66, 86, 25);
					panel_2.add(lblNewLabel_12);
				}
				{
					txtCodE = new JTextField();
					txtCodE.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent e) {
						    // Obtén el carácter ingresado
						    char c = e.getKeyChar();
						    
						    // Verifica si el carácter es un número y si no se han ingresado más de 8 dígitos
						    if (!Character.isDigit(c) || ((e.getComponent() instanceof JTextField) && ((JTextField) e.getComponent()).getText().length() >= 8)) {
						        e.consume(); // Bloquea el carácter
						    }
						}
					});
					txtCodE.setBounds(99, 9, 86, 20);
					panel_2.add(txtCodE);
					txtCodE.setColumns(10);
				}
				{
					txtNomE = new JTextField();
					txtNomE.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent e) {
							
							//PARA QUE PERMITA SOLAMENTE INGRESAR  LETRAS NO NUMEROS
							   char c = e.getKeyChar();
						        // Solo permite letras y espacio
						        if (!Character.isLetter(c) && c != ' ') {
						            e.consume(); // bloquea el carácter
						        }
							
						}
					});
					txtNomE.setColumns(10);
					txtNomE.setBounds(99, 39, 86, 20);
					panel_2.add(txtNomE);
				}
				{
					txtApelli = new JTextField();
					txtApelli.addKeyListener(new KeyAdapter() 
					{
						@Override
						public void keyTyped(KeyEvent e) 
						{
							//PARA QUE PERMITA SOLAMENTE INGRESAR  LETRAS NO NUMEROS
							   char c = e.getKeyChar();
						        // Solo permite letras y espacio
						        if (!Character.isLetter(c) && c != ' ') {
						            e.consume(); // bloquea el carácter
						        }
						}
					});
					txtApelli.setColumns(10);
					txtApelli.setBounds(99, 69, 86, 20);
					panel_2.add(txtApelli);
				}
				{
					cboCargo = new JComboBox();
					cboCargo.setModel(new DefaultComboBoxModel(new String[] {"VENDEDOR", "PANADERO", "SUPERVISOR"}));
					cboCargo.setBounds(308, 7, 80, 22);
					panel_2.add(cboCargo);
				}
				{
					txtSalario = new JTextField();
					txtSalario.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent e) {
							
							//PARA QUE PERMITA SOLAMENTE INGRESAR NUMEROS
							  char c = e.getKeyChar();
						        // Permite solo números y el punto (para números decimales)
						        if (!Character.isDigit(c) && c != '.' && c != '\b') 
						        {
						            e.consume(); // bloquea el carácter
						        }
						}
					});
					txtSalario.setBounds(308, 39, 80, 20);
					panel_2.add(txtSalario);
					txtSalario.setColumns(10);
				}
				{
					cboAfiliacion = new JComboBox();
					cboAfiliacion.setModel(new DefaultComboBoxModel(new String[] {"AFP", "ONP"}));
					cboAfiliacion.setBounds(308, 67, 80, 22);
					panel_2.add(cboAfiliacion);
				}
				{
					btnAgregarE = new JButton("AGREGAR");
					btnAgregarE.addActionListener(this);
					btnAgregarE.setBounds(425, 37, 116, 23);
					panel_2.add(btnAgregarE);
				}
				{
					btnModificarE = new JButton("EDITAR");
					btnModificarE.addActionListener(this);
					btnModificarE.setBounds(452, 67, 188, 23);
					panel_2.add(btnModificarE);
				}
				{
					btnEliminarE = new JButton("ELIMINAR");
					btnEliminarE.addActionListener(this);
					btnEliminarE.setBounds(551, 37, 116, 23);
					panel_2.add(btnEliminarE);
				}
				{
					table_1 = new JTable();
					JScrollPane scrollEmpleados = new JScrollPane(table_1);
					scrollEmpleados.setBounds(10, 106, 799, 311);
					panel_2.add(scrollEmpleados);
				}
			}
			{
				panel_4 = new JPanel();
				tabbedPane.addTab("PROVEEDOR", null, panel_4, null);
				panel_4.setLayout(null);
				{
					lblNewLabel_13 = new JLabel("RUC 20:");
					lblNewLabel_13.setBounds(10, 11, 82, 25);
					panel_4.add(lblNewLabel_13);
				}
				{
					lblNewLabel_14 = new JLabel("EMPRESA: ");
					lblNewLabel_14.setBounds(10, 46, 82, 25);
					panel_4.add(lblNewLabel_14);
				}
				{
					lblNewLabel_15 = new JLabel("TELÉFONO:");
					lblNewLabel_15.setBounds(198, 11, 108, 25);
					panel_4.add(lblNewLabel_15);
				}
				{
					lblNewLabel_16 = new JLabel("DIRECCIÓN:");
					lblNewLabel_16.setBounds(200, 46, 106, 25);
					panel_4.add(lblNewLabel_16);
				}
				{
					txtRuc = new JTextField();
					txtRuc.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent e) {
							 char c = e.getKeyChar();
						        if (!Character.isDigit(c) && c != ' ' && c != '\b') {
						            e.consume(); // bloquea el carácter
						        }
						}
					});
					txtRuc.setBounds(102, 11, 86, 20);
					panel_4.add(txtRuc);
					txtRuc.setColumns(10);
				}
				{
					txtEmpresa = new JTextField();
					txtEmpresa.addKeyListener(this);
					txtEmpresa.setColumns(10);
					txtEmpresa.setBounds(102, 46, 86, 20);
					panel_4.add(txtEmpresa);
				}
				{
					txtTelefono = new JTextField();
					txtTelefono.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent e) {
							
							char c = e.getKeyChar();
					        // Permite solo números enteros
					        if (!Character.isDigit(c) && c != '\b') {
					            e.consume(); // bloquea el carácter
					        }

						}
					});
					txtTelefono.setColumns(10);
					txtTelefono.setBounds(316, 14, 100, 20);
					panel_4.add(txtTelefono);
				}
				{
					txtDireccion = new JTextField();
					txtDireccion.setColumns(10);
					txtDireccion.setBounds(316, 46, 100, 20);
					panel_4.add(txtDireccion);
				}
				{
					btnAgregarProve = new JButton("AGREGAR");
					btnAgregarProve.addActionListener(this);
					btnAgregarProve.setBounds(426, 12, 126, 23);
					panel_4.add(btnAgregarProve);
				}
				{
					btnModificarProve = new JButton("MODIFICAR");
					btnModificarProve.addActionListener(this);
					btnModificarProve.setBounds(574, 12, 126, 23);
					panel_4.add(btnModificarProve);
				}
				{
					btnEliminarProve = new JButton("ELIMINAR");
					btnEliminarProve.addActionListener(this);
					btnEliminarProve.setBounds(499, 47, 134, 23);
					panel_4.add(btnEliminarProve);
				}
				{
					table_2 = new JTable();
					JScrollPane scrollProveedores = new JScrollPane(table_2);
					scrollProveedores.setBounds(10, 109, 799, 303);
					panel_4.add(scrollProveedores);
				}
				
				JLabel lblNewLabel_14_1 = new JLabel("EMAIL:");
				lblNewLabel_14_1.setBounds(10, 79, 82, 25);
				panel_4.add(lblNewLabel_14_1);
				
				JLabel lblNewLabel_14_1_1 = new JLabel("DISTRITO:");
				lblNewLabel_14_1_1.setBounds(200, 81, 106, 25);
				panel_4.add(lblNewLabel_14_1_1);
				
				txtEmail = new JTextField();
				txtEmail.addKeyListener(this);
				txtEmail.setColumns(10);
				txtEmail.setBounds(102, 76, 86, 20);
				panel_4.add(txtEmail);
				
				txtDistrito = new JTextField();
				txtDistrito.setColumns(10);
				txtDistrito.setBounds(316, 76, 100, 20);
				panel_4.add(txtDistrito);
			}
			panel_3 = new JPanel();
			tabbedPane.addTab("PRODUCTOS", null, panel_3, null);
			panel_3.setLayout(null);
			{
				txtNomPro = new JTextField();
				txtNomPro.addKeyListener(new KeyAdapter() {
					@Override
					
					public void keyTyped(KeyEvent e) {
						
						//PARA QUE PERMITA SOLAMENTE INGRESAR  LETRAS NO NUMEROS
						   char c = e.getKeyChar();
					        // Solo permite letras y espacio
					        if (!Character.isLetter(c) && c != ' ') {
					            e.consume(); // bloquea el carácter
					        }
					}
				});
				txtNomPro.setBounds(96, 14, 86, 20);
				panel_3.add(txtNomPro);
				txtNomPro.setColumns(10);
			}
			{
				lblNewLabel_2 = new JLabel("NOMBRE: ");
				lblNewLabel_2.setBounds(10, 11, 86, 25);
				panel_3.add(lblNewLabel_2);
			}
			{
				lblNewLabel_3 = new JLabel("DESCRIPCIÓN:");
				lblNewLabel_3.setBounds(217, 8, 104, 25);
				panel_3.add(lblNewLabel_3);
			}
			{
				txtDescripcion = new JTextField();
				txtDescripcion.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
					}
				});
				txtDescripcion.setBounds(331, 11, 291, 54);
				txtDescripcion.setColumns(10);
				panel_3.add(txtDescripcion);
			}
			{
				lblNewLabel_4 = new JLabel("PRECIO:");
				lblNewLabel_4.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
					}
				});
				lblNewLabel_4.setBounds(10, 40, 86, 25);
				panel_3.add(lblNewLabel_4);
			}
			{
				txtPrecio = new JTextField();
				txtPrecio.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						 char c = e.getKeyChar();
					        // Permite solo números y el punto (para números decimales)
					        if (!Character.isDigit(c) && c != '.' && c != '\b') {
					            e.consume(); // bloquea el carácter
					        }
					}
				});
				txtPrecio.setColumns(10);
				txtPrecio.setBounds(96, 45, 86, 20);
				panel_3.add(txtPrecio);
			}
			{
				lblNewLabel_5 = new JLabel("STOCK:");
				lblNewLabel_5.setBounds(10, 71, 86, 25);
				panel_3.add(lblNewLabel_5);
			}
			{
				txtStock = new JTextField();
				txtStock.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						 char c = e.getKeyChar();
					     
					        if (!Character.isDigit(c) && c != '.' && c != '\b') {
					            e.consume(); // bloquea el carácter
					        }
					}
				});
				txtStock.setColumns(10);
				txtStock.setBounds(95, 75, 87, 20);
				panel_3.add(txtStock);
			}
			
			btnEliminarProducto = new JButton("ELIMINAR");
			btnEliminarProducto.addActionListener(this);
			btnEliminarProducto.setBounds(136, 116, 89, 23);
			panel_3.add(btnEliminarProducto);
			
			btnModificarProducto = new JButton("MODIFICAR");
			btnModificarProducto.addActionListener(this);
			btnModificarProducto.setBounds(246, 116, 104, 23);
			panel_3.add(btnModificarProducto);
			{
				btnAgregarProductos = new JButton("AGREGAR");
				btnAgregarProductos.addActionListener(this);
				btnAgregarProductos.setBounds(20, 116, 89, 23);
				panel_3.add(btnAgregarProductos);
			}
			{
				table = new JTable();
				JScrollPane scrollProductos = new JScrollPane(table);
				scrollProductos.setBounds(10, 146, 799, 266);
				panel_3.add(scrollProductos);
				{
					btnBuscarProducto = new JButton("BUSCAR / LISTAR");
					btnBuscarProducto.addActionListener(this);
					btnBuscarProducto.setBounds(360, 116, 130, 23);
					panel_3.add(btnBuscarProducto);
				}
				// AUTOCOMPLETAR CAMPOS AL SELECCIONAR FILA
				table.addMouseListener(new MouseAdapter() {
				    @Override
				    public void mouseClicked(MouseEvent e) {
				        int fila = table.getSelectedRow();
				        if (fila >= 0) {
				            String nombre = table.getValueAt(fila, 1).toString();       // Nombre_PRO
				            String descripcion = table.getValueAt(fila, 2).toString();  // Descripcion_PRO
				            String precio = table.getValueAt(fila, 3).toString();       // Precio_venta
				            String stock = table.getValueAt(fila, 4).toString();        // Stock_PRO

				            txtNomPro.setText(nombre);
				            txtDescripcion.setText(descripcion);
				            txtPrecio.setText(precio);
				            txtStock.setText(stock);
				        }
				    }
				});
			}
			
			JPanel panel_5 = new JPanel();
			tabbedPane.addTab("COMPRAS PRODUCTOS", null, panel_5, null);
			panel_5.setLayout(null);
			
			cmbProveedor = new JComboBox<String>();
			cmbProveedor.setBounds(551, 34, 86, 22);
			panel_5.add(cmbProveedor);
			cmbProveedor.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        String idProveedor = (String) cmbProveedor.getSelectedItem();
			        ArrayProveedor array = new ArrayProveedor();
			        ArrayList<Proveedor> lista = array.ConsultarProveedoresID(idProveedor);

			        if (!lista.isEmpty()) {
			            Proveedor prov = lista.get(0); //primer proveedor
			            txtNombreProveedor.setText(prov.getNombre_PROV());
			        } else {
			            txtNombreProveedor.setText(""); //por si no se encuentra nada
			        }
			    }
			});
			
			JLabel lblNewLabel_17 = new JLabel("PROVEEDOR:");
			lblNewLabel_17.setBounds(444, 38, 97, 14);
			panel_5.add(lblNewLabel_17);
			
			txtNombreProveedor = new JTextField();
			txtNombreProveedor.setEditable(false);
			txtNombreProveedor.setBounds(661, 36, 96, 20);
			panel_5.add(txtNombreProveedor);
			txtNombreProveedor.setColumns(10);
			
			JLabel lblNewLabel_18 = new JLabel("EMPLEADO:");
			lblNewLabel_18.setBounds(444, 68, 116, 14);
			panel_5.add(lblNewLabel_18);
			
			cmbEmpleado = new JComboBox<String>();
			cmbEmpleado.setBounds(518, 64, 86, 22);
			panel_5.add(cmbEmpleado);
			cmbEmpleado.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    	String idEmpleado = (String) cmbEmpleado.getSelectedItem();
			        if (idEmpleado != null) {
			            ArrayEmpleados array = new ArrayEmpleados();
			            ArrayList<Empleados> lista = array.ConsultarEmpleadosID(idEmpleado);
			            if (!lista.isEmpty()) {
			                Empleados emp = lista.get(0);
			                txtNombreEmpleado.setText(emp.getNombre_EMP());
			                txtCargoEmpleado.setText(emp.getCargo_EMP());
			            } else {
			                txtNombreEmpleado.setText("");
			                txtCargoEmpleado.setText("");
			            }
			        }
			    }
			});
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 148, 799, 264);
			panel_5.add(scrollPane);
			
			tablaCompras = new JTable();
			scrollPane.setViewportView(tablaCompras);
			tablaCompras.getSelectionModel().addListSelectionListener(e -> {
			    if (!e.getValueIsAdjusting() && tablaCompras.getSelectedRow() != -1) {
			        int fila = tablaCompras.getSelectedRow();
			        String nombreProducto = tablaCompras.getValueAt(fila, 6).toString(); // Columna PRODUCTO

			        // Asignar directamente los valores de la tabla
			        txtNOMPRO.setText(nombreProducto);
			        txtCANT.setText(tablaCompras.getValueAt(fila, 7).toString());   // CANTIDAD
			        txtPRECOM.setText(tablaCompras.getValueAt(fila, 8).toString()); // P COMPRA

			        // Obtener descripción y precio venta del producto usando el nombre
			        ArrayProductos daoProd = new ArrayProductos();
			        ArrayList<Productos> lista = daoProd.ConsultarPorNombre(nombreProducto);

			        if (!lista.isEmpty()) {
			            Productos prod = lista.get(0);
			            txtDES.setText(prod.getDescripción_PRO());
			            txtPREVEN.setText(String.valueOf(prod.getPrecio_venta()));
			        } else {
			            txtDES.setText("");
			            txtPREVEN.setText("");
			        }
			    }
			});
			{
				txtNombreEmpleado = new JTextField();
				txtNombreEmpleado.setEditable(false);
				txtNombreEmpleado.setColumns(10);
				txtNombreEmpleado.setBounds(614, 66, 96, 20);
				panel_5.add(txtNombreEmpleado);
			}
			{
				txtCargoEmpleado = new JTextField();
				txtCargoEmpleado.setEditable(false);
				txtCargoEmpleado.setColumns(10);
				txtCargoEmpleado.setBounds(713, 66, 96, 20);
				panel_5.add(txtCargoEmpleado);
			}
			llenarComboProveedores(cmbProveedor);
			LlenarComboEmpleadosSUPER(cmbEmpleado);
			{
				btnNewButton = new JButton("REGISTRAR COMPRA");
				btnNewButton.addActionListener(this);
				btnNewButton.setBounds(10, 114, 175, 23);
				panel_5.add(btnNewButton);
			}
			{
				txtNOMPRO = new JTextField();
				txtNOMPRO.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						
						
					}
				});
				txtNOMPRO.setColumns(10);
				txtNOMPRO.setBounds(85, 10, 86, 20);
				panel_5.add(txtNOMPRO);
			}
			{
				lblNewLabel_20 = new JLabel("PRODUCTO:");
				lblNewLabel_20.setBounds(10, 9, 86, 22);
				panel_5.add(lblNewLabel_20);
			}
			{
				lblNewLabel_21 = new JLabel("PRECIO VENTA:");
				lblNewLabel_21.setBounds(10, 33, 116, 25);
				panel_5.add(lblNewLabel_21);
			}
			{
				txtPREVEN = new JTextField();
				txtPREVEN.addKeyListener(this);
				txtPREVEN.setColumns(10);
				txtPREVEN.setBounds(108, 35, 63, 20);
				panel_5.add(txtPREVEN);
			}
			{
				lblNewLabel_22 = new JLabel("DESCRIPCIÓN:");
				lblNewLabel_22.setBounds(181, 9, 153, 22);
				panel_5.add(lblNewLabel_22);
			}
			{
				txtDES = new JTextField();
				txtDES.setColumns(10);
				txtDES.setBounds(281, 8, 153, 46);
				panel_5.add(txtDES);
			}
			{
				lblNewLabel_23 = new JLabel("CANTIDAD:");
				lblNewLabel_23.setBounds(181, 63, 116, 25);
				panel_5.add(lblNewLabel_23);
			}
			{
				txtCANT = new JTextField();
				txtCANT.addKeyListener(this);
				txtCANT.setColumns(10);
				txtCANT.setBounds(261, 66, 86, 20);
				panel_5.add(txtCANT);
			}
			{
				lblNewLabel_24 = new JLabel("PRECIO COMPRA:");
				lblNewLabel_24.setBounds(10, 57, 116, 25);
				panel_5.add(lblNewLabel_24);
			}
			{
				txtPRECOM = new JTextField();
				txtPRECOM.addKeyListener(this);
				txtPRECOM.setColumns(10);
				txtPRECOM.setBounds(118, 59, 53, 20);
				panel_5.add(txtPRECOM);
			}
			{
				btnEliminarCompra = new JButton("ELIMINAR");
				btnEliminarCompra.addActionListener(this);
				btnEliminarCompra.setBounds(208, 114, 116, 23);
				panel_5.add(btnEliminarCompra);
			}
			{
				btnModificarCompraP = new JButton("MODIFICAR");
				btnModificarCompraP.addActionListener(this);
				btnModificarCompraP.setBounds(334, 114, 116, 23);
				panel_5.add(btnModificarCompraP);
			}
			{
				btnBuscarComP = new JButton("BUSCAR / LISTAR");
				btnBuscarComP.addActionListener(this);
				btnBuscarComP.setBounds(471, 114, 144, 23);
				panel_5.add(btnBuscarComP);
			}
			{
				lblNewLabel_11 = new JLabel("(N PRODUCTO)");
				lblNewLabel_11.setBounds(505, 100, 110, 14);
				panel_5.add(lblNewLabel_11);
			}
			{
				ListarC("");
				ListarP("");
				ListarE("");
				ListarPV("");
			}
			
		}	
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscarProducto) {
			do_btnBuscarProducto_actionPerformed(e);
		}
		if (e.getSource() == btnBuscarComP) {
			do_btnBuscarComP_actionPerformed(e);
		}
		if (e.getSource() == btnModificarCompraP) {
			do_btnModificarCompraP_actionPerformed(e);
		}
		if (e.getSource() == btnEliminarCompra) {
			do_btnEliminarCompra_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnEliminarProve) {
			do_btnEliminarProve_actionPerformed(e);
		}
		if (e.getSource() == btnModificarProve) {
			do_btnModificarProve_actionPerformed(e);
		}
		if (e.getSource() == btnAgregarProve) {
			do_btnAgregarProve_actionPerformed(e);
		}
		if (e.getSource() == btnEliminarE) {
			do_btnEliminarE_actionPerformed(e);
		}
		if (e.getSource() == btnModificarE) {
			do_btnModificarE_actionPerformed(e);
		}
		if (e.getSource() == btnAgregarE) {
			do_btnAgregarE_actionPerformed(e);
		}
		if (e.getSource() == btnEliminarProducto) {
			do_btnEliminarProducto_actionPerformed(e);
		}
		if (e.getSource() == btnModificarProducto) {
			do_btnModificarProducto_actionPerformed(e);
		}
		if (e.getSource() == btnAgregarProductos) {
			do_btnAgregarProductos_actionPerformed(e);
		}
	}
	
	//LISTAR PRODUCTOS
	public void ListarP(String nom) {
	    DefaultTableModel modelo = new DefaultTableModel();
	    ArrayProductos p = new ArrayProductos();
	    ArrayList<Productos> lista;

	    if (nom.length() == 0) {
	        lista = p.listarProductos();
	    } else {
	        lista = p.consultarProductos(nom);
	    }

	    modelo.addColumn("Código");
	    modelo.addColumn("Nombre");
	    modelo.addColumn("Descripción");
	    modelo.addColumn("Precio");
	    modelo.addColumn("Stock");

	    for (Productos pro : lista) {
	        Object[] fila = new Object[5];
	        fila[0] = pro.getID_PRODUCTO();
	        fila[1] = pro.getNombre_PRO();
	        fila[2] = pro.getDescripción_PRO();
	        fila[3] = pro.getPrecio_venta();
	        fila[4] = pro.getStock_PRO();
	        modelo.addRow(fila);
	    }
	    table.setModel(modelo);
	}
	
	//LISTAR EMPLEADOS
	public void ListarE(String nom) 
	{
		DefaultTableModel modelo1 = new DefaultTableModel();
		ArrayEmpleados e = new ArrayEmpleados();
		ArrayList<Empleados> listaE = new ArrayList<Empleados>();
		
		if(nom.length()==0) listaE=e.ListarEmpleados();
		else listaE= e.ConsultarEmpleados(nom);	
		
		modelo1.setRowCount(listaE.size());
		Iterator<Empleados> it = listaE.iterator();
		
		modelo1.addColumn("Código");
		modelo1.addColumn("Nombre");
		modelo1.addColumn("Apellido");
		modelo1.addColumn("Cargo");
		modelo1.addColumn("Salario");
		modelo1.addColumn("Afiliación");
		
		int i=0;
		while(it.hasNext())
		{
			Object obj= it.next();
			Empleados emple = (Empleados) obj;
			modelo1.setValueAt(emple.getID_EMPLEADO(), i, 0);
			modelo1.setValueAt(emple.getNombre_EMP(), i, 1);
			modelo1.setValueAt(emple.getApellido_EMP(), i, 2);
			modelo1.setValueAt(emple.getCargo_EMP(), i, 3);
			modelo1.setValueAt(emple.getSalario(), i, 4);
			modelo1.setValueAt(emple.getTipoAfiliacion(), i, 5);
			i++;
		}
		table_1.setModel(modelo1);
	}
	
	//LISTAR PROVEEDORES
	public void ListarPV(String nom) 
	{
		DefaultTableModel modelo2 = new DefaultTableModel();
		ArrayProveedor pv = new ArrayProveedor();
		ArrayList<Proveedor> listaE = new ArrayList<Proveedor>();
		if(nom.length()==0) listaE=pv.ListarProveedores();
		else listaE= pv.ConsultarProveedores(nom);	
		
		modelo2.setRowCount(listaE.size());
		Iterator<Proveedor> it = listaE.iterator();
		
		modelo2.addColumn("RUC 20");
		modelo2.addColumn("EMPRESA");
		modelo2.addColumn("Teléfono");
		modelo2.addColumn("Email");
		modelo2.addColumn("Distrito");
		modelo2.addColumn("Dirección");
		
		int i=0;
		while(it.hasNext())
		{
			Object obj= it.next();
			Proveedor prove = (Proveedor) obj;
			modelo2.setValueAt(prove.getID_PROVEEDOR(), i, 0);
			modelo2.setValueAt(prove.getNombre_PROV(), i, 1);
			modelo2.setValueAt(prove.getTelefono_PROV(), i, 2);
			modelo2.setValueAt(prove.getEmail_PROV(), i, 3);
			modelo2.setValueAt(prove.getDireccion_PROV(), i, 4);
			modelo2.setValueAt(prove.getDistrito_PROV(), i, 5);
			i++;
		}
		table_2.setModel(modelo2);
	}

	// LLENAR COMBO DE PROVEEDORES
	public void llenarComboProveedores(JComboBox<String> cmb) {
		cmb.removeAllItems(); //LIMPIA EL COMBOBOX
		ArrayProveedor prov = new ArrayProveedor();
	    for (Proveedor p : prov.ListarProveedores()) {
	        cmb.addItem(p.getID_PROVEEDOR());
		    }
		}

	// LLENAR COMBO DE EMPLEADOS
	public void LlenarComboEmpleadosSUPER(JComboBox<String> cmb) {
		cmbEmpleado.removeAllItems(); //LIMPIA EL COMBOBOX
		ArrayEmpleados empleadosDAO = new ArrayEmpleados();
		for (Empleados emp : empleadosDAO.ListarEmpleados()) {
			if (emp.getCargo_EMP().equalsIgnoreCase("Supervisor")) {
		    cmbEmpleado.addItem(emp.getID_EMPLEADO());
		    }
		}
	}

	
	//PROGRAMAMOS LA PESTAÑA PRODUCTOS	
	void LimpiarP() {
		txtNomPro.setText("");
		txtDescripcion.setText("");
		txtPrecio.setText("");
		txtStock.setText("");	
	}	
	
	//BOTÓN AGREGAR PRODUCTOS
	protected void do_btnAgregarProductos_actionPerformed(ActionEvent e) {
		try {
	        ArrayProductos AP = new ArrayProductos();
	        String nuevoID = AP.generarNuevoIDProducto(); //GENERA AUTOMATICAMENTE ID A01, A02...

	        Productos pro = new Productos(
	            nuevoID,
	            txtNomPro.getText(),
	            txtDescripcion.getText(),
	            Double.parseDouble(txtPrecio.getText()),
	            Integer.parseInt(txtStock.getText())
	        );
	        AP.insertar(pro);
	        ListarP("");
	        LimpiarP();
	        JOptionPane.showMessageDialog(null, "Producto agregado con ID: " + nuevoID);
	    } catch (Exception e2) {
	        JOptionPane.showMessageDialog(null, "Datos vacíos o inválidos");
	    }

	    LlenarComboEmpleadosSUPER(cmbEmpleado);
	}
	
	//BOTÓN MODIFICAR PRODUCTOS
	protected void do_btnModificarProducto_actionPerformed(ActionEvent e) 
	{
		try {
	        String nombre = txtNomPro.getText().trim();
	        String descripcion = txtDescripcion.getText().trim();
	        double precioVenta = Double.parseDouble(txtPrecio.getText());
	        int stock = Integer.parseInt(txtStock.getText());

	        ArrayProductos AP = new ArrayProductos();
	        ArrayList<Productos> lista = AP.ConsultarPorNombre(nombre);

	        if (lista.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "No se encontró el producto con ese nombre.");
	            return;
	        }

	        // OBTENER ID
	        String idProducto = lista.get(0).getID_PRODUCTO();

	        // ACTUALIZAR
	        Productos p = new Productos(idProducto, nombre, descripcion, precioVenta, stock);

	        // EDITAR, LISTAR Y LIMPIAR
	        AP.editar(p);
	        ListarP("");
	        LimpiarP();

	        JOptionPane.showMessageDialog(null, "Producto modificado correctamente.");
	    } catch (Exception e2) {
	        JOptionPane.showMessageDialog(null, "Error al modificar producto: " + e2.getMessage());
	    }
	}
	
	//BOTÓN ELIMINAR PRODUCTOS
	protected void do_btnEliminarProducto_actionPerformed(ActionEvent e) 
	{
		try {
	        String nombre = txtNomPro.getText().trim();
	        if (nombre.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Ingrese el nombre del producto a eliminar.");
	            return;
	        }

	        ArrayProductos 	AP = new ArrayProductos();
	        AP.eliminarPorNombre(nombre);
	        ListarP("");
	        LimpiarP();
	        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
	    }
	}
	//BOTÓN BUSCAR PRODUCTOS
	protected void do_btnBuscarProducto_actionPerformed(ActionEvent e) {
		String nombre = txtNomPro.getText().trim();
	    ListarP(nombre);
	}
	
	//PROGRAMAMOS LA PESTAÑA EMPLEADOS
	protected void do_btnAgregarE_actionPerformed(ActionEvent e) 
	{
		try 
		{		
			Empleados emple = new Empleados(txtCodE.getText(),txtNomE.getText(),txtApelli.getText(), cboCargo.getSelectedItem().toString(),Double.parseDouble(txtSalario.getText()),cboAfiliacion.getSelectedItem().toString());
			ArrayEmpleados E = new ArrayEmpleados();
			E.Insertar(emple);
			ListarE("");
			LlenarComboEmpleadosSUPER(cmbEmpleado);
			LimpiarE();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
		
	}
	void LimpiarE() 
	{
		txtCodE.setText("");
		txtNomE.setText("");
		txtApelli.setText("");
		txtSalario.setText("");
	}
	
	protected void do_btnModificarE_actionPerformed(ActionEvent e) 
	{
		try 
		{		
			Empleados emple = new Empleados(txtCodE.getText(),txtNomE.getText(),txtApelli.getText(), cboCargo.getSelectedItem().toString(),Double.parseDouble(txtSalario.getText()),cboAfiliacion.getSelectedItem().toString());
			ArrayEmpleados E = new ArrayEmpleados();
			E.Editar(emple);
			ListarE("");
			LlenarComboEmpleadosSUPER(cmbEmpleado);
			LimpiarE();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
	}
	protected void do_btnEliminarE_actionPerformed(ActionEvent e) 
	{
		ArrayEmpleados E= new ArrayEmpleados();
		E.Eliminar(txtCodE.getText());
		ListarE("");
		LlenarComboEmpleadosSUPER(cmbEmpleado);
		LimpiarE();	
	}
	
	
	//PROGRAMAMOS LA PESTAÑA PROVEEDOR
	protected void do_btnAgregarProve_actionPerformed(ActionEvent e) 
	{
		try 
		{		
		    String email = txtEmail.getText().trim();

		    // Validar que el campo email no esté vacío y contenga arroba
		    if (email.isEmpty() || !email.contains("@")) {
		         JOptionPane.showMessageDialog(null, "Falta el arroba en el correo electrónico.", "Error", JOptionPane.WARNING_MESSAGE);
		         txtEmail.requestFocus();
		         return; // Detiene el proceso si el email no es válido
		    }
		       
			Proveedor provee = new Proveedor(txtRuc.getText(),txtEmpresa.getText(),txtTelefono.getText(),txtEmail.getText(),txtDireccion.getText(),txtDistrito.getText());
			ArrayProveedor PV = new ArrayProveedor();
			PV.Insertar(provee);
			ListarPV("");
			llenarComboProveedores(cmbProveedor);
			LimpiarPV();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
		
	}
	void LimpiarPV() {
		txtRuc.setText("");
		txtEmpresa.setText("");
		txtTelefono.setText("");
		txtDireccion.setText("");
		txtEmail.setText("");
		txtDistrito.setText("");
	}	
	protected void do_btnModificarProve_actionPerformed(ActionEvent e) 
	{
		try 
		{		
			Proveedor provee = new Proveedor(txtRuc.getText(),txtEmpresa.getText(),txtTelefono.getText(),txtEmail.getText(),txtDireccion.getText(),txtDistrito.getText());
			ArrayProveedor PV = new ArrayProveedor();
			PV.Editar(provee);
			ListarPV("");
			llenarComboProveedores(cmbProveedor);
			LimpiarPV();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
	}
	protected void do_btnEliminarProve_actionPerformed(ActionEvent e) 
	{
		ArrayProveedor PV = new ArrayProveedor();
		PV.Eliminar(txtRuc.getText());
		ListarPV("");
		llenarComboProveedores(cmbProveedor);
		LimpiarPV();
	}
	
	public void ListarC(String nom) {
	    DefaultTableModel modelo = new DefaultTableModel();
	    ArrayComprasProductos ac = new ArrayComprasProductos();
	    ArrayEmpleados empleadosDAO = new ArrayEmpleados();
	    ArrayProveedor proveedoresDAO = new ArrayProveedor();

	    ArrayList<ComprasProductos> listaC;

	    if (nom.length() == 0) {
	        listaC = ac.Listar();
	    } else {
	        listaC = ac.ConsultarPorNombreProducto(nom);
	    }

	    modelo.addColumn("ID COMPRA");
	    modelo.addColumn("RUC PROV");
	    modelo.addColumn("NOM PROV");   // visual
	    modelo.addColumn("DNI EMP");
	    modelo.addColumn("NOM EMP");    // visual
	    modelo.addColumn("FECHA");
	    modelo.addColumn("PRODUCTO");   
	    modelo.addColumn("CANTIDAD");
	    modelo.addColumn("P COMPRA");
	    modelo.addColumn("TOTAL");

	    for (ComprasProductos c : listaC) {
	        String nombreEmpleado = "";
	        String nombreProveedor = "";

	        // Buscar nombre del empleado
	        for (Empleados emp : empleadosDAO.ListarEmpleados()) {
	            if (emp.getID_EMPLEADO().equals(c.getID_EMPLEADO())) {
	                nombreEmpleado = emp.getNombre_EMP();
	                break;
	            }
	        }

	        // Buscar nombre del proveedor
	        for (Proveedor prov : proveedoresDAO.ListarProveedores()) {
	            if (prov.getID_PROVEEDOR().equals(c.getID_PROVEEDOR())) {
	                nombreProveedor = prov.getNombre_PROV();
	                break;
	            }
	        }

	        Object[] fila = new Object[10];
	        fila[0] = c.getID_COMPRA();
	        fila[1] = c.getID_PROVEEDOR();
	        fila[2] = nombreProveedor;
	        fila[3] = c.getID_EMPLEADO();
	        fila[4] = nombreEmpleado;
	        fila[5] = c.getFecha_COM_PRO();
	        fila[6] = c.getNOMBRE_PRO();  
	        fila[7] = c.getCantidad_COM_PRO();
	        fila[8] = c.getPrecioC_COM_PRO();
	        fila[9] = c.getTotal_COM();
	        modelo.addRow(fila);
	    }

	    tablaCompras.setModel(modelo);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
	        //Obtener datos del producto desde los campos de texto
	        String nombre = txtNOMPRO.getText().trim();
	        String descripcion = txtDES.getText().trim();
	        double precioVenta = Double.parseDouble(txtPREVEN.getText());
	        int cantidad = Integer.parseInt(txtCANT.getText());
	        double precioCompra = Double.parseDouble(txtPRECOM.getText());
	        double total = precioCompra * cantidad;

	        //Obtener datos del proveedor y empleado
	        String idProveedor = (String) cmbProveedor.getSelectedItem();
	        String idEmpleado = (String) cmbEmpleado.getSelectedItem();

	        //Validar que el empleado sea SUPERVISOR
	        ArrayEmpleados daoEmp = new ArrayEmpleados();
	        ArrayList<Empleados> empList = daoEmp.ConsultarEmpleadosID(idEmpleado);
	        if (empList.isEmpty() || !empList.get(0).getCargo_EMP().equalsIgnoreCase("Supervisor")) {
	            JOptionPane.showMessageDialog(null, "Solo un Supervisor puede registrar compras.");
	            return;
	        }

	        //Verificar si el producto ya existe por su nombre
	        ArrayProductos daoProd = new ArrayProductos();
	        ArrayList<Productos> existe = daoProd.ConsultarPorNombre(nombre);
	        String idProducto;

	        if (!existe.isEmpty()) {
	            // Producto ya existe → solo actualizar stock
	            idProducto = existe.get(0).getID_PRODUCTO();
	            daoProd.ActualizarStock(idProducto, cantidad);
	        } else {
	            // Producto nuevo → generar ID de PRODUCTO y registrar
	            idProducto = daoProd.generarNuevoIDProducto();  // tipo A01, A02, etc.
	            Productos nuevo = new Productos(idProducto, nombre, descripcion, precioVenta, cantidad);
	            daoProd.insertar(nuevo);
	        }

	        //Generar ID de compra
	        ArrayComprasProductos daoCompra = new ArrayComprasProductos();
	        String idCompra = daoCompra.generarNuevoIDCompra();  // tipo CP01, CP02, etc.

	        //Crear objeto y registrar en tabla COMPRA_PRODUCTOS 
	        ComprasProductos cp = new ComprasProductos(
	            idCompra,
	            idProveedor,
	            idEmpleado,
	            nombre,      
	            null,        // Fecha autogenerada en DB
	            cantidad,
	            precioCompra,
	            total
	        );

	        daoCompra.Insertar(cp);

	        //Limpiar campos
	        txtNOMPRO.setText("");
	        txtDES.setText("");
	        txtPREVEN.setText("");
	        txtCANT.setText("");
	        txtPRECOM.setText("");

	        //Actualizar tablas
	        ListarC("");
	        ListarP("");
	        
	        //Confirmación
	        JOptionPane.showMessageDialog(null, "Compra registrada correctamente.");

	    } catch (Exception ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error al registrar compra: " + ex.getMessage());
	    }
	}
	protected void do_btnEliminarCompra_actionPerformed(ActionEvent e) {
		try {
	        int fila = tablaCompras.getSelectedRow();
	        if (fila == -1) {
	            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar.");
	            return;
	        }

	        String idCompra = tablaCompras.getValueAt(fila, 0).toString();          // ID_COMPRA
	        String nombreProducto = tablaCompras.getValueAt(fila, 6).toString();    // NOMBRE_PRO
	        int cantidadComprada = Integer.parseInt(tablaCompras.getValueAt(fila, 7).toString());  // Cantidad

	        // Buscar el producto por nombre
	        ArrayProductos daoProd = new ArrayProductos();
	        ArrayList<Productos> productos = daoProd.ConsultarPorNombre(nombreProducto);

	        if (productos.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Producto no encontrado en la base de datos.");
	            return;
	        }

	        Productos producto = productos.get(0);
	        String idProducto = producto.getID_PRODUCTO();
	        int stockActual = producto.getStock_PRO();
	        int stockRestante = stockActual - cantidadComprada;

	        // ✅ Validación: no permitir stock negativo
	        if (stockRestante < 0) {
	            JOptionPane.showMessageDialog(null, "No se puede eliminar la compra. El stock quedaría negativo.");
	            return;
	        }

	        if (stockRestante == 0) {
	            // Eliminar producto completamente
	            daoProd.eliminarPorNombre(nombreProducto);
	        } else {
	            // Restar del stock
	            daoProd.ActualizarStock(idProducto, -cantidadComprada);
	        }

	        // Eliminar la compra
	        ArrayComprasProductos daoCompra = new ArrayComprasProductos();
	        daoCompra.Eliminar(idCompra);

	        // Actualizar tablas
	        ListarC("");
	        ListarP("");

	        JOptionPane.showMessageDialog(null, "Compra eliminada correctamente.");

	    } catch (Exception ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
	    }
	}
	protected void do_btnModificarCompraP_actionPerformed(ActionEvent e) {
		try {
            int fila = tablaCompras.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para modificar.");
                return;
            }

            // Obtener ID de la compra seleccionada
            String idCompra = tablaCompras.getValueAt(fila, 0).toString();

            // Datos actualizados desde los txt
            String nombre = txtNOMPRO.getText().trim();
            String descripcion = txtDES.getText().trim();
            double precioVenta = Double.parseDouble(txtPREVEN.getText());
            int nuevaCantidad = Integer.parseInt(txtCANT.getText());
            double nuevoPrecioCompra = Double.parseDouble(txtPRECOM.getText());
            double nuevoTotal = nuevaCantidad * nuevoPrecioCompra;

            // Datos de proveedor y empleado
            String idProveedor = (String) cmbProveedor.getSelectedItem();
            String idEmpleado = (String) cmbEmpleado.getSelectedItem();

            // Buscar producto por nombre
            ArrayProductos daoProd = new ArrayProductos();
            ArrayList<Productos> lista = daoProd.ConsultarPorNombre(nombre);

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontró el producto a modificar.");
                return;
            }

            String idProducto = lista.get(0).getID_PRODUCTO();
            int stockActual = lista.get(0).getStock_PRO();

            // Obtener datos originales
            ArrayComprasProductos daoCompra = new ArrayComprasProductos();
            ArrayList<ComprasProductos> listaOriginal = daoCompra.ConsultarPorID(idCompra);

            if (listaOriginal.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontró la compra original.");
                return;
            }

            ComprasProductos compraOriginal = listaOriginal.get(0);
            int cantidadOriginal = compraOriginal.getCantidad_COM_PRO();

            // Calcular diferencia para ajustar stock
            int diferenciaCantidad = nuevaCantidad - cantidadOriginal;
            int nuevoStock = stockActual + diferenciaCantidad;

            if (nuevoStock < 0) {
                JOptionPane.showMessageDialog(null, "No se puede modificar. El stock quedaría negativo.");
                return;
            }

            // Actualizar compra
            ComprasProductos nuevaCompra = new ComprasProductos(
                idCompra,
                idProveedor,
                idEmpleado,
                nombre,
                null,
                nuevaCantidad,
                nuevoPrecioCompra,
                nuevoTotal
            );
            daoCompra.Editar(nuevaCompra);

            // Actualizar stock y precio en PRODUCTOS
            daoProd.ActualizarStock(idProducto, diferenciaCantidad);
            daoProd.ActualizarPrecioVenta(idProducto, precioVenta);

            JOptionPane.showMessageDialog(null, "Compra modificada correctamente.");
            ListarC("");
            ListarP("");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al modificar: " + ex.getMessage());
        }
	}
	protected void do_btnBuscarComP_actionPerformed(ActionEvent e) {
		String nombre = txtNOMPRO.getText().trim();
        if (!nombre.isEmpty()) {
            ListarC(nombre);
        } else {
            ListarC(""); // Mostrar todo si está vacío
        }
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtEmail) {
			do_txtEmail_keyTyped(e);
		}
		if (e.getSource() == txtEmpresa) {
			do_txtEmpresa_keyTyped(e);
		}
		if (e.getSource() == txtCANT) {
			do_txtCANT_keyTyped(e);
		}
		if (e.getSource() == txtPRECOM) {
			do_txtPRECOM_keyTyped(e);
		}
		if (e.getSource() == txtPREVEN) {
			do_txtPREVEN_keyTyped(e);
		}
	}
	protected void do_txtPREVEN_keyTyped(KeyEvent e) {
	    char c = e.getKeyChar();
	    JTextField textField = (JTextField) e.getComponent();
	    String textoActual = textField.getText();

	    // Permitir números y un solo punto decimal
	    if (!Character.isDigit(c) && c != '.') {
	        e.consume(); // Bloquear si no es número ni punto
	    }

	    // No permitir más de un punto decimal
	    if (c == '.' && textoActual.contains(".")) {
	        e.consume(); // Ya hay un punto
	    }

	    // Limitar a 8 caracteres en total (incluyendo el punto)
	    if (textoActual.length() >= 8) {
	        e.consume();
	    }
		
	}
	protected void do_txtPRECOM_keyTyped(KeyEvent e) {
	    char c = e.getKeyChar();
	    JTextField textField = (JTextField) e.getComponent();
	    String textoActual = textField.getText();

	    // Permitir números y un solo punto decimal
	    if (!Character.isDigit(c) && c != '.') {
	        e.consume(); // Bloquear si no es número ni punto
	    }

	    // No permitir más de un punto decimal
	    if (c == '.' && textoActual.contains(".")) {
	        e.consume(); // Ya hay un punto
	    }

	    // Limitar a 8 caracteres en total (incluyendo el punto)
	    if (textoActual.length() >= 8) {
	        e.consume();
	    }
	}
	protected void do_txtCANT_keyTyped(KeyEvent e) {
		  char c = e.getKeyChar();
		    JTextField textField = (JTextField) e.getComponent();
		    String textoActual = textField.getText();

		    // Solo permitir dígitos del 0 al 9
		    if (!Character.isDigit(c)) {
		        e.consume(); // Bloquea si no es número
		    }

		    // Limitar a 5 dígitos (puedes cambiar el número si deseas)
		    if (textoActual.length() >= 5) {
		        e.consume(); // Bloquea si supera el límite
		    }
	}
	protected void do_txtEmpresa_keyTyped(KeyEvent e) {
	    char c = e.getKeyChar();

	    // Permitir letras, números y espacio
	    if (!Character.isLetterOrDigit(c) && c != ' ') {
	        e.consume(); // Bloquea símbolos y caracteres especiales
	    }
	}
	protected void do_txtEmail_keyTyped(KeyEvent e) {
	}
}
