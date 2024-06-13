import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("curso js");
        c1.setDescricao("descrição curso js");
        c1.setCargaHoraria(8);

        Curso c2 = new Curso();
        c2.setTitulo("curso c#");
        c2.setDescricao("descrição curso c#");
        c2.setCargaHoraria(4);

        Mentoria m = new Mentoria();
        m.setTitulo("mentoria de java");
        m.setDescricao("descrição mentoria java");
        m.setData(LocalDate.now());

        Bootcamp bc = new Bootcamp();
        bc.setNome("Santander Bootcamp");
        bc.setDescricao("Bootcamp Santander Backend em Java");
        bc.getConteudos().add(c1);
        bc.getConteudos().add(c2);
        bc.getConteudos().add(m);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bc);
        System.out.println("Conteúdos Inscritos Vinicius:" + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        devVinicius.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Vinicius:" + devVinicius.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vinicius:" + devVinicius.getConteudosConcluidos());
        System.out.println("XP:" + devVinicius.calcularTotalXp());

        System.out.println("-------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bc);
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());

    }
}
