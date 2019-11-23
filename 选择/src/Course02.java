public class Course02 {
}
/*
1.
class SystemUtil{
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}

2.
class TestA {
    public static void hello() {
        System.out.println("hello");
    }
}
class MyApplication {
    public static void main(String[] args) {
        TestA test=null;
        test.hello();
    }
}

3.
class Base {
    Base() {
        System.out.print("Base");
    }
}
class Alpha extends Base {
    public static void main( String[] args ) {
        new Alpha();
        //调用父类无参的构造方法
        new Base();
    }
}

4.
class TestA {
    public int aMethod(){
        static int i = 0;
        i++;
        return i;
    }
    public static void main(String args[]){
        TestA test = new TestA();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}
*/

