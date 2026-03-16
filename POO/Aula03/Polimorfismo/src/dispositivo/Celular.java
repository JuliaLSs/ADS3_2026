package dispositivo;

public class Celular extends Dispositivo{
	
	@Override
	public void iniciar() {
		System.out.println("Iniciou o Celular");
		System.out.println("Ativa o wifi");
		System.out.println("Ativa bluetooth");
		System.out.println("Aparece tela de Bloqueio");
		System.out.println("Mostra notificações recebidas");
		
	}

}
