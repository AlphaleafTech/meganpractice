package practice;

import org.testng.annotations.Test;

/*
This class is for method practice
 */
public class MethodPracticeTest {
// message from megan
    @Test
    public void testCase() {
        String ret = isItHotOut(81);
        System.out.println(ret);

    }

    /**
     * I am going to give you a number, and if that number is divisible
     * by 7, then I just want you to print out "That is a lucky number!"
     *
     * @param number my input number
     */
    public void isLuckyNumber(int number) {

    }

    //
    public String isItHotOut(int temp) {
        if(temp >= 90) {
            return "You should wear lightly! its hot out there yo!";
        }
        else if(temp >= 80 && temp < 90) {
            return "You can just wear casually! Its nice out~!";
        }
        else {
            return"Put on a jacket, just in case!";
        }

    }
}
// the end of the class