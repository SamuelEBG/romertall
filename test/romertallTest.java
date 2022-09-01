
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class romertallTest {

    @Test
    void test(){
        assertEquals("MDCCLXVII", toRoman(1767));
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

            if(num < 5){
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
