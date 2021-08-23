package org.emp;

public class Employee {
   private void EmpId() {
     System.out.println("Employe id is 232");
      }
   private  void EmpName() {
	   System.out.println("empname is mano");
   }
   private void EmpDob() {
	   System.out.println("emp dob is 23/07/1994");
   }
   public static void main(String[] args) {
	   Employee e = new Employee();
	   e.EmpDob();
	   e.EmpName();
   }
	   
   }