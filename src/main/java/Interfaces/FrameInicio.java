package Interfaces;

import javax.swing.JFrame;

import Panels.Validacion_id;

public class FrameInicio extends JFrame {

	
	public void defecto() {
		Validacion_id panel=new Validacion_id();
		setSize(900, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(panel);
	}
}
