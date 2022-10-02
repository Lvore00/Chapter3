package FarmAnimal;

public class MyFarm {
    public static void main(String[] args) {

        MyFarm farm[] = new MyFarm[5];

        farm[0] = new Duck ("Donald", "Male", 3.2, 5, "Quack Quack");
        farm[1] = new Duck("Cheese", "Female", 3.6, 5, "Quack Quack");
        farm[2] = new Cow("Molly", "Female", 1600.0, 3, "Moo Moo");
        farm[3] = new Chicken("Amelia", "Female", 1.8, 4, "Cluck Cluck");
        farm[4] = new Chicken("Dixie", "Female", 1.7, 4, "Cluck Cluck");

        System.out.println(farm + feedLoadingSchedule());

    }
}
