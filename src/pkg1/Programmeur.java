package pkg1;

import java.util.Objects;

public class Programmeur extends Employe {
    private String langage;

    public Programmeur(String matricule, String nom, String prenom, double salaire, String langage) {
        super(matricule, nom, prenom, salaire);
        this.langage = langage;
    }

    @Override
    public String toString() {
        return "Programmeur{" +
                "langage='" + langage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programmeur that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(langage, that.langage);
    }
    @Override
    public Programmeur clone() throws CloneNotSupportedException{
        return (Programmeur)super.clone();
    }

    @Override
    public int compareTo(Employe p){
       if (p instanceof Programmeur){
           return this.langage.compareTo(((Programmeur) p).langage);
       } else throw new IllegalArgumentException();

    }



}
