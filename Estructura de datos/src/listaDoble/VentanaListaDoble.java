package listaDoble;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaListaDoble extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JButton btn_aceptar;
	private ventanaInsertar insertar;
	private JComboBox cb_op;
	private JTextArea ta_lista;
	
	public ListaDoble lista=new ListaDoble();

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					VentanaListaDoble frame = new VentanaListaDoble();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaListaDoble() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] A= {"Seleccione una opción", 
				"1.- Insertar nodo adelante", 
				"2.- Insertar nodo atrás", 
				"3.- Eliminar primer nodo", 
				"4.- Eliminar último nodo",
				"5.- Recorrido hacia adelante",
				"6.- Recorrido hacia atrás",
				"7.- Imprimir"
				};
		
		cb_op = new JComboBox(A);
		cb_op.setBounds(40, 60, 250, 25);
		contentPane.add(cb_op);
		
		JLabel lbl_titulo = new JLabel("Lista Doblemente Enlazada");
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_titulo.setBounds(97, 11, 239, 25);
		contentPane.add(lbl_titulo);
		
		ta_lista = new JTextArea();
		ta_lista.setBounds(10, 93, 414, 157);
		contentPane.add(ta_lista);
		
		btn_aceptar = new JButton("Aceptar");
		btn_aceptar.setBounds(315, 61, 89, 23);
		btn_aceptar.addActionListener(this);
		contentPane.add(btn_aceptar);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==btn_aceptar)
		{
			int op = cb_op.getSelectedIndex();
			String texto="";
			
			switch (op)
			{
			case 0:
					JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción de la lista", "Seleccione una opción", JOptionPane.ERROR_MESSAGE);
					break;
			case 1:
					EventQueue.invokeLater(new Runnable() 
					{
						public void run() 
						{
							try 
							{
								insertar=new ventanaInsertar(1, lista);
								insertar.setVisible(true);
							} 
							catch (Exception e) 
							{
								e.printStackTrace();
							}
						}
					});
				break;
			case 2:
					EventQueue.invokeLater(new Runnable() 
					{
						public void run() 
						{
							try 
							{
								insertar=new ventanaInsertar(2, lista);
								insertar.setVisible(true);
							} 
							catch (Exception e) 
							{
								e.printStackTrace();
							}
						}
					});
				break;
			case 5:
					texto=lista.imprimirAdelante().toString();
					ta_lista.setText(texto);
				break;
			case 6:
					texto=lista.imprimirAtras().toString();
					ta_lista.setText(texto);
				break;
			}
		}
		
	}
}
