package aula09;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionTester {
    public static void main(String[] args) {
        int DIM []= {1000, 5000, 10000, 20000, 40000, 100000};
        Collection<Integer> col_arraylist = new ArrayList<>();
        Collection<Integer> col_linkedlist = new LinkedList<>();
        Collection<Integer> col_arraydeque = new ArrayDeque<>();
        Collection<Integer> col_hashset = new HashSet<Integer>();
        Collection <Integer> col_linkedhashset = new LinkedHashSet<Integer>();
        Collection<Integer> col_treeset = new TreeSet<Integer>();
        printTabela(true, DIM, "ArrayList", col_arraylist);
        printTabela(false, DIM, "LinkedList", col_linkedlist);
        printTabela(false, DIM, "ArrayDeque", col_arraydeque);
        printTabela(false, DIM, "HashSet", col_hashset);
        printTabela(false, DIM, "LinkedHashSet", col_linkedhashset);
        printTabela(false, DIM, "TreeSet", col_treeset);
    }

    private static void printTabela (boolean printTitle, int DIM[], String tipo, Collection<Integer> col) {

        DecimalFormat df = new DecimalFormat("#0.0");
        df.setRoundingMode(RoundingMode.HALF_UP);
        StringBuilder output = new StringBuilder();
        if(printTitle){
            output.append(String.format("%4s %9s %8s %8s %8s %8s %8s\n","Collection",DIM[0],DIM[1],DIM[2],DIM[3],DIM[4],DIM[5]));
        }
        for (int i = 1; i <= 4; i++) {
            switch(i){
                case 1:
                    output.append(tipo+"\n");
                    break;
                case 2:
                    output.append(String.format("%3s %15s %8s %8s %8s %8s %8s\n","add",df.format(checkPerformance(col, DIM[0])[0]),df.format(checkPerformance(col, DIM[1])[0]),df.format(checkPerformance(col, DIM[2])[0]),df.format(checkPerformance(col, DIM[3])[0]),df.format(checkPerformance(col, DIM[4])[0]),df.format(checkPerformance(col, DIM[5])[0])));
                    break;
                case 3:
                    output.append(String.format("%4s %12s %8s %8s %8s %8s %8s\n","search",df.format(checkPerformance(col, DIM[0])[1]),df.format(checkPerformance(col, DIM[1])[1]),df.format(checkPerformance(col, DIM[2])[1]),df.format(checkPerformance(col, DIM[3])[1]),df.format(checkPerformance(col, DIM[4])[1]),df.format(checkPerformance(col, DIM[5])[1])));
                    break;
                case 4:
                    output.append(String.format("%4s %12s %8s %8s %8s %8s %8s","remove",df.format(checkPerformance(col, DIM[0])[2]),df.format(checkPerformance(col, DIM[1])[2]),df.format(checkPerformance(col, DIM[2])[2]),df.format(checkPerformance(col, DIM[3])[2]),df.format(checkPerformance(col, DIM[4])[2]),df.format(checkPerformance(col, DIM[5])[2])));
                    break;
            }
        }
        System.out.println(output.toString());
    }

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, delta1, delta2, delta3, deltas[] = new double[3];
        // Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
        col.add( i );
        stop = System.nanoTime(); // clock snapshot after
        delta1 = (stop-start)/1e6; // convert to milliseconds
        // Search
        start = System.nanoTime(); // clock snapshot before
        stop = System.nanoTime(); // clock snapshot after
        delta2 = (stop-start)/1e6; // convert nanoseconds to milliseconds
        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
        iterator.next();
        iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta3 = (stop-start)/1e6; // convert nanoseconds to milliseconds
        deltas[0] = delta1;
        deltas[1] = delta2;
        deltas[2] = delta3;

        return deltas;
    }
}

