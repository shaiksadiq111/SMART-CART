import java.util.*;
class Hackthon
{
public static void main(String args[])
{
	int p=0;
	Scanner sc=new Scanner(System.in);
	try
	{
		System.out.println("Welcome to supermarket:");
		Thread.sleep(1000);
		
		String[] List={"Toothpaste","soaps","sugar","vegetab","oil","venegar","beans","creams"};
		int[] cost={200,300,1000,2000,100,1000,4000};
		System.out.println("press 1 for scanning list into cart:");
		Thread.sleep(1000);
		int a=sc.nextInt();
		Thread.sleep(1000);
			System.out.println("Please wait the list is scanning!!!!!");
			Thread.sleep(3000);
			String[] List1=new String[10];
			for(int i=0;i<7;i++)
			{
				List1[i]=List[i];
				System.out.println((i+1)+"."+List1[i]);
				Thread.sleep(1000);
			}
			System.out.println("List is successfully scanned to cart.....");
			Thread.sleep(1000);
			System.out.println("Start your shopping");
			Thread.sleep(1000);
		int[] arr=new int[9];
		for(int i=1;i<=8;i++)
		{
			arr[i]=i;
		}
		
	 int[][] mall={
		 {0,6,8,999,999,999,22,8},
	     {6,0,999,10,999,7,999,999},
	     {8,999,0,999,13,999,999,999},
		 {999,10,999,0,999,999,14,2},
	     {999,999,13,999,0,999,18,999},
		{999,7,999,999,999,0,999,11},
		{999,999,999,14,18,999,0,20},
		{999,999,999,22,999,11,20,0}
	 };
	 
	  System.out.println("Follow this cart map.save your valuble time");
	  Thread.sleep(1000);
	   System.out.println("...........");
	   Thread.sleep(1000);
	  System.out.println("MAP");
	  Thread.sleep(1000);
	    System.out.println("........");
		Thread.sleep(1000);
	 
	   int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
        { 0, 42, 66, 31, 0 } };
	 int V=5;
	   int[] dest=new int[10];
	 
	int total=0;

    int INF = 9999999;

    int no_edge;

    
    boolean[] selected = new boolean[V];

    Arrays.fill(selected, false);

    no_edge = 0;
    selected[0] = true;
    System.out.println("Edge : Weight");

    while (no_edge < V - 1)
		{
   int min = INF;
      int x = 0; 
      int y = 0; 

      for (int i = 0; i < V; i++) 
	  {
        if (selected[i] == true) 
		{
          for (int j = 0; j < V; j++) 
		  {
           
            if (!selected[j] && G[i][j] != 0) 
			{
              if (min > G[i][j])
				  {
                min = G[i][j];
                x = i;
                y = j;
              }
            }
          }
        }
      }
	  
	
	

	  Thread.sleep(1000);
      System.out.println(List[x] + " - " + List[y]+ " :  " + G[x][y]+"Meters");
	  dest[p]=x;
	  p++;
	
	  
	  
	  selected[y] = true;
      no_edge++;
	 
   }
   
   
   
     for(int z=0;z<4;z++)
	  {
		  System.out.println("step"+(z+1)+" go to the"+List[dest[z]]);
		  Thread.sleep(3000);
		  System.out.println("your are reached the " +List[dest[z]]);
		  Thread.sleep(1000);
		  System.out.println("please put "+List[dest[z]]+" into the cart");
		  Thread.sleep(3000);
		  
		  System.out.println("Press true for putting the "+List[dest[z]]+" into cart");
		  Thread.sleep(1000);
		  boolean val=sc.nextBoolean();
		  if(true==val)
		  {
		  while(val)
		  {
			  total=total+cost[z];
			  Thread.sleep(1000);
			  System.out.println("the cost of things in the cart::"+total);
			  break;
		  }
		  }
		  else
		  {
			   System.out.println("the cost of things in to cart::"+total);
			  
		  }
		  Thread.sleep(1000);
		  System.out.println("<--------------------------------------->");
		  
		  
		  
		  
	  }
	   Thread.sleep(1000);
	  System.out.println("-------------------------------------------");
	  Thread.sleep(1000);
	  System.out.println("-------------------------------------------");
	  Thread.sleep(1000);
	  System.out.println("Dear customer shopping successfully completed....!!!");
	  Thread.sleep(1000);
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   Thread.sleep(1000);
      System.out.println("-------------------------------------------");
	  System.out.println("-------------------------------------------");
	    Thread.sleep(1000);
	  System.out.println("Select your payment method:");
	  
   Thread.sleep(1000);
	  System.out.println("1.Credit Card");
	  
   Thread.sleep(1000);
	  System.out.println("2.phone pay");
	  
   Thread.sleep(1000);
	  System.out.println("3.Cash");
	  
   Thread.sleep(1000);
	  System.out.println("Select your choice:");
	  int choice=sc.nextInt();
	  switch(choice)
	  {
		  case 1:
		  Thread.sleep(1000);
		  System.out.println("Please type your ATM card number:");
		  long atm=sc.nextLong();
		  Thread.sleep(1000);
		  System.out.println("Enter 4 digit otp:");
		  long otp=sc.nextLong();
		  System.out.println("Sucesssfully transaction completed");
		  break;
		  
		  case 2:
		  Thread.sleep(1000);
		  System.out.println("Scan Qr code ");
		  Thread.sleep(1000);
		  System.out.println("Start scan by entering 1:");
		  int scan=sc.nextInt();
		  Thread.sleep(3000);
		  System.out.println("Successfully trancation completed");
		  break;
		  
		  case 3:
		  Thread.sleep(1000);
		  System.out.println("Please GoTO cash counter");
		  break;
		  
		  
	  }
    
	

	  Thread.sleep(1000);
	  
	  System.out.println("--------------------------------------------------------------------------");
	    Thread.sleep(1000);
	  System.out.println("BILL");
	  System.out.println("-----");
	  System.out.println("21-10-2022");
	  System.out.println("Total number of iteams:"+8);
	  System.out.println("List of iteams buyed-");
	  for(int b=0;b<4;b++)
	  {
		  System.out.println(List[dest[b]]+"        :"+cost[dest[b]]);
		  Thread.sleep(1000);
	  }
	  Thread.sleep(1000);
	  System.out.println("");
	  Thread.sleep(1000);
	
	  System.out.println("****TOTAL="+total+"*****");
	  System.out.println("Thank You");
	  	  
	  System.out.println("--------------------------------------------------------------------------");
	
	 
	  
	  
	  
	  
	  
	  
	 
	  
   
	}catch(Exception e)
	{
	}
    
	 
  
}
}