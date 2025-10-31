package h2;

public class H2_main {

	public static void main(String[] args) {
		int i = 15;
        int j = 7;
        int k = 23;

        int min = Math.min(i, Math.min(j, k));
        int max = Math.max(i, Math.max(j, k));

        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}