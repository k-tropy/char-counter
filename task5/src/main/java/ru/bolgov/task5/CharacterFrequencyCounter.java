package ru.bolgov.task5;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {
    private final Map<Character, Integer> frequencyMap;

    public CharacterFrequencyCounter() {
        this.frequencyMap = new HashMap<>();
    }

    public Map<Character, Integer> getFrequencyMap() {
        return frequencyMap;
    }

    public Map<Character, Integer> countFrequency(String s) {
        
        char[] arrayChars = s.toCharArray();
        
        for (char key:arrayChars) {
            int value = this.frequencyMap.getOrDefault(key, 0) + 1;
            this.frequencyMap.put(key, value);  
        }
        
        return this.getFrequencyMap();
       

    }

}


