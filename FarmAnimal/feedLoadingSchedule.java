package FarmAnimal;

public abstract class feedLoadingSchedule {

    private int firstTime;
    private int secondTime;
    private int thirdTime;

    public feedLoadingSchedule(int firstTime, int secondTime, int thirdTime){
        this.firstTime = firstTime;
        this.secondTime = secondTime;
        this.thirdTime = thirdTime;
    }

    abstract void time();

 public String getFirstTime(){
     return getName() + ": " + getFirstTime() + "am - " + getSecondTime() + "pm";
 }



}
