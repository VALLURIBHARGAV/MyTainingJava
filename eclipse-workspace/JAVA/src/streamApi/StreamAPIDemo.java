package streamApi;

import java.util.stream.IntStream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,9,4,5,345,34,343};
		int min = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]<min)
					min=nums[i];
		}
		System.out.println("Min= " + min);
		int minValue= IntStream.of(nums).min().getAsInt();
		System.out.println("MIn value: " + minValue);
		
		System.out.println("using as passing the method to Stream: " );
		IntStream.of(nums).min().ifPresent(System.out::println);
		
		int[] newArray= IntStream.of(nums).distinct().toArray();
		System.out.println("Elements in Created Array are: ");
		for(int i:newArray)System.out.println(i);
		
		System.out.println("No of Elements: " + IntStream.of(nums).distinct().count());
		
		
	}

}
