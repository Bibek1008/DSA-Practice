package placement;



public class fun {
    public static void main(String[] args) {
//        A obj=new A();
//        obj.print();
        B obj1=new B();
        obj1.play();
        obj1.play1();


    }


}
class A{
    static void play(){
        System.out.println("This is class A");
    }
}
class B extends A{
    void play1(){
        System.out.println("this is B");
    }
}