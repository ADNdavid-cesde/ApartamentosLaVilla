package org.example;

import org.example.MODELOS.Apartamento;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************************************************");
        System.out.println("*********************Arredamientos ADN****************\n\n");

        Scanner lea= new Scanner(System.in);

        Apartamento apartamento = new Apartamento();

        System.out.print("Ingresa la direccion del apartamento: ");
        apartamento.setDireccion(lea.nextLine());

        System.out.print("Ingresa el barrio: ");
        apartamento.setBarrio(lea.nextLine());

        System.out.print("Indica el estrato socio Economico: ");
        apartamento.setBarrio(lea.next());

        System.out.print("Con cuantos banios cuenta el apartamento: ");
        apartamento.setCantidadBanios(lea.next());

        System.out.print("Con cuantas habitaciones cuenta el apartamento: ");
        apartamento.setCantidadHabitaciones(lea.next());

        System.out.print("El apartamento tiene parqueadero (true - false): ");
        apartamento.setParquedero(lea.nextBoolean());

        System.out.print("Indica el area del apartamento en M2 (sin decimales): ");
        apartamento.setArea(lea.nextInt());

        System.out.print("Indica el valor del canon del arrendamiento: ");
        apartamento.setValorCanon(lea.nextInt());

        System.out.println(apartamento);

    }
}