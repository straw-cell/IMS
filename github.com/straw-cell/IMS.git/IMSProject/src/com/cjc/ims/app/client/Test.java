package com.cjc.ims.app.client;
import com.cjc.ims.app.serviceimpl.*;
import com.cjc.ims.app.servicei.*;
import com.cjc.ims.app.model.*;
import java.util.*;
public class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Karvenagar a=new Karvenagar();
			while(true)
 			{
 				System.out.println("1. Add course");
 				System.out.println("2. View Course");
 				System.out.println("3. Add Faculty");
 				System.out.println("4. View Faculty");
 				System.out.println("5. Add Batch");
 				System.out.println("6. View Batch");
 				System.out.println("7. Add Student");
 				System.out.println("8. View Student");
 				
 				System.out.println();

 				System.out.println("Enter your choice......");
				int ch=sc.nextInt();
				if(ch==1)
				{
    					a.addCourse();
 					System.out.println();
				}
				else if(ch==2)
				{
    					a.viewCourse();
    					System.out.println();
				}
				else if(ch==3)
				{
    					a.addFaculty();
    					System.out.println();
				}
				else if(ch==4)
				{
    					a.viewFaculty();
    					System.out.println();
				}
				else if(ch==5)
				{
    					a.addBatch();
    					System.out.println();
				}
				else if(ch==6)
  	                        {
         			        a.viewBatch();
                                        System.out.println();
                                }
                                else if(ch==7)
                                {
 	                     	 	a.addStudent();
					System.out.println();
 				}
       				else if(ch==8)
 				{
					a.viewStudent();
					System.out.println();
 				}
				else 
				{
				System.out.println("Invalid choice");
 				}
			}
		}
	}







