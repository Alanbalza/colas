package com.upchiapas.queve;

import com.upchiapas.queve.models.Pizza;

import java.util.LinkedList; //LinkedList son listas en la sadas
import java.util.Queue; //Queue = colas
import java.util.Random;//Random nos crea numeros aleatorios 

public class Main {

    public static void main(String[] args) {

        //Estamos creando una cola
        String[] catalago =  {"Huawaiana", "Peperoni", "4 Quesos", "Mexicana"};
        Random random = new Random(System.nanoTime());
        Queue <Pizza> listaPizza = new LinkedList<Pizza>();
        //creacion de diez numeros
        for (int i=0; i<10; i++)
            listaPizza.add(new Pizza((short) (i+1),
                    catalago[random.nextInt(catalago.length)],
                    random.nextFloat()
                    ));
        // size nos da a conocer el tamaño
        //isEmpaty nos verifica quel espacio este vacio
        // != negacion
        while (!listaPizza.isEmpty())
            System.out.println(listaPizza.poll());


    }
}