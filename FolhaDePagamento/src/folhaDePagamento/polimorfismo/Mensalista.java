package folhaDePagamento.polimorfismo;

public class Mensalista extends Funcionario {
	
	private double salario;

	public Mensalista(String cpf, String nome,Departamento departamento, String tipo, String cargo) {
		super(cpf, nome, departamento, tipo, cargo);
	}
	
	public double calcularSalario(Funcionario funcionario,double salario) {
		funcionario.setSalario(salario);
		memoria = Double.toString(salario);
		return funcionario.getSalario();
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

