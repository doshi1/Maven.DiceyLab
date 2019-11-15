import org.junit.Test;
import org.junit.Assert;


public class DiceTest {

    @Test
    public void tossAndSumTest()
    {
        //Given
        Dice dice = new Dice(2);
        //When
        int result = dice.tossAndSum();
        //Then
        Assert.assertTrue(result >= 2 && result <= 12);


    }
    @Test
    public void tossAndSumTest2()
    {
        //Given
        Dice dice = new Dice(3);
        //When
        int result = dice.tossAndSum();
        //Then
        Assert.assertTrue(result >= 3 && result <= 18);

    }
    @Test
    public void diceConstructorTest(){
        //Given
        Dice dice = new Dice(3);
        //When
        int result = dice.getNumberOfDices();
        //Then
        Assert.assertEquals(result, 3);

    }
}