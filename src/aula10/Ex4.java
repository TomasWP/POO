package aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("words.txt"));
        Set<String> words = new HashSet<String>();
        Set<String> words_end_s = new HashSet<String>();
        while (input.hasNext()) {
            String word = input.next();
            if(!word.matches(".*\\d+.*")){
                word = word.replaceAll("[^a-zA-Z0-9]", "");
                if (word.length() > 2) {
                    words.add(word);
                    if(word.charAt(word.length() - 1) == 's'){
                        words_end_s.add(word);
                    }
                }
            }
        }
        System.out.println(words);
        System.out.println(words_end_s);
        System.out.println("Número de palavras que acabam com s: "+words_end_s.size());
        System.out.println("Número de palavras: "+words.size());
    }
}
