

//Write your code here
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n){
        int sum = n;
        if (n <= 2)
            return sum;
        for (int i = 1; i <= Math.ceil(n/2) ; i++){
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}



