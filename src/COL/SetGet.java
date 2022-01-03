package COL;

public class SetGet {
    public static void main(String[] args) {
        Person1 pp1=new Person1();
        pp1.setName("张三");
        pp1.setAge(15);
        System.out.println(pp1.getName());
        System.out.println(pp1);
    }
}
class Person1{
    private String name;
    private int age;
    public Person1(){

    }

    public Person1(String name,int age){
        setName(name);
        setAge(age);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
//        this.age = age;
        if(age<0 || age>130){
            this.age=-1;
            System.out.println("年龄输入错误");
        }else{
            this.age=age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}