package tk.langley;


public abstract class ArrayLogic {

    int length;
    int[] arr;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public ArrayLogic(int[] arr){
        this.arr = arr.clone();
        this.length = arr.length;
    }

    public ArrayLogic() {
    }

    public int max() {
        int m = this.arr[0];
        for(int i=0; i<this.length; i++)
            if(this.arr[i]>m)
                m = this.arr[i];
        return m;
    }

    public int min() {
        int m = this.arr[0];
        for(int i=0; i<this.length; i++)
            if(this.arr[i]<m)
                m = this.arr[i];
        return m;
    }

    public int sum() {
        int sum = 0;
        for(int i=0; i<this.length; i++)
            sum += this.arr[i];
        return sum;
    }

    public double average() {
        return this.sum()/this.length;
    }

    public boolean isFiboSequence() {
        // считаем, что последовательность является фибоначчи, если все её члены - члены последовательности фибо
        for(int i = 0; i < this.length; i++) {
            if(!this.isFibonacci(this.arr[i])) {
                return false;
            }
        }
        return true;
    }
    private boolean isFibonacci(int num) {
        // свойство чисел Фибоначчи
        boolean a = Math.sqrt(num*num*5+4) == num;
        boolean b = Math.sqrt(num*num*5-4) == num;
        return a || b;
    }
}
