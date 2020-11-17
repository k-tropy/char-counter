package ru.bolgov.task5;

import java.util.Map;

public class FrequencyPrinter {

    public String frequencyMapToString(Map<Character, Integer> frequencies) {
        StringBuilder result = new StringBuilder();
        frequencies.forEach((key, value) -> result.append("\"" + key.toString() + "\" - " + value + "\"\n"));
        return result.toString();
    }

}
