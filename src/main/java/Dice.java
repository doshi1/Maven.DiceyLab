import java.util.Random;

public class Dice {

    private int numberOfDices;
    Random randomUtil;

    public int getNumberOfDices() {
        return numberOfDices;
    }

    public Dice(int numberOfDices) {
        this.numberOfDices = numberOfDices;
        randomUtil = new Random();
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        for(int i = 0; i < numberOfDices; ){
            int rolledNumber = randomUtil.nextInt(7);
            sum+= rolledNumber;
            if(rolledNumber != 0)
                i++;
        }
        return sum;
    }

}
