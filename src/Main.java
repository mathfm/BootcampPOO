import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso2 = new Curso("Curso Js", "Descrição Js", 4);
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição Java");
        curso1.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Mentoria java");
        mentoria1.setTitulo("Java Testes");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Js Testes");
        mentoria2.setDescricao("Mentoria Js");
        mentoria2.setData(LocalDate.now());

        Bootcamp JavaBootcamp = new Bootcamp();
        JavaBootcamp.setNome("Bootcamp Java");
        JavaBootcamp.setDescricao("Descrição do Bootcamp java");
        JavaBootcamp.getConteudos().add(curso1);
        JavaBootcamp.getConteudos().add(mentoria1);

        Bootcamp JsBootcamp = new Bootcamp();
        JsBootcamp.setNome("Bootcamp Js");
        JsBootcamp.setDescricao("Descrição do Bootcamp Js");
        JsBootcamp.getConteudos().add(curso2);
        JsBootcamp.getConteudos().add(mentoria2);

        Dev aluno1 = new Dev();
        aluno1.setName("Joao");
        aluno1.instreverBootcamp(JavaBootcamp);
        aluno1.progredir();

        System.out.println(aluno1.getName());
        System.out.println("Conteudos Inscritos: " + aluno1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + aluno1.getConteudosConcluidos());
        System.out.println("Xp Total: " + aluno1.calcularXpTotal());
        System.out.println("----------------");

        Dev aluno2 = new Dev();
        aluno2.setName("Julia");
        aluno2.instreverBootcamp(JsBootcamp);
        aluno2.progredir();

        System.out.println(aluno2.getName());
        System.out.println("Conteudos Inscritos: " + aluno2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + aluno2.getConteudosConcluidos());
        System.out.println("Xp Total: " + aluno2.calcularXpTotal());



    }
}