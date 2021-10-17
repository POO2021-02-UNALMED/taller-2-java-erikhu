package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cont = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) cont++;
		}
		return cont;
	}
	
	public String verificarIntegridad() {
		for (int i = 0; i < asientos.length; i++) {
			Asiento asiento = asientos[i];
			if (asiento != null && isNotOriginal(asiento)) {
				return "Las piezas no son originales";
			}
		}
		return "Auto original";
	}
	
	private boolean isNotOriginal(Asiento asiento) {
		return !(asiento.registro == motor.registro && asiento.registro == registro);
	}
}