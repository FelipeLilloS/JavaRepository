/*
    import java.util.*;

    public class Ej1Ayudantia {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int distintos = 0;

            ArrayList<Integer> lista = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                lista.add(sc.nextInt());
            }

            for (int i = 0; i < lista.size(); i++) {
                for (int j = i + 1; j < lista.size() -1; j++) {
                    if (lista.get(i) == lista.get(j)) {
                        continue;
                    }
                    distintos++;
                }
            }

            System.out.println(distintos);
        }

    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in)

*/