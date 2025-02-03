 package com.cjc.ims.app.serviceimpl;
import com.cjc.ims.app.servicei.*;
import com.cjc.ims.app.model.*;
import java.util.*;

public class Karvenagar implements Cjc
{
Scanner sc=new Scanner(System.in);
List<Course> clist=new ArrayList<>();
List<Faculty> flist=new ArrayList<>();
List<Batch> blist=new ArrayList<>();
List<Student> slist=new ArrayList<>();

public void addCourse()
{
      
       Course c=new Course();
  
       System.out.println("Enter your course id ");
       c.setCid(sc.nextInt());

       //int cid = sc.nextInt();
       //c.setCid(cid);   (long version for set) and above is the short one

       System.out.println("Enter your course name ");
       c.setCname(sc.next());

       clist.add(c);

}

public void viewCourse()
{
       Iterator<Course> citr=clist.iterator();
            while(citr.hasNext()) 
            {
             Course cs=citr.next();
             System.out.println("Course id is "+cs.getCid());
             System.out.println("Course name is "+cs.getCname());
             }
}


public void addFaculty()
{
        Scanner sc=new Scanner(System.in);
        Course c=new Course();
        Faculty f= new Faculty();

        System.out.println("Enter your Faculty id ");
        f.setFid(sc.nextInt());
       
        System.out.println("Enter your Faculty name ");
        f.setFname(sc.next());

        System.out.println("Enter course id");

        int cid=sc.nextInt();  

        for(Course cou:clist){

            if(cou.getCid()==cid)
            {
        f.setCourse(cou);
        System.out.println("course set");
   
        break;
            }

           else{
        System.out.println("course not found");
               }

}

  flist.add(f);


}



public void viewFaculty()
{
      for(Faculty f:flist)
      {
      System.out.println(f.getFid());
      System.out.println(f.getFname());
      System.out.println(f.getCourse().getCid());
      System.out.println(f.getCourse().getCname());
      } 
    
}

public void addBatch()
{
Batch b=new Batch();
System.out.println("Enter your branch id");
b.setBid(sc.nextInt());
System.out.println("Enter your branch name");
b.setBname(sc.next());
System.out.println("Enter faculty ID for this Batch");
int fid=sc.nextInt();
for (Faculty f:flist)
{
if(f.getFid()==fid)
{
b.setFaculty(f);
} 
}
blist.add(b);
}
public void viewBatch()
{
Iterator<Batch>itr2=blist.iterator();
while(itr2.hasNext())
{
Batch co2=itr2.next();
System.out.println(co2.getBid());
System.out.println(co2.getBname());
System.out.println(co2.getFaculty().getFid());
System.out.println(co2.getFaculty().getFname());
}
}
public void addStudent()
{
Student s=new Student();
System.out.println("Enter Student id");
s.setSid(sc.nextInt());
System.out.println("Enter Student name");
s.setSname(sc.next());
System.out.println("Enter your Batch id");
int bid=sc.nextInt();
for(Batch b : blist)
{
if(b.getBid()==bid)
{
s.setBatch(b);
}
}
slist.add(s);
}
public void viewStudent()
{
Iterator<Student>itr3=slist.iterator();
while(itr3.hasNext())
{
Student co3=itr3.next();
System.out.println(co3.getSid());
System.out.println(co3.getSname());
System.out.println(co3.getBatch().getBid());
System.out.println(co3.getBatch().getBname());
}
}
}


