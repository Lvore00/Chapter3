package FarmAnimal;

public class Cow extends FarmAnimal{

    private String moo;

    //Constructor

    public Cow(String name, String gender, double weight, int age, String moo) {
        super(name, gender, weight, age);
        this.moo = moo;
    }

    //Getters and setters

    public String getMoo() {
        return moo;
    }

    public void setMoo(String moo) {
        this.moo = moo;
    }

    //Methods






    //String toString

    @Override
    public String toString() {
        return "Cow goes: " + moo + " " + super.toString();
    }
}
