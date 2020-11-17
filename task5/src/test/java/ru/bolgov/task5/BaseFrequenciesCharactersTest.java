package ru.bolgov.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class BaseFrequenciesCharactersTest {

    BaseFrequenciesCharacters base = BaseFrequenciesCharacters.getBase();

    @Test
    public void testSameObjectForSameKeywords() {
        Map<Character, Integer> expectedObject = base.getFrequencyMap("мороз и солнце");
        Map<Character, Integer> actualMapobject = base.getFrequencyMap("мороз и солнце");

        if (expectedObject != actualMapobject) {
            fail("Returned a new object for the same phrase");
        }
    }

    @Test
    public void testDifferentObjectForDifferentPhrases() {
        Map<Character, Integer> expectedObject = base.getFrequencyMap("мороз и солнце");
        Map<Character, Integer> actualMapobject = base.getFrequencyMap("день чудесный");

        if (expectedObject == actualMapobject) {
            fail("Returned the same object for a new phrase");
        }
    }
}
