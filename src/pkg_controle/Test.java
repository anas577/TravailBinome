package pkg_controle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Animal[] tableau = new Animal[4];
        tableau[0] = new Mammifere("vache", 700, 4);
        tableau[1] = new Mammifere("cheval", 900, 7);
        tableau[2] = new Oiseau("poule", 3, 2);
        tableau[3] = new Oiseau("aigle", 15, 20);

        for (Animal a : tableau) {
            System.out.println(a);
            a.faireDuBruit();
            if (a instanceof Mammifere m) {
                m.allaiter();
            }
            if (a instanceof Oiseau o) {
                o.voler();
            }
        }

        Arrays.sort(tableau);

        ArrayList<Animal> liste = new ArrayList<Animal>(Arrays.asList(tableau));
        liste.add(new Oiseau("perruche", 1, 1));
        tableau = liste.toArray(new Animal[liste.size()]);

        ArrayList<Animal> liste2 = new ArrayList<Animal>(Arrays.asList(tableau));
        liste2.remove(0);
        tableau = liste2.toArray(new Animal[liste2.size()]);

        Animal[] tab2 = Arrays.copyOf(tableau, tableau.length);

        ArrayList<Animal> liste3 = new ArrayList<Animal>(Arrays.asList(tableau));
        Collections.reverse(liste3);
        tableau = liste3.toArray(new Animal[liste3.size()]);

        System.out.println("*****************************");
        System.out.println();
        for (Animal a : tableau) {
            System.out.println(a);

        }
    }
}
