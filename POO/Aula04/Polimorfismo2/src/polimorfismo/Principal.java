package polimorfismo;

public class Principal {

	public static void main(String[] args) {

		//Animal a = new Animal("indefinida");
		Gato g = new Gato ("Siâmes");
		Cachorro c = new Cachorro ("SRD");
		Cachorro c2 = new Cachorro ("Bulldog");
		
		Animal [] animais = new Animal[]{g, c, c2};
		for (int i = 0; i < animais.length; i++) {
			animais[i].emitirSom();
			//usar instanceof ao usar downcast
			if (animais[i] instanceof Gato) {
				Gato gato = ( Gato ) animais [i]; //downcast
				gato.ronronar();
				System.out.println("O animal acima é um gato\n");
			} else if (animais[i] instanceof Cachorro) {
				Cachorro cachorro = ( Cachorro ) animais [i];
				cachorro.abanarORabo();
				System.out.println("O animal acima é um cachorro\n");
			}
		}

	}

}
