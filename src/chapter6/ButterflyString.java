package chapter6;

import static org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversions.toUpperCase;

public class ButterflyString {

    public String butterflySring(String butterfly) {
        
        return butterfly;
    }

    public String checkFirstLetters(String butterfly) {
    String   name =  butterfly.substring(0, 1).toUpperCase() + butterfly.substring(1);
    return name;

    }
}
