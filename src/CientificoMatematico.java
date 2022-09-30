
public class CientificoMatematico {
	//atributos
	private String nombre, areaEspecialidad;
	
	//constructores
	public CientificoMatematico(){
	}
	
	public CientificoMatematico(String n1, String ae){
		this.nombre=n1;
		this.areaEspecialidad= ae;
	}

	public String getNombre() {
		return nombre;
	}

	

	public String getAreaEspecialidad() {
		return areaEspecialidad;
	}

	
	public void setAreaEspecialidad(String areaEspecialidad) {
		this.areaEspecialidad = areaEspecialidad;
	}
	
	//fun min
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: "+ nombre+ "\n" );
		sb.append("Area Esp: " + areaEspecialidad+ "\n");
		return sb.toString();
	}
	
	public boolean equals(CientificoMatematico otro) {
		return (otro.nombre == this.nombre);
	}
	


	//fun clase

	public boolean estaOrdenCreciente(int num1, int num2) {
		return (num1<=num2);
	}
	
	public String ordenaCreciente(int num1, int num2) {
		String res;
		if (num1<=num2) {
			res=(num1+"-"+num2);
		}
		else
			res=(num2+"-"+num1);
		return res;
	}
	
	public boolean esImpar(int num1) {
		return(num1%2!=0);
	}
	
}
