package org.texastorque;

import java.io.File;
import java.util.Scanner;

/**
 * Handles credential token
 *
 * @author Justus
 */
public class Token {
    private String token;

    /**
     * Load token from file to field
     * 
     * @param path The path to the file
     */
    public Token(String path) {
        try {
            File file = new File(path);
            try {
                Scanner scanner = new Scanner(file);
                token = scanner.nextLine();
                scanner.close();
            } catch (Exception scannerError) {
                System.out.printf("[ERROR] - Token file could not be read!\n");
            }
        } catch (Exception fileError) {
            System.out.printf("[ERROR] - Token file not found!\n");
        }
    }

    /**
     * Read token field
     *
     * @throws Exception Token field is null
     * @return token
     */
    public String getToken() {
        if (token == null)
            System.out.printf("[ERROR] - Token field is null!\n");
        return token;
    }
}

/*_*/   // Fred