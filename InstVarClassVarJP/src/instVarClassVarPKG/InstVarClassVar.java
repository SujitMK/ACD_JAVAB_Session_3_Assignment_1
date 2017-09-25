package instVarClassVarPKG;

public class InstVarClassVar {
	
	// declaring and initializing class variables
	
	static int classVarRollNo = 7;
	static String classVarStudentName = "Sujit";	
	
	// declaring and initializing instant variables
	
	int instVarRollNo = 10;
	String instVarStudentName = "Ajit";	
	
	public static void main(String[] args) {
		
		// Class variables scope is across the class and no need for a object/instance creation
		
		System.out.println();
		System.out.println("Student Roll Number is "+"'"+classVarRollNo+"'"+" . Student Name is "+"'"+classVarStudentName+"'");
		System.out.println();
		
		// Instant Variables scope is limited to instance of a class and can not be accessed without the ins	tance
		
		InstVarClassVar iVCV = new InstVarClassVar();
        
		System.out.println("Student Roll Number is "+"'"+iVCV.instVarRollNo+"'"+" . Student Name is "+"'"+iVCV.instVarStudentName+"'");
		
	}

}
