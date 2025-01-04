import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
 

public class List{
  
	Scanner scan1 = new Scanner(System.in);
 
  String task1, task2, task3, task4, task5;
   void settask(){
    task1 = scan1.next();
    task2 = scan1.next();
    task3 = scan1.next();
    task4 = scan1.next();
    task5 = scan1.next();
   }
    String gettask1(){


    return task1;

   }
    String gettask2(){
    return task2;
   }
   
   String gettask3(){
    return task3;
   }
   
   String gettask4(){
    return task4;
   }
   
   String gettask5(){
    return task5;
   }
   public void writing(){
    try{
 FileWriter writer = new FileWriter("tasks.txt");
 
 writer.write(gettask1()+"\n");
 
 writer.write(gettask2()+"\n");
 
 writer.write(gettask3()+"\n");

 writer.write(gettask4()+"\n");
 
 writer.write(gettask5());
 System.out.println("tasks added successfully");
 writer.close();
}catch(IOException e){
      System.out.println("error");
    }
   }
   
  
 


public class marking extends List{
  
public void mark_task_as_complete(){
try{
File myobj = new File("tasks.txt");
Scanner scan2 = new Scanner(myobj);
System.out.println("Which tasks are you done with?");

while(scan2.hasNextLine()){

  

int ntask = scan1.nextInt();
switch(ntask){
case 1:
  
  System.out.println(scan2.nextLine()+" :task 1 is complete");
  break;

case 2:

  System.out.println(scan2.nextLine()+" :task 2 is complete");
   break;
 case 3:
  System.out.println(scan2.nextLine()+" :task 3 is complete");
  break;
  case 4:
  System.out.println(scan2.nextLine()+" :task 4 is complete");
  break;
  case 5:
  System.out.println(scan2.next()+" :task 5 is complete");
  break;
default:
  System.out.println("sorry, no more task is available");

  }

}
}catch(IOException e){
  System.out.println("error");
}
}

}





public class removing extends List{
   public void removetask(){
    
      File deleting = new File("tasks.txt");
     
    System.out.println("which task do you want to remove?");
   String answer = scan1.next();
   
    if(deleting.exists()){
      int option1 = scan1.nextInt();
      switch(option1){
      case 1:
        System.out.println(deleting.delete()+" task 1 has been removed");
        task1 = null;
        break;
      
   case 2:
    System.out.println(deleting.delete()+" task 2 has been removed");
    task2 = null;
    break;
   case 3:
    System.out.println(deleting.delete()+" task 3 has been removed");
    task3 = null;
    break;
   case 4:
    System.out.println(deleting.delete()+" task 4 has been removed");
    task4 = null;
    break;
   case 5:
    System.out.println(deleting.delete()+" task 5 has been removed");
    task5 = null;
    break;
   default:
    System.out.println("no other tasks to delete");
    }
  }


}

  
  }
  
  public class pending extends List{
public void view_pending_task(){

  try{
  File reading = new File("tasks.txt");
  Scanner scan3 = new Scanner(reading);
  
System.out.println("Which tasks are pending?");
while(scan3.hasNextLine()){
int ntask2 = scan1.nextInt();
switch(ntask2){
case 1:
  System.out.println(scan3.nextLine());
  break;
  case 2:
  System.out.println(scan3.nextLine());
  break;
  case 3:
  System.out.println(scan3.nextLine());

  break;
  case 4:
  System.out.println(scan3.nextLine());
  break;
  case 5:
  System.out.println(scan3.nextLine());
  break;
}
}
}catch(IOException e){
  System.out.println("error");
}
}
}








public static void main(String [] args){
  /*try{
    File myobj = new File("tasks.txt");
    if(myobj.createNewFile()){
      System.out.println("file created: "+myobj.getName());
    }
 }catch(IOException e){
System.out.println("error");
 }*/
 Scanner scan = new Scanner(System.in);
 
  

 
    
    
    List lis = new List();
   
    List.marking mark = lis.new marking();
    List.removing remove = lis.new removing();
    List.pending pend = lis.new pending();

     String option;

    System.out.println("Hello, What do you want to do?");
    option = scan.next();
    switch(option){
     case "addtask": 
      lis.settask();
      lis.gettask1();
      lis.gettask2();
      lis.gettask3();
      lis.gettask4();
      lis.gettask5();
      lis.writing();
      break;
     case "mark_task_as_complete":
     
       mark.mark_task_as_complete();
      break;
     case "removetask":
      
      remove.removetask();
      break;
     case "view_pending_task":
     
      pend.view_pending_task();
        break;
        default:
        System.out.println("please select an appropriate option");  
    }

  }

}