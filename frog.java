import java.util.Scanner;

class frog{
	public static void main(String[] args) {
	
		Scanner myObj = new Scanner(System.in);

		do{
		int distance;
		int time = 0;
		System.out.println("please enter distance"); 
		distance = myObj.nextInt();
		for(int i = 0; i<++i;i++){
			if(distance >=5){
			distance = distance-5;
			if(distance == 0){
				System.out.println("time duration : "+time); 
				break;
			}
			time = time+1;
			}
			if(distance >=2){
			distance = distance-2;
			if(distance == 0){
				System.out.println("time duration : "+time); 
				break;
			}
			time = time+2;
			}
			if(distance >=1){
			distance = distance-1;
			if(distance == 0){
				System.out.println("time duration : "+time); 
				break;
			}
			time = time+5;
			}
		}
		}while(true);
	
	}
}