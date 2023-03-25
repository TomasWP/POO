package aula06;
import java.util.Arrays;

public class Conjunto {
    private int[] elementos;
    private int tamanho;

    public Conjunto() {
        elementos = new int[10];
        tamanho = 0;
    }

    public void insert(int n) {
        if (!contains(n)) {
            if (tamanho == elementos.length) {
                elementos = Arrays.copyOf(elementos, elementos.length * 2);
            }
            elementos[tamanho] = n;
            tamanho++;
        }
    }

    public boolean contains(int n) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == n) {
                return true;
            }
        }
        return false;
    }

    public void remove(int n) {
        int i = 0;
        while (i < tamanho && elementos[i] != n) {
            i++;
        }
        if (i < tamanho) {
            for (int j = i; j < tamanho - 1; j++) {
                elementos[j] = elementos[j + 1];
            }
            tamanho--;
        }
    }

    public void empty() {
        elementos = new int[10];
        tamanho = 0;
    }

    public String toString() {
        if (tamanho == 0) {
            return "{}";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (int i = 0; i < tamanho - 1; i++) {
                sb.append(elementos[i]).append(", ");
            }
            sb.append(elementos[tamanho - 1]).append("}");
            return sb.toString();
        }
    }

    public int size() {
        return tamanho;
    }

    public Conjunto combine(Conjunto add) {
        Conjunto result = new Conjunto();
        for (int i = 0; i < tamanho; i++) {
            result.insert(elementos[i]);
        }
        for (int i = 0; i < add.tamanho; i++) {
            result.insert(add.elementos[i]);
        }
        return result;
    }

    public Conjunto subtract(Conjunto dif) {
        Conjunto result = new Conjunto();
        for (int i = 0; i < tamanho; i++) {
            if (!dif.contains(elementos[i])) {
                result.insert(elementos[i]);
            }
        }
        return result;
    }

    public Conjunto intersect(Conjunto inter) {
        Conjunto result = new Conjunto();
        for (int i = 0; i < tamanho; i++) {
            if (inter.contains(elementos[i])) {
                result.insert(elementos[i]);
            }
        }
        return result;
    }
}
