package aula12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new HashSet<String>();
        Scanner input = new Scanner(new FileReader("major2.txt"));
        int n = 0;
        while (input.hasNext()) {
            String word = input.next();
            if(word.length()>2){
                word = word.replaceAll("[\\t\\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"']", " ");
                words.add(word);
                n++;
            }
        }
        System.out.println("Número Total de Palavras: "+n);
        System.out.println("Número de Diferentes Palavras: "+words.size());
    }
}
