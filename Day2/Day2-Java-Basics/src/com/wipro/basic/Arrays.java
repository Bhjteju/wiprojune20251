package com.wipro.basic;

public class Arrays {
	public static void main(String[] args) {
		
		
//>>>>>>>>>>>>>>>>>Ex: 10 >>>>>>>>>>>>>>>>>	
		
		
//		int[] numbers = {1, 2, 3, 4, 5};
//		numbers[3] = 10;
//		
//		for(int i=0;i<numbers.length;i++) {
//			System.out.println(numbers[i]);
//	
//		}
		
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
//	int nums[][] ={{1000,1010,1020,1030},{2000,2010,2020,2030},{3000,3010,3020,3030},{4000,4010,4020,4030}};
//	for(int i=0;i<nums.length;i++)
//	{
//		for(int j=0;j<nums[0].length;j++)
//		{
//			System.out.print(nums[i][j]+"  ");
//		}
//		System.out.println();
//	}
//>>>>>>>>>>>>>>>>>>>>>>>>> Ex- 11 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
//		        int[] numbers = {3, 7, 12, 5, 8};  
//
//		        
//		        for (int i = 0; i < numbers.length; i++) {
//		            numbers[i] = numbers[i] * 2; 
//		        }
//
//		      
//		        for (int i = 0; i < numbers.length; i++) {
//		            System.out.println(numbers[i]);
//		        }

//>>>>>>>>>>>>>>>>>>>>>> EX: 12 -- Largest >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		        
//		                int[] numbers = {100, 67, 98, 678, 45, 123};
//
//		                int largest = numbers[0];
//
//		                
//		                for (int i = 1; i < numbers.length; i++) {
//		                    if (numbers[i] > largest) {
//		                        largest = numbers[i];
//		                    }
//		                }
//
//		                
//		                System.out.println("The largest number is: " + largest);
		            
		        

		
//>>>>>>>>>>>>>>>>>>>>>> Ex: 13 -- 2nd Largest >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		

//		        int[] arr = {10, 5, 20, 8, 15};
//
//		        int largest = arr[0];
//		        int secondLargest = arr[0];
//
//		        
//		        for (int i = 1; i < arr.length; i++) {
//		            if (arr[i] > largest) {
//		                largest = arr[i];
//		            }
//		        }
//
//		       
//		        for (int i = 0; i < arr.length; i++) {
//		            if (arr[i] > secondLargest && arr[i] < largest) {
//		                secondLargest = arr[i];
//		            }
//		        }
//
//		        System.out.println("Second largest element: " + secondLargest);
//		    
//>>>>>>>>>>>>>>>>Ex : 14 - Remove duplicates >>>>>>>>>>>
		
		        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
		        int n = arr.length;
		        
		        int m =0;

		        for (int i = 1; i < n; i++) {
		        	if (arr[m] != arr[i]) {
		        		m++;
		        		arr[m] = arr[i];
		        	}
		        	
		        }
		        
		        //System.out.print("Array after removing duplicates: ");
		        
		        
		        for (int i = 0; i< m; i++) {
		            System.out.println(arr[i] + " ");
		        }
		        
		        System.out.println("length : " + m);

//>>>>>>>>>>>>>>>Ex:- 15 >>>>>>>>>>>>>>>>>>>>>>

//		        int[] arr = {2, 7, 11, 15};
//		        int target = 9;
//
//		        for (int i = 0; i < arr.length; i++) {
//		            for (int j = i + 1; j < arr.length; j++) {
//		                if (arr[i] + arr[j] == target) {
//		                    System.out.println("Paired indices: [" + i + ", " + j + "]");
//		                }
//		            }
//		        }
		
//		int[] arr= {21, 17, 14, 15, 19, 4, 5};
//	    int target=29;
//	    int[] output= {0,0};
//	    
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(((i+1)<arr.length)&&(arr[i]+arr[i+1]==target))
//			{
//				
//				
//				output[0]=i;
//				output[1]=i+1;
//			}
//			
//		}
//	
//		System.out.println(output[0]+ " - " +output[1]);

//>>>>>>>>>>>>Ex:- 16 - revere an array >>>>>>>>>>>>>>>>>>>>>>>
		
//		        int[] arr = {1, 2, 3, 4, 5};
//
////		        int i = 0;
////		        int j = arr.length - 1;
////
////		        while (i < j) {
////		           
////		            int temp = arr[i];
////		            arr[i] = arr[j];
////		            arr[j] = temp;
////
////		            i++;
////		            j--;
////		        }
////
////		        
////		        for (int num : arr) {
////		            System.out.print(num + " ");
////		        }
//		        
//		        for(int i=arr.length-1;i>=0;i--)
//		        {
//		        	System.out.print(arr[i] + " ");
//		        }
		 
		        

	}
}

