package week3.day1;

public class Students {
	public void getStudentInfo(int empId) {
		System.out.println(empId);
		
	}
		public void getStudentInfo(int empId,String empEmail) {
			System.out.println(empId +" "+ empEmail);
			
		}
		public void getStudentInfo(String empName,int empId) {
				System.out.println(empName+" "+empId);
				
			}
		
		public void getStudentInfo(Long empPhone,int empId,String empName) {
					System.out.println(empPhone+" "+empId+" "+empName);
					
				}
		
		
	public static void main(String[] args) {
		Students S = new Students();
		S.getStudentInfo(500);
		S.getStudentInfo(500, "abc@gmail.com");
		S.getStudentInfo("Param", 500);
		S.getStudentInfo(9840764557L, 500, "Param");

		
	}

}
