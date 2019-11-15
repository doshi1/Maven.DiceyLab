
public class Bins {
    private int startRange;
    private int endRange;
    private int[] results;

    public Bins(int startRange, int endRange){
        this.startRange = startRange;
        this.endRange = endRange;
        results = new int[endRange - startRange + 1];
    }

    public Integer getBin(int binNumber){
        Integer result = null;
        if(binNumber >= startRange && binNumber <= endRange){
            result = results[binNumber - startRange];
        }
        return result;
    }

    public void incrementBin(Integer binNumber){
        if(binNumber >= startRange && binNumber <= endRange){
            results[binNumber - startRange]++;
        }
    }
    public Integer getStartRange(){
        return startRange;
    }
    public Integer getEndRange(){
        return endRange;
    }
    public void printResults(){
    }

    public int getNumberofRange() {
        return results.length;
    }
}