package yoo;

import java.util.Scanner;

 public class Diary { //변수 생성
	protected static double inbalance;
	protected static double balance;
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
	
	
	Diary(){ //생성자
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
	   
	 	   
	   public double price(){ //전체 총 금액
		   total=foodtotal+clothtotal+annitotal;   
		   return total;
	   }
	   public double foodper(int foodtotal){//퍼센트
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
	   public double cmoney(){ //지출 후 현재 가지고 있는 돈
		   return inbalance=balance-total;
	   }
	   public static void main(String args[]){
	   }
 }