package main.java.juan1639.main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import main.java.juan1639.settings.Settings;

public class Ventana extends JPanel {
	
	public static final int WIDTH = Settings.Dimensiones.TILE_X * Settings.Dimensiones.NRO_COLUMNAS; 
	public static final int HEIGHT = Settings.Dimensiones.TILE_Y * Settings.Dimensiones.NRO_FILAS; 
	
	private static final long serialVersionUID = 6132970227030811138L;
	
	public Ventana() {
		
		inicializa();
	}
	
	private void inicializa() {
		
		//addKeyListener(new Controles());

		int[] rgb = Settings.Colores.GRIS_SUELO;
		setBackground(new Color(rgb[0], rgb[1], rgb[2]));
		setFocusable(true);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));

		comenzar();
	}
	
	private void comenzar() {
		
		
	}

}
