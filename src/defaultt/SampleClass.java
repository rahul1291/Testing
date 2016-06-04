package defaultt;

import java.util.HashMap;
import java.util.Map;

public class SampleClass {

	
	public static void main(String args[]){
		
		
	/*	long result=getSingleDigitSum(167888);
	    while(result>9){
	    	result=getSingleDigitSum(result);
	    }
	    System.out.println("result is"+result);*/
		/*Map<Integer,Integer> map=new HashMap<>();
		int values[]={1,2,3,2,2,2,3,3,4,4,5,5,7,7,7,9,9,9,9};
		
		for(int i=0;i<values.length;i++){
			if(!map.containsKey(values[i])){
				map.put(values[i], 1);
			}
			else{
				map.put(values[i],map.get(values[i])+1);
			}
		}
		
		for(Map.Entry<Integer,Integer> mapp:map.entrySet()){
			System.out.println(mapp.getKey()+"/"+mapp.getValue());
			System.out.println("\n");
		}*/
		System.out.println("aaaaaaaaa");
		
		A a=new A();
		a.CalculateReverse();
		a.PerfectNumber(496);
		a.PrimeNumber(11);
		a.FindGreatest(12, 13,12);
		ArrayData data=new ArrayData();
		data.Insertion(3);
	}
	
	/*static long getSingleDigitSum(long num){
		long sum=0;
		while(num>0){
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}*/
	
}
