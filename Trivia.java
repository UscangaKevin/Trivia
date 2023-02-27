/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;
import java.util.Scanner;
/**
 *
 * @author yairv
 */
public class Trivia {
        public static void main(String[] args) {
     int victoria,pregunta,menu,dificultad,bien,mal;
    double mult,punt;
    pregunta=0;
    punt=0;
    mal=0;
    bien=0;
    mult=1;
    menu=1;
    victoria=0;
    dificultad=0;
    if (bien==2){
    mult=1.5;
    }
    if (bien==3){
    mult=2;
    }
    Scanner esc=new Scanner(System.in);
    do{
        System.out.println("Trivia sobre química, ¿Eres un experto en la química?");
        System.out.println("1-Iniciar");
        System.out.println("2-Creditos");
        System.out.println("3-Salir");
    String op=esc.nextLine();
    switch (op){
        case "1":
            menu=2;

            break;
        case "2":
            System.out.println("Este programa fue creado por:");
            System.out.println("Yair Vásquez Castro");
            System.out.println("Irving Gonzalo Vazquez Trinidad");
            System.out.println("Bryham Gabriel Pitta Álvarez");
            System.out.println("Kevin Uscanga Reyes");
            System.out.println("Damian Fernandez");
            break;
        case "3":
            System.exit(0);
    }
    }while (menu==1);
    /*dificultad*/
    do{
            System.out.println("Selecciona la dificultad");
            System.out.println("1.-Facil");
            System.out.println("2.-Intermedia");
            System.out.println("3.-Cientifico");
 String op=esc.nextLine();
 switch (op){
                   case "1":
                       dificultad=1;
    pregunta=1;
    menu=0;
                       break;
                   case "2":
                       dificultad=2;
    pregunta=1;
    menu=0;
                       break;
                   case "3":
                       dificultad=3;
    pregunta=1;
    menu=0;
                       break;
               }
    }while (menu==2);
    /* pregunta 1*/
    
        do{
        System.out.println("La Teoría Cinético Molecular considera que:");
        System.out.println("1-En los choques entre moléculas no se pierde energía cinética.");
        System.out.println("2-Las moléculas son indestructibles.");
        System.out.println("3-Las fuerzas de atracción entre moléculas gaseosas no son despreciables.");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=2;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=2;
            break;
        case "3":
            System.out.println("la respuesta es incorrecta!");
            mal=1;
            bien=0;
            System.out.println(+punt);
            pregunta=2;
    }
    }while (pregunta==1);
    
    /* pregunta 2*/
    
