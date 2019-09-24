
public class Student {
      int sid;
       String sname;
       Student(int sid, String sname)
      {
    	  this.sid=sid;
    	  this.sname=sname;
    	 System.out.println("Student info");
    	  System.out.println("Student id="+sid+" "+"Student Name="+sname);
    	  
      }
	public static void main(String[] args) {
	  Student[] s1=new Student[3];
	   s1[0]=new Student(1,"abc");
	   s1[1]=new Student(2,"pqr");
 	 // System.out.println(s1);
 	  

	 //System.out.println(s1.length);
	 //s.m1(23, "PQR");
	 
	 Teacher[] t=new Teacher[3];
	
      t[0]=new Teacher (5, 30, "abc");
      t[1]=new Teacher(6, 56, "pqr");
      t[2]=new Teacher(8, 45, "xyz");
	}

}
class Teacher 

{
	int tid, tage;
	String tname;
	public Teacher(int tid,int tage,String tname)
	{
	
		
		this.tid=tid;
	this.tname=tname;
	   this.tage=tage;
	  System.out.println("Teacher id=" +tid+ " "  +"Teacher Name="+tname+" "+"Teacher Age"+tage);

		
	}
	

}