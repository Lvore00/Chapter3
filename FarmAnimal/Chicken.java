package FarmAnimal;

public class Chicken extends FarmAnimal{

    private String sound;

    //Constructor

    public Chicken(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    //Getters and setters

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    //Methods


    //you must override this method with the same parameter (same signature)
    //In FarmAnimal, this method does not take any parameter but now this takes String type parameter.
    //when you override, you must keep the same method name, and take same number of parameters if the method has any.

@Override
    public String feedLoadingSchedule(String schedule){
        return "8am - 4pm";
    }




    //String toString

    @Override
    public String toString() {
        return "Chicken goes: " + getSound() + " " + super.toString();
    }

}
