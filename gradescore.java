import java.util.Scanner ;
 class gradescore {
	
	public static void main( String[] args){
		
		 Scanner input1 = new Scanner(System.in) ;
	double matscore , engscore , chescore , physcore , comscore , grade , tscore , averagescore ;
	 String  grades , name , report = "" ;
	 System.out.println("Please Enter Your Name") ;
	 name = input1.nextLine() ;
	 System.out.println("Hello " + name) ;
	System.out.println("Enter Your Maths Score") ;
	matscore = input1.nextDouble() ;
	System.out.println("Enter Your Eng Score") ;
	engscore = input1.nextDouble() ;
	System.out.println("Enter Your chem Score") ;
	chescore = input1.nextDouble() ;
	System.out.println("Enter Your phy Score") ;
	physcore = input1.nextDouble() ;
	System.out.println("Enter Your computer Score") ;
	comscore = input1.nextDouble() ;
	averagescore = (((matscore + engscore + chescore + physcore + comscore ) / 500 ) * 100 ) ;
	if (averagescore < 40 ) {
		grades = "poor" ;
		report ="You need to work more in the next session " ;
	}
	else if(averagescore < 60 ) {
		grades = "Average" ;
		report = "You are not there yet , you need to work harder in the next section " ;
	}
	else if (averagescore < 80 ) {
		grades = "Good" ;
		report = "Well Done, But you can still do much better in the next section " ;
	}
	else if (averagescore < 90 ) {
		grades = "Very Good" ;
		report = "This is a very commendable result, but you can still achieve a better result in the next section " ;
	}
	else if (averagescore < 101  ) {
		grades = "Excellent" ;
		report = " A very big congratulations to you, please keep it up !!!!!! " ;
	}
	else{
		grades = "Dear " + name + " Your result can not be determined " ;
		System.out.println(grades) ;
		
	}
	if (grades != "Your result can not be determined "  ){
	System.out.println("Dear " + name + " Your final result grade is " + grades) ;
	System.out.println(report) ;
	}
	 
  }
}