package folhaDePagamento.polimorfismo;


public class Funcionario {
private String cpf;
private String nome;
private String tipo;
private String cargo;
protected String memoria;
private double salario;
private Departamento departamento;


public Funcionario(String cpf, String nome, Departamento departamento,String tipo, String cargo) {
	setCpf(cpf);
	setNome(nome);
	setDepartamento(departamento);
	setTipo(tipo);
	setCargo(cargo);
}

public double getSalario() {
	return salario;
}



public void setSalario(double salario) {
	this.salario = salario;
}



public String getCpf() {
	return cpf;
}



public void setCpf(String cpf) {
	this.cpf = cpf;
}



public String getNome() {
	return nome;
}

public String getMemoria() {
	return memoria;
}

public void setMemoria(String memoria) {
	this.memoria = memoria;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDepartamento() {
	return departamento.getNome();
}

public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
}

public String getTipo() {
	return tipo;
}

public boolean setTipo(String tipo) {
	if(tipo =="Mensalista" || tipo =="Horista"|| tipo =="Empreitada") {
		this.tipo = tipo;
		return true;
	}
	return false;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

public double calcularSalario(Funcionario funcionario,double salario) {
	funcionario.setSalario(salario);
	memoria = Double.toString(salario);
	return funcionario.getSalario();
}

public double calcularSalarioH(Funcionario funcionario,double valorHora,double HorasTrabalhadas) {
	funcionario.setSalario(HorasTrabalhadas*valorHora);
	memoria = Double.toString(HorasTrabalhadas)+"*"+Double.toString(valorHora);
	return funcionario.getSalario();
}

}
