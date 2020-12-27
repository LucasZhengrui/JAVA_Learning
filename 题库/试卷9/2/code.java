// 本题运行结果是∶
// in SuperClass : x=3
// in SubClass : x=5
// in SuperClass.doSomthingO
// in SubClass.doSomethingO)
// super. x=3 sub, x=5
// 【第一空】参考答案∶ 3
// 【第二空】参考答案∶ in SuperClass.doSomthing
// 【第三空】参考答案∶ 5
// 【第四空】参考答案∶ in SubClass.doSomething

public class Java_2{

    public static void main(String args[]) {
        SubClass subC = new SubClass();
        subC.doSomething();
    }
}
class SuperClass {

    int x;

    SuperClass() {
        //*********Found********
        x = ___________;
        System.out.println("in SuperClass : x=" + x);
    }

    void doSomething() {
        //*********Found********
        System.out.println("__________________________()");
    }
}

class SubClass extends SuperClass {

    int x;

    SubClass() {
        super();
        //*********Found********
        x = ____________;
        System.out.println("in SubClass  :x=" + x);
    }

    void doSomething() {
        super.doSomething();
        //*********Found********
        System.out.println("________________________()");
        System.out.println("super.x=" + super.x + "  sub.x=" + x);
    }
}
