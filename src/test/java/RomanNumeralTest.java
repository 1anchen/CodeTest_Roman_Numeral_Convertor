import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RomanNumeralTest {

    RomanNumeral romanNumeral;

    @Before
    public void before(){
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void cannotConvertNumberZero(){
        Assert.assertEquals("Not Defined", romanNumeral.convertNumberToRomanNumeral(0));
    }

    @Test
    public void cannotConvertNumberFourThousand(){
        Assert.assertEquals("Not Defined", romanNumeral.convertNumberToRomanNumeral(4000));
    }

    @Test
    public void canConvertNumberOne(){
        Assert.assertEquals("I", romanNumeral.convertNumberToRomanNumeral(1));
    }

    @Test
    public void canConvertNumberTwo(){
        Assert.assertEquals("II", romanNumeral.convertNumberToRomanNumeral(2));
    }

    @Test
    public void canConvertNumberThree(){
        Assert.assertEquals("III", romanNumeral.convertNumberToRomanNumeral(3));
    }

    @Test
    public void canConvertNumberFour(){
        Assert.assertEquals("IV", romanNumeral.convertNumberToRomanNumeral(4));
    }

    @Test
    public void canConvertNumberFive(){
        Assert.assertEquals("V", romanNumeral.convertNumberToRomanNumeral(5));
    }

    @Test
    public void canConvertNumberSix(){
        Assert.assertEquals("VI", romanNumeral.convertNumberToRomanNumeral(6));
    }

    @Test
    public void canConvertNumberSeven(){
        Assert.assertEquals("VII", romanNumeral.convertNumberToRomanNumeral(7));
    }

    @Test
    public void canConvertNumberEight(){
        Assert.assertEquals("VIII", romanNumeral.convertNumberToRomanNumeral(8));
    }

    @Test
    public void canConvertNumberNine(){
        Assert.assertEquals("IX", romanNumeral.convertNumberToRomanNumeral(9));
    }

    @Test
    public void canConvertNumberTen(){
        Assert.assertEquals("X", romanNumeral.convertNumberToRomanNumeral(10));
    }

    @Test
    public void canConvertNumberEleven(){
        Assert.assertEquals("XI", romanNumeral.convertNumberToRomanNumeral(11));
    }

    @Test
    public void canConvertNumberTwelve(){
        Assert.assertEquals("XII", romanNumeral.convertNumberToRomanNumeral(12));
    }

    @Test
    public void canConvertNumberThirteen(){
        Assert.assertEquals("XIII", romanNumeral.convertNumberToRomanNumeral(13));
    }

    @Test
    public void canConvertNumberFourteen(){
        Assert.assertEquals("XIV", romanNumeral.convertNumberToRomanNumeral(14));
    }

    @Test
    public void canConvertNumberFifteen(){
        Assert.assertEquals("XV", romanNumeral.convertNumberToRomanNumeral(15));
    }

    @Test
    public void canConvertNumberSixteen(){
        Assert.assertEquals("XVI", romanNumeral.convertNumberToRomanNumeral(16));
    }

    @Test
    public void canConvertNumberSeventeen(){
        Assert.assertEquals("XVII", romanNumeral.convertNumberToRomanNumeral(17));
    }

    @Test
    public void canConvertNumberEighteen(){
        Assert.assertEquals("XVIII", romanNumeral.convertNumberToRomanNumeral(18));
    }

    @Test
    public void canConvertNumberNineteen(){
        Assert.assertEquals("XIX", romanNumeral.convertNumberToRomanNumeral(19));
    }

    @Test
    public void canConvertNumberTwenty(){
        Assert.assertEquals("XX", romanNumeral.convertNumberToRomanNumeral(20));
    }

    @Test
    public void canConvertNumberTwentyOne(){
        Assert.assertEquals("XXI", romanNumeral.convertNumberToRomanNumeral(21));
    }

    @Test
    public void canConvertNumberTwentyTwo(){
        Assert.assertEquals("XXII", romanNumeral.convertNumberToRomanNumeral(22));
    }

    @Test
    public void canConvertNumberTwentyThree(){
        Assert.assertEquals("XXIII", romanNumeral.convertNumberToRomanNumeral(23));
    }

    @Test
    public void canConvertNumberTwentyFour(){
        Assert.assertEquals("XXIV", romanNumeral.convertNumberToRomanNumeral(24));
    }

    @Test
    public void canConvertNumberTwentyFive(){
        Assert.assertEquals("XXV", romanNumeral.convertNumberToRomanNumeral(25));
    }

    @Test
    public void canConvertNumberTwentySix(){
        Assert.assertEquals("XXVI", romanNumeral.convertNumberToRomanNumeral(26));
    }

    @Test
    public void canConvertNumberTwentySeven(){
        Assert.assertEquals("XXVII", romanNumeral.convertNumberToRomanNumeral(27));
    }

    @Test
    public void canConvertNumberTwentyEight(){
        Assert.assertEquals("XXVIII", romanNumeral.convertNumberToRomanNumeral(28));
    }

    @Test
    public void canConvertNumberTwentyNine(){
        Assert.assertEquals("XXIX", romanNumeral.convertNumberToRomanNumeral(29));
    }

    @Test
    public void canConvertNumberThirty(){
        Assert.assertEquals("XXX", romanNumeral.convertNumberToRomanNumeral(30));
    }

    @Test
    public void canConvertNumberThirtyOne(){
        Assert.assertEquals("XXXI", romanNumeral.convertNumberToRomanNumeral(31));
    }

    @Test
    public void canConvertNumberThirtyTwo(){
        Assert.assertEquals("XXXII", romanNumeral.convertNumberToRomanNumeral(32));
    }

    @Test
    public void canConvertNumberThirtyThree(){
        Assert.assertEquals("XXXIII", romanNumeral.convertNumberToRomanNumeral(33));
    }

    @Test
    public void canConvertNumberThirtyFour(){
        Assert.assertEquals("XXXIV", romanNumeral.convertNumberToRomanNumeral(34));
    }

    @Test
    public void canConvertNumberThirtyFive(){
        Assert.assertEquals("XXXV", romanNumeral.convertNumberToRomanNumeral(35));
    }

    @Test
    public void canConvertNumberThirtySix(){
        Assert.assertEquals("XXXVI", romanNumeral.convertNumberToRomanNumeral(36));
    }

    @Test
    public void canConvertNumberThirtySeven(){
        Assert.assertEquals("XXXVII", romanNumeral.convertNumberToRomanNumeral(37));
    }

    @Test
    public void canConvertNumberThirtyEight(){
        Assert.assertEquals("XXXVIII", romanNumeral.convertNumberToRomanNumeral(38));
    }

    @Test
    public void canConvertNumberThirtyNine(){
        Assert.assertEquals("XXXIX", romanNumeral.convertNumberToRomanNumeral(39));
    }

    @Test
    public void canConvertNumberForty(){
        Assert.assertEquals("XL", romanNumeral.convertNumberToRomanNumeral(40));
    }






}
