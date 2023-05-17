package aula12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<Character,ArrayList<String>> words = new TreeMap<Character,ArrayList<String>>();
        Scanner input = new Scanner(new FileReader("A_cidade_e_as_serras.txt"));
        ArrayList<String> list;
        while (input.hasNext()) {
            Boolean contains = false;
            int index = 0, count = 0;
            String word = input.next().trim().toLowerCase();
            word = word.replaceAll("[^a-zA-Z]", "");
            if(word.length()>2){
                char first_char = word.charAt(0);
                if(!words.containsKey(first_char)){
                    list = new ArrayList<String>();
                    list.add(word+", 1");
                    words.put(first_char,list);
                }else{
                    for(String word_in_list : words.get(first_char)){
                        String[] split = word_in_list.split(", ");
                        if(word.equals(split[0])){
                            contains = true;
                            count = Integer.parseInt(split[1]);
                            index = words.get(first_char).indexOf(word_in_list);
                            break;
                        }
                    }
                    if(contains){
                        words.get(first_char).remove(index);
                        words.get(first_char).add(word+", "+(count+1));
                    }else{
                        words.get(first_char).add(word+", "+1);
                    }
                }
            }
        }
        for (Map.Entry<Character, ArrayList<String>> entry : words.entrySet()) {
            int n = 0;
            for(String word : entry.getValue()){
                if(entry.getValue().size() == 1){
                    System.out.println(entry.getKey() + ": " + word);
                }else if(entry.getValue().indexOf(word) == entry.getValue().size()-1){
                    System.out.println("; " + word+".");
                }else{
                    if(n == 0){
                        System.out.print(entry.getKey() + ": " + word);
                        n++;
                    }else{
                        System.out.print("; " + word);
                    }
                }
            }
        }
    }
}
