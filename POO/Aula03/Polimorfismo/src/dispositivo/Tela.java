package dispositivo;

public class Tela {

	public static void main(String[] args) {
		
		Dispositivo dispositivo = new Dispositivo();
		PCDesktop pc = new PCDesktop();
		Celular celular = new Celular();
		
		dispositivo.iniciar();
		System.out.println(" ");
		pc.iniciar();
		System.out.println(" ");
		celular.iniciar();
		System.out.println(" ");
		

	}

}