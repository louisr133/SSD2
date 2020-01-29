/**
 * 
 */
package arrayPractice;

/**
 * @author louis
 *
 */
class TwoDem {

	public static void main(String[] args) {
		
		int indexOfLargest = 0;
		int compare = 0;

		int[][] twoD = new int[][]{
			{1,2,3},
			{4,5,6}, 
		};
		
		for(int[] firstArr: twoD) {
			for(int num: firstArr) {
				if (num > compare){
					compare = num;
				}
				indexOfLargest++;
			}
		}
		
		
		
		System.out.println(indexOfLargest-1);
		
		
	}

}
