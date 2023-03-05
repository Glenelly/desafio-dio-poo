package dio_desafio_dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Conteudo conteudo1 = new Curso(); //polimorfismo
        Conteudo conteudo2 = new Mentoria();

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */

        Boot_camp bootcamp = new Boot_camp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devGlenelly = new Dev();
        devGlenelly.setNome("Glenelly");
        devGlenelly.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Glenelly: " + devGlenelly.getConteudosInscritos());

        devGlenelly.progredir();
        devGlenelly.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Glenelly:" + devGlenelly.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Glenelly: " + devGlenelly.getConteudosConcluidos());
        System.out.println("XP: " + devGlenelly.calcularTotalXp());

        System.out.println("------------");

        Dev devKarla = new Dev();
        devKarla.setNome("Karla");
        devKarla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Karla: " + devKarla.getConteudosInscritos());

        devKarla.progredir();
        devKarla.progredir();
        devKarla.progredir();
        

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Karla: " + devKarla.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devKarla.getConteudosConcluidos());
        System.out.println("XP: " + devKarla.calcularTotalXp());
    }
    
}
