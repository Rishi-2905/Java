class Fibonacci {
    static void fib(int n)
    {
        if (n <= 1)
            System.out.println(n);
        System.out.println( fib(n - 1) + fib(n - 2));
    }
 
    public static void main(String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }
}