package COL;

public class OverR {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person("王铁柱",147235,"男");
        p2.work(p2);
        p1.eat();
        Student s1=new Student("张三",150222,"男",201739050);
        Student s2=new Student("李四",160211,"男",201739040);
        Student s3=new Student();
        s1.eat();
        s2.work(s2);
    }
}
class Person{
    String name;
    long ID;
    String sex;

    public Person() {
    }

    public Person(String name, long ID, String sex) {
        this.name = name;
        this.ID = ID;
        this.sex = sex;
    }
    public void work(Person p){
        System.out.println(p.name+" : 不是工作需要我，而是我们需要工作");
    }
    public void eat(){
        System.out.println("人是铁饭是钢，一顿不吃饿得慌");
    }
}

class Student extends Person{
    int SID;

    public Student() {
    }

    public Student(String name, long ID, String sex, int SID) {
        super(name, ID, sex);
        this.SID = SID;
    }

    @Override
    public void work(Person p) {
//        super.work();
        System.out.println(p.name+"我是学生，我的工作是学习");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("我是学生，我要在食堂吃饭");
    }
}