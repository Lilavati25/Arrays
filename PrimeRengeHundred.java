import java.util.*;
public class PrimeRengeHundred {
    
    public static void main(String[] args){
        int a,b,i;
        a=1;
        b=100;
        System.out.println("Following are prime numbers between 1 and 100 "  );
        for(i=a;i<=b;i++){
            if(checkPrime(i)){
                System.out.print(i+ "\t");
            }
        }
    }
    public static boolean checkPrime(int num){
	    
	    if(num<2){
	        return false;
	    }
	    else{
	        int x= num/2;
	        for(int i=2;i<x;i++){
	            if(num%i==0){
	                return false;
	            }
	        }
	    }
	    return true;
	}
}

