package tk.langley;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        MyArray m = new My1dArray();
        if(args.length > 0)
            m.readFromFile(args[0]); // k. lest assume you use it right
        else
            m = m.readFromStdIn(); // lol wut
        print(m);
        print(m.reverseArray());
        print(m.sorted());
        print("max=" + m.max());
        print("min=" + m.min());
        print("sum=" + m.sum());
        print("average=" + m.average());
        print("is Fibo: " + m.isFiboSequence());
    }

    public static void print(Object o) {
        // долго писать
        System.out.println(o);
    }
}
