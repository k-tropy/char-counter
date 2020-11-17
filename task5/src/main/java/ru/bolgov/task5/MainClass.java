package ru.bolgov.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) throws IOException {

        while (true) {
            BaseFrequenciesCharacters base = BaseFrequenciesCharacters.getBase();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();

            Map<Character, Integer> frequencyMap = base.getFrequencyMap(s);
            FrequencyPrinter printer = new FrequencyPrinter();

            System.out.println(printer.frequencyMapToString(frequencyMap));
        }
    }

}