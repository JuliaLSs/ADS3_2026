package jogo;

public class Jogo {

	public static void main(String[] args) {
		Personagem personagem = new Personagem();
		Guerreiro guerreiro = new Guerreiro();
		Mago mago = new Mago ();
		Arqueiro arqueiro = new Arqueiro();
		
		//guerreiro.atacar();
		//mago.atacar();
		//arqueiro.atacar();
		
		Personagem[] personagens = new Personagem [4];
		personagens[0] = personagem;
		personagens[1] = guerreiro;
		personagens[2] = mago;
		personagens[3] = arqueiro;
		for (int i = 0; i < personagens.length; i++) {
			personagens[i].atacar("Mortal");
			
		}	

	}

}
