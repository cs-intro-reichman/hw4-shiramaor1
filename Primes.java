public class Primes {
    public static void main(String[] args) {
        int n = 30;

        boolean [] primes = new boolean[n + 1];
        primes[0] = primes[1] = false;

        int i = 2;
        while (i <= n) {
            primes[i] = true;
            i++;
        }
        i = 2; 
        while (i * i <= n) {
            if (primes[i]) {
                int j = i*i;
                while (j <= n ) {
                    primes[j] = false;
                    j += i; 
                }
            }
            i++;
        }
        System.out.println("Primes up to " + n + ":");
        int count = 0;
        i = 2;
        while  (i <= n) {
            if (primes[i]) {
                count++;
                System.out.println(i);
            }
            i++;
        }
        int percent = (count * 100) / n;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + percent + "% are primes)");
    }
   
}