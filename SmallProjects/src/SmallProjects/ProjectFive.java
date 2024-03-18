package SmallProjects;

public class ProjectFive {
	public class StringCompute{
		private String str;
		private char[] strChars = str.toCharArray();
		
		public StringCompute(String str) {
			this.setStr(str);
		}

		public String getStr() {
			return str;
		}

		public void setStr(String str) {
			this.str = str;
		}
		
		public int countOccurances(char ch) {
			int count = 0;
			for(char i : this.strChars) {
				if (ch == i) {
					count++;
				}
			}
			return count;
		}
		
		public boolean hasOnlyDigits() {
			boolean state = true;
			for (char i: this.strChars) {
				if ((int)i < '0' || (int)i > '9') {
					state = false;
				}
			}
			return state;
		}
		
		public String removeChar(char ch) {
			String st = "";
			for (char i: this.strChars) {
				if (i != ch) {
					st += i;
				}
			}
			return st;
		}
		
		public boolean isPalindrom() {
			for(int i = 0; i < strChars.length; i++) {
				if(strChars[i] != strChars[strChars.length-i]) {
					return false;
				}
			}
			return true;
		}
		
		public void duplicate(String s) {
			if (this.str.equals(s)) {
				this.str = s + s.toUpperCase();
			} else {
				this.str = s;
			}
		}
	}
}
