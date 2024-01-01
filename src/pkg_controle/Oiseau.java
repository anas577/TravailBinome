package pkg_controle;

public class Oiseau extends Animal{
    public Oiseau(String nom, int poids, int age) {
        super(nom, poids, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println("L'oiseau chante melideusement");
    }

    public void voler(){
        System.out.println("L'oiseau deploie ses ailes et s'envole");
    }
}
