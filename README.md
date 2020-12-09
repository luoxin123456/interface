＃接口
＃计191罗鑫2019311215
＃实验目的
1。掌握Java中抽象类和抽象方法
2。掌握Java中接口的定义
3。了解异常类的使用方法，并在程序中根据输入的情况做异常处理
＃实验过程
定义在实验初期最初我创造了两个接口，在学生接口使用抽象类定义缴纳学费，查询学费，在老师接口使用方法定义分配工资以及查询薪水。在博士生中实现两个接口，并且将他们实例化
＃#核心代码
1。用方法定义两个接口
```
 interface Studentinterface{					
	 void setFee(int fee);				
	 int getFee();
 }
  interface Teacherinterface{
	  void setSalary(int salary);
	 int  getSalary();
  }
  ```
2。
用博士生实现两个接口
 public class Doctor implements Studentinterface,Teacherinterface{
	   private String name;
	   private int age;
	   private int fee;
	   private int salary;
	   public Doctor(String name,int fee,int salary){
		   this.name=name;
		   this.fee=fee;
		   this.salary=salary;
```
3。在博士生中实现两个接口里面定义的方法
```
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
   ```
4.用if
