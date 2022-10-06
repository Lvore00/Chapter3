package Flight;

import java.util.Arrays;

public class ThingsThatFly {

    public static void main(String[] args) {

        Flight[] thingsThatFly = new Flight[2];

        thingsThatFly[0] = new Airplane(2016, "Boeing 747");
        thingsThatFly[1] = new Bird("Eagle");
        thingsThatFly[2] = new Bird ("Hummingbird");

        System.out.println(thingsThatFly.length);

      for(int i = 0; i < thingsThatFly.length; i++){

          System.out.println(thingsThatFly[i].toString());
          thingsThatFly[i].fly();
      }


    }
}

