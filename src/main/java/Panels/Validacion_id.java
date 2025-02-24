package Panels;

import javax.swing.JPanel;
import java.awt.Label;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Logica.Validacion;

public class Validacion_id extends JPanel {
	private JTable table;
	private JButton btnCompilar;
	private JTextArea textArea;
	private JLabel lblTitulo;
	private JPanel JpTitulo;
	
	private String texto;
	
	public Validacion_id() {
		setSize(900, 600);;
		setLayout(null);
		
		JpTitulo = new JPanel();
		JpTitulo.setBounds(0, 0, 900, 49);
		add(JpTitulo);
		JpTitulo.setLayout(new BorderLayout(0, 0));
		
		lblTitulo = new JLabel("VALIDADOR DE ID");
		lblTitulo.setFont(new Font("Roboto Black", Font.PLAIN, 25));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		JpTitulo.add(lblTitulo, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 88, 300, 391);
		add(textArea);
		
		btnCompilar = new JButton("COMPILAR");
		btnCompilar.setToolTipText("AL PRECIONAR SE COMPILARA EL CODIGO DEL CUADRO DE TEXTO\r\n");
		btnCompilar.setBackground(SystemColor.activeCaption);
		btnCompilar.setFont(new Font("Roboto Black", Font.PLAIN, 14));
		btnCompilar.setBounds(397, 517, 123, 21);
		add(btnCompilar);
		
		btnCompilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	texto=textArea.getText();
            	Validacion validacion = new Validacion();
            	validacion.dividir_filas(texto);
            	//validacion.Validar_id(texto);
            	}
        });
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.setBounds(590, 87, 300, 391);
		add(table);
	
		
	}
	
}
