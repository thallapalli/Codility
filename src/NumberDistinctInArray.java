import java.util.HashSet;
import java.util.Set;

public class NumberDistinctInArray {
	 public int solution(int[] A) {
	       Set<Integer> intset=new HashSet();
			 for(int i=0;i<A.length;i++) {
				 if(!intset.contains(A[i])) {
					 intset.add(A[i]) ;
				 }
			 }
			return intset.size();
	    }
}
