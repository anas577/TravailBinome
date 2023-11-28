package pkg1;

import java.util.Objects;

public class Employe implements Cloneable, Comparable<Employe>{
    private String matricule;
    private String nom;
    private String prenom;
    private double salaire;

    public Employe(String matricule, String nom, String prenom, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe: " +
                "matricule='" + matricule + '\'' +
                " nom='" + nom + '\'' +
                " prenom='" + prenom + '\'' +
                " salaire=" + salaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return Double.compare(salaire, employe.salaire) == 0 && Objects.equals(matricule, employe.matricule) && Objects.equals(nom, employe.nom) && Objects.equals(prenom, employe.prenom);
    }

    @Override
    public Employe clone() throws CloneNotSupportedException {
        return (Employe)super.clone();
    }

    @Override
    public int compareTo(Employe e){
       return this.matricule.compareTo(e.matricule);
    }

}
