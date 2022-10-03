package Flight;

public class Airplane implements Flight{

    private int year;
    private String model;

    public Airplane(int year, String model) {
        this.year = year;
        this.model = model;

    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    @Override
    public void fly(){
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }

    public String toString(){
        return "Airplane: " + "Model: " + model + "\n" +
                "Year: " + year;
    }


}
