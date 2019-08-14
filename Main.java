import java.util.Scanner;

class air
{public String Name;
public air next;
    int[] seating = new int[10]; 
    int gst,sgst,ticket,total,count,tot;

    Scanner sc=new Scanner(System.in);

    air()
    {
      gst=500;
      sgst=700;
      next=null;
    }

    public void start()
    {   
        
     //
    }

public void orig_to_dest()
{
  int ch;
  System.out.println("\nEnter destination from pune to:\n1.Delhi\n2.Kolkata\n3.Chennai");
  ch=sc.nextInt();
  switch(ch)
 {
   case 1:
         ticket=5000;    
         makeReservation();
         break;
   case 2:
         ticket=7000;   
         makeReservation();
         break;
   case 3:
         ticket=3000;
         makeReservation();
         break;
          
 }
}

public void calc()
{
  if(ticket==5000 || ticket==7000 || ticket==3000)
   {
     tot=ticket+gst+sgst;
     total=(ticket+gst+sgst)*count;
     System.out.println("\nTotal airfare per passeger is="+tot);
     System.out.println("\nTotal airfare for all passegers is="+total);
   }
}


public void makeReservation()
    {
        int section;
        System.out.println("Please type 1 for First Class or 2 for Economy: ");
        section=sc.nextInt();
        if ( section == 1 )
        {
            System.out.println("\nYou hava chosen first class");
            firstClassSeat();
        }
        else
        {
             System.out.println("\nFlight is exclusively for first class!!...Press 3 for continue and 4 to quit");
             int result=sc.nextInt();
             if(result==3)
             {
               firstClassSeat();
             }
             else
             {
               System.out.println("\nThanks for visting mintu airlines!!");
               start();
             }
        }
    }

public void firstClassSeat()
{
  System.out.println("Enter the number of seats:");
  count=sc.nextInt();
  System.out.println("You have booked "+count+" seats");
  if(count<=10)
        {
            calc();
            mode_of_payment();
            baggage();
            meal();
        }
        else
         {
            if (count>=11)
            {
                    System.out.println("First Class is fully booked. Would you like to go for next flight? Press 1 for Yes 2 for No");
                    int choice =sc.nextInt();
                    if ( choice == 1 )
                    {
                        makeReservation();
                    }
                    else
                    {
                        System.out.println("Thanks for visiting for mintu airlines!!");
                        start();
                    }
                }
            }

        }

public void mode_of_payment()
{
  int pay;
  System.out.println("\nPress 1 for cash and 2 for online payment");
  pay=sc.nextInt();
  if(pay==1)
   {
     System.out.println("\nPay to the nearest airport within 24 hours!!"); 
   }
   else
    {
      System.out.println("\nProvide your credit card details within 2 hours on the website!!"); 
    }
   
}



public void baggage()
{
  int kg;
  System.out.println("\nEnter the luggage weight:");
  kg=sc.nextInt();
  if(kg<=7)
  {
    System.out.println("\nLuggage is handy!! You can carry it in plane");
 }
  else if(kg>7 && kg<=15)
    System.out.println("\nPut luggage on belt");
 else
  {
    System.out.println("\nLuggage is extra...its chargeable!!");
  }
}

public void meal()
{
  int ch;
  int ans;
  System.out.println("\nDo you want meal? Press 1 for yes and 2 for no");
  ch=sc.nextInt();
  if(ch==1)
   {
      System.out.println("\nPress 5 for Veg and 6 for Non-veg");
      ans=sc.nextInt();
      if(ans==5)
       {
        System.out.println("\nWish for veg meal is accepted!!");
        System.out.println("\nBooking is successful!!");
        System.out.println("\nWish you a happy journey!!");
        start();
       }
      else
       {
        System.out.println("\nWish for non-veg meal is accepted!!");  
        System.out.println("\nBooking is successful!!");
        System.out.println("\nWish you a happy journey!!");
        start();
       }   
   }

   else
    {
       System.out.println("\nThanks for the intimation");     
       System.out.println("\nBooking is successful!!");
       System.out.println("\nWish you a happy journey!!");
       start();
    }
}

}




public class Main{
public static void main(String args[])
{
  air a=new air();
  Symboltable T =new Symboltable();
  Scanner sc=new Scanner(System.in);
  int y;
  do{ 
  System.out.print("Enter name in which you want to make a reservation: ");
  a.Name=sc.next();
  System.out.println("\nWelcome to Mintu Airlines!!");
  a.orig_to_dest();
  a.makeReservation();
  a.firstClassSeat();
  a.mode_of_payment();
  a.baggage();
  a.meal();
  T.insert(a);
  System.out.println("Press 1 to continue: ");
  y=sc.nextInt();
  }while(y==1);
}
}



























