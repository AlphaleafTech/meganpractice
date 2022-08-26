package practice;

import org.testng.annotations.Test;

/*
This class is for method practice
 */
public class MethodPracticeTest {
// message from megan
    @Test
    public void testCase() {

    }

    public String isItHotOut(int temp) {
        if(temp >= 90) {
            return "You should wear lightly! its hot out there yo!";
        }
        else if(temp < 90 && temp >= 80) {
            return "You can just wear casually! Its nice out~!";
        }
        else {
            return "Put on a jacket, just in case!";
        }
    }
}
// the end of the class