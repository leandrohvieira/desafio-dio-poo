import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição curso Python");
        curso2.setCargaHoraria(8);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        //Conteudo conteudo = new Curso();
        //Conteudo conteudo1 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro");
        devLeandro.inscreverBootcamp(bootcamp);
        devLeandro.progredir();

        System.out.println("Conteúdos Inscritos Leandro: " + devLeandro.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Leandro: " + devLeandro.getConteudosConcluidos());
        System.out.println("XP: " + devLeandro.calcularTotalXP());

        Dev devKarine = new Dev();
        devKarine.setNome("Karine");
        devKarine.inscreverBootcamp(bootcamp);
        devKarine.progredir();
        devKarine.progredir();
        devKarine.progredir();

        System.out.println("Conteúdos Inscritos Karine: " + devKarine.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Karine: " + devKarine.getConteudosConcluidos());
        System.out.println("XP: " + devKarine.calcularTotalXP());
    }

}