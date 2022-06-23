package folhaDePagamento.semHerancaEPolimorfismo;

import java.util.ArrayList;
import java.util.List;


public class Departamento {
 private String nome;

private List<Horista> horistas = new ArrayList<>();
private List<Mensalista> mensalistas = new ArrayList<>();
private List<Empreitada> empreitadas = new ArrayList<>();
 
 public Departamento(String nome) {
	 setNome(nome);
	}
 
 public void addFuncionarioHorista(Horista horista) {
	horistas.add(horista);
 }

 public void addFuncionarioMensalista(Mensalista mensalista) {
	mensalistas.add(mensalista);
 }

	 public void addFuncionarioEmpreitada(Empreitada empreitada) {
	empreitadas.add(empreitada);
 }

 
 public String getFuncionarios() {
	 StringBuilder resultado = new StringBuilder();
	 resultado.append("Lista de funcionários:");
	 resultado.append("\n");
	 for (Horista hor : this.horistas) {
		 resultado.append(String.format("%1s %1s %1s %1s R$ %.2f %1s %1s", hor.getCpf(), hor.getNome(), hor.getDepartamento(),
					hor.getTipo(),hor.getSalario(),hor.getMemoria(), hor.getCargo()));
			resultado.append("\n");
	 }
	 for (Mensalista men : this.mensalistas) {
		 resultado.append(String.format("%1s %1s %1s %1s R$ %.2f %1s %1s", men.getCpf(), men.getNome(), men.getDepartamento(),
					men.getTipo(),men.getSalario(),men.getMemoria(), men.getCargo()));
			resultado.append("\n");
	 }
	 for (Empreitada emp : this.empreitadas) {
		 resultado.append(String.format("%1s %1s %1s %1s R$ %.2f %1s %1s", emp.getCpf(), emp.getNome(), emp.getDepartamento(),
					emp.getTipo(),emp.getSalario(),emp.getMemoria(), emp.getCargo()));
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
