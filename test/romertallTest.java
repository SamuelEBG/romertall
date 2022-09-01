
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class romertallTest {

    @Test
    void test(){
        assertEquals("MD", toRoman(1500));
    }

    private String toRoman(int number) {

        int num = number;
        String result = "";

        do {
            if (num < 1000 && num >= 500){
                num -= 500;
                result += "D";

            }

            if (num >= 1000) {
                num -= 1000;
                result += "M";
            }

        } while (num > 0);

        {

            return result;
        }
    }
}
