package listaDoble;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ventanaInsertar extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JTextField tf_id;
	private JTextField tf_nombre;
	private JTextField tf_album;
	private JTextField tf_artista;
	private JTextField tf_genero;
	private JLabel lblNombre;
	private JLabel lblArtista;
	private JLabel lblGnero;
	private JButton btn_aceptar;
	int op2=0;
	private ListaDoble lista;

	public ventanaInsertar(int op) 
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_titulo = new JLabel();
		lbl_titulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		switch (op)
		{
		case 1:
				lbl_titulo.setText("Insertar principio");
				op2=1;
			break;
		case 2:
				lbl_titulo.setText("Insertar final");
				op2=2;
			break;
		}
		
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo.setBounds(47, 11, 190, 30);
		contentPane.add(lbl_titulo);
		
		tf_id = new JTextField();
		tf_id.setBounds(75, 75, 175, 30);
		contentPane.add(tf_id);
		tf_id.setColumns(10);
		
		tf_nombre = new JTextField();
		tf_nombre.setColumns(10);
		tf_nombre.setBounds(75, 116, 175, 30);
		contentPane.add(tf_nombre);
		
		tf_album = new JTextField();
		tf_album.setColumns(10);
		tf_album.setBounds(75, 157, 175, 30);
		contentPane.add(tf_album);
		
		tf_artista = new JTextField();
		tf_artista.setColumns(10);
		tf_artista.setBounds(75, 198, 175, 30);
		contentPane.add(tf_artista);
		
		tf_genero = new JTextField();
		tf_genero.setColumns(10);
		tf_genero.setBounds(75, 239, 175, 30);
		contentPane.add(tf_genero);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(19, 83, 26, 14);
		contentPane.add(lblId);
		
		JLabel lbllbum = new JLabel("\u00C1lbum");
		lbllbum.setBounds(19, 165, 46, 14);
		contentPane.add(lbllbum);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(19, 124, 46, 14);
		contentPane.add(lblNombre);
		
		lblArtista = new JLabel("Artista");
		lblArtista.setBounds(19, 206, 46, 14);
		contentPane.add(lblArtista);
		
		lblGnero = new JLabel("Género");
		lblGnero.setBounds(19, 247, 46, 14);
		contentPane.add(lblGnero);
		
		btn_aceptar = new JButton("Ingresar");
		btn_aceptar.setBounds(97, 297, 89, 23);
		btn_aceptar.addActionListener(this);
		contentPane.add(btn_aceptar);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==btn_aceptar)
		{
			
			NodoDoble nuevo=new NodoDoble();
			
			nuevo.setId(Integer.parseInt(tf_id.getText()));
			nuevo.setNombre(tf_nombre.getText());
			nuevo.setArtista(tf_artista.getText());
			nuevo.setAlbum(tf_album.getText());
			nuevo.setGenero(tf_genero.getText());
			
			lista.insertarPrincipio(nuevo);
			
			dispose();
		}
		
	}
}
