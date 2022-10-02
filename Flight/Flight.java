package Flight;

public interface Flight {

    public class Airplane implements Flight{
        private int year;
        private String model;
        private String modelNumber;

        public Airplane(int year, String model, String modelNumber) {
            this.year = year;
            this.model = model;
            this.modelNumber = modelNumber;
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

        public String getModelNumber() {
            return modelNumber;
        }

        public void setModelNumber(String modelNumber) {
            this.modelNumber = modelNumber;
        }

        @Override
        public String flight(){
         return ("I'm an airplane that relies on an engine to fly.");
        }

        public String toString(){
            return "Airplane: " + "Model: " + model + "\n" +
                    "Model Number: " + modelNumber + "\n" +
                    "Year: " + year + "\n" +
                    flight();
        }


    }

    public class Bird implements Flight{
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
        public String flight(){
            return("I'm a bird who flaps wings to fly");
        }
        @Override
        public String toString(){
            return "Bird: " + type + " " + flight();
        }
    }
}
