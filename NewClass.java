
package newpackage;

import java.io.*;
import java.util.Scanner;
public class NewClass
{
public static void main (String [] args) throws IOException
{
    int speed,time,distance,num,sum=0;
    Scanner key=new Scanner(System.in);
    System.out.print("enter number of speed:");
    speed=key.nextInt();
    while(speed<0){
        System.out.print("enter number of speed:");
        speed=key.nextInt();
    }
    System.out.print("enter number of hours:");
    time=key.nextInt();
    while(time<1){
        System.out.print("enter number of hours:");
        time=key.nextInt();
    }
    File file=new File("travel.txt");
    if(!file.exists()){
        System.out.println("the file is not found");
        System.exit(0);
    }
    Scanner in=new Scanner(file);
    while(in.hasNext()){
        num=in.nextInt();
        sum+=num;
    }
    System.out.println("the sum is "+sum);
     in.close();
    

   
    
    
    
    
    
    
    
    /*Scanner keyboard=new Scanner(System.in);
   int floor,rooms,occuiped,totalrooms=0,totaloccuiped=0;
   double occupancyrate;
   System.out.println("enter number of floor:");
   floor=keyboard.nextInt();
   while(floor<1){
    System.out.println("enter again numbers of rooms:");
   floor=keyboard.nextInt(); 
   }
   for(int i=1;i<=floor;i++){
   System.out.println("enter numbers of rooms:");
   rooms=keyboard.nextInt();
   while(rooms<10){
      System.out.println("enter again numbers of rooms:");
      rooms=keyboard.nextInt(); 
   }
   System.out.println("the number of them that are occupied:");
   occuiped=keyboard.nextInt();
   totalrooms+=rooms;
   totaloccuiped+=occuiped;
   }
    occupancyrate=totaloccuiped/(double)totalrooms;
    System.out.println("the occupancy rate:"+occupancyrate);
    System.out.println("the number of rooms"+totalrooms);
    System.out.println("the number of occupied rooms"+totaloccuiped);
    System.out.println("the number of vecint rooms"+(totalrooms-totaloccuiped));*/
    
}
}
