package yoo;

import java.util.Scanner;

 public class Diary {
	 private double inbalance;
	private static double balance;
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
		inbalance=400000;
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
	   
	   public double price(){ 
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
	   public double cmoney(){
		   return inbalance=balance-total;
	   }
	   
	   public static void main(String args[]){
			Diary diary = new Diary();
			Scanner scan = new Scanner(System.in);

			System.out.println("���� ������ �ִ� �ݾ�: " + diary.getBalance() );
			
			int k=0;
			
			while(true){
				System.out.println("1�� : ���� �Է�"+"\n"+"2�� : ���� ����"+"\n"+"3�� : �ʱ�ȭ"+"\n");
				k=scan.nextInt();
				
				
				if(k==1){
					int tday=0;
					System.out.printf("��¥: ");
					tday=scan.nextInt();
					diary.date(tday);
					
					int tcloth=0;
					System.out.println("�ʿ� �� �� : " );
					tcloth=scan.nextInt();
					diary.cloth(tcloth);
					 
					int tfood=0;
					System.out.println("���Ŀ� �� �� : ");
					tfood=scan.nextInt();
					diary.food(tfood);
					
					int tanni=0;
					System.out.println("����Ͽ� ��  �� : ");
					tanni=scan.nextInt();
					diary.anniversary(tanni);
					
					count++;
				}
				else if(k==2){
					for(int j=0;j<count;j++){
						   System.out.println("��¥ : "+date[j]+"\n"+"�ʿ� �� ���� : "+cloth[j]+"\n"+"���Ŀ� �� ���� : "+food[j]+"\n"+"����Ͽ� �� ���� : "+anniversary[j]+"\n");
					}   
					System.out.println("�ʿ� �� �� �ݾ���:"+clothtotal+"\n"+"���Ŀ� �� �� �ݾ���:"+foodtotal+"\n"+"����Ͽ� �� �� �ݾ���:"+annitotal+"\n");
					System.out.println("�� �ݾ� :"+diary.price());
					System.out.printf("�ʿ� �� ���� ���� :%.2f\n ",diary.clothper(clothtotal));
					System.out.printf("���Ŀ� �� ���� ���� :%.2f\n ",diary.foodper(foodtotal));
					System.out.printf("����Ͽ� �� ���� ���� :%.2f\n ",diary.anniper(annitotal));
					System.out.printf("���� �ݾ� : %.2f\n", diary.cmoney());
					if((0.0<=diary.cmoney()) &&( diary.cmoney()<=400000*0.2)){
						   System.out.println("!!!!! �� �� !!!!! �� �� �� �� �� !!!!!!");
					   }
					if(diary.cmoney()<=0.0){
						   System.out.println("���ڳ��µ� �� �� �ž�????????");
					   }
				}
				else if(k==3){
					date[count]=0;
					cloth[count]=0;
					food[count]=0;
					anniversary[count]=0;
					balance=400000;
				}
			}
	   }
 }