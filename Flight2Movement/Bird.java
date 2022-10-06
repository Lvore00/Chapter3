package Flight2Movement;

public class Bird implements Movement , Flight{
    private String type;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly(){
        System.out.println("I'm a bird who flaps wings to fly");
    }

    public void walk(){
        System.out.println("I walk on my feet.");
    }


    public void jump(){
        System.out.println("I jump by leaping from my feet.");
    }

    @Override
    public String toString(){
        return "Bird: " + type;
    }
}
