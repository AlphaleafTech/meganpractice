package practice;

import org.testng.annotations.Test;

public class MeganMethodPracticeTwo {

    @Test
    public void testCase() {

    }


    public boolean isTheNumber10(int number) {
        if (number == 10){
            return true;
        }
         else return false;
    }


    /**
     * I am going to give you a two number
     *    height -> height of the triangle
     *    base   -> base length of the triangle
     *
     *  area = (height * base)/2
     */
    public int areaOfTriangle(int height, int base) {
        int num = height * base;
        return num / 2;

    }
}
