package it.develhope.booleanOperators3;

public class Start {

    public static void main(String[] args) {

        int x = 3;
        int y = 2;

        System.out.println(!(!(!(false ^ false) || (true && true)))); //it should be true
        System.out.println(!((x * y) <= 6) && (x - y != 1)); //it should be false

    }
}
