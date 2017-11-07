package LightCode;

public class MaoPao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={13,-5,8,5,19,-1};
		for (int i=1;i<arr.length;i++){
			for(int j=0;i<arr.length-j;j++){
			if(arr[j]<arr[j+1]){
				int temp;
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
			System.out.println(" "+ arr[i]+" ");
		}

	}

}
