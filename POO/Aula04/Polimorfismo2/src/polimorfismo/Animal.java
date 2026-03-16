package polimorfismo;

public abstract class Animal {
	
	private String raca;
	
	//Construtor
	public Animal(String raca) {
		this.raca = raca;
		
	}
	
	public abstract void emitirSom();

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}

