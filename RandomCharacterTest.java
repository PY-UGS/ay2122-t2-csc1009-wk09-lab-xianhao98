package tutorial9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
public class RandomCharacterTest {
    RandomCharacter random;
    @BeforeEach
    void setUp(){
        random = new RandomCharacter();        
    }
    
    @org.junit.jupiter.api.Test
    public void getRandomLowerCaseLetter() {
        for (int i = 0; i < 15; i++){
            char letter = random.getRandomLowerCaseLetter();
            assertTrue(letter <= 'z' && letter >= 'a');
        }
    }

    @org.junit.jupiter.api.Test
    public void getRandomUpperCaseLetter() {
        for (int i = 0; i < 15; i++){
            char letter = random.getRandomUpperCaseLetter();
            assertTrue(letter <= 'Z' && letter >= 'A');
        }
    }

    @org.junit.jupiter.api.Test
    public void getRandomDigitCharacter() {
        for (int i = 0; i < 15; i++){
            int letter = random.getRandomDigitCharacter();
            assertTrue(letter <= 9 && letter >= 0);
        }
    }

    @org.junit.jupiter.api.Test
    public void getRandomCharacter(){
        for (int i = 0; i < 15; i++){
            char letter = random.getRandomCharacter();
            assertTrue(letter <= 125 && letter >= 33);
        }
    }

    @org.junit.jupiter.api.Test
    public void getRandomPrimeDigitCharacter() {
        for (int i = 0; i < 15; i++){
            int digit = random.getRandomPrimeNumber();
            assertTrue(random.isPrime(digit));

        }
    }

}

