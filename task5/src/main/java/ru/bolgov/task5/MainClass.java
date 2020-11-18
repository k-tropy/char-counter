package ru.bolgov.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) throws IOException {
        boolean exit = false;
        while (!exit) {
            System.out.println("Please type in a string or type 'exit' to exit");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            if("exit".equals(s)) {
                exit = true;
                continue;
            }
            
            BaseFrequenciesCharacters base = BaseFrequenciesCharacters.getBase();
            Map<Character, Integer> frequencyMap = base.getFrequencyMap(s);
            FrequencyPrinter printer = new FrequencyPrinter();

            System.out.println(printer.frequencyMapToString(frequencyMap));
        }
    }

}