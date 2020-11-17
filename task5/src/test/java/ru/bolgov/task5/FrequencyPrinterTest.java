package ru.bolgov.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class FrequencyPrinterTest {
    FrequencyPrinter printer = new FrequencyPrinter();

    @Test
    public void testFirstToStringRussian() {
        Map<Character, Integer> testMap = new HashMap<>();
        testMap.put('м', 1);
        testMap.put('о', 3);
        testMap.put('р', 1);
        testMap.put('з', 1);
        testMap.put(' ', 2);
        testMap.put('и', 1);
        testMap.put('с', 1);
        testMap.put('л', 1);
        testMap.put('н', 1);
        testMap.put('ц', 1);
        testMap.put('е', 1);

        assertEquals("\"р\" - 1\"\n" + "\" \" - 2\"\n" + "\"с\" - 1\"\n" + "\"е\" - 1\"\n" + "\"ц\" - 1\"\n"
                + "\"з\" - 1\"\n" + "\"и\" - 1\"\n" + "\"л\" - 1\"\n" + "\"м\" - 1\"\n" + "\"н\" - 1\"\n"
                + "\"о\" - 3\"\n" + "", printer.frequencyMapToString(testMap));
    }

    @Test
    public void testFirstToStringEnglish() {
        Map<Character, Integer> testMap = new HashMap<>();
        testMap.put('q', 1);
        testMap.put('w', 3);
        testMap.put('e', 1);
        testMap.put('r', 1);
        testMap.put('t', 2);
        testMap.put('y', 1);
        testMap.put(' ', 1);
        testMap.put('u', 1);

        assertEquals(
                "\" \" - 1\"\n" + "\"q\" - 1\"\n" + "\"r\" - 1\"\n" + "\"t\" - 2\"\n" + "\"e\" - 1\"\n"
                        + "\"u\" - 1\"\n" + "\"w\" - 3\"\n" + "\"y\" - 1\"\n" + "",
                printer.frequencyMapToString(testMap));
    }

    @Test
    public void testFirstToStringNumbers() {
        Map<Character, Integer> testMap = new HashMap<>();
        testMap.put('1', 1);
        testMap.put('2', 3);
        testMap.put('3', 1);
        testMap.put('4', 1);
        testMap.put('5', 2);
        testMap.put('6', 1);
        testMap.put(' ', 1);
        testMap.put('7', 1);

        assertEquals(
                "\" \" - 1\"\n" + "\"1\" - 1\"\n" + "\"2\" - 3\"\n" + "\"3\" - 1\"\n" + "\"4\" - 1\"\n"
                        + "\"5\" - 2\"\n" + "\"6\" - 1\"\n" + "\"7\" - 1\"\n" + "",
                printer.frequencyMapToString(testMap));
    }

}
