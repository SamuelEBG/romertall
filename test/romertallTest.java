
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class romertallTest {

    @Test
    void test(){
        assertEquals("MDCCLXVII", toRoman(1767));
    }

    @Test
    void testNumberFour(){
        assertEquals("IV",toRoman(4));
    }


    @Test
    void testNumberNine(){
        assertEquals("XI",toRoman(9));
    }

    @Test
    void testNumberNineteen(){
        assertEquals("XIX",toRoman(19));
    }

    @Test
    void testNumber40(){
        assertEquals("XL",toRoman(40));
    }

    @Test
    void testNumber49(){
        assertEquals("IL",toRoman(49));
    }

    @Test
    void testNumber1999(){
        assertEquals("MCMXCIX",toRoman(1999));
    }

    @Test
    void testNegativeNumber(){
        assertEquals("Not a Roman number!", toRoman(-1));
        assertEquals("Not a Roman number!", toRoman(-9999));
    }

    @Test
    void testNumberZero(){
        assertEquals("Not a Roman number!", toRoman(0));
        assertEquals("Not a Roman number!", toRoman(0000));
    }

    private String toRoman(int number) {


        if((number == 0) || (number < 0)){
            return "Not a Roman number!";
        }

        int num = number;
        String result = "";

        do {



            if (num == 4){
                num -= 4;
                result += "IV";
            }

            if (num == 9){
                num -= 9;
                result += "IX";
            }

            if (num == 40){
                num -= 40;
                result += "XL";
            }


            if(num < 5 && num >0 ){
                num -= 1;
                result += "I";
            }

            if(num < 10 && num >= 5){
                num -= 5;
                result += "V";
            }

            if(num < 50 && num >= 10){
                num -= 10;
                result += "X";
            }

            if(num < 100 && num >=50){
                num -= 50;
                result += "L";
            }


            if(num < 500 && num >= 100){
                num -= 100;
                result += "C";
            }

            if (num < 1000 && num >= 500){
                num -= 500;
                result += "D";

            }

            if (num >= 1000) {
                num -= 1000;
                result += "M";
            }

        } while (num > 0);

        return result;
    }
}
