package folhaDePagamento.polimorfismo;

public class Horista extends Funcionario{

private double valorHora;
private double horasTrabalhadas;

	public Horista(String cpf, String nome,Departamento departamento, String tipo, String cargo) {
		super(cpf, nome,departamento,tipo, cargo);
	}
	
	public double getValorHora() {
	return valorHora;
	}


	public void setValorHora(double valorHora) {
	this.valorHora = valorHora;
	}


	public double getHorasTrabalhadas() {
	return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(double horasTrabalhadas) {
	this.horasTrabalhadas = horasTrabalhadas;
	}

	public double calcularSalarioH(Funcionario funcionario,double valorHora,double HorasTrabalhadas) {
		funcionario.setSalario(HorasTrabalhadas*valorHora);
		memoria = Double.toString(HorasTrabalhadas)+"*"+Double.toString(valorHora);
		return funcionario.getSalario();
	}
}
