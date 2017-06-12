package yoo;

import java.util.Scanner;

 public class Diary {
	private double balance;
	protected static int count=0;
	protected static int[] date;
	protected static int[] cloth;
	protected static int[] food;
	protected static int[] anniversary;
	protected static int foodtotal;
	protected static int clothtotal;
	protected static int annitotal;
	protected static int total;
	protected static double ft;
	protected static double ct;
	protected static double at;
	
	
	Diary(){
		total=0;
		clothtotal=0;
		annitotal=0;
		foodtotal=0;
		ft=0.0;
		ct=0.0;
		at=0.0;
		balance=400000;
		date=new int[100];
		cloth=new int[100];
		food=new int[100];
		anniversary=new int[100];
	}   
	   public void date(int day){
		   date[count]=day;
	   }
	   public void food(int f){
		   food[count]=f;
		   foodtotal=foodtotal+f;
	   }

	   public void cloth(int c){
		   cloth[count]=c;
		   clothtotal=clothtotal+c;
	   }
	   public void anniversary(int anni){
		   anniversary[count]=anni;
		   annitotal=annitotal+anni;
	   }
	   
	   public int price(){ 
		   total=foodtotal+clothtotal+annitotal;   
		   return total;
	   }
	   public double foodper(int foodtotal){
		   ft=((double)foodtotal/total)*100;
		   return ft;
	   }
	   public double clothper(int clothtotal){
		   ct=((double)clothtotal/total)*100;
		   return ct;
	   }
	   public double anniper(int annitotal){
		   at=((double)annitotal/total)*100;
		   return at;
	   }
	   public void money(double add){
	      balance+=add;
	   }	   
	   protected void setBalance(double b){
	      balance=b;	      
	   }
	   public double getBalance(){
	      return balance;
	   }
	   public double money(){
		   return balance-=total;
	   }
	   
	   public static void main(String args[]){
			Diary diary = new Diary();
			Scanner scan = new Scanner(System.in);

			System.out.println("³»°¡ °¡Áö°í ÀÖ´Â ±Ý¾×: " + diary.getBalance() );
			
			while(count<100000){

				int tday=0;
				System.out.printf("³¯Â¥: ");
				tday=scan.nextInt();
				diary.date(tday);
				
				int tcloth=0;
				System.out.println("¿Ê¿¡ ¾´ µ· : " );
				tcloth=scan.nextInt();
				diary.cloth(tcloth);
				 
				int tfood=0;
				System.out.println("À½½Ä¿¡ ¾´ µ· : ");
				tfood=scan.nextInt();
				diary.food(tfood);
				
				int tanni=0;
				System.out.println("±â³äÀÏ¿¡ ¾´  µ· : ");
				tanni=scan.nextInt();
				diary.anniversary(tanni);
				
				count++;	
				for(int j=0;j<count;j++){
					   System.out.println("³¯Â¥ : "+date[j]+"\n"+"¿Ê¿¡ ¾´ µ·Àº : "+cloth[j]+"\n"+"À½½Ä¿¡ ¾´ µ·Àº : "+food[j]+"\n"+"±â³äÀÏ¿¡ ¾´ µ·Àº : "+anniversary[j]+"\n\n\n"
				+"¿Ê¿¡ ¾´ ÃÑ ±Ý¾×Àº:"+clothtotal+"\n"+"À½½Ä¿¡ ¾´ ÃÑ ±Ý¾×Àº:"+foodtotal+"\n"+"±â³äÀÏ¿¡ ¾´ ÃÑ ±Ý¾×Àº:"+annitotal+"\n");
					   System.out.println("ÃÑ ±Ý¾× :"+diary.price());
					   
					   System.out.printf("¿Ê¿¡ ¾´ µ·ÀÇ ºñÀ² :%.2f\n ",diary.clothper(clothtotal));
					   System.out.printf("À½½Ä¿¡ ¾´ µ·ÀÇ ºñÀ² :%.2f\n ",diary.foodper(foodtotal));
					   System.out.printf("±â³äÀÏ¿¡ ¾´ µ·ÀÇ ºñÀ² :%.2f\n ",diary.anniper(annitotal));
					   System.out.printf("³²Àº ±Ý¾× : %.2f\n", diary.money());
				}
				if(diary.money()<=(diary.price()/100)*0.2){
					System.out.println("!!!!! °æ °í !!!!! ¾Æ ²¸ ¾² ¼¼ ¿ä !!!!!!");
				}
				if(diary.money()<=0.0){
					System.out.println("ÀûÀÚ³µ´Âµ¥ ´õ ¾µ °Å¾ß????????");
				}
			}
	   }
 }