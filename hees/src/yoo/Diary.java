package yoo;

import java.util.Scanner;

 public class Diary { //���� ������ �ʱ�ȭ
	protected static double inbalance=400000;
	protected static double balance=400000;
	protected static int count=0;
	protected static int[] date = new int[100];
	protected static int[] cloth = new int[100];
	protected static int[] food = new int[100];
	protected static int[] anniversary = new int[100];
	protected static int foodtotal = 0;
	protected static int clothtotal = 0;
	protected static int annitotal = 0;
	protected static int total = 0;
	protected static double ft = 0.0;
	protected static double ct = 0.0;
	protected static double at = 0.0;
	
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
	   
	 	   
	   public double price(){ //��ü �� �ݾ�
		   total=foodtotal+clothtotal+annitotal;   
		   return total;
	   }
	   public double foodper(int foodtotal){//�ۼ�Ʈ
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
	     
	   public double getBalance(){
	      return balance;
	   }
	   public double cmoney(){ //���� �� ���� ������ �ִ� ��
		   return inbalance=balance-total;
	   }
	   public static void main(String args[]){
	   }
}