package �ӿ�;
 interface Studentinterface{					//����һ�����
	 void setFee(int fee);				+
	 int getFee();
 }
  interface Teacherinterface{
	  void setSalary(int salary);
	 int  getSalary();
  }
   public class Doctor implements Studentinterface,Teacherinterface{
	   private String name;
	   private int age;
	   private int fee;
	   private int salary;
	   public Doctor(String name,int fee,int salary){
		   this.name=name;
		   this.fee=fee;
		   this.salary=salary;
		   if((this.salary-this.fee) > 1500) {
		   System.out.println("����Ҫ��˰");}
		   else if((this.salary-this.fee) <= 1500) {
		   System.out.println("�㲻��Ҫ��˰");}
	   }
	   public int getFee() {
		   return this.fee;
	   }
	   public void  setFee(int fee) {
		   this.fee=fee;
	   }
		public int getSalary() {
            return this.salary;
		}
	   public void setSalary(int salary) {
		   this.salary=salary;
   }
       public String getName() {
    	   return name;
       }
       public void setName(String name) {
    	   this.name=name;
       }
       public int getAge() {
    	   return age;
       }
       public void setAge(int age) {
    	   this.age=age;
       }
   }
  