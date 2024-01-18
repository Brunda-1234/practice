package tekion;
import java.util.Arrays;
public class ArrayProgram {
	
	public static int[] check(int[] a,int target) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i] +a[j] )== target) {
				
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		
		int[] a = {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(check(a,target)));
	}

}
