
public class Homework {
	
	// * Write a method to find N numbers which are power of three. e.g. n=4,
	//		 * return {1,3,9,27}

	public void PowerofThree(int n){
		int num = 1;
		int[] arr = new int[n];
		for (int i=0; i<n; i++){
			
			arr[i] = num;
			num = num*3;
		}
		for (int i=0; i<n; i++){
			System.out.println(arr[i]);
		}
	}
	
	{System.out.println("--------------------");
	}
	
//	* Given a integer 'n', return n%count, count is the number of digits of n
//			 * For example, n = 100, return 1
	
	public void countDigits(int n) {
		if (n == 0) {
			System.out.println(0);
			return;
		}
		
		int count = 0,m = n;
	
       while (n != 0) {
			n = n / 10;
			count++;
		}

		System.out.println(m % count);
	}
	
	
//	  * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
//	 * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4
//	 * 6*/
	
	public void printNumbers(int n) {
		int num = 0;
		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				System.out.println(num);
				num = num + 2;
			}
		} else {
			num = 1;
			for (int i = 0; i < n; i++) {
				System.out.println(num);
				num = num + 2;
			}
		}
	}
	
//	 * Given numRows, generate the first numRows of Pascal's triangle. For
//	 * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
//	 * [1,4,6,4,1]
//	 */
	
	public void Pascal(int rows) {

	     for(int i =0;i<rows;i++) {
	         int number = 1;
	         
			System.out.format("%"+(rows-i)*2+"s","");
	         for(int j=0;j<=i;j++) {
	              System.out.format("%4d",number);
	              number = number * (i - j) / (j + 1);
	         }

	         System.out.println();
	     }
	  }
	
//	 * Write a function that takes a string as input and reverse only the vowels
//	 * of a string. For example: Given s = "hello", return "holle".*/

	public static boolean isVowel(char c) {
	final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
//        for (char vowel : vowels) {
            if (vowels[i] == c) {
                return true;
            }
        }

        return false;
        }
	
	public void swap(String text){
		char[] textArray = text.toCharArray();

        int left = 0;
        int right = textArray.length - 1;
        boolean leftIsVowel = false;
        boolean rightIsVowel = false;



        while (left < right) {

            leftIsVowel = isVowel(textArray[left]);
            rightIsVowel = isVowel(textArray[right]);

            if (leftIsVowel && rightIsVowel) {
                char temp = textArray[left];
                textArray[left] = textArray[right];
                textArray[right] = temp;
                left++;
                right--;
            }

            if (!leftIsVowel)
                left++;

            if (!rightIsVowel)
                right--;

        }

        String reversed = new String(textArray);

        System.out.println(reversed);
		}
	
//	 * Given a string s consists of upper/lower-case alphabets and empty space
//	 * characters ' ', return the length of last word in the string. If the last
//	 * word does not exist, return 0. Note: A word is defined as a character
//	 * sequence consists of non-space characters only.
	
	
	public void lengthofLastWord(String str) {
		char[] arr = str.toCharArray();

		int x = 0;
		for (int i = str.length() -1; arr[i] != ' '; i--) {
			x++;
		}
		
		System.out.println(x);
	}
	
//	/**
//	 * Reverse a string by words. Do not use 'split' function. e.g. "I like
//	 * soccer" --> "soccer like I"
	
	
	public void reversewords(String s){
		
		String str_arr[] = new String[20];
		
		int k=s.length(),j=0;
		for(int i=s.length()-1;i>=0;i--){
			
			if(s.charAt(i)==' '){
				str_arr[j++]=s.substring(i+1, k);
				k=i;
			} 
		}
		str_arr[j++]=s.substring(0, k);
		
		for(int i=0;i<j;i++)	
			System.out.print(str_arr[i]+" ");
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Homework PoT = new Homework();
		PoT.PowerofThree(4);
	
		Homework cd = new Homework();
		cd.countDigits(100);
		
		Homework oddeven = new Homework();
		oddeven.printNumbers(4);
		
		 Homework pt = new Homework();
         pt.Pascal(5);

		Homework checklen = new Homework();
		checklen.lengthofLastWord("apple is best");
				
		Homework SV = new Homework();
		SV.swap("hello");
		
		Homework RW = new Homework();
		RW.reversewords("i like soccer");
	}

}
