import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args) {
        List<List<Integer>> matriksAsli = new ArrayList<>();

        List<Integer> baris1 = new ArrayList<>();
        baris1.add(1);
        baris1.add(2);
        baris1.add(3);

        List<Integer> baris2 = new ArrayList<>();
        baris2.add(4);
        baris2.add(5);
        baris2.add(6);

        List<Integer> baris3 = new ArrayList<>();
        baris3.add(7);
        baris3.add(8);
        baris3.add(9);

        matriksAsli.add(baris1);
        matriksAsli.add(baris2);
        matriksAsli.add(baris3);
        System.out.println("Matrik asli:");





        for (int i=0; i < matriksAsli.size(); i++) {

            for(int j=0; j < matriksAsli.get(i).size(); j++) {
                System.out.print(matriksAsli.get(i).get(j));
                System.out.print("\t");
            }
            System.out.println();


        }

    }


}