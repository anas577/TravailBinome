package pkg_controle;

public abstract class Animal implements Comparable<Animal> {
    private String nom;
    private int poids;
    private int age;
    public static int nb_animaux = 0;

    public Animal(String nom, int poids, int age) {
        this.nom = nom;
        this.poids = poids;
        this.age = age;
    }

    public abstract void faireDuBruit();

    public void afficherType(){
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public String toString(){
        afficherType();
        return " nom: "+nom+" poids: " + poids +" age: "+age;
    }
    @Override
    public int compareTo(Animal a){
        return this.nom.compareTo(a.nom);
    }
}
