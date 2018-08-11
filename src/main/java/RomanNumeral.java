public class RomanNumeral {


    private String romanNumeral;

    public RomanNumeral(){

    }
    public String convertNumberToRomanNumeral(int number){

        this.romanNumeral = "" ;

        if (number > 0  && number < 3999) {

//        while(number>=1000){
//            romanNumeral += "M";
//            number-=1000;
//        }
//
//        while(number>=900){
//            romanNumeral += "CM";
//            number-=900;
//        }
//
//        while(number>=500){
//            romanNumeral += "D";
//            number-=500;
//        }
//


        number = convertFourHandred(number);
        number = convertHandred(number);
        number = convertNinety(number);
        number = convertFifty(number);
        number = convertForty(number);
        number = convertTen(number);
        number = convertNine(number);
        number = convertFive(number);
        number = convertFour(number);
        convertOneToThree(number);

        }else{
            romanNumeral ="Not Defined";
        }

        return romanNumeral;
    }

    public int convertOneToThree(int number){
        while (number >= 1) {
            this.romanNumeral += "I";
            number -= 1;
        }
        return number;
    }

    public int convertFour(int number){
        while(number >=4){
            this.romanNumeral += "IV";
            number -=4;
        }
        return number;
    }

    public int convertFive(int number){
        while(number >=5){
            this.romanNumeral += "V";
            number -=5;
        }
        return number;
    }

    public int convertNine(int number){
        while(number >=9){
            this.romanNumeral += "IX";
            number -=9;
        }
        return number;
    }

    public int convertTen(int number){
        while(number >=10){
            this.romanNumeral += "X";
            number -=10;
        }
        return number;
    }

    public int convertForty(int number){
        while(number >=40){
            this.romanNumeral += "XL";
            number -=40;
        }
        return number;
    }

    public int convertFifty(int number){
        while(number >=50){
            this.romanNumeral += "L";
            number -=50;
        }
        return number;
    }

    public int convertNinety(int number){
        while(number >=90){
            this.romanNumeral += "XC";
            number -=90;
        }
        return number;
    }


    public int convertHandred(int number){
        while(number >=100){
            this.romanNumeral += "C";
            number -=100;
        }
        return number;
    }


    public int convertFourHandred(int number){
        while(number >=400){
            this.romanNumeral += "CD";
            number -=400;
        }
        return number;
    }




}

