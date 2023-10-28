//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area
// della forma specifica crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano
// un tipo che ne identifichi la Forma in maniera univoca usando una enum.

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5,5);
        Triangolo triangolo1 = new Triangolo(4,5);
        System.out.println(rettangolo1.CalcoloArea());
        System.out.println(triangolo1.CalcoloArea());

    }
}