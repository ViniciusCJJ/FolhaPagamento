package folhaDePagamento.semHerancaEPolimorfismo;


public class Horista{

	private String cpf;
	private String nome;
	private String tipo;
	private String cargo;
	private String memoria;
	private double salario;
	private Departamento departamento;
	private double valorHora;
	private double horasTrabalhadas;


	public Horista(String cpf, String nome, Departamento departamento,String tipo, String cargo) {
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
		if(tipo =="Horista") {
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

	public double calcularSalario(Horista horista,double valorHora,double HorasTrabalhadas) {
		horista.setSalario(HorasTrabalhadas*valorHora);
		memoria = Double.toString(HorasTrabalhadas)+"*"+Double.toString(valorHora);
		return horista.getSalario();
	}
}
