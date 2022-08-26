package practice;

import org.testng.annotations.Test;

/*
This class is for method practice
 */
public class MethodPracticeTest {
// message from megan
    @Test
    public void testCase() {
//        String ret = isItHotOut(81);
//        System.out.println(ret);

        int[] numDatabase = getNumData();

        for(int i = 0; i < numDatabase.length; i++) {
            int each = numDatabase[i];
            isLuckyNumber(each);
        }

    }

    /**
     * I am going to give you a number, and if that number is divisible
     * by 7, then I just want you to print out "That is a lucky number!"
     *
     * @param number my input number
     */
    public void isLuckyNumber(int number) {
        int result = number % 7;
        if(result ==0 ) {
            System.out.println("\t" +number + "\tis a lucky number!!");
        }
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

    public int[] getNumData() {
        int[] temp = new int[10_000];
        for(int i =0; i < temp.length; i++) {
            int rand = (int)(Math.random() * 9999) + 1;
            temp[i] = rand;
        }
        return temp;
    }
}
// the end of the class