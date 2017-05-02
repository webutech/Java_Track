
public class OneDArrayDemo {
	
	
	public static void main(String...args) {
		int [][] nums=new int[2][];
		
		nums[0]=new int[3];
		nums[1]=new int[4];
		
		nums[0][0]=10;
		nums[0][1]=20;
		nums[0][2]=30;
		
		nums[1][0]=100;
		nums[1][1]=200;
		nums[1][2]=300;
		nums[1][3]=400;
		
		System.out.println("---------Before Removing Array object-----------");
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Hash code of nums[0] : "+nums[0].hashCode());
		
		int newArray[]={50,60,70,80};
		
		int temp[]=nums[0];
		
		nums[0]=newArray;
		System.out.println("---------After Removing and adding new Array object-----------");
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Hash code of nums[0] : "+nums[0].hashCode());
		System.out.println("hash code of temp : "+temp.hashCode());
		
		
		
		
		
	}
}
