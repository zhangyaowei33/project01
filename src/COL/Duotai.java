package COL;

public class Duotai {
    public static void main(String[] args) {
        Animan n1=new Cat();
        n1.shot();
        Dog d1=new Dog();
        d1.shot();
        AnimalCry(n1);
        AnimalCry(d1);


    }
    static void AnimalCry(Animan a){
        a.shot();
    }
}
class Animan{
    public void shot(){
        System.out.println("叫了一声：");
    }
}

class Cat extends Animan{
    public  void shot(){
        System.out.println("喵喵喵，，，，，，，，，，，，，");
    }
}
class Dog extends Animan{
    public void shot(){
        System.out.println("汪汪汪。。。。。。。。。。。。。");
    }
}
