import java.util.Random;

public class Dice {

public Integer numberOfDies;
public Integer numberOfTosses;

public Dice (Integer numberOfDies, Integer numberOfTosses) {
    this.numberOfDies= numberOfDies;
    this.numberOfTosses = numberOfTosses;


}



    public  Integer tossAndSum() {

    Integer sum = 0;
   // int maxRoll = 6;
   // int minRoll = 1;
    Random random = new Random();


    for(int die = 0; die < numberOfDies; die++) {

    sum += random.nextInt(6) + 1;
}
    return sum;
}

public Integer getDiceRolled(){
    return this.numberOfDies;
}

}
