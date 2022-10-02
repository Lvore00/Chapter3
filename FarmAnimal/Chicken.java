package FarmAnimal;

public class Chicken extends FarmAnimal{

    private String cluck;

    //Constructor

    public Chicken(String name, String gender, double weight, int age, String cluck) {
        super(name, gender, weight, age);
        this.cluck = cluck;
    }

    //Getters and setters

    public String getCluck() {
        return cluck;
    }

    public void setCluck(String cluck) {
        this.cluck = cluck;
    }

    //Methods






    //String toString

    @Override
    public String toString() {
        return "Chicken goes: " + cluck + " " + super.toString();
    }

}
