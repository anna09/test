public class Fibo {

	public static void main(String[] args) {

		int sum=1, sum2=0, total=0;

		for(int i=0; i<4000000; i=sum2){
			sum2 =sum;
			sum= sum+i;

			if(sum%2==0){

				/*   System.out.println(sum);*/

				total = total + sum;
			}
		}

		System.out.println("합"+total);
	}

}
