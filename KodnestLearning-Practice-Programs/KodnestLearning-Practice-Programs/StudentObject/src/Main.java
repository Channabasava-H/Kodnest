import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		System.out.println("Enter Roll no: ");
		s1.roll_no=scan.nextInt();
		System.out.println("Enter name : ");
		scan.next();
		s1.name=scan.nextLine();
		System.out.println("Enter age : ");
		s1.age=scan.nextInt();
		
		System.out.println("Enter Roll no: ");
		s2.roll_no=scan.nextInt();
		System.out.println("Enter name : ");
		scan.next();
		s2.name=scan.nextLine();
		System.out.println("Enter age : ");
		s2.age=scan.nextInt();
		
		System.out.println("Enter Roll no: ");
		s3.roll_no=scan.nextInt();
		System.out.println("Enter name : ");
		scan.next();
		s3.name=scan.nextLine();
		System.out.println("Enter age : ");
		s3.age=scan.nextInt();
		scan.close();
		
		Student arr[]=new Student[3];
		
		arr[0]= s1;
		arr[1]=s2;
		arr[2]=s3;
		
		for(Student x : arr) {
			System.out.println("Roll no:"+x.roll_no);
			System.out.println("Name : "+x.name);
			System.out.println("Age : "+x.age);
		}

	}

}
