package FarmAnimal;

public class Cow extends FarmAnimal{

    private String sound;

    //Constructor

    public Cow(String name, String gender, double weight, int age, String sound) {
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


    public String feedLoadingSchedule(){
        return "6am - 4pm";
    }




    //String toString

    @Override
    public String toString() {
        return "Cow goes: " + getSound() + " " + super.toString();
    }
}
