package practice;

import org.testng.annotations.Test;

public class MeganMethodPracticeTwo {

    @Test
    public void testCase() {

    }


    /**
     * if the input room number is equal to
     * 4 or 13 or 17  --> "DO NOT USE THIS NUMBER"
     * otherwise just return "YOU CAN USE THIS NUMBER"
     */
    public String detectRoomNumber(int roomNum) {

        return "";
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
