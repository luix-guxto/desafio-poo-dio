import dio.bootcamp.Bootcamp;
import dio.conteudos.*;
import dio.dev.Dev;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Dev eu = new Dev("Luis A", "123456789", "teste@teste.com");
        System.out.println(eu);
        System.out.println();

        Bootcamp java = new Bootcamp("DIO - Java", "Bootcamp de Java", LocalDate.of(2024, 8,1), LocalDate.of(2024,11,1), "DIO");
        System.out.println(java);
        System.out.println();

        Questionario quiz = new Questionario("Java Básico", "Quiz de Java");
        Map<Character, String> alternativas = Map.of('A', "testeA", 'B', "testeB", 'C', "testeC", 'D', "testeD");
        quiz.adicionarQuestao(new Questao("Qual a versão atual do Java?", 'A', alternativas));
        quiz.adicionarQuestao(new Questao("Qual a versão atual do Java?", 'B', alternativas));
        quiz.adicionarQuestao(new Questao("Qual a versão atual do Java?", 'C', alternativas));
        quiz.adicionarQuestao(new Questao("Qual a versão atual do Java?", 'D', alternativas));
        Curso curso = new Curso("Java Básico", "Curso de Java", 10, "JAVA POO", "DIO", quiz);
        Curso curso2 = new Curso("Java Intermediário", "Curso de Java", 10, "JAVA POO", "DIO", quiz);
        System.out.println(curso);
        System.out.println();

        java.adicionarConteudo(curso);
        java.adicionarConteudo(curso2);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Mentoria de Java", "DIO", "11/10/2024", "20:00", "https://youtube.com...");
        java.adicionarConteudo(mentoria);
        System.out.println(mentoria);
        System.out.println();

        Desafio desafio = new Desafio("Desafio de Java", "Desafio de Java", 10, new String[]{"Desafio 1", "Desafio 2", "Desafio 3"});
        System.out.println(desafio);
        java.adicionarConteudo(desafio);
        System.out.println();

        Projeto projeto = new Projeto("Projeto de Java", "Projeto de Java", "https://github.com...", "DIO");
        System.out.println(projeto);
        java.adicionarConteudo(projeto);
        System.out.println();

        eu.adicionarBootcamp(java);

        eu.addXp(eu.obterBootcamps().get(0).calcularXP());

        System.out.println(eu);

    }
}
