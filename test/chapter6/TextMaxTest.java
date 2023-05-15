package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextMaxTest {
TextMax text;
    @BeforeEach
    void setUp() {text = new TextMax();}

    @Test
    public void testForMaximumNumbers(){
      assertEquals(56,text.maximumNumbers(23,56));
    }

    }

