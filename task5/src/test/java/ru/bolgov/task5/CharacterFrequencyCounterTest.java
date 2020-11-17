package ru.bolgov.task5;
 
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {

    @Test
    public void testContFrequencyRussian() {
        CharacterFrequencyCounter counterFrequency = new CharacterFrequencyCounter();
        String testPhrase = "мороз и солнце";
        Map<Character, Integer> expectedMap = new HashMap<>();
        expectedMap.put('м', 1);
        expectedMap.put('о', 3);
        expectedMap.put('р', 1);
        expectedMap.put('з', 1);
        expectedMap.put(' ', 2);
        expectedMap.put('и', 1);
        expectedMap.put('с', 1);
        expectedMap.put('л', 1);
        expectedMap.put('н', 1);
        expectedMap.put('ц', 1);
        expectedMap.put('е', 1);

        Map<Character, Integer> actualMap = counterFrequency.countFrequency(testPhrase);
        assertEquals(expectedMap, actualMap);

    }

    @Test
    public void testContFrequencyEnglish() {
        CharacterFrequencyCounter counterFrequency = new CharacterFrequencyCounter();
        String testPhrase = "qwerty qwerty qwerty a sd";
        Map<Character, Integer> expectedMap = new HashMap<>();
        expectedMap.put('q', 3);
        expectedMap.put('w', 3);
        expectedMap.put('e', 3);
        expectedMap.put('r', 3);
        expectedMap.put('t', 3);
        expectedMap.put('y', 3);
        expectedMap.put(' ', 4);
        expectedMap.put('a', 1);
        expectedMap.put('s', 1);
        expectedMap.put('d', 1);

        Map<Character, Integer> actualMap = counterFrequency.countFrequency(testPhrase);
        assertEquals(expectedMap, actualMap);

    }

    @Test
    public void testContFrequencyNumbers() {
        CharacterFrequencyCounter counterFrequency = new CharacterFrequencyCounter();
        String testPhrase = "123 123 123 4 56";
        Map<Character, Integer> expectedMap = new HashMap<>();
        expectedMap.put('1', 3);
        expectedMap.put('2', 3);
        expectedMap.put('3', 3);
        expectedMap.put(' ', 4);
        expectedMap.put('4', 1);
        expectedMap.put('5', 1);
        expectedMap.put('6', 1);

        Map<Character, Integer> actualMap = counterFrequency.countFrequency(testPhrase);
        assertEquals(expectedMap, actualMap);

    }

}
