package com.nbicocchi.exercises.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountCommedia {
    public static Map<String, Integer> toMap(List<String> l) {
        Map<String, Integer> map = new HashMap<>();
        for (String s: l) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }

    /**
     * Trasforma una lista di righe in una lista di singole parole
     * @param lines lista di righe del libro
     * @return lista di parole
     */
    public static List<String> extractWords(List<String> lines) {
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            // Divido la riga in parole usando regex per separare su spazi e punteggiatura
            String[] split = line.split("\\W+"); // \W+ = tutto ciò che non è lettera/numeri
            // Aggiungo solo parole non vuote
            for (String word : split) {
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
        }

        return words;
    }

    public static List<String> read() throws IOException {
        InputStream is = WordCountCommedia.class
                .getClassLoader()
                .getResourceAsStream("commedia.txt");

        if (is == null) {
            throw new IllegalArgumentException("File non trovato!");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        List<String> lines = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        return lines;

    }

    public static List<Map.Entry<String, Integer>> topNFrequentPairs(Map<String, Integer> counts, int n) {
        return counts.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // ordina decrescente
                .limit(n)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        List<String> l = new ArrayList<>();
        l.add("nicola");
        l.add("giulia");
        l.add("tre");
        l.add("tre");
        List<String> lines = read();
        System.out.println(topNFrequentPairs(toMap(extractWords(lines)), 100));
    }
}
