public class Factorial {
    public static int calculate(int n){
        if(n < 0){
            throw new IllegalArgumentException("Getal moet positief zijn!");
        }

        int result = 1;
        for(int i = 2; i <= n; i++){
            result*=i;
        }
        return result;
    }

}
