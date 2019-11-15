public class Simulation {
    private Dice dice;
    private Bins bins;
    private int numberOfTries;

    public Simulation(int numberOfDice, int numberOfTries){
        dice = new Dice(numberOfDice);
        bins = new Bins(numberOfDice, 6 * numberOfDice);
        this.numberOfTries = numberOfTries;
    }
    public void runSimulation(){
        for(int i = 0; i < numberOfTries; i++){
            Integer result = dice.tossAndSum();
            bins.incrementBin(result);
        }
    }
    public void printResults(){
        System.out.println("***");
        System.out.println("Simulation of " + dice.getNumberOfDices()+
                " dice tossed for " + numberOfTries + " times.");
        System.out.println("***");
        for(int i = bins.getStartRange(); i <= bins.getEndRange(); i++) {
            int result = bins.getBin(i);
            double avg = (double)result / numberOfTries;
            String str = String.format("%2d :%8d: %.2f %s  ", i, result, avg, getStarsForRow(i));
            System.out.println(str);
        }

    }
    private String getStarsForRow(int rowNumber){
        String starStr = "**";
        int middleRow = (bins.getEndRange() / 2) + 1;
        int displacement = 0;
        if ( rowNumber > middleRow)
            displacement = bins.getEndRange() - rowNumber;
        else
            displacement = rowNumber - bins.getStartRange();
        for (int i = 0; i < displacement; i++) {
            starStr += "***";

        }
        return starStr;
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);

        sim.runSimulation();

        sim.printResults();
    }

}