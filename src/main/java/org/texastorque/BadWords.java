package org.texastorque;

import java.io.*;
import java.net.*;

public class BadWords {
    private static String[] words = {};

    private static String badWordsUrl = 
        "https://raw.githubusercontent.com/RobertJGabriel/Google-profanity-words/master/list.txt";

    private static String getHTML(String surl) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(surl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
            for (String line; (line = reader.readLine()) != null; ) {
                result.append(line);
            }
        }
        return result.toString();
    }

    public BadWords() {
		try {
        	words = getHTML(badWordsUrl).split(" ");
		} catch (Exception e) {
            System.out.printf("[ERROR] - Could not retrieve bad words from interwebs!\n");
		}
    }

    public String[] getWordsArray() {
        if (words.length == 0)
            System.out.printf("[WARNING] - Bad words array is null!\n");
        return words;
    }
}