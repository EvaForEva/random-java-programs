class Employee {
	String strFirstName;
	String strLastName;
	int iWage;

	Employee(String strFn, String strLn, int iW){
		strFirstName = strFn;
		strLastName = strLn;
		iWage = iW;
	}

	void printData() {
		System.out.println("\n");
		System.out.println("First name: " + this.strFirstName);
		System.out.println("Last name: " + this.strLastName);
		System.out.println("Wage: " + this.iWage);
	}

	void wageIncrease(int iZ){
		iWage += iZ;
	}
}

class Trainee extends Employee {
	int iExam;

	Trainee(String strFn, String strLn, int iW) { 
		super(strFn, strLn, iW);
		iExam = 0;
	}
	
	void printData() {
		System.out.println("\n");
		System.out.println("Status: Trainee");
		System.out.println("First name: " + this.strFirstName);
		System.out.println("Last name: " + this.strLastName);
		System.out.println("Wage: " + this.iWage);
		System.out.println("Exam: " + this.iExam);
	}
}

class PermanentEmployee extends Employee {
	int iHierarchy;
	static int iMinHierarchy = 0;
	static int iMaxHierarchy = 6;

	PermanentEmployee(String strFn, String strLn, int iW) { 
		super(strFn, strLn, iW);
		iHierarchy = 0;
	}

	PermanentEmployee(String strFn, String strLn, int iW, int iH) {
		super(strFn, strLn, iW);
		if(iH >= iMinHierarchy && iH <= iMaxHierarchy) {
			iHierarchy = iH;
		} else {
			iHierarchy = iMinHierarchy;
		}
	}

	void promote() { 
		if (iHierarchy < iMaxHierarchy) {
			iHierarchy++;
		} else {
			System.out.println("\nThere.");
		}
	}
	
	void printData() {
		System.out.println("\n");
		System.out.println("Status: Permanent emoloyee");
		System.out.println("First name: " + this.strFirstName);
		System.out.println("Last name: " + this.strLastName);
		System.out.println("Wage: " + this.iWage);
		System.out.println("Hierarchy level: " + this.iHierarchy);
	}
}

class Boss extends Employee {
	Boss(String strFn, String strLn, int iW) {
		super(strFn, strLn, iW);
	}
	void wageIncrease(int iZ) { 
		iWage += 2 * iZ;
	}
	
	void printData() {
		System.out.println("\n");
		System.out.println("Status: Boss");
		System.out.println("First name: " + this.strFirstName);
		System.out.println("Last name: " + this.strLastName);
		System.out.println("Wage: " + this.iWage);
	}
}

class EmolyeesData {
	public static void main(String args[]) {
		Trainee klaus;
		klaus = new Trainee("Klaus", "Meyer", 500);
		
		PermanentEmployee fritz = new PermanentEmployee("Fritz", "Kraus", 2_500);
		PermanentEmployee peter = new PermanentEmployee("Peter", "Mueller", 4_000, 3);

		Boss maria = new Boss("Maria", "Schmitt", 20_000);

		klaus.printData();
		fritz.printData();
		peter.printData();
		maria.printData();

		peter.promote();
		peter.printData();
		peter.wageIncrease(2_000);
		peter.printData();

		klaus.iWage = 10_000;
		klaus.printData();
	}
}