import java.text.DecimalFormat;

// Egy double tömb létrehozása
// A tömb átlagát kiszámolni 

public class Atlag_double {
    public static void main(String[] args) {
        double[] szamok = {3.14, 5.0, 4.2, 4.5,3.3,4.1,4.8};
        int index = 0; //A szám amivel az osszeget osztjuk
        double osszeg = 0.0; //A száma ami a tömbben lévő számok összege

        DecimalFormat format = new DecimalFormat();
        format.setMinimumFractionDigits(2); //Minimum szám a , után
        format.setMaximumFractionDigits(3); //Maximum szám a , után

        /*
            1.Index növelése 1-gyel
            2.Osszeg növelése a tömbben található számmal 
            3.Ujra mindaddig amig el nem fogy a szam a tombben  
        */
        for(double atlag : szamok){
            index++;
            osszeg += atlag;
        }
        
        System.out.println(format.format(osszeg / index));
    }
}
