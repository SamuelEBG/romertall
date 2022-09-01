
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class romertallTest {

    @Test
    void test(){
        assertEquals("MDCCL", toRoman(1750));
    }

    private String toRoman(int number) {

        int num = number;
        String result = "";

        do {

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
