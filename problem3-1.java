c class Problem3 {

	public static void main(String[] args) {

		//약수 구하기
		long index=600851475143L;
		/*
		   for(long i=1; i<=index; i++){

		   if(index%i==0){
		   System.out.println(i);

		   }
		   }*/

		//소인수 구하기

		for(long i=1L; i<=index; i++){
			if(index%i==0){
				index /= i;

				System.out.println(i);
			}

		}
	}

}
