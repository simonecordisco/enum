public class Rettangolo extends Forma {
    Tipi tipo;
    double altezza;
    double larghezza;

    Rettangolo(double altezza,double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.tipo= Tipi.RETTANGOLO;

    }
    public double CalcoloArea(){
        double area = altezza*larghezza;

        return area;
    }
}
