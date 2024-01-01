package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TableauEmploye {
    private Employe[] tableau = new Employe[5];

    public TableauEmploye(){
        tableau[0] = new Employe("Ennouri","Ahmed","BF1232",20000);
        tableau[1] = new Employe("Ouadih","Nabil","AF3432",40000);
        tableau[2] = new Employe("Fathani","Anas","DF4323",30000);
        tableau[3] = new Employe("Cherkaoui","Jaafar","AD342",34200);
        tableau[4] = new Employe("Elon","Musk","AF45678",20000);
    }
    public void afficher(){
        for (Employe emp:
             tableau) {
            System.out.println(emp.toString());

        }
    }

    public void trier(){
        Arrays.sort(tableau);
    }
    public void ajouter(Employe emp){
        ArrayList<Employe> liste = new ArrayList<Employe>(Arrays.asList(tableau));
        liste.add(emp);
        tableau = liste.toArray(new Employe[liste.size()]);
    }

    public boolean supprimer(Employe emp){
        ArrayList<Employe> liste = new ArrayList<Employe>(Arrays.asList(tableau));
        if(!liste.contains(emp)) return false;
        liste.remove(emp);
        tableau = liste.toArray(new Employe[liste.size()]);
        return true;
    }

    public int nombreElement(){
        return tableau.length;
    }

    public void reverse(){
        ArrayList<Employe> list = new ArrayList<Employe>(Arrays.asList(tableau));
        Collections.reverse(list);
        tableau = list.toArray(new Employe[list.size()]);
    }
    public Employe plusGrand(){
        this.trier();
        return this.tableau[tableau.length -1];
    }
    
}
