package OOP.inheritance;

class Parent{
    public void printParent(){
        System.out.println("This is Parent class");
    }
}

class Child extends Parent{
    public void printChild(){
        System.out.println("This is Child class");
    }
}

public class SubclassIntro {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printParent();

        Child child = new Child();
        child.printChild();
    }
}
