package folhaDePagamento.polimorfismo;

import java.util.ArrayList;
import java.util.List;


public class Departamento {

private String nome;
private List<Funcionario> funcionarios = new ArrayList<>();
 
 public Departamento(String nome) {
		this.nome = nome;
	}
 
 public void addFuncionario(Funcionario funcionario) {
	 funcionarios.add(funcionario);
 }

 public String getFuncionarios() {
	 StringBuilder resultado = new StringBuilder();
	 resultado.append("Lista de funcionários:");
	 resultado.append("\n");
	 for (Funcionario func : this.funcionarios) {
		 if(func.getTipo()=="Horista") {
		 resultado.append(String.format("%1s %1s %1s %1s R$ %.2f %1s %1s", func.getCpf(), func.getNome(), func.getDepartamento(),
					func.getTipo(),func.getSalario(),func.getMemoria(), func.getCargo()));
		}else {
		 resultado.append(String.format("%1s %1s %1s %1s R$ %.2f %1s", func.getCpf(), func.getNome(), func.getDepartamento(),
					func.getTipo(),func.getSalario(),func.getCargo()));
		}
			resultado.append("\n");
	 }
	 return resultado.toString();
}
 

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
}
