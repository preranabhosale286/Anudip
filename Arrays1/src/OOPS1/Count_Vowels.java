package OOPS1;
import java.io.IOException;
public class Count_Vowels {
  static int isVowel(char chars)
		{
			if (chars == 'a' || chars == 'e' || chars == 'i'
				|| chars == 'o' || chars == 'u') {
				return 1;
			}
			else {
				return 0;
			}
		}
		static int vowelno(String str, int l)
		{
			if (l == 1) {
				return isVowel(str.charAt(l - 1));
			}

			return vowelno(str, l - 1)
				+ isVowel(str.charAt(l - 1));
		}

		public static void main(String[] args)
			throws IOException
		{
			String str = "java is programming lanagauge";

			str = str.toLowerCase();

			System.out.println(
				"Total number of vowels in given string are:");

			System.out.println(vowelno(str, str.length()));
		}
	}


