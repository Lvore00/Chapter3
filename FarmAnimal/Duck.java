package FarmAnimal;

public class Duck extends FarmAnimal{

    private String quack;

    //Constructor

    public Duck(String name, String gender, double weight, int age, String quack) {
        super(name, gender, weight, age);
        this.quack = quack;
    }

    //Getters and setters

    public String getQuack() {
        return quack;
    }

    public void setQuack(String quack) {
        this.quack = quack;
    }

    //Methods





    //String toString


    @Override
    public String toString() {
        return "Duck goes: " + quack + " " + super.toString();
    }
}
