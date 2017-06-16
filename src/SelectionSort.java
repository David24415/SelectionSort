//David Dorneau
//Z23281302
//Data structures and Algorithms
//Assignment #2 SelectionSort



import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner myVar = new Scanner(System.in);
		System.out.println("Enter the size of your array\n");	//Allow user to enter size of Array
		int ArrSize=myVar.nextInt();
		int count=0, z=0, k=0;
		int ArrB[]=new int[ArrSize];
		System.out.println("Enter the values in your array to sort\n");	//Allow user to enter values in array
		
while (count<ArrSize)
	{
	
	ArrB[count]=myVar.nextInt();
	count++;
	
	}
System.out.print("your unsorted Array is: ");		//Display array before sort
while(z<ArrSize)
{
	System.out.print(ArrB[z]+", ");
	z++;
}

		Ssort(ArrB,ArrSize);							//Call to sort function
		
		System.out.print("\nthe sorted Array is: ");		//Display array after sort
		
		while(k<ArrSize)
		{
			System.out.print(ArrB[k]+", ");
			k++;
		}
}
static void Ssort(int arr[],int Size) //Sort function definition
{
	int MaxIn=0;
	int tmp=0;
	for(int i=0; i<=(Size-2);i++)
	{
	MaxIn=i;
		for(int j=i+1;j<=(Size-1);j++)
		{
			if( arr[j]>arr[MaxIn])
			{
				MaxIn=j;
				tmp=arr[i];
				arr[i]=arr[MaxIn];
				arr[MaxIn]=tmp;
			}
			
		}
	}
	
}


}

