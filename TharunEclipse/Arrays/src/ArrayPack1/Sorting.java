package ArrayPack1;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

	public static void main(String[] args) {

		int b[] = new int[5];

		b[0] = 20;
		b[1] = 90;
		b[2] = 80;
		b[3] = 30;
		b[4] = 10;

		Arrays.sort(b);
		//System.out.println(b);
		for (int v : b)
			System.out.print(v+" ");
     //System.out.println(a.length);
	}
}
