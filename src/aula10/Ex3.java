package aula10;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Ex3 {

    public static void main(String[] args) {
        String frase = "Hello World";
        Map<String, ArrayList<Integer>> mapa = new HashMap<>();
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            String string = String.valueOf(c);
            if (!mapa.containsKey(string)) {
                if(string.equals(" ")){
                    string = ("\" \"");
                }
                mapa.put(string, new ArrayList<Integer>());
            }
            mapa.get(string).add(i);
        }
        
        System.out.println(mapa);
    }

}
