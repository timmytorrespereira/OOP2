public class Animal{

    public Animal(String name) {
        this.name = name;
    }
    
    protected String name;

    public void eat(){
        System.out.println("*The lion is eating*");
    }
}