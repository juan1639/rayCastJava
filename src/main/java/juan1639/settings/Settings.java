package main.java.juan1639.settings;

public class Settings {
	
	public static final int FPS = 120;
	
	public static final Double PI = 3.14159265;
	
	public static final int DISTANCIA_ENTRE_RAYOS = 1;// 1=ideal, 2=para más FPS, etc...
	public static final int FOV = 60;// 60º (Field Of View) del jugador
	
	public static final Boolean RENDER_CON_TEXTURA = false;
	public static final int NRO_TEXTURAS_PARED = 14;
	
	// ==================================================
	public class Dimensiones {
		
		public static final int TILE_X = 20;// px
		public static final int TILE_Y = 20;// px
		public static final int NRO_COLUMNAS = 40;
		public static final int NRO_FILAS = 30;
	}
	
	// ==================================================
	public class Colores {
		
		public static final int[] BLANCO = {245, 245, 245};
		public static final int[] GRIS_SUELO = {70, 75, 75};
		public static final int[] PARED_OSCURO = {150, 150, 150};
		public static final int[] PARED_CLARO = {128, 128, 128};
		public static final int[] NEGRO = {5, 5, 5};
		public static final int[] AMARILLO = {249, 216, 28};
		public static final int[] VERDE = {83, 216, 61};
		public static final int[] ROJO = {255, 55, 5};
		public static final int[] AZUL_OSCURO = {22, 11, 78};
		public static final int[] AZUL_CELESTE = {83, 183, 255};
	}
}
