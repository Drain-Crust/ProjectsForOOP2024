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
	
	public class SimpleDate{
		private int day;
		private int month;
		private int year;
		
		public SimpleDate(int day, int month, int year) {
			setDate(day, month, year);
		}
		
		public SimpleDate() {
			setDate(1, 1, 2000);
		}
		
		public void setDate(int day, int month, int year) {
			this.setDay(day);
			this.setMonth(month);
			this.setYear(year);
		}
		
		public int getDay() {
			return day;
		}
		
		public void setDay(int day) {
			this.day = (day >= 1 && day <= 31) ? day : 1;
		}
		
		public int getMonth() {
			return month;
		}
		
		public void setMonth(int month) {
			this.month = (month >= 1 && year <= 12) ? month : 1;
		}
		
		public int getYear() {
			return year;
		}
		
		public void setYear(int year) {
			this.year = (year >= 2000 && year <= 2024) ? year : 2000;
		}
		
		public String toString() {
			return this.day + "/" + this.month + "/" + this.year;
		}
	}
	
	public class SimpleDateApplication{
		public static void main(String[] args) {
			ProjectFive projectFive = new ProjectFive();
			ProjectFive.SimpleDate d1 = projectFive.new SimpleDate();
			d1.setDay(22);
			d1.setMonth(3);
			d1.setYear(2019);
			System.out.println(d1);
			SimpleDate d2 = projectFive.new SimpleDate(14,03,2019);
			System.out.println(d2);
		}
	}
	
	public class Count{
		private String value;
		
		public Count () {
			value = "";
		}
		
		public void successor() {
			this.value += "S";
		}
		
		public void predessor() {
			char[] cha = this.value.toCharArray();
			cha[this.value.length()] = ((cha[this.value.length()] == 'S') ? "".charAt(0) : cha[this.value.length()]);
			this.value = new String(cha);
		}
		
		public String toString() {
			int count = 0;
			for (char i : this.value.toCharArray()) {
				if (i == 'S') {
					count++;
				}
			}
			return Integer.toString(count);
		}
		
		public void add(Count s) {
			
		}
	}
}
