package FarmAnimal;

public class Duck extends FarmAnimal{

    private String sound;

    //Constructor

    public Duck(String name, String gender, double weight, int age, String sound) {
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

@Override
    public String feedLoadingSchedule(String schedule){
        return "8am-12pm-6pm";
    }



    //String toString


    @Override
    public String toString() {
        return "Duck goes: " + getSound() + " " + super.toString();
    }
}

