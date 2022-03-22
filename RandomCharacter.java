package tutorial9;
import java.util.*;
public class RandomCharacter {
    static Random random = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many character to generate from each method:");
        int ans = sc.nextInt();
        char[] lowercase = new char[ans];
        char[] uppercase = new char[ans];
        int[] digit = new int[ans];
        char[] randchar = new char[ans];
        int[] primedigit = new int[ans];
        for(int i = 0; i<ans; i++){
            lowercase[i] = getRandomLowerCaseLetter();
            uppercase[i] = getRandomUpperCaseLetter();
            digit[i] = getRandomDigitCharacter();
            randchar[i] = getRandomCharacter();
            primedigit[i] = getRandomPrimeNumber();
        }
        System.out.print("\nGenerated Random lower case Character: ");
        for(int i = 0; i<ans; i++){
            System.out.print(lowercase[i] + ", ");
        }
        System.out.print("\nGenerated Random upper case Character: ");
        for(int i = 0; i<ans; i++){
            System.out.print(uppercase[i] + ", ");
        }
        System.out.print("\nGenerated Random Digit: ");
        for(int i = 0; i<ans; i++){
            System.out.print(digit[i] + ", ");
        }
        System.out.print("\nGenerated Random Character: ");
        for(int i = 0; i<ans; i++){
            System.out.print(randchar[i] + ", ");
        }
        System.out.print("\nGenerated Random prime number: ");
        for(int i = 0; i<ans; i++){
            System.out.print(primedigit[i] + ", ");
        }
    }

    public static char getRandomLowerCaseLetter(){
        random = new Random();
        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        return randomizedCharacter;
    }

    public static char getRandomUpperCaseLetter(){
        random = new Random();
        char randomizedCharacter = (char) (random.nextInt(26) + 'A');
        return randomizedCharacter;
    }

    public static int getRandomDigitCharacter(){
        random = new Random();
        int rand_int = random.nextInt(10);     
        return rand_int;
    }

    public static char getRandomCharacter(){
        int range = 125 - 33 + 1;
        return (char)((Math.random()  * range) + 33);
    }

    public static int getRandomPrimeNumber(){
        random = new Random();
        int prime_num = random.nextInt(100) + 1;
        while (!isPrime(prime_num)) {          
            prime_num = random.nextInt(100) + 1;
        }
        return prime_num;
    }

    public static boolean isPrime(int inputNum){
        if (inputNum <= 3 || inputNum % 2 == 0) 
            return inputNum == 2 || inputNum == 3; //this returns false if number is <=1 & true if number = 2 or 3
        int divisor = 3;
        while ((divisor <= Math.sqrt(inputNum)) && (inputNum % divisor != 0)) 
            divisor += 2; //iterates through all possible divisors
        return inputNum % divisor != 0; //returns true/false
    }
}
