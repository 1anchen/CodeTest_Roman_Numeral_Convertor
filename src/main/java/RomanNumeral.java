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
//        while(number>=400){
//            romanNumeral += "CD";
//            number-=400;
//        }
//
//        while(number>=100){
//            romanNumeral += "C";
//            number-=100;
//        }
//
//        while(number>=90){
//            romanNumeral += "XC";
//            number-=90;
//        }
//
//        while(number>=50){
//            romanNumeral += "L";
//            number-=50;
//        }

//
//
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






}

