package Penultimo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class ejerciciopenultimo {
    Scanner sc = new Scanner(System.in);
    String texto = "texto.txt";
    String cadena = "";

    FileWriter archivo = new FileWriter(texto);
    PrintWriter pw = new PrintWriter(archivo);


        while (!cadena.equals("fin")) {
        System.out.print("Empieza a escribir, para acabar escribir fin): ");
        cadena = sc.nextLine();
        if (!cadena.equals("fin")) {
            pw.println(cadena);
        }
    }
}
