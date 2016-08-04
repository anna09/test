pckage test;

public class Problem4 {

	private static int subfunc(int b){


		int swap=0;
		while(b>0){
			swap*=10;
			swap+=b%10;
			b/=10;
		}

		return swap;
	}



	public static void main(String[] args) {


		int twice;
		int  a, b,c;
		int max=0 , swap;

		for(int i=100; i<=999; i++){
			for(int j=100; j<=999; j++){


				twice= i*j;

				if(twice%11==0){

					a=twice/1000;
					b=twice%1000;

					swap = subfunc(b);

					if(swap==a){

						if(max < twice){

							max=twice;
						}

					}



				}

			}




		}

		System.out.println(max);

	}

}
