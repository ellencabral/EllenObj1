package br.edu.ifsul.control;

import br.edu.ifsul.model.Participante;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Participante p1 = new Participante();

        Participante p2 = new Participante();

        Participante p3 = new Participante(3, "ellen");

        Participante p4 = new Participante(4, "maria");

        Participante p5 = new Participante(5, "bruno", "bruno@hotmail.com", "b1234", "99999-9900");

        Participante p6 = new Participante(6, "jose", "jose@hotmail.com", "j123", "98999-0099");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        p1.setId(1);
        p1.setNome("joana");
        p1.setEmail("jo@gmail.com");
        p1.setSenha("123jo");
        p1.setTelefone("99399-9089");

        p2.setId(2);
        p2.setNome("marcos");
        p2.setEmail("mmm@gmail.com");
        p2.setSenha("ma230");
        p2.setTelefone("99199-9329");

        System.out.println("\n"+p1.getId()+" "+p1.getNome()+" "+p1.getEmail()+" "+p1.getSenha()+" "+p1.getTelefone());
        System.out.println(p2.getId()+" "+p2.getNome()+" "+p2.getEmail()+" "+p2.getSenha()+" "+p2.getTelefone()+"\n");

        // LIST

        List<Participante> participanteList = new ArrayList<>();

        participanteList.add(p6);
        participanteList.add(p5);
        participanteList.add(p4);
        participanteList.add(p3);
        participanteList.add(p2);
        participanteList.add(p1);

        System.out.println("Lista na ordem decrescente");
        System.out.println(participanteList+"\n");

        participanteList.forEach(x -> {
            if(x.getId() == 2) {
                System.out.println("Objeto de id = 2");
                System.out.println(x);
            }
        });

        System.out.println("\nLista na ordem crescente");
        Collections.sort(participanteList);
        System.out.println(participanteList);

        // MAP

        Map<Integer, Participante> participanteMap = new HashMap<>();

        participanteMap.put(p6.hashCode(), p6);
        participanteMap.put(p5.hashCode(), p5);
        participanteMap.put(p4.hashCode(), p4);
        participanteMap.put(p3.hashCode(), p3);
        participanteMap.put(p2.hashCode(), p2);
        participanteMap.put(p1.hashCode(), p1);

        System.out.println("\nMap");
        System.out.println(participanteMap);


        System.out.println("\nObjeto de id = 2");
        System.out.println(participanteMap.get(p2.hashCode()));
    }
}
