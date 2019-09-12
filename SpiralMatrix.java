package spiralmatrix;

/**
 * 
 * @author Chandra
 * @objective for any m,n matrix, Need to print the OP in spiral form. For example
 * @Input a[][] = [ 1 2 3 ]
 * 		   		  [ 4 5 6 ]
 * 		   		  [ 7 8 9 ]
 * 
 * @Output = [1 2 3 6 9 8top 7 4 5 ]
 *
 */
public class SpiralMatrix {

	public static int[] retrieveArr(int a[][], int r, int b, int l ) {
		int top=0;
		int right=r;
		int bottom=b;
		int left=l;
		
		//we have to print in order top->right->bottom->left
		
		while(top<=bottom && left <=right) {
		//moving in direct from left -> right
		for(int i=left;i<=right;i++)
		System.out.println(a[top][i]);
		
		top ++;
		
		//for direction top->bottom
		for(int i=top;i<=bottom;i++ )
			System.out.println(a[i][right]);
		
		right --;
		
		//for direction right -> left
		for(int i=right; i>=left; i--)
			System.out.println(a[bottom][i]);
		
		bottom --;
		
		//for direction left -> top
		for(int i=bottom; i>=top; i--)
			System.out.println(a[i][left]);
		
		left++;
			
		
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},
						{4,5,6,7},
						{7,8,9,10}};
		
		retrieveArr(arr, 3, 2, 0);
	}
}
