public class forStatement {

    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(" 10000 at 2% interest= " + calculateInterest(10000.00, 2.00));
        System.out.println(" 10000 at 3% interest= " + calculateInterest(10000.00, 3.00));
        System.out.println(" 10000 at 4% interest= " + calculateInterest(10000.00, 4.00));
        System.out.println(" 10000 at 5% interest= " + calculateInterest(10000.00, 5.00));

       // for(int i=2; i<=8; i++){
         //   System.out.println(" 10000 at " + i + "% interest = "+ String.format("%.2f", calculateInterest(10000.00, i)));
       // }
        System.out.println("*****************");
        for(int i=8;i>=2; i--){
            System.out.println(" 10000 at " + i + "% interest = "+ String.format("%.2f", calculateInterest(10000.00, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n){

        if(n==1){
            return false;
        }

        for(int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
