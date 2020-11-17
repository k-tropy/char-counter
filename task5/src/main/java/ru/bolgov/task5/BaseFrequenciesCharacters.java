 package ru.bolgov.task5;

import java.util.HashMap;
import java.util.Map;

public class BaseFrequenciesCharacters {
    private static BaseFrequenciesCharacters base;
    private final Map<String, CharacterFrequencyCounter> baseFrequencies;

    private BaseFrequenciesCharacters() {
        this.baseFrequencies = new HashMap<>();
    }

    public Map<String, CharacterFrequencyCounter> getBaseFrequencies() {
        return baseFrequencies;
    }

    public static BaseFrequenciesCharacters getBase() {
        if (base == null) {
            base = new BaseFrequenciesCharacters();
        }
        return base;
    }

    public Map<Character,Integer> getFrequencyMap(String s) {
        addIfNotInBase(s);
        return this.baseFrequencies.get(s).getFrequencyMap();
    }

    private void addIfNotInBase(String s) {
        if (!this.baseFrequencies.containsKey(s)) {
            CharacterFrequencyCounter counterFrequency = new CharacterFrequencyCounter();
            counterFrequency.countFrequency(s);
            this.baseFrequencies.put(s, counterFrequency);
        }
    }

}
