public class Course03 {
}
/*
1.
public class Person{
    private String name = "Person";
    int age=0;
}
public class Child extends Person{
    public String grade;
    public static void main(String[] args){
        Person p = new Child();
        System.out.println(p.name);
    }
}
Error:(5, 8) java: 类Child是公共的, 应在名为 Child.java 的文件中声明
Error:(9, 29) java: name 在 Person 中是 private 访问控制

2.
class Base{
    public Base(String s){
        System.out.print("B");
    }
}
public class Derived extends Base{
    public Derived (String s) {
        System.out.print("D");
    }
    public static void main(String[] args){
        new Derived("C");
    }
}
Error:(26, 31) java: 无法将类 Base中的构造器 Base应用到给定类型;
        需要: java.lang.String
        找到: 没有参数
        原因: 实际参数列表和形式参数列表长度不同
 */