import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Cursos JAVA");
		curso1.setDescricao("Descrição do curso");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Cursos JAVA SCRIPT");
		curso2.setDescricao("Descrição do curso");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Menetoria de JAVA");
		mentoria.setDescricao("Descrição mentoria JAVA");
		mentoria.setData(LocalDate.now());

		/*
		 * System.out.println(curso1);
		 * System.out.println(curso2);
		 * System.out.println(mentoria);
		 */

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcampo Java Developer");
		bootcamp.setDescricao("Descrição do bootcampo java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		System.out.println("-------------------------------------------------------");

		Dev alunoDev1 = new Dev();
		alunoDev1.setNome("João");
		alunoDev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos incritos de João: \n" + alunoDev1.getConteudosInscritos());
		alunoDev1.progredir();
		System.out.println("Conteúdos incritos de João: \n" + alunoDev1.getConteudosInscritos());
		System.out.println("Conteúdos concluidos de João: \n" + alunoDev1.getConteudosConcluidos());
		System.out.println("XP:" + alunoDev1.calcularTotalXp());

		System.out.println("-------------------------------------------------------");

		Dev alunoDev2 = new Dev();
		alunoDev2.setNome("Maria");
		alunoDev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos incritos de Maria: \n" + alunoDev2.getConteudosInscritos());
		alunoDev2.progredir();
		System.out.println("Conteúdos incritos de João: \n" + alunoDev1.getConteudosInscritos());
		System.out.println("Conteúdos concluidos de João: \n" + alunoDev1.getConteudosConcluidos());
		System.out.println("XP:" + alunoDev2.calcularTotalXp());

	}

}
