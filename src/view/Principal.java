package view;

import model.ProfessorHorista;
import model.ProfessorTitular;

public class Principal {

	public static void main(String[] args) {
		// ProfessorHorista
		ProfessorHorista ph = new ProfessorHorista();
		ph.setNome("João");
		ph.setMatricula("PH001");
		ph.setIdade(30);
		ph.setHorasAula(20);
		ph.setValorHoraAula(50.0);

        System.out.println("Dados do Professor Horista:");
        System.out.println("Nome: " + ph.getNome());
        System.out.println("Matrícula: " + ph.getMatricula());
        System.out.println("Idade: " + ph.getIdade());
        System.out.println("Horas/Aula: " + ph.getHorasAula());
        System.out.println("Valor/Hora-Aula: R$" + ph.getValorHoraAula());
        ph.calcSalario();

        System.out.println();

        // ProfessorTitular
        ProfessorTitular pt = new ProfessorTitular();
        pt.setNome("Maria");
        pt.setMatricula("PT001");
        pt.setIdade(40);
        pt.setAnoInstituicao(20);
        pt.setSalario(5000.0);

        System.out.println("Dados do Professor Titular:");
        System.out.println("Nome: " + pt.getNome());
        System.out.println("Matrícula: " + pt.getMatricula());
        System.out.println("Idade: " + pt.getIdade());
        System.out.println("Anos na Instituição: " + pt.getAnoInstituicao());
        System.out.println("Salário: R$" + pt.getSalario());
        pt.calcSalario();
    }
}
