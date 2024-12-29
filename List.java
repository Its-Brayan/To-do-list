import java.util.Scanner;
 

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
   

  
  
 


public class marking extends List{
  
public void mark_task_as_complete(){
settask();
  System.out.println("Which tasks are you done with?");
int ntask = scan1.nextInt();
switch(ntask){
case 1:
  
  System.out.println(gettask1()+" :task 1 is complete");
  break;

case 2:

  System.out.println(gettask2()+" :task 2 is complete");
   break;
 case 3:
  System.out.println(gettask3()+" :task 3 is complete");
  break;
  case 4:
  System.out.println(gettask4()+" :task 4 is complete");
  break;
  case 5:
  System.out.println(gettask5()+" :task 5 is complete");
  break;
default:
  System.out.println("sorry, no more task is available");

  }
}
}
public class removing extends List{
   public void removetask(){
    settask();
    System.out.println("which task do you want to remove?");
      int option1 = scan1.nextInt();
      switch(option1){
      case 1:
        System.out.println(gettask1()+" task 1 has been removed");
        task1 = null;
        break;
      
   case 2:
    System.out.println(gettask2()+" task 2 has been removed");
    task2 = null;
    break;
   case 3:
    System.out.println(gettask3()+" task 3 has been removed");
    task3 = null;
    break;
   case 4:
    System.out.println(gettask4()+" task 4 has been removed");
    task4 = null;
    break;
   case 5:
    System.out.println(gettask5()+" task 5 has been removed");
    task5 = null;
    break;
   default:
    System.out.println("no other tasks to delete");
    }
    }
  }
  public class pending extends List{
public void view_pending_task(){
  settask();
System.out.println("Which tasks are pending?");
int ntask2 = scan1.nextInt();
switch(ntask2){
case 1:
  System.out.println(gettask1());
  break;
  case 2:
  System.out.println(gettask2());
  break;
  case 3:
  System.out.println(gettask3());

  break;
  case 4:
  System.out.println(gettask4());
  break;
  case 5:
  System.out.println(gettask5());
  break;
}

}
}
public static void main(String [] args){
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