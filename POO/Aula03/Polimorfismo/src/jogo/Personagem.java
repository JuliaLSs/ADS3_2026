package jogo;

public class Personagem {
	//atributos ( - = privado)
	private int vida;
	
	//métodos (+ = publico)
	public void atacar() {
		System.out.println("Ataque");
	}
	
	public void atacar(String tipo) {
		System.out.println("Personagem executou ataque do tipo " + tipo);
	}

}
