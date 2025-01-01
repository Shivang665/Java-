public class parameter_of_String {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.bark();
        Cat c1 = new Cat();
        c1.walk();

    }
    static class Dog{
        void bark()
        {
            System.out.println("The dog is barking");
        }
    }

    static class Cat{
        void walk(){
            System.out.println("The cat is walking");
        }
    }


}
