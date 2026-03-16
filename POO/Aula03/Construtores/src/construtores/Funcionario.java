package construtores;

public class Funcionario extends Pessoa{
	
	private double salario;

	public Funcionario(String nome, String cpf, double salario) {
		//chamando construtor da classe superior (Pessoa)
		super(nome, cpf);
		this.salario = salario;
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
