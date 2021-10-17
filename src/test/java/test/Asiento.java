package test;

import java.util.Arrays;

public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	private String[] colors = {"amarillo", "rojo", "verde", "negro"};
	
	public void cambiarColor(String color) {
		if(Arrays.asList(this.colors).contains(color)) {
			this.color = color;
		}
	}
}
