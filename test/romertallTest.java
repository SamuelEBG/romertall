
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
    void testNumberSix(){
        assertEquals("IX", toRoman(9));
    }

    @Test
    void trettioatta(){
        assertEquals("XXXVIII", toRoman(38));
    }

    @Test
    void test789(){
        assertEquals("DCCLXXXIX", toRoman(789));
    }

    @Test
    void test2421(){
        assertEquals("MMCDXXI", toRoman(2421));
    }

    @Test
    void testNumber19(){
        assertEquals("XIX", toRoman(19));
    }

    @Test
    void test246(){
        assertEquals("CCXLVI", toRoman(246));
    }

    @Test
    void test93(){
        assertEquals("XCIII", toRoman(93));
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
        StringBuilder result = new StringBuilder();

        do {

            if(num < 5){
                if (num == 4){
                    num -= 4;
                    result.append("IV");

                } else{
                    num -= 1;
                    result.append("I");
                }
            }

            if(num < 10 && num >= 5){
                if(num == 9){
                    num -= 9;
                    result.append("IX");
                } else{
                    num -= 5;
                    result.append("V");
                }
            }

            if(num < 50 && num >= 10){

                if(num >= 40){
                    num -= 40;
                    result.append("XL");
                } else{
                    num -= 10;
                    result.append("X");
                }
            }

            if(num < 100 && num >= 50){
                if(num >= 90){
                    num -= 90;
                    result.append("XC");
                } else{
                    num -= 50;
                    result.append("L");
                }
            }

            if(num < 500 && num >= 100){
                if(num >= 400){
                    num -= 400;
                    result.append("CD");
                } else{
                    num -= 100;
                    result.append("C");
                }
            }

            if (num < 1000 && num >= 500){
                if(num >= 900){
                    num -= 900;
                    result.append("CM");
                }
                num -= 500;
                result.append("D");
            }

            if (num >= 1000) {
                num -= 1000;
                result.append("M");
            }

        } while (num > 0);

        return result.toString();
    }
}