        do{
        System.out.println("La fórmula general de un alcano es:");
        System.out.println("1- CnH2n");
        System.out.println("2-CnH2n-2");
        System.out.println("3-CnH2n+2");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=3;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=3;
            break;
        case "3":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=3;
            break;
    }
    }while (pregunta==2);   
        
    /* pregunta 3*/
    
        do{
        System.out.println("¿Cual es la diferencia entre un acido y una base?:");
        System.out.println("1-El ácido tiene ph mayor o igual a 8 mientras que una base tiene ph menor o igual a 6");
        System.out.println("2-El ácido es alcalino mientras que la base es ácida");
        System.out.println("3-El ácido libera iones de hidrogeno en el agua mientras que una base libera iones de hidroxilo");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=4;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=4;
            break;
        case "3":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=4;
            break;
    }
    }while (pregunta==3);
        
    /* pregunta 4*/
    
        do{
        System.out.println("¿Cual es la estructura de un átomo?:");
        System.out.println("1-Iones, protones y electrones");
        System.out.println("2-Electrones, protones y neutrones");
        System.out.println("3-Masa atómica,Iones y Electrones");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=5;
            break;
        case "2":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=5;
            break;
        case "3":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=5;
            break;
    }
    }while (pregunta==4);
        
    /* pregunta 5*/
    
        do{
        System.out.println("¿Cual es la diferencia entre un elemento y un compuesto?:");
        System.out.println("1-Un elemento es un material compuesto de un simple tipo de átomo, un compuesto es una sustancia formada por dos o más elementos que se combinan químicamente");
        System.out.println("2-Un elemento se puede separar en una sustancia más simple. el compuesto por otra parte tiene elementos quimicamente inproporcionales e indefinidos");
        System.out.println("3-Los elementos estan unidos por moleculas o iones mientras que los compuestos estan formados por un átomo como el oro  ");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=6;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=6;
            break;
        case "3":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=6;
            break;
    }
    }while (pregunta==5);
    if (victoria==5 && dificultad==1){
        System.out.println("Felicidades, has demostrado tener el conocimiento para completar el modo facil");
        System.out.println("Tu puntuacion final:"+punt);
        System.out.println("1-Continuar");
        System.out.println("2-Salir");
        String op=esc.nextLine();
        switch (op) {
            case "1":
    punt=0;
    mal=0;
    pregunta=0;
    bien=0;
    mult=1;
    menu=1;
    victoria=0;
    dificultad=0;
    break;
            case "2":
            System.exit(0);
        }
        }
            
    if (mal==3){
        System.out.println("Has perdido, ¿Quieres volver a intentarlo?");
        System.out.println("Tu puntuacion final:"+punt);
        System.out.println("1-Continuar");
        System.out.println("2-Salir");
        String op=esc.nextLine();
        switch (op) {
            case "1":
    punt=0;
    mal=0;
    pregunta=0;
    bien=0;
    mult=1;
    menu=1;
    victoria=0;
    dificultad=0;
    break;
            case "2":
            System.exit(0);
        }
        }
    
        
    if (pregunta==6 && dificultad==1 && victoria<5){
        System.out.println("Has perdido, ¿Quieres volver a intentarlo?");
        System.out.println("Tu puntuacion final:"+punt);
        System.out.println("1-Continuar");
        System.out.println("2-Salir");
        String op=esc.nextLine();
        switch (op) {
            case "1":
    punt=0;
    mal=0;
    pregunta=0;
    bien=0;
    mult=1;
    menu=1;
    victoria=0;
    dificultad=0;
    break;
            case "2":
            System.exit(0);
        }
            }
    /* pregunta 6*/
    
        do{
        System.out.println("¿Cómo funciona un catalizador en una reaccion química?:");
        System.out.println("1-Ayuda a ralentizar la velocidad de la reaccion química para manejar con más precision los compuestos");
        System.out.println("2-El catalizador aumenta la velocidad de la reacción química al reducir la energía del estado de transición");
        System.out.println("3-Es un compuesto necesario para que una reaccion quimica se llegue a dar");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=7;
            break;
        case "2":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=7;
            break;
        case "3":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=7;
            break;
    }
    }while (pregunta==6);
        
    /* pregunta 7*/
    
        do{
        System.out.println("¿Cómo se relaciona la velocidad de una reaccion con la temperatura?:");
        System.out.println("1-la velocidad de una reacción aumenta cuando aumentamos la temperatura");
        System.out.println("2-Cambia el resultado de nuestra reaccion final");
        System.out.println("3-Se necesita la temperatura para completar las reacciones");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=8;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=8;
            break;
        case "3":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=8;
            break;
    }
    }while (pregunta==7);
        
    /* pregunta 8*/
    
        do{
        System.out.println("¿Como se equilibra una ecuacion quimica?:");
        System.out.println("1-Multiplicando el numero atomico por el producto mas la clase de átomos");
        System.out.println("2-Multiplicando la clase de átomo por los productos y sumarle el numero atomico");
        System.out.println("3-Se debe igualar el número y clase de átomos, iones o moléculas reactantes con los productos");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=9;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=9;
            break;
        case "3":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=9;
            break;
    }
    }while (pregunta==8);
        
    /* pregunta 9*/
    
        do{
        System.out.println("¿Cual es la diferencia entre un cambio fisico y un cambio quimico?:");
        System.out.println("1-Un cambio fisico cambia la figura del objeto mientras que un cambio quimico cambia su estructura quimica");
        System.out.println("2-El cambio fisico altera la estructura de los átomos y el cambio quimico lo vuelve un cambio permanente");
        System.out.println("3-Un cambio fisico afecta las reacciones que pueden suceder y el cambio quimico evita las reacciones");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=10;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=10;
            break;
        case "3":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=10;
            break;
    }
    }while (pregunta==9);
        
    /* pregunta 10*/
    
        do{
        System.out.println("¿Como se calcula la concentracion de una solucion?:");
        System.out.println("1-Base(b) * VolumenDisolución(i)");
        System.out.println("2-MasaSoluto(g) * VolumenDisolución(l)");
        System.out.println("3-MasaSoluto(g) / VolumenDisolución(l)");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=11;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=11;
            break;
        case "3":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=11;
            break;
    }
    }while (pregunta==10);
    if (victoria==10 && dificultad==2){
        System.out.println("Felicidades, has demostrado tener el conocimiento para completar el modo intermedio");
        System.out.println("Tu puntuacion final:"+punt);
        System.out.println("1-Continuar");
        System.out.println("2-Salir");
        String op=esc.nextLine();
        switch (op) {
            case "1":
    punt=0;
    mal=0;
    pregunta=0;
    bien=0;
    mult=1;
    menu=1;
    victoria=0;
    dificultad=0;
    break;
            case "2":
            System.exit(0);
        }
        }

        if (mal==3){
        System.out.println("Has perdido, ¿Quieres volver a intentarlo?");
        System.out.println("Tu puntuacion final:"+punt);
        System.out.println("1-Continuar");
        System.out.println("2-Salir");
        String op=esc.nextLine();
        switch (op) {
            case "1":
    punt=0;
    mal=0;
    pregunta=0;
    bien=0;
    mult=1;
    menu=1;
    victoria=0;
    dificultad=0;
    break;
            case "2":
            System.exit(0);
        }
        }
        
    /* pregunta 11*/
    
        do{
        System.out.println("¿Cual es la diferencia entre un enlace covalente y un enlace ionico?:");
        System.out.println("1-No cuentan con diferencias, ya que se refieren al mismo proce");
        System.out.println("2-Los enlaces iónicos se forman por la tranferencia de un electrón de un átomo a otro. En los enlaces covalentes, se comparten electrones entre dos átomos.");
        System.out.println("3-Los enlaces covalentes se forman por la tranferencia de un electrón de un átomo a otro. En los enlaces ionicos, se comparten electrones entre dos átomos.");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=12;
            break;
        case "2":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=12;
            break;
        case "3":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=12;
            break;
    }
    }while (pregunta==11);
        
    /* pregunta 12*/
    
        do{
        System.out.println("Selecciona la opcion que defina que es una reaccion endotermica:");
        System.out.println("1-El ácido tiene ph mayor o igual a 8 mientras que una base tiene ph menor o igual a 6");
        System.out.println("2-El ácido es alcalino mientras que la base es ácida");
        System.out.println("3-El ácido libera iones de hidrogeno en el agua mientras que una base libera iones de hidroxilo");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=13;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=13;
            break;
        case "3":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=13;
            break;
    }
    }while (pregunta==12);
        
    /* pregunta 13*/
    
        do{
        System.out.println("Selecciona la opcion que defina que es una reaccion exotérmica:");
        System.out.println("1-El ácido tiene ph mayor o igual a 8 mientras que una base tiene ph menor o igual a 6");
        System.out.println("2-El ácido es alcalino mientras que la base es ácida");
        System.out.println("3-El ácido libera iones de hidrogeno en el agua mientras que una base libera iones de hidroxilo");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=14;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=14;
            break;
        case "3":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=14;
            break;
    }
    }while (pregunta==13);
        
    /* pregunta 14*/
    
        do{
        System.out.println("¿Cual es la diferencia entre un acido y una base?:");
        System.out.println("1-El ácido tiene ph mayor o igual a 8 mientras que una base tiene ph menor o igual a 6");
        System.out.println("2-El ácido es alcalino mientras que la base es ácida");
        System.out.println("3-El ácido libera iones de hidrogeno en el agua mientras que una base libera iones de hidroxilo");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=15;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=15;
            break;
        case "3":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=15;
            break;
    }
    }while (pregunta==14);
        
    /* pregunta 15*/
    
        do{
        System.out.println("¿Cual es la diferencia entre un acido y una base?:");
        System.out.println("1-El ácido tiene ph mayor o igual a 8 mientras que una base tiene ph menor o igual a 6");
        System.out.println("2-El ácido es alcalino mientras que la base es ácida");
        System.out.println("3-El ácido libera iones de hidrogeno en el agua mientras que una base libera iones de hidroxilo");
    String op=esc.nextLine();
    switch (op){
        case "1":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=16;
            break;
        case "2":
            System.out.println("la respuesta es incorrecta!");
            mal=mal+1;
            bien=0;
            System.out.println(+punt);
            pregunta=16;
            break;
        case "3":
            System.out.println("La respuesta es correcta!");
            bien=bien+1;
            punt=(punt)+(100*mult);
            System.out.println("+"+punt);
            pregunta=16;
            break;
    }
    }while (pregunta==15);

    if (mal==3){
        System.out.println("Has perdido, ¿Quieres volver a intentarlo?");
        System.out.println("Tu puntuacion final:"+punt);
        System.out.println("1-Continuar");
        System.out.println("2-Salir");
        String op=esc.nextLine();
        switch (op) {
            case "1":
    punt=0;
    mal=0;
    pregunta=0;
    bien=0;
    mult=1;
    menu=1;
    victoria=0;
    dificultad=0;
    break;
            case "2":
            System.exit(0);
        }
        }
    if (victoria==15 && dificultad==3){
        System.out.println("Felicidades, has demostrado ser todo un científico");
        System.out.println("Tu puntuacion final:"+punt);
        System.out.println("1-Continuar");
        System.out.println("2-Salir");
        String op=esc.nextLine();
        switch (op) {
            case "1":
    punt=0;
    mal=0;
    pregunta=0;
    bien=0;
    mult=1;
    menu=1;
    victoria=0;
    dificultad=0;
    break;
            case "2":
            System.exit(0);
        }
        }
        if (pregunta==16){
        System.out.println("Has perdido, ¿Quieres volver a intentarlo?");
        System.out.println("Tu puntuacion final:"+punt);
        System.out.println("1-Continuar");
        System.out.println("2-Salir");
        String op=esc.nextLine();
        switch (op) {
            case "1":
    punt=0;
    mal=0;
    pregunta=0;
    bien=0;
    mult=1;
    menu=1;
    victoria=0;
    dificultad=0;
    break;
            case "2":
            System.exit(0);
        }
        }
}
}