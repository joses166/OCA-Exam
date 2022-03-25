import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio_2_2 {

	public static void main(String[] args) {
		
		List<Float> fishLengthList = new ArrayList<Float>();
		fishLengthList.addAll(Arrays.asList(10.0f, 15.5f, 18.0f, 29.5f, 45.5f));
		
		for (Float fish: fishLengthList) if ( fish > 28 ) System.out.println("This fish have " + fish);
	}
	
}
