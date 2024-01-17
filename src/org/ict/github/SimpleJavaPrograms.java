package org.ict.github;

public class SimpleJavaPrograms {

	public static void main(String[] args) {
		float p, r, t; 
		p = 12000; r = 10; t = 2;
		System.out.println("\n---------------SIMPLE INTEREST---------------------");
		cal_simple_interest(p,r,t);
		
		float pr = 1200, ra = 10, ti = 2 , nt=1; 
		System.out.println("\n-----------------COMPOUND INTEREST--------------------");
        System.out.println("\n The principle amount is = " + pr);
        System.out.println("\n The rate is = " + ra);
        System.out.println("\n The time period is " + ti);
        System.out.println("\n The number of times the interest is compounded is " + nt);
        cal_compound_interest(pr,ra,ti,nt);
        
        float l,b; 
        System.out.println("\n----------------RECTANGLE PERIMETER------------------");
		l = 12; b = 5;
		cal_rec_per(l,b);
		
		int m,n; 
		System.out.println("\n------------------SWAPPING NUMBERS-------------------");
		m=3; n=5;
		System.out.println("\n Numbers before swapping: "+m+" "+n);
		swap(m,n);



	}
	public static void cal_simple_interest(float pa,float ri,float ny)
	{ 
		float si;
	    si = (pa*ri*ny)/100;
	    System.out.println("\n Simple Interest = " + si);
		
	}
	
	public static void cal_compound_interest(float p, float r, float t, float n)
    {
       
    	double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("\n Compound Interest is: "+cinterest);
        
    }
	
	public static void cal_rec_per(float le,float br)
	{ 
		float p;
	    p = 2*(le+br);
	    System.out.println("\n Rectangle Perimeter  = " + p);
		
	}
	
	public static void swap(int x,int y)
	{ 
		int t;
	    t=x;
	    x=y;
	    y=t;
	    System.out.println("\n Numbers after  swapping: "+x+" "+y);
		
	}

}
