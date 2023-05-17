package aula11;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("major2.txt"));
        HashMap<String, HashSet<String>> words = new HashMap<>();
        while (input.hasNext()) {
            String word = input.next();
            if(word.length()>2){
                word = word.replaceAll("[\\t\\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"']", " ");
                if(!words.containsKey(word)){
                    words.put(word, new HashSet<String>());
                    words.get(word).add(input.next()+"=1");
                }else{
                    for (String valor : words.get(word)) {
                        String next_word = input.next().replaceAll("[\\t\\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"']", "");
                        if(next_word.length()>3){
                            next_word = "";
                        }
                        if(valor.contains(next_word)){
                            String[] tokens = valor.split("=");
                            int num = Integer.parseInt(tokens[1]);
                            num++;
                            words.get(word).add(tokens[0]+"="+num);
                        }
                    }
                }
            }
        }
        for (Map.Entry<String, HashSet<String>> entry : words.entrySet()) {
            String chave = entry.getKey();
            HashSet<String> valor = entry.getValue();
            System.out.println(chave + " = " + valor);
        }
    }
}
