package pkg_controle;

public class Mammifere extends Animal{
    public Mammifere(String nom, int poids, int age) {
        super(nom, poids, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println("le mammifere emet un son");
    }

    public void allaiter(){
        System.out.println("le mammifere allaite ses petits");
    }


}
