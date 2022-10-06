package Flight2Movement;

public class ThingsThatMove {
        public static void main(String[] args) {

            Flight [] thingsTMove = new Flight[3];

            thingsTMove[0] = new Airplane(2016, "Boeing 747");
            thingsTMove[1] = new Bird("Eagle");
            thingsTMove[2] = new Bird("Hummingbird");

            System.out.println(thingsTMove.length);

            for (int i = 0; i < thingsTMove.length; i++) {

                System.out.println(thingsTMove[i].toString());
                thingsTMove[i].fly();
                thingsTMove[i].jump();
                thingsTMove[i].walk();


            }
        }
    }
