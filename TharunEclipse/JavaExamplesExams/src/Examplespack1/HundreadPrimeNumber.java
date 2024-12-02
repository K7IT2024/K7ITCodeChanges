package Examplespack1;

public class HundreadPrimeNumber {

	
	public static void main(String[] args) {
	
		
		
		    
		        int count = 0; // Counter for the number of primes found
		        int number = 2; // Starting number to check for prime status

		        while (count < 100) { // Loop until we find 100 primes
		            if (isPrime(number)) {
		                System.out.print(number + " ");
		                count++;
		            }
		            number++;
		        }
		    }

		    // Method to check if a number is prime
		    public static boolean isPrime(int n) {
		        if (n <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(n); i++) {
		            if (n % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		
		
		
		
		
		
		
		
		
		
		

	}


