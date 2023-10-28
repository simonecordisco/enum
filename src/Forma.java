public class Forma {

      enum Tipi{

        TRIANGOLO,
        RETTANGOLO,
    }
    public static String getFormString(Tipi forma){
        switch (forma){
            case TRIANGOLO:
                return "Triangolo";
            case RETTANGOLO:
                return "Rettangolo";
            default:
                return "Semplice Forma";
        }
    }
}
