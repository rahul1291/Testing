package defaultt;

public class A {

	int num=111;
	int sum=0;
	int rem=0;
	int z=num;
	public void CalculateReverse(){
		while(num>0){
			
			rem=rem*10;
			rem=rem+num%10;
			num=num/10;
			
		}
		
		System.out.println("reverse of number"+rem);
		
		if(rem==z){
			System.out.println("palindrom number");
		}
		else{
			System.out.println("not a plaindrom number");
		}
	}
	
	
	public void PerfectNumber(int n){
		
		for(int i=1;i<n;i++){
			
			if(n%i==0){
				sum=sum+i;
			}
		}
		
		if(sum==n){
			System.out.println("perfect number");
		}
		else{
			System.out.println("not perfect number");
		}
	}
	
	public void PrimeNumber(int num){
		boolean flag=true;
		for(int i=2;i<=num;i++){
			if(num%i==0 && num!=i){
				flag=false;
				break;
			}
		}
		if(flag==false){
			System.out.println("not prime number");
		}
		else{
			System.out.println("prime number");
		}
		
	}
	
	public void FindGreatest(int a,int b, int c){
		if(a==b && b==c){
			System.out.println("all are equal");
		}
		else if(a>=b){
			if(a>b){
				if(b>=c){
					System.out.println("a is greater");
				}
				else{
					if(c==a){
						System.out.println("a or c is greater");
					}
					else if(c>a){
						System.out.println("c is greater");
					}
					else{
						System.out.println("a is greater");
					}
				}
			}
			else if(a==b){
				if(b>c){
					System.out.println("a or b is greater");
				}
				else{
					System.out.println("c is greater");
				}
			}
		}
		else if(b>=c){
			if(b>c){
				if(c>=a){
					System.out.println("b is greater");
				}
				else{
					if(a==b){
						System.out.println("a or b is greater");
					}
					else if(a>b){
						System.out.println("a is greater");
					}
					else{
						System.out.println("b is greater");
					}
				}
			}
			else if(b==c){
				if(c>a){
					System.out.println("b or c is greater");
				}
				else{
					System.out.println("a is greater");
				}
			}
		}
		else if(c>=a){
			if(c>a){
				if(a>=b){
					System.out.println("c is greater");
				}
				else{
					if(b==c){
						System.out.println("b or c is greater");
					}
					else if(b>c){
						System.out.println("b is greater");
					}
					else{
						System.out.println("c is greater");
					}
				}
			}
			else if(c==a){
				if(a>b){
					System.out.println("a or c is greater");
				}
				else{
					System.out.println("b is greater");
				}
			}
		}
		
		
	}
	
	
}
