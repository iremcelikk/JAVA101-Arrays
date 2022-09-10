
public class HarmonicMean {
	
	static double calculateHarmonicMean(int[] list) {
		double sum=0;
		for(double i:list) {
			sum+=1/i;
		}
		
		return list.length/sum;
	}
	public static void main(String[] args) {
		
		int[] list= {2,9,36,45,11,7,2};
		System.out.println("Harmonic Mean is: "+calculateHarmonicMean(list));		
	}
}
