package folhaDePagamento.semHerancaEPolimorfismo;

public class Empreitada{

	private double salario;
	private String cpf;
	private String nome;
	private String tipo;
	private String cargo;
	private String memoria;
	private Departamento departamento;



	public Empreitada(String cpf, String nome, Departamento departamento,String tipo, String cargo) {
		setCpf(cpf);
		setNome(nome);
		setDepartamento(departamento);
		setTipo(tipo);
		setCargo(cargo);
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
		if(tipo =="Empreitada") {
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
	
	
	public double calcularSalario(Empreitada empreitada,double salario) {
		empreitada.setSalario(salario);
		memoria = Double.toString(salario);
		return empreitada.getSalario();
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
