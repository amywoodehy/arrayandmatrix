package tk.langley;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

interface MyArray{
    int[] getArr();
    int getLength();
    MyArray readFromFile(String filename);
    MyArray readFromStdIn();
    String toString();
    MyArray reverseArray();
    MyArray sorted();
    int max();
    int min();
    int sum();
    double average();
    boolean isFiboSequence();
}


public class My1dArray extends ArrayLogic implements MyArray{
    public My1dArray(int[] array) {
        super(array);
    }

    public My1dArray() {
    }

    public My1dArray reverseArray() {
        int[] a = new int[this.length];
        for(int i=0; i < this.length; i++) {
            a[i] = this.arr[this.length - i - 1];
        }
        return new My1dArray(a);
    }

    public My1dArray sorted() {
        // implementing bubble algorithm
        int[]a = this.arr.clone();
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i = 1; i < a.length; i++)
                if(a[i-1] > a[i]) {
                    int tmp = a[i-1]; a[i-1] = a[i]; a[i] = tmp;
                    flag = true;
                }
        }
        return new My1dArray(a);
    }

    @Override
    public My1dArray readFromFile(String filename){
        // ETO PI3DEC KAKOI-TO
        Scanner scan = null;
        try {
            scan = new Scanner(new File("input.txt"));
        } catch(Exception e) {
            System.err.println("Failed to open a file");
            return null;
        }
        List<Integer> array = new ArrayList<>();
        try {
            while (scan.hasNext()) {
                array.add(this.readInt(scan));
            }
        } catch(NullPointerException e) {
            System.err.println("null pointer exception?");
        }
        int[] a = new int[array.size()];
        for(int i = 0; i<a.length; i++) {
            a[i] = array.get(i);
        }
        return new My1dArray(a);
    }

    @Override
    public My1dArray readFromStdIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину матрицы:");
        int l = scanner.nextInt();
        System.out.println("Введите элементы матрицы:");
        int[] array = new int[l]; // создаем массив с размером l
        for(int j=0; j<l;j++){
            array[j] = this.readInt(scanner);  // введеное числе сохраняем в ячейке j массива
        }
        return new My1dArray(array);
    }

    private int readInt(Scanner s) {
        String str = s.next();
        while(true) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.err.println("Passed " + str);
                System.err.println("Hey check what you type and try again");
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.arr);
    }
}
