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
    public void cannotConvertNegativeNumber(){
        Assert.assertEquals("Not Defined", romanNumeral.convertNumberToRomanNumeral(-10));
    }

    @Test
    public void cannotConvertNumberFourThousand(){
        Assert.assertEquals("Not Defined", romanNumeral.convertNumberToRomanNumeral(4000));
    }

    @Test
    public void cannotConvertNumberFourThousandAndOne(){
        Assert.assertEquals("Not Defined", romanNumeral.convertNumberToRomanNumeral(4001));
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

    @Test
    public void canConvertNumberFortyOne(){
        Assert.assertEquals("XLI", romanNumeral.convertNumberToRomanNumeral(41));
    }

    @Test
    public void canConvertNumberFortyTwo(){
        Assert.assertEquals("XLII", romanNumeral.convertNumberToRomanNumeral(42));
    }

    @Test
    public void canConvertNumberFortyThree(){
        Assert.assertEquals("XLIII", romanNumeral.convertNumberToRomanNumeral(43));
    }

    @Test
    public void canConvertNumberFortyFour(){
        Assert.assertEquals("XLIV", romanNumeral.convertNumberToRomanNumeral(44));
    }

    @Test
    public void canConvertNumberFortyFive(){
        Assert.assertEquals("XLV", romanNumeral.convertNumberToRomanNumeral(45));
    }

    @Test
    public void canConvertNumberFortySix(){
        Assert.assertEquals("XLVI", romanNumeral.convertNumberToRomanNumeral(46));
    }

    @Test
    public void canConvertNumberFortySeven(){
        Assert.assertEquals("XLVII", romanNumeral.convertNumberToRomanNumeral(47));
    }

    @Test
    public void canConvertNumberFortyEight(){
        Assert.assertEquals("XLVIII", romanNumeral.convertNumberToRomanNumeral(48));
    }

    @Test
    public void canConvertNumberFortyNine(){
        Assert.assertEquals("XLIX", romanNumeral.convertNumberToRomanNumeral(49));
    }

    @Test
    public void canConvertNumberFifty(){
        Assert.assertEquals("L", romanNumeral.convertNumberToRomanNumeral(50));
    }

    @Test
    public void canConvertNumberFiftyOne(){
        Assert.assertEquals("LI", romanNumeral.convertNumberToRomanNumeral(51));
    }

    @Test
    public void canConvertNumberFiftyTwo(){
        Assert.assertEquals("LII", romanNumeral.convertNumberToRomanNumeral(52));
    }

    @Test
    public void canConvertNumberFiftyThree(){
        Assert.assertEquals("LIII", romanNumeral.convertNumberToRomanNumeral(53));
    }

    @Test
    public void canConvertNumberFiftyFour(){
        Assert.assertEquals("LIV", romanNumeral.convertNumberToRomanNumeral(54));
    }

    @Test
    public void canConvertNumberFiftyFive(){
        Assert.assertEquals("LV", romanNumeral.convertNumberToRomanNumeral(55));
    }

    @Test
    public void canConvertNumberFiftySix(){
        Assert.assertEquals("LVI", romanNumeral.convertNumberToRomanNumeral(56));
    }

    @Test
    public void canConvertNumberFiftySeven(){
        Assert.assertEquals("LVII", romanNumeral.convertNumberToRomanNumeral(57));
    }

    @Test
    public void canConvertNumberFiftyEight(){
        Assert.assertEquals("LVIII", romanNumeral.convertNumberToRomanNumeral(58));
    }

    @Test
    public void canConvertNumberFiftyNine(){
        Assert.assertEquals("LIX", romanNumeral.convertNumberToRomanNumeral(59));
    }

    @Test
    public void canConvertNumberSixty(){
        Assert.assertEquals("LX", romanNumeral.convertNumberToRomanNumeral(60));
    }

    @Test
    public void canConvertNumberSixtyOne(){
        Assert.assertEquals("LXI", romanNumeral.convertNumberToRomanNumeral(61));
    }

    @Test
    public void canConvertNumberSixtyTwo(){
        Assert.assertEquals("LXII", romanNumeral.convertNumberToRomanNumeral(62));
    }

    @Test
    public void canConvertNumberSixtyThree(){
        Assert.assertEquals("LXIII", romanNumeral.convertNumberToRomanNumeral(63));
    }

    @Test
    public void canConvertNumberSixtyFour(){
        Assert.assertEquals("LXIV", romanNumeral.convertNumberToRomanNumeral(64));
    }

    @Test
    public void canConvertNumberSixtyFive(){
        Assert.assertEquals("LXV", romanNumeral.convertNumberToRomanNumeral(65));
    }

    @Test
    public void canConvertNumberSixtySix(){
        Assert.assertEquals("LXVI", romanNumeral.convertNumberToRomanNumeral(66));
    }

    @Test
    public void canConvertNumberSixtySeven(){
        Assert.assertEquals("LXVII", romanNumeral.convertNumberToRomanNumeral(67));
    }

    @Test
    public void canConvertNumberSixtyEight(){
        Assert.assertEquals("LXVIII", romanNumeral.convertNumberToRomanNumeral(68));
    }

    @Test
    public void canConvertNumberSixtyNine(){
        Assert.assertEquals("LXIX", romanNumeral.convertNumberToRomanNumeral(69));
    }

    @Test
    public void canConvertNumberSeventy(){
        Assert.assertEquals("LXX", romanNumeral.convertNumberToRomanNumeral(70));
    }

    @Test
    public void canConvertNumberSeventyOne(){
        Assert.assertEquals("LXXI", romanNumeral.convertNumberToRomanNumeral(71));
    }

    @Test
    public void canConvertNumberSeventyTwo(){
        Assert.assertEquals("LXXII", romanNumeral.convertNumberToRomanNumeral(72));
    }

    @Test
    public void canConvertNumberSeventyThree(){
        Assert.assertEquals("LXXIII", romanNumeral.convertNumberToRomanNumeral(73));
    }

    @Test
    public void canConvertNumberSeventyFour(){
        Assert.assertEquals("LXXIV", romanNumeral.convertNumberToRomanNumeral(74));
    }

    @Test
    public void canConvertNumberSeventyFive(){
        Assert.assertEquals("LXXV", romanNumeral.convertNumberToRomanNumeral(75));
    }

    @Test
    public void canConvertNumberSeventySix(){
        Assert.assertEquals("LXXVI", romanNumeral.convertNumberToRomanNumeral(76));
    }

    @Test
    public void canConvertNumberSeventySeven(){
        Assert.assertEquals("LXXVII", romanNumeral.convertNumberToRomanNumeral(77));
    }

    @Test
    public void canConvertNumberSeventyEight(){
        Assert.assertEquals("LXXVIII", romanNumeral.convertNumberToRomanNumeral(78));
    }

    @Test
    public void canConvertNumberSeventyNine(){
        Assert.assertEquals("LXXIX", romanNumeral.convertNumberToRomanNumeral(79));
    }

    @Test
    public void canConvertNumberEighty(){
        Assert.assertEquals("LXXX", romanNumeral.convertNumberToRomanNumeral(80));
    }

    @Test
    public void canConvertNumberEightyOne(){
        Assert.assertEquals("LXXXI", romanNumeral.convertNumberToRomanNumeral(81));
    }

    @Test
    public void canConvertNumberEightyTwo(){
        Assert.assertEquals("LXXXII", romanNumeral.convertNumberToRomanNumeral(82));
    }

    @Test
    public void canConvertNumberEightyThree(){
        Assert.assertEquals("LXXXIII", romanNumeral.convertNumberToRomanNumeral(83));
    }

    @Test
    public void canConvertNumberEightyFour(){
        Assert.assertEquals("LXXXIV", romanNumeral.convertNumberToRomanNumeral(84));
    }

    @Test
    public void canConvertNumberEightyFive(){
        Assert.assertEquals("LXXXV", romanNumeral.convertNumberToRomanNumeral(85));
    }

    @Test
    public void canConvertNumberEightySix(){
        Assert.assertEquals("LXXXVI", romanNumeral.convertNumberToRomanNumeral(86));
    }

    @Test
    public void canConvertNumberEightySeven(){
        Assert.assertEquals("LXXXVII", romanNumeral.convertNumberToRomanNumeral(87));
    }

    @Test
    public void canConvertNumberEightyEight(){
        Assert.assertEquals("LXXXVIII", romanNumeral.convertNumberToRomanNumeral(88));
    }

    @Test
    public void canConvertNumberEightyNine(){
        Assert.assertEquals("LXXXIX", romanNumeral.convertNumberToRomanNumeral(89));
    }

    @Test
    public void canConvertNumberNinety(){
        Assert.assertEquals("XC", romanNumeral.convertNumberToRomanNumeral(90));
    }

    @Test
    public void canConvertNumberNinetyOne(){
        Assert.assertEquals("XCI", romanNumeral.convertNumberToRomanNumeral(91));
    }

    @Test
    public void canConvertNumberNinetyTwo(){
        Assert.assertEquals("XCII", romanNumeral.convertNumberToRomanNumeral(92));
    }

    @Test
    public void canConvertNumberNinetyThree(){
        Assert.assertEquals("XCIII", romanNumeral.convertNumberToRomanNumeral(93));
    }

    @Test
    public void canConvertNumberNinetyFour(){
        Assert.assertEquals("XCIV", romanNumeral.convertNumberToRomanNumeral(94));
    }

    @Test
    public void canConvertNumberNinetyFive(){
        Assert.assertEquals("XCV", romanNumeral.convertNumberToRomanNumeral(95));
    }

    @Test
    public void canConvertNumberNinetySix(){
        Assert.assertEquals("XCVI", romanNumeral.convertNumberToRomanNumeral(96));
    }

    @Test
    public void canConvertNumberNinetySeven(){
        Assert.assertEquals("XCVII", romanNumeral.convertNumberToRomanNumeral(97));
    }

    @Test
    public void canConvertNumberNinetyEight(){
        Assert.assertEquals("XCVIII", romanNumeral.convertNumberToRomanNumeral(98));
    }

    @Test
    public void canConvertNumberNinetyNine(){
        Assert.assertEquals("XCIX", romanNumeral.convertNumberToRomanNumeral(99));
    }

    @Test
    public void canConvertNumberOneHundred(){
        Assert.assertEquals("C", romanNumeral.convertNumberToRomanNumeral(100));
    }

    @Test
    public void canConvertNumberOneHundredAndOne(){
        Assert.assertEquals("CI", romanNumeral.convertNumberToRomanNumeral(101));
    }

    @Test
    public void canConvertNumberOneHundredAndfour(){
        Assert.assertEquals("CIV", romanNumeral.convertNumberToRomanNumeral(104));
    }

    @Test
    public void canConvertNumberOneHundredAndFive(){
        Assert.assertEquals("CV", romanNumeral.convertNumberToRomanNumeral(105));
    }

    @Test
    public void canConvertNumberOneHundredAndEight(){
        Assert.assertEquals("CVIII", romanNumeral.convertNumberToRomanNumeral(108));
    }

    @Test
    public void canConvertNumberOneHundredAndTen(){
        Assert.assertEquals("CX", romanNumeral.convertNumberToRomanNumeral(110));
    }

    @Test
    public void canConvertNumberOneHundredAndTwelve(){
        Assert.assertEquals("CXII", romanNumeral.convertNumberToRomanNumeral(112));
    }

    @Test
    public void canConvertNumberOneHundredAndSixteen(){
        Assert.assertEquals("CXVI", romanNumeral.convertNumberToRomanNumeral(116));
    }

    @Test
    public void canConvertNumberOneHundredAndTwenty(){
        Assert.assertEquals("CXX", romanNumeral.convertNumberToRomanNumeral(120));
    }

    @Test
    public void canConvertNumberOneHundredAndTwentyThree(){
        Assert.assertEquals("CXXIII", romanNumeral.convertNumberToRomanNumeral(123));
    }

    @Test
    public void canConvertNumberOneHundredAndThirtyFive(){
        Assert.assertEquals("CXXXV", romanNumeral.convertNumberToRomanNumeral(135));
    }

    @Test
    public void canConvertNumberOneHundredAndTHirtyNine(){
        Assert.assertEquals("CXXXIX", romanNumeral.convertNumberToRomanNumeral(139));
    }

    @Test
    public void canConvertNumberOneHundredAndFortySeven(){
        Assert.assertEquals("CXLVII", romanNumeral.convertNumberToRomanNumeral(147));
    }

    @Test
    public void canConvertNumberOneHundredAndFiftyFour(){
        Assert.assertEquals("CLIV", romanNumeral.convertNumberToRomanNumeral(154));
    }

    @Test
    public void canConvertNumberOneHundredAndSixtyTwo(){
        Assert.assertEquals("CLXII", romanNumeral.convertNumberToRomanNumeral(162));
    }

    @Test
    public void canConvertNumberOneHundredAndSeventyNine(){
        Assert.assertEquals("CLXXIX", romanNumeral.convertNumberToRomanNumeral(179));
    }

    @Test
    public void canConvertNumberOneHundredAndEightySix(){
        Assert.assertEquals("CLXXXVI", romanNumeral.convertNumberToRomanNumeral(186));
    }

    @Test
    public void canConvertNumberOneHundredAndNinetyOne(){
        Assert.assertEquals("CXCI", romanNumeral.convertNumberToRomanNumeral(191));
    }

    @Test
    public void canConvertNumberTwoHundredAndTwo(){
        Assert.assertEquals("CCII", romanNumeral.convertNumberToRomanNumeral(202));
    }

    @Test
    public void canConvertNumberTwoHundredAndThirteen(){
        Assert.assertEquals("CCXIII", romanNumeral.convertNumberToRomanNumeral(213));
    }

    @Test
    public void canConvertNumberTwoHundredAndTwentyFour(){
        Assert.assertEquals("CCXXIV", romanNumeral.convertNumberToRomanNumeral(224));
    }

    @Test
    public void canConvertNumberTwoHundredAndThirtyFive(){
        Assert.assertEquals("CCXXXV", romanNumeral.convertNumberToRomanNumeral(235));
    }

    @Test
    public void canConvertNumberTwoHundredAndFortySix(){
        Assert.assertEquals("CCXLVI", romanNumeral.convertNumberToRomanNumeral(246));
    }

    @Test
    public void canConvertNumberTwoHundredAndFiftySeven(){
        Assert.assertEquals("CCLVII", romanNumeral.convertNumberToRomanNumeral(257));
    }

    @Test
    public void canConvertNumberTwoHundredAndSixtyEight(){
        Assert.assertEquals("CCLXVIII", romanNumeral.convertNumberToRomanNumeral(268));
    }

    @Test
    public void canConvertNumberTwoHundredAnSeventyNine(){
        Assert.assertEquals("CCLXXIX", romanNumeral.convertNumberToRomanNumeral(279));
    }

    @Test
    public void canConvertNumberTwoHundredAndEighty(){
        Assert.assertEquals("CCLXXX", romanNumeral.convertNumberToRomanNumeral(280));
    }

    @Test
    public void canConvertNumberTwoHundredAndNinetyOne(){
        Assert.assertEquals("CCXCI", romanNumeral.convertNumberToRomanNumeral(291));
    }

    @Test
    public void canConvertNumberThreeHundredAndTwo(){
        Assert.assertEquals("CCCII", romanNumeral.convertNumberToRomanNumeral(302));
    }

    @Test
    public void canConvertNumberThreeHundredAndThirteen(){
        Assert.assertEquals("CCCXIII", romanNumeral.convertNumberToRomanNumeral(313));
    }

    @Test
    public void canConvertNumberThreeHundredAndTwentyFour(){
        Assert.assertEquals("CCCXXIV", romanNumeral.convertNumberToRomanNumeral(324));
    }

    @Test
    public void canConvertNumberThreeHundredAndThirtyFive(){
        Assert.assertEquals("CCCXXXV", romanNumeral.convertNumberToRomanNumeral(335));
    }

    @Test
    public void canConvertNumberThreeHundredAndFortySix(){
        Assert.assertEquals("CCCXLVI", romanNumeral.convertNumberToRomanNumeral(346));
    }

    @Test
    public void canConvertNumberThreeHundredAndFiftySeven(){
        Assert.assertEquals("CCCLVII", romanNumeral.convertNumberToRomanNumeral(357));
    }

    @Test
    public void canConvertNumberThreeHundredAndSixtyEight(){
        Assert.assertEquals("CCCLXVIII", romanNumeral.convertNumberToRomanNumeral(368));
    }

    @Test
    public void canConvertNumberThreeHundredAndSeventyNine(){
        Assert.assertEquals("CCCLXXIX", romanNumeral.convertNumberToRomanNumeral(379));
    }

    @Test
    public void canConvertNumberThreeHundredAndEighty(){
        Assert.assertEquals("CCCLXXX", romanNumeral.convertNumberToRomanNumeral(380));
    }

    @Test
    public void canConvertNumberThreeHundredAndNinetyOne(){
        Assert.assertEquals("CCCXCI", romanNumeral.convertNumberToRomanNumeral(391));
    }

    @Test
    public void canConvertNumberFourHundredAndTwo(){
        Assert.assertEquals("CDII", romanNumeral.convertNumberToRomanNumeral(402));
    }

    @Test
    public void canConvertNumberFourHundredAndThirteen(){
        Assert.assertEquals("CDXIII", romanNumeral.convertNumberToRomanNumeral(413));
    }

    @Test
    public void canConvertNumberFourHundredAndTwentyFour(){
        Assert.assertEquals("CDXXIV", romanNumeral.convertNumberToRomanNumeral(424));
    }

    @Test
    public void canConvertNumberFourHundredAndThirtyFive(){
        Assert.assertEquals("CDXXXV", romanNumeral.convertNumberToRomanNumeral(435));
    }

    @Test
    public void canConvertNumberFourHundredAndFortySix(){
        Assert.assertEquals("CDXLVI", romanNumeral.convertNumberToRomanNumeral(446));
    }

    @Test
    public void canConvertNumberFourHundredAndFiftySeven(){
        Assert.assertEquals("CDLVII", romanNumeral.convertNumberToRomanNumeral(457));
    }

    @Test
    public void canConvertNumberFourHundredAndSixtyEight(){
        Assert.assertEquals("CDLXVIII", romanNumeral.convertNumberToRomanNumeral(468));
    }

    @Test
    public void canConvertNumberFourHundredAndSeventyOne(){
        Assert.assertEquals("CDLXXI", romanNumeral.convertNumberToRomanNumeral(471));
    }

    @Test
    public void canConvertNumberFourHundredAndEightyTwo(){
        Assert.assertEquals("CDLXXXII", romanNumeral.convertNumberToRomanNumeral(482));
    }

    @Test
    public void canConvertNumberFourHundredAndNinetyThree(){
        Assert.assertEquals("CDXCIII", romanNumeral.convertNumberToRomanNumeral(493));
    }

    @Test
    public void canConvertNumberFiveHundredAndFour(){
        Assert.assertEquals("DIV", romanNumeral.convertNumberToRomanNumeral(504));
    }

    @Test
    public void canConvertNumberFiveHundredAndFifteen(){
        Assert.assertEquals("DXV", romanNumeral.convertNumberToRomanNumeral(515));
    }

    @Test
    public void canConvertNumberFiveHundredAndTwentySix(){
        Assert.assertEquals("DXXVI", romanNumeral.convertNumberToRomanNumeral(526));
    }

    @Test
    public void canConvertNumberFiveHundredAndThirtySeven(){
        Assert.assertEquals("DXXXVII", romanNumeral.convertNumberToRomanNumeral(537));
    }

    @Test
    public void canConvertNumberFiveHundredAndFortyEight(){
        Assert.assertEquals("DXLVIII", romanNumeral.convertNumberToRomanNumeral(548));
    }

    @Test
    public void canConvertNumberFiveHundredAndFiftyNine(){
        Assert.assertEquals("DLIX", romanNumeral.convertNumberToRomanNumeral(559));
    }

    @Test
    public void canConvertNumberFiveHundredAndSixtyOne(){
        Assert.assertEquals("DLXI", romanNumeral.convertNumberToRomanNumeral(561));
    }

    @Test
    public void canConvertNumberFiveHundredAndSeventyTwo(){
        Assert.assertEquals("DLXXII", romanNumeral.convertNumberToRomanNumeral(572));
    }

    @Test
    public void canConvertNumberFiveHundredAndEightyThree(){
        Assert.assertEquals("DLXXXIII", romanNumeral.convertNumberToRomanNumeral(583));
    }

    @Test
    public void canConvertNumberFiveHundredAndNinetyFour(){
        Assert.assertEquals("DXCIV", romanNumeral.convertNumberToRomanNumeral(594));
    }

    @Test
    public void canConvertNumberSixHundredAndFive(){
        Assert.assertEquals("DCV", romanNumeral.convertNumberToRomanNumeral(605));
    }

    @Test
    public void canConvertNumberSixHundredAndSeventeen(){
        Assert.assertEquals("DCXVII", romanNumeral.convertNumberToRomanNumeral(617));
    }

    @Test
    public void canConvertNumberSixHundredAndTwentyNine(){
        Assert.assertEquals("DCXXIX", romanNumeral.convertNumberToRomanNumeral(629));
    }

    @Test
    public void canConvertNumberSixHundredAndThirtyEight(){
        Assert.assertEquals("DCXXXVIII", romanNumeral.convertNumberToRomanNumeral(638));
    }

    @Test
    public void canConvertNumberSixHundredAndFortySix(){
        Assert.assertEquals("DCXLVI", romanNumeral.convertNumberToRomanNumeral(646));
    }

    @Test
    public void canConvertNumberSixHundredAndFiftyFour(){
        Assert.assertEquals("DCLIV", romanNumeral.convertNumberToRomanNumeral(654));
    }

    @Test
    public void canConvertNumberSixHundredAndSixtyTwo(){
        Assert.assertEquals("DCLXII", romanNumeral.convertNumberToRomanNumeral(662));
    }

    @Test
    public void canConvertNumberSixHundredAndSeventyOne(){
        Assert.assertEquals("DCLXXI", romanNumeral.convertNumberToRomanNumeral(671));
    }

    @Test
    public void canConvertNumberSixHundredAndEightyThree(){
        Assert.assertEquals("DCLXXXIII", romanNumeral.convertNumberToRomanNumeral(683));
    }

    @Test
    public void canConvertNumberSixHundredAndNinetyFive(){
        Assert.assertEquals("DCXCV", romanNumeral.convertNumberToRomanNumeral(695));
    }

    @Test
    public void canConvertNumberSevenHundredAndSeven(){
        Assert.assertEquals("DCCVII", romanNumeral.convertNumberToRomanNumeral(707));
    }

    @Test
    public void canConvertNumberSevenHundredAndNineteen(){
        Assert.assertEquals("DCCXIX", romanNumeral.convertNumberToRomanNumeral(719));
    }

    @Test
    public void canConvertNumberSevenHundredAndTwentyTwo(){
        Assert.assertEquals("DCCXXII", romanNumeral.convertNumberToRomanNumeral(722));
    }

    @Test
    public void canConvertNumberSevenHundredAndThirtyFive(){
        Assert.assertEquals("DCCXXXV", romanNumeral.convertNumberToRomanNumeral(735));
    }

    @Test
    public void canConvertNumberSevenHundredAndFortyEight(){
        Assert.assertEquals("DCCXLVIII", romanNumeral.convertNumberToRomanNumeral(748));
    }

    @Test
    public void canConvertNumberSevenHundredAndFiftyOne(){
        Assert.assertEquals("DCCLI", romanNumeral.convertNumberToRomanNumeral(751));
    }

    @Test
    public void canConvertNumberSevenHundredAndSixtyFour(){
        Assert.assertEquals("DCCLXIV", romanNumeral.convertNumberToRomanNumeral(764));
    }

    @Test
    public void canConvertNumberSevenHundredAndSeventySeven(){
        Assert.assertEquals("DCCLXXVII", romanNumeral.convertNumberToRomanNumeral(777));
    }

    @Test
    public void canConvertNumberSevenHundredAndNinety(){
        Assert.assertEquals("DCCXC", romanNumeral.convertNumberToRomanNumeral(790));
    }

    @Test
    public void canConvertNumberEightHundredAndFour(){
        Assert.assertEquals("DCCCIV", romanNumeral.convertNumberToRomanNumeral(804));
    }

    @Test
    public void canConvertNumberEightHundredAndEighteen(){
        Assert.assertEquals("DCCCXVIII", romanNumeral.convertNumberToRomanNumeral(818));
    }

    @Test
    public void canConvertNumberEightHundredAndThirtyTwo(){
        Assert.assertEquals("DCCCXXXII", romanNumeral.convertNumberToRomanNumeral(832));
    }

    @Test
    public void canConvertNumberEightHundredAndFortySix(){
        Assert.assertEquals("DCCCXLVI", romanNumeral.convertNumberToRomanNumeral(846));
    }

    @Test
    public void canConvertNumberEightHundredAndSixty(){
        Assert.assertEquals("DCCCLX", romanNumeral.convertNumberToRomanNumeral(860));
    }

    @Test
    public void canConvertNumberEightHundredAndSeventyFour(){
        Assert.assertEquals("DCCCLXXIV", romanNumeral.convertNumberToRomanNumeral(874));
    }

    @Test
    public void canConvertNumberEightHundredAndEightyEight(){
        Assert.assertEquals("DCCCLXXXVIII", romanNumeral.convertNumberToRomanNumeral(888));
    }

    @Test
    public void canConvertNumberNineHundredAndOne(){
        Assert.assertEquals("CMI", romanNumeral.convertNumberToRomanNumeral(901));
    }

    @Test
    public void canConvertNumberNineHundredAndSeventeen(){
        Assert.assertEquals("CMXVII", romanNumeral.convertNumberToRomanNumeral(917));
    }

    @Test
    public void canConvertNumberNineHundredAndThirtyThree(){
        Assert.assertEquals("CMXXXIII", romanNumeral.convertNumberToRomanNumeral(933));
    }

    @Test
    public void canConvertNumberNineHundredAndFortyNine(){
        Assert.assertEquals("CMXLIX", romanNumeral.convertNumberToRomanNumeral(949));
    }

    @Test
    public void canConvertNumberNineHundredAndSixtyFive(){
        Assert.assertEquals("CMLXV", romanNumeral.convertNumberToRomanNumeral(965));
    }

    @Test
    public void canConvertNumberNineHundredAndEightyOne(){
        Assert.assertEquals("CMLXXXI", romanNumeral.convertNumberToRomanNumeral(981));
    }

    @Test
    public void canConvertNumberNineHundredAndNinetySeven(){
        Assert.assertEquals("CMXCVII", romanNumeral.convertNumberToRomanNumeral(997));
    }

    @Test
    public void canConvertNumberOneThousandAndFourteen(){
        Assert.assertEquals("MXIV", romanNumeral.convertNumberToRomanNumeral(1014));
    }

    @Test
    public void canConvertNumberOneThousandOneHundredAndThirtyOne(){
        Assert.assertEquals("MCXXXI", romanNumeral.convertNumberToRomanNumeral(1131));
    }

    @Test
    public void canConvertNumberOneThousandTwoHundredAndFortyEight(){
        Assert.assertEquals("MCCXLVIII", romanNumeral.convertNumberToRomanNumeral(1248));
    }

    @Test
    public void canConvertNumberOneThousandThreeHundredAndSixtyFive(){
        Assert.assertEquals("MCCCLXV", romanNumeral.convertNumberToRomanNumeral(1365));
    }

    @Test
    public void canConvertNumberOneThousandFourHundredAndEightyTwo(){
        Assert.assertEquals("MCDLXXXII", romanNumeral.convertNumberToRomanNumeral(1482));
    }

    @Test
    public void canConvertNumberOneThousandFiveHundredAndNinetyNine(){
        Assert.assertEquals("MDXCIX", romanNumeral.convertNumberToRomanNumeral(1599));
    }

    @Test
    public void canConvertNumberOneThousandSevenHundredAndSixteen(){
        Assert.assertEquals("MDCCXVI", romanNumeral.convertNumberToRomanNumeral(1716));
    }

    @Test
    public void canConvertNumberOneThousandEightHundredAndThirtyThree(){
        Assert.assertEquals("MDCCCXXXIII", romanNumeral.convertNumberToRomanNumeral(1833));
    }

    @Test
    public void canConvertNumberOneThousandNineHundredAndFifty(){
        Assert.assertEquals("MCML", romanNumeral.convertNumberToRomanNumeral(1950));
    }

    @Test
    public void canConvertNumberTwoThousandSixtySeven(){
        Assert.assertEquals("MMLXVII", romanNumeral.convertNumberToRomanNumeral(2067));
    }

    @Test
    public void canConvertNumberTwoThousandOneHundredAndEightFour(){
        Assert.assertEquals("MMCLXXXIV", romanNumeral.convertNumberToRomanNumeral(2184));
    }

    @Test
    public void canConvertNumberTwoThousandThreeHundredAndOne(){
        Assert.assertEquals("MMCCCI", romanNumeral.convertNumberToRomanNumeral(2301));
    }

    @Test
    public void canConvertNumberTwoThousandFourHundredAndTwentyEight(){
        Assert.assertEquals("MMCDXXVIII", romanNumeral.convertNumberToRomanNumeral(2428));
    }

    @Test
    public void canConvertNumberTwoThousandFiveHundredAndFortyFive(){
        Assert.assertEquals("MMDXLV", romanNumeral.convertNumberToRomanNumeral(2545));
    }

    @Test
    public void canConvertNumberTwoThousandSixHundredAndSixtyTwo(){
        Assert.assertEquals("MMDCLXII", romanNumeral.convertNumberToRomanNumeral(2662));
    }

    @Test
    public void canConvertNumberTwoThousandSevenHundredAndSeventyNine(){
        Assert.assertEquals("MMDCCLXXIX", romanNumeral.convertNumberToRomanNumeral(2779));
    }

    @Test
    public void canConvertNumberTwoThousandEightHundredAndNinetySix(){
        Assert.assertEquals("MMDCCCXCVI", romanNumeral.convertNumberToRomanNumeral(2896));
    }

    @Test
    public void canConvertNumberThreeThousandEightAndFourteen(){
        Assert.assertEquals("MMMXIV", romanNumeral.convertNumberToRomanNumeral(3014));
    }

    @Test
    public void canConvertNumberThreeThousandOneHundredAndThirtyTwo(){
        Assert.assertEquals("MMMCXXXII", romanNumeral.convertNumberToRomanNumeral(3132));
    }

    @Test
    public void canConvertNumberThreeThousandTwoHundredAndFifty(){
        Assert.assertEquals("MMMCCL", romanNumeral.convertNumberToRomanNumeral(3250));
    }

    @Test
    public void canConvertNumberThreeThousandThreeHundredAndSixtyEight(){
        Assert.assertEquals("MMMCCCLXVIII", romanNumeral.convertNumberToRomanNumeral(3368));
    }

    @Test
    public void canConvertNumberThreeThousandFourHundredAndEightySix(){
        Assert.assertEquals("MMMCDLXXXVI", romanNumeral.convertNumberToRomanNumeral(3486));
    }

    @Test
    public void canConvertNumberThreeThousandSixHundredAndFour(){
        Assert.assertEquals("MMMDCIV", romanNumeral.convertNumberToRomanNumeral(3604));
    }

    @Test
    public void canConvertNumberThreeThousandSevenHundredAndThirtyThree(){
        Assert.assertEquals("MMMDCCXXXIII", romanNumeral.convertNumberToRomanNumeral(3733));
    }

    @Test
    public void canConvertNumberThreeThousandEightHundredAndFiftyOne(){
        Assert.assertEquals("MMMDCCCLI", romanNumeral.convertNumberToRomanNumeral(3851));
    }

    @Test
    public void canConvertNumberThreeThousandNineHundredAndSeventy(){
        Assert.assertEquals("MMMCMLXX", romanNumeral.convertNumberToRomanNumeral(3970));
    }

    @Test
    public void canConvertNumberThreeThousandNineHundredAndNinetyNine(){
        Assert.assertEquals("MMMCMXCIX", romanNumeral.convertNumberToRomanNumeral(3999));
    }


}
