package Flight;

public class ThingsThatFly {

    public static void main(String[] args) {

        ThingsThatFly thingsThatFly = new ThingsThatFly[2];
        
        thingsThatFly[0] = new Airplane(2016, "Boeing 747");
        thingsThatFly[1] = new Bird("Eagle");
        thingsThatFly[2] = new Bird ("Hummingbird");

        System.out.println(thingsThatFly.length);

        for (String item: thingsThatFly) {
            fly(item, );
            
        }

        public static void birdsMethod(ThingsThatFly thingsThatFly){

        }

    }
}
