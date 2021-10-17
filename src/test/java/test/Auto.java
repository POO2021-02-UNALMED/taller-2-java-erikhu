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
		return asientos.length;
	}
	
	public String verificarIntegridad() {
		for (int i = 0; i < asientos.length; i++) {
			if (isNotOriginal(asientos[i])) {
				return "Las piezas no son originales";
			}
		}
		return "Auto original";
	}
	
	private boolean isNotOriginal(Asiento asiento) {
		return !(asiento != null && asiento.registro == motor.registro && asiento.registro == registro);
	}
}
