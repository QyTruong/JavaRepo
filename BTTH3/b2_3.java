import lib3.TamGiac;
import lib3.TamGiacCan;
import lib3.TamGiacDeu;

public class b2_3 {
    public static void main(String[] args) {
        TamGiac tamGiac = new TamGiac(5, 7, 3);
        TamGiacCan tamGiacCan = new TamGiacCan(4, 2);
        TamGiacDeu tamGiacDeu = new TamGiacDeu(7);

        System.out.println(tamGiac);
        System.out.println(tamGiacCan);
        System.out.println(tamGiacDeu);
    }
}
