public class Main {
    public static void main(String[] args) {
        int n = recursiveFactorial(3);
        System.out.println("====== Fatorial Recursivo");
        System.out.println(n);

        int n2 = recursiveFunc1(4);
        System.out.println("====== Func Recursiva 1");
        System.out.println(n2);

        int n3 = recursiveMult(4, 2);
        System.out.println("====== Multiplicação Recursiva");
        System.out.println(n3);

        int n4 = recursiveFunc2(3);
        System.out.println("====== Func Recursiva 2");
        System.out.println(n4);

        int n5 = recursiveFibonacci(13);
        System.out.println("====== Fibonacci Recursiva");
        System.out.println(n5);

        int n6 = interactiveFibonacci(13);
        System.out.println("====== Fibonacci Interativo");
        System.out.println(n6);

        int n7 = recursivePow(3,4);
        System.out.println("====== Potência Recursiva");
        System.out.println(n7);

        int n8 = interactivePow(3,4);
        System.out.println("====== Potência Interativa");
        System.out.println(n8);

        int n9 = recursiveSum(3);
        System.out.println("====== Somatório Recursivo");
        System.out.println(n9);
    }

    public static int recursiveFactorial(int num){

        if(num == 0){
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

    public static int recursiveFunc1(int n){
        if(n == 1){
            return 1;
        }

        return 10 * recursiveFunc1(n-1) + 2;
    }

    public static int recursiveMult(int op1, int op2){
        if(op2 == 0){
            return 0;
        }

        return op1 + recursiveMult(op1, op2 - 1);
    }

    public static int recursiveFunc2(int n){
        if(n == 0){
            return 2;
        }

        return 2 * recursiveFunc2(n - 1) - 4;
    }

    public static int recursiveFibonacci(int n){
        if(n == 0) return 0;

        if(n == 1) return 1;

        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);

    }

    public static int recursivePow(int base, int exp){
        if(exp == 0){
            return 1;
        }

        return base * recursivePow(base, exp-1);
    }

    public static int recursiveSum(int n){
        if (n > 1){
            return ((2 * n * n) + 2 * n + 8) + recursiveSum(n - 1);
        }else{
            return ((2 * n * n) + 2 * n + 8);
        }


    }

    public static int interactiveFibonacci(int n){

        if(n == 0 || n == 1){
            return n;
        }

        int i = 1;
        int prev = 0;
        int next = 1;
        int result = 0;

        while (i < n){
            result = prev + next;
            prev = next;
            next = result;
            i++;
        }

        return result;
    }

    public static int interactivePow(int base, int exp){
        if(exp == 0){
            return 1;
        }

        int result = 1;

        for (int i = 0; i < exp; i++) {
            result *= base;
        }

        return result;
    }
}