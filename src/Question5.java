//Implement multiple inheritance with default method inside interface?
//we are making two interface dog and cat and clas multipleinheritence is implementing both interface.
interface Dog{
    default void speak(){
        System.out.println("Interface Dog is barking");
    }
}
interface Cat{
    default void speak(){
        System.out.println("Interface Cat is Meow");
    }
}
class Multiple_inheritence implements Dog,Cat{
    @Override
    public void speak(){
        System.out.println("here we are overriding the speak method of interface dog and interface cat");
                Dog.super.speak();
        Cat.super.speak();

    }
}






public class Question5{
    public static void main(String[] args){
        Multiple_inheritence obj =new Multiple_inheritence();
        obj.speak();
    }
}