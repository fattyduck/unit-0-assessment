package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
      printHelloWorld();
        bonusPrintOutSumOfFirstTenFibonacciNumbers();
        bonusPrintOutSumOfFirstFortyFibonacciNumbers();
    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static Object returnPrimitiveBooleanTrue() {
        return true;
    }

    public static Object returnPrimitiveInt1729() {
      return 1729;
    }

    public static Object returnPrimitiveDoubleThreePointOneFour() {
      return 3.14;
    }

    public static Object returnPrimitiveCharZ() {
        return 'Z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int x=0;
        for(int i=1;i<10;i++){
            x+=i;
        }
        System.out.println(x);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int x=0;
        for(int i=1;i<10000;i++){
            x+=i;
        }
        System.out.println(x);
    }

    public static boolean isOdd(int n) {
        boolean isOdd=false;
        if(n%2!=0){
            isOdd=true;
        }
        return false;
    }

    public static boolean isMultipleOfThree(int n) {

        Boolean isMultipleOfThree= false;
        if(n%3==0){
            isMultipleOfThree=true;
        }
        return isMultipleOfThree;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {

        boolean b= false;
        if(n%2!=0&&n%3==0){
            b=true;
        }
        return b;
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        String re ="";
        if(times>0)
        {
            for(int i = 0; i < times; i++)
            {
                re+=input;
            }
        }else {
            re+="Why bother using repeat if you want to repeat 0 times?";
        }

        return re;
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        int q = input.indexOf('q');
        String sub = input.substring(0, q);
        return sub;
    }

    public static Person declareAndReturnPersonNamedAda() {

        Person Ada= new Person("Ada");
        return Ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon()
    {
      Person AlanTuring=new Person("AlanTuring");
        AlanTuring.setCity("London");
        return AlanTuring;
    }

    public static boolean isFromLondon(Person person) {

        boolean b = false;
        if(person.getCity().equalsIgnoreCase("london")){
            b=true;
        }
        return b;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        ArrayList<Place> place=new ArrayList<Place>();
        Place london = new Place("London");
        Place paris = new Place("Paris");
        Place princeton = new Place("Princeton");
        place.add(london);
        place.add(paris);
        place.add(princeton);

        return place;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
      HashMap<String,Person> map = new HashMap<String, Person>();
        Person AlanTuring= new Person("Alan Turing");
        Person GraceHopper= new Person("Grace Hopper");
        map.put(AlanTuring.getName(),AlanTuring);
        map.put(GraceHopper.getName(),GraceHopper);
        return map;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
        people.get("Alan Turing").setCity("Princeton");
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {
       int total=0;
        for(int i=0; i<10;i++){
            total+=fibonacci(i);
        }
        System.out.println(total);
    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {
        int total=0;
        for(int i=0; i<40;i++){
            total+=fibonacci(i);
        }
        System.out.println(total);

    }
    public static int fibonacci(int num){
        int a=0;
        int b=1;
        for(int i=0; i<num;i++){

            int c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
}
