package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java Básico");
        cursoJava.setDescricao("Introdução à linguagem Java");
        cursoJava.setCargaHoraria(4);

        Curso cursoPOO = new Curso();
        cursoPOO.setTitulo("Curso Programação Orientada a Objetos");
        cursoPOO.setDescricao("Abstração, Encapsulamento, Herança e Polimorfismo");
        cursoPOO.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Código e Carreira");
        mentoria.setDescricao("Discussão aberta com um especialista");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampPOO = new Bootcamp();
        bootcampPOO.setNome("Master POO Java");
        bootcampPOO.setDescricao("Aprenda POO dominando o Java");
        bootcampPOO.getConteudos().add(cursoJava);
        bootcampPOO.getConteudos().add(cursoPOO);
        bootcampPOO.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampPOO);

        System.out.println("--- Dev: " + devCamila.getNome() + " ---");
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("XP Inicial: " + devCamila.calcularTotalXp());

        devCamila.progredir();
        devCamila.progredir();

        System.out.println("\n-- Após progredir (2x) --");
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devCamila.getConteudosConcluidos());

        System.out.println("XP Total: " + devCamila.calcularTotalXp());

        System.out.println("\n------------------------------------------------\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcampPOO);

        System.out.println("--- Dev: " + devJoao.getNome() + " ---");
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("\n-- Após progredir (3x) --");
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());

        System.out.println("XP Total: " + devJoao.calcularTotalXp());
    }
}