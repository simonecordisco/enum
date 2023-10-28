public class Triangolo extends Forma {
    Tipi tipo;
    double altezza;
    double larghezza;

    Triangolo(double altezza,double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.tipo= Tipi.TRIANGOLO;
    }
    public double CalcoloArea(){
        double area = (altezza*larghezza)/2;

        return area;
    }
}
