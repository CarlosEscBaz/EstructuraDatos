package pilas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class principal extends JFrame implements ActionListener 
{

	private JPanel contentPane;
	private JTextField tfId;
	private JTextField tfNombre;
	private JTextField tfCiudad;
	private JTextField tfEstadio;
	private JButton btnPush, btnPop, btnTope, btnVacia;
	private JTextArea taTexto;
	private pila p=new pila();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					principal frame = new principal();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public principal() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnPush = new JButton("Push");
		btnPush.setBounds(20, 85, 89, 23);
		btnPush.addActionListener(this);
		contentPane.add(btnPush);
		
		btnPop = new JButton("Pop");
		btnPop.setBounds(215, 85, 89, 23);
		btnPop.addActionListener(this);
		contentPane.add(btnPop);
		
		tfId = new JTextField();
		tfId.setBounds(10, 40, 75, 30);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(95, 40, 100, 30);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfCiudad = new JTextField();
		tfCiudad.setBounds(205, 40, 100, 30);
		contentPane.add(tfCiudad);
		tfCiudad.setColumns(10);
		
		tfEstadio = new JTextField();
		tfEstadio.setColumns(10);
		tfEstadio.setBounds(315, 40, 100, 30);
		contentPane.add(tfEstadio);
		
		JLabel lblId = new JLabel("ID (N\u00FAmero)");
		lblId.setFont(new Font("Arial Black", Font.PLAIN, 10));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(10, 15, 75, 14);
		contentPane.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(95, 9, 100, 20);
		contentPane.add(lblNombre);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCiudad.setBounds(205, 9, 100, 20);
		contentPane.add(lblCiudad);
		
		JLabel lblEstadio = new JLabel("Estadio");
		lblEstadio.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblEstadio.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstadio.setBounds(315, 9, 100, 20);
		contentPane.add(lblEstadio);
		
		btnVacia = new JButton("\u00BFVac\u00EDa?");
		btnVacia.setBounds(314, 85, 100, 23);
		btnVacia.addActionListener(this);
		contentPane.add(btnVacia);
		
		btnTope = new JButton("Tope");
		btnTope.setBounds(119, 85, 89, 23);
		btnTope.addActionListener(this);
		contentPane.add(btnTope);
		
		taTexto = new JTextArea();
		taTexto.setBounds(10, 112, 414, 111);
		contentPane.add(taTexto);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		equipo eq=new equipo();
		nodo n=new nodo();
		String texto="";
		
		if (e.getSource()==btnVacia)
		{
			if (p.isVacio())
			{
				JOptionPane.showMessageDialog(null, "La pila está vacía");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "La pila NO está vacía");
			}
		}
		if (e.getSource()==btnPush)
		{
			boolean bandera=true;
			if (tfId.getText().length()==0 || tfNombre.getText().length()==0 || tfCiudad.getText().length()==0 || tfEstadio.getText().length()==0) 
			{
				JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
				bandera=false;
			}
			else
			{
				try 
				{
					eq.setId(Integer.parseInt(tfId.getText()));
				}
				catch (Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un id válido", "Error", JOptionPane.ERROR_MESSAGE);
					bandera=false;
				}
				
				if (bandera)
				{
					eq.setNombre(tfNombre.getText());
					eq.setCiudad(tfCiudad.getText());
					eq.setEstadio(tfEstadio.getText());
					n.setE(eq);
					
					if (!p.isFull())
					{
						if (p.push(n))
						{
							JOptionPane.showMessageDialog(null, "Ingresado");
							tfId.setText(null);
							tfNombre.setText(null);
							tfCiudad.setText(null);
							tfEstadio.setText(null);
							
							texto = p.imprimir().toString();
							taTexto.setText(texto);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "No ingresado", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "La pila está llena", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		}
		if (e.getSource()==btnPop)
		{
			texto=p.pop().toString();
			JOptionPane.showMessageDialog(null, texto, "Pop", JOptionPane.INFORMATION_MESSAGE);
			
			texto = p.imprimir().toString();
			taTexto.setText(texto);
			
		}
		if (e.getSource()==btnTope)
		{
			if (p.isVacio())
			{
				JOptionPane.showMessageDialog(null, "La pila está vacía", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				texto=p.tope().toString();
				JOptionPane.showMessageDialog(null, texto, "Tope", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
