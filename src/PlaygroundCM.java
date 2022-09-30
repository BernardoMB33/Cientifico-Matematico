
public class PlaygroundCM {

	public static void main(String[] args) {
		CientificoMatematico cd1 = new CientificoMatematico("Josue", "Fisico");
		CientificoMatematico cd2 = new CientificoMatematico("Josue", "Fisico");
		CientificoMatematico cd3 = new CientificoMatematico("Matias", "Datos");
		
		// fun min
		System.out.println(cd1.equals(cd3));
		System.out.println(cd1.equals(cd2));
		System.out.println(cd1.toString());
		
		
		// gets and sets
		cd1.setAreaEspecialidad("Quimico");
		System.out.println(cd1.getNombre());
		System.out.println(cd1.getAreaEspecialidad());
		
		
		//Ex 7
		System.out.println(cd1.estaOrdenCreciente(11, 23));
		System.out.println(cd1.estaOrdenCreciente(50, 11));
		
		//Ex 8
		System.out.println(cd1.ordenaCreciente(11, 23));
		System.out.println(cd1.ordenaCreciente(50, 11));
		
		//Ex 9
		System.out.println(cd1.esImpar(11));
		System.out.println(cd1.esImpar(4));
		
		
		
		
	}

}
