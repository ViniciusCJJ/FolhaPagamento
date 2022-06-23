package folhaDePagamento.semHerancaEPolimorfismo;

public class Principal {

	public static void main(String[] args) {
		Departamento d1=new Departamento("Rh");
		Horista h1=new Horista("104.224.558-90","Zezim",d1,"Horista","valor/hora");
		Mensalista m1=new Mensalista("132.344.103-70","Zezim2",d1,"Mensalista","Gerente");
		Empreitada e1=new Empreitada("122.043.449-11","Zezim3",d1,"Empreitada","Conserto do ar condicionado");
		h1.calcularSalario(h1,15,150);
		m1.calcularSalario(m1,5000);
		e1.calcularSalario(e1, 550);
		d1.addFuncionarioHorista(h1);
		d1.addFuncionarioMensalista(m1);
		d1.addFuncionarioEmpreitada(e1);
	    Departamento d2=new Departamento("Administracao");
	    Horista h2=new Horista("901.205.185-34","Zezim4",d2,"Horista","valor/hora");
		Mensalista m2=new Mensalista("105.265.986-23","Zezim5",d2,"Mensalista","Gerente Administrativo");
		Empreitada e2=new Empreitada("834.173.927-92","Zezim6",d2,"Empreitada","Consulta externa");
		h2.calcularSalario(h2,11.3,125);
		m2.calcularSalario(m2,12000);
		e2.calcularSalario(e2,7530);
		d2.addFuncionarioHorista(h2);
		d2.addFuncionarioMensalista(m2);
		d2.addFuncionarioEmpreitada(e2);
		System.out.print(d1.getFuncionarios());
		//System.out.print(d1.getFuncionariosMensalistas());
		//System.out.print(d1.getFuncionariosEmpreitadas());
		System.out.print(d2.getFuncionarios());
		//System.out.print(d2.getFuncionariosMensalistas());
		//System.out.print(d2.getFuncionariosEmpreitadas());
	}

}
