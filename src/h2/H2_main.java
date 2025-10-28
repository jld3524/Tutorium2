package h2;

public class H2_main {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int k = 3;
		int min;
		int max;
		
		 min = Math.min(i, Math.min(j, k));  // gibt den kleineren Wert zurück
		 //max = Math.max(i, j, k);  // gibt den größeren Wert zurück

	        System.out.println("Min: " + min);
	        //System.out.println("Max: " + max);
	}

}
