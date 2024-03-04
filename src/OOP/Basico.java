package OOP;


public class Basico {
    public static void main(String[] args) {
        Personagem p = new Personagem();
        p.age = 10;
        p.name="Fulano";
        p.weight = 60.0;

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.weight);
    }
}

class Personagem{
    String name;
    int age;
    double weight;

    Personagem(){}

    Personagem(String _name, int _age, double _weight){
        this.weight = _weight;
        this.name = _name;
        this.age = _age;
    }
}