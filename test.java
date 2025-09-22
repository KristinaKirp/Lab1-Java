public class test {
    public double fraction (double x) {
        return x%1 ;
    }

    public int charToNum (char x) {
        int a = (int)x;
        return (a-48);
    }
    public boolean is2Digits (int x) {
        return (((x >= 10) && (x <= 99)) || ((x<= - 10) && (x >=-99)));
    }
    public boolean isInRange (int a, int b, int num) {
        return (((num >= a) && (num <= b)) || ((num <= a) && (num >= b)));

    }
    public boolean isEqual(int a, int b, int c) {
        return((a== b) && (a ==c));
    }
    public int abs (int x) {
        if(x >= 0)
            return x;
        else
            return x*(-1);
    }
    public boolean is35 (int x) {
        if ((x % 3 == 0) && (x%5 != 0 ) || (x % 5 == 0) && (x%3 != 0 ))
            return true;
        else
            return false;
    }
    public int max3 (int x, int y, int z) {
        if(x>=y && x>=z)
            return x;
        else if (y>=x && y >=z )
            return y;
        else
            return z;
    }
    public int sum2 (int x, int y) {
        if( (x+y) >= 10 && (x+y) <=19)
            return 20;
        else
            return (x+y);
    }
    public String day (int x) {
        switch (x) {
            case 1: return ("Понедельник");
            case 2: return ("Вторник");
            case 3: return ("Среда");
            case 4: return ("Четверг");
            case 5: return ("Пятница");
            case 6: return ("Суббота");
            case 7: return ("Воскресенье");
            default: return ("Это не день недели");
        }
    }
    public String listNums (int x) {
        String Nums = new String();
        for(int i = 0; i <= x; i++)
        {
            Nums = Nums + String.valueOf(i + " ");

        }
        return Nums;
    }
    public String chet (int x) {
        String Nums = new String();

        for(int i = 0; i <= x; i+=2) {
            Nums = Nums + String.valueOf(i + " ");


        }
        return Nums;
    }
    public int numLen (long x) {
        int count = 0;
        while (x>0) {
            x = x/10;
            count++;
        }
        return count;
    }
    public void square (int x) {
        for (int i =0; i<x; i++) {
            for (int j = 0; j<x;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void rightTriangle (int x) {
        for (int i = 1; i <= x; i++) {

            for (int j = x - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int findFirst (int[] arr, int x) {
        if(arr.length == 0){
            System.out.println("Массив должен содержать числа");
            return 0;
        }
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public int maxAbs (int[] arr){
        if(arr.length == 0){
            System.out.println("Массив должен содержать числа");
            return 0;
        }
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            int abs = Math.abs(arr[i]);
            if(abs > max){
                max = abs;
            }
        }
        return max;
    }
    public int[] add (int[] arr, int[] ins, int pos){
        int size = arr.length + ins.length;
       int[] newArr = new int[size];
       for(int i = 0; i < pos; i ++)
           newArr[i] = arr[i];
       for(int i =0; i < ins.length; i++)
           newArr[pos + i] = ins[i];
       for(int i = pos; i < arr.length; i ++)
           newArr[ins.length + i] = arr[i];
       return newArr;
    }
    public int[] reverseBack (int[] arr){
        int size = arr.length;
        int[] reversArr = new int[size];
        for(int i = 0; i < arr.length; i ++){
            reversArr[i]= arr[arr.length- 1 - i];
        }
        return reversArr;
    }
    public int[] findAll (int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == x)
                count++;
        }
        int ind = 0;
        int[] newArr =new int[count];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                newArr[ind] = i;
                ind++;
            }
        }
        return newArr;
    }




}
