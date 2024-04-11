package model;

public class ProfessorTitular extends Professor{
	
	private	int anoinstituicao;
	private double salario;
	
	public ProfessorTitular () {
		anoinstituicao = 0;
		salario = 0.0;
	}
	
	public int getAnoInstituicao() {
		return anoinstituicao;
	}
	
	public void setAnoInstituicao(int anoinstituicao) {
		this.anoinstituicao = anoinstituicao;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

    public void calcSalario() {

        double salarioFinal = salario * (1 + (0.05 * (getIdade() / 5)));
        System.out.println("Salário do Professor Titular: R$" + salarioFinal);
    }
	

}
