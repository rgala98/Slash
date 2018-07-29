/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;
import java.util.Arrays;


/**
 *
 * @author Nisarg
 */
 
public class nums {
 

	static int a[] = new int[5000];
	static int k = 0;
        static String str[] = new String[10];
        
        public nums()
        {
            k=0;
        }
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
    	int sum = 0;
        if (index == r)
        {
            for (int j=0; j<r; j++)
                { sum = sum + data[j];}
            a[k++] = sum;
            return;
            
        }
 

        for (int i=start; i<=end-1 && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
 

    static void printCombination(int arr[], int n, int r)
    {
        
        int data[]=new int[r];
 
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
 
    public static void callnums (int q) {
    	
        //int arr[] = {1,4,8,16,32,64,2};
        int temp=0,i;
        int arr[] = new int[7];
        int o=0;
        for(i=0;i<=6;i++)
        {
            temp = (int)Math.pow(2,i);
            if(temp!=q){
                arr[o] = temp; o++;
            }
        }
        arr[6] = q;
        for(i=0;i<7;i++)
            System.out.println(arr[i]);
       
        
           

        
        int r,j,p=0;
        int n = arr.length;
        
        for(r = 1;r<arr.length;r++)
        printCombination(arr, n, r);
        int b[] = new int[k+1];
        int c=0;
        for(i=0;i<k;i++)
        {temp = a[i]+q;
        	 if(check(temp,arr) == true)	
        	 {	
                     b[c++] = temp;
                 }
        }
        Arrays.sort(b);
        b[0]+=q;
        /*for(i=c;i>0;i--)
        {
            if(b[i]>100)
                c--;
            
        }*/
       System.out.print(b[c]);
        
        
        Arrays.fill(str,"");
        
        
        for(i=0;i<10;i++)
        {
                
        	for(j=0;j<5;j++)
        	{
        	if (p<c){
                    if(b[p]>99)
                    {str[i] += "\t  ";p++;}
                    else
                        str[i] += "\t"+Integer.toString(b[p++]);
                }
        	}
        	
                
        }
        for(i=0;i<10;i++)
        {
        	System.out.println(str[i]);
        }
    }
    public static boolean check(int n,int[] x)
    {
    		for(int i = 0;i<x.length;i++)
    		{
    			if(n==x[i])
    				return false;
    		}
    		return true;
    	
    	
    }
}
