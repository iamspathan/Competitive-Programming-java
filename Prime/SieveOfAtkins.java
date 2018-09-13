/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prime;

/**
 *
 * @author SYSTEM
 */
public class SieveOfAtkins {

    public SieveOfAtkins(int limit) {
        if (limit > 2) 
            System.out.print(2 + " "); 
  
        if (limit > 3) 
            System.out.print(3 + " "); 
        
        boolean sieve[] = new boolean[limit]; 
  
        for (int i = 0; i < limit; i++) 
            sieve[i] = false; 
        
        for (int x = 1; x * x < limit; x++) { 
            for (int y = 1; y * y < limit; y++) { 
  
                // Main part of Sieve of Atkin 
                int n = (4 * x * x) + (y * y); 
                if (n <= limit && (n % 12 == 1 || n % 12 == 5)) 
  
                    sieve[n] ^= true; 
  
                n = (3 * x * x) + (y * y); 
                if (n <= limit && n % 12 == 7) 
                    sieve[n] ^= true; 
  
                n = (3 * x * x) - (y * y); 
                if (x > y && n <= limit && n % 12 == 11) 
                    sieve[n] ^= true; 
            } 
        } 
        for (int r = 5; r * r < limit; r++) { 
            if (sieve[r]) { 
                for (int i = r * r; i < limit; 
                     i += r * r) 
                    sieve[i] = false; 
    
              } 
        } 
  
        // Print primes using sieve[] 
        for (int a = 5; a < limit; a++) 
            if (sieve[a]) 
                System.out.print(a + " ");       
    }
    
    
    

    
    
}
