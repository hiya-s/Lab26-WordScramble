import java.util.*;
public class WordScramble {
	public static void main (String args[]) {
	
		
		String word = "cupcake";
		char [] letters = word.toCharArray();
		System.out.print(letters); //cupcake
		
		String sentence = "the green is greener ";
			String[] words = sentence.split ("");
			System.out.println(Arrays.toString(words));
		
			
			
			char [] alpha = new char [26];
			int n = 65;
			for(int i =0; i< alpha.length; i++) {
				alpha[i] = (char)n ;
				n++;
			}
			System.out.println(alpha);
					
	}
		
		//1
		public static boolean hasTwoA(String a) {
			char a1 = 'a';
			int count = 0;
			for(int i= 0; i<a.length(); i++) {
			char letter = 	a.charAt(i);
			if(letter == a1) {
				count++;
			}
		}
			boolean twoA = false;
			if(count >2) {
				twoA = true;
			}
			return twoA;
	}
		//2
		public static boolean isVowel(char letter ) {
			boolean isVowel = false;
			if(letter == 'a' ||letter == 'e' ||letter == 'i' ||letter == 'o' ||letter == 'u' ) {
				isVowel = true;
			}
			return isVowel;
		}
		
		//3
		public static int numVowels(String s) {
			boolean temp;
			int count = 0;
			String[] words = s.split ("");
			for(int i = 0; i< words.length; i++) {
				for(int j = 0; j< words[i].length(); j++) {
					char one = words[i].charAt(j);
					temp = isVowel( one);
					if(temp == true) {
						count++;
					}
				}
			}
			return count;	
		}
		
		//4
		public static boolean evenChars(String s, char a, char b) {
			boolean equalChars = false;
			int counta = 0;
			int countb = 0;
			String[] words = s.split ("");
			for(int i = 0; i< words.length; i++) {
				for(int j = 0; j< words[i].length(); j++) {
					char one = words[i].charAt(j);
					if(one == a) {
						counta++;
					}
					if(one == b) {
						countb++;
					}
				}
			
		}
			if(counta == countb) {
				equalChars = true;}
			return equalChars;
			}
		
		//5
		//Not possible
		
		//6
		public static boolean twoInARow(String s, char a) {
			boolean twoInARow = false;
			String[] words = s.split ("");
			for(int i = 0; i< words.length; i++) {
				for(int j = 0; j< words[i].length(); j++) {
					char one = words[i].charAt(j);
					if(one == a) {
						if(i!= words.length -1 ||  j != words[i].length() -1 ) {
						one = words[i+1].charAt(j+1);
						if(one == a) {
							twoInARow = true;
							break;
						}
						}
					}
				}
			
		}
			return twoInARow;
		}
		
		//7
		public static String capitalizeVowels(String s){
			String[] words = s.split ("");
			String reviseS = "";
			boolean isVowel;
			for(int i = 0; i< words.length; i++) {
				for(int j = 0; j< words[i].length(); j++) {
					char one = words[i].charAt(j);
					isVowel =isVowel(one);
					if(isVowel == true) {
						reviseS = reviseS + words[i].substring(j, j+1).toUpperCase();
					}
					else {
						reviseS = reviseS + one;
					}
						}
						}
			return reviseS;
					}
				
			//8
			public static String nCopies(char c, int n) {
				String s = "";
				for(int i =0; i <= n; i++) {
					s = s+c;
				}
				return s;
				
			}
			
			//9
			public static String longestWord(String s) {
				String[] words = s.split ("");
				int[] wordsNum = new int[words.length];
				for(int i = 0; i< words.length; i++) {
					wordsNum[i] = words[i].length();
				}
				int max = 0;
				for(int j = 0; j< wordsNum.length; j++) {
					if(wordsNum[max] < wordsNum[j]) {
						max =j;
					}
				}
				
				String x = words[max];
				return x;
					}
			
			//10
			
			public static boolean containsPrefix(String s, int n){
				boolean containsPrefix = false;
				char prefix = s.charAt(0);
				int countN = 0;
				for(int i =0; i<s.length(); i++) {
					char one  = s.charAt(i);
					if(prefix == one) {
						countN++;
					}
				}
				if(countN >= n) {
					containsPrefix = true;
				}
				return containsPrefix;
			}
			
			//WordScramble APP
			
			//2
			public static boolean isPunctuation(char letter ) {
				boolean isPunctuation = false;
				if(letter == ',' ||letter == '\\' ||letter == '?' ||letter == '!' ||letter == '.' ) {
					isPunctuation = true;
				}
				return isPunctuation;
			}
			
			public static void wordScramble(String line){
				String[] words = line.split ("");
				String reviseS = "";
				for(int i = 0; i< words.length; i++) {
					for(int j = words[i].length()-1; j> 1; j--) {
						char one = words[i].charAt(j);
						boolean isPunctuation = isPunctuation(one);
						if((j ==1 || j ==words[i].length()-1) && isPunctuation == true) {
							reviseS = reviseS + one;
						}
						else {
							reviseS = reviseS + words[i].substring(j, j+1);
						}
							}
							}
				System.out.println(reviseS);
						}
					
			
			}
		

		
			
		


	

