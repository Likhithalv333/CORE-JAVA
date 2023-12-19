class basedonsign 
{
	public static void main(String[] args) 
	{
		int[] arr={-9,8,-9,7,-6,0,-4,876,-5};
		int[] result=rearrangePositiveNegative(arr);
		for(int num:result){
			System.out.print(num+" ");
		}
	}
	public static int[] rearrangePositiveNegative(int[] arr){
		int[] result=new int[arr.length];
		int left=0;
		int right=arr.length-1;
		for(int num:arr){
			if(num>=0){
				result[left]=num;
				left++;
			}
			else{
				result[right]=num;
				right--;
			}
		}
		return result;
	}
	
}
