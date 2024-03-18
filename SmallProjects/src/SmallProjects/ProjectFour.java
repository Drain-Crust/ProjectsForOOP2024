package SmallProjects;

import java.util.Random;

public class ProjectFour {
	
	public class NumberList{
		private int[] arrayList = new int[10];
		
		public NumberList() {
			for (int i = 0; i < this.arrayList.length;i++) {
				this.arrayList[i] = 0;
			}
		}
		
		public NumberList(int upperBound) {
			Random random = new Random();
			for (int i = 0; i < this.arrayList.length;i++) {
				this.arrayList[i] = random.nextInt(upperBound-1);;
			}
		}
		
		public int size() {
			return this.arrayList.length;
		}
		
		public String toString() {
			String numbers = "";
			for (int i : this.arrayList) {
				numbers = numbers + i + " ,";
			}
			return numbers;
		}
		
		private boolean isValid(int i) {
			return (i < this.arrayList.length)? true : false;
		}
		
		public void update(int i, int value) {
			if(isValid(i) == true) {
				this.arrayList[i] = value;
			}
		}
		
		public int min() {
			int min = this.arrayList[0];
			for (int i : this.arrayList) {
				if (min > i){
					min = i;
				}
			}
			return min;
		}
		
		public int max() {
			int max = this.arrayList[0];
			for (int i : this.arrayList) {
				if (max < i){
					max = i;
				}
			}
			return max;
		}
		
		public int nonZero() {
			int count = 0;
			for (int i : this.arrayList) {
				if (i != 0) {
					count++;
				}
			}
			return count;
		}
		
		public double average() {
			int sum = 0;
			for (int i : this.arrayList) {
				sum += i;
			}
			return (double)sum / (double)this.arrayList.length;
		}
		
		public int getNumber(int i) {
			return this.arrayList[i];
		}
		
		public void absolute() {
			for (int i = 0; i < this.arrayList.length; i++) {
				this.arrayList[i] = Math.abs(this.arrayList[i]);
			}
		}
		
		public void scale(int f) {
			for (int i = 0; i < this.arrayList.length; i++) {
				this.arrayList[i] = f * this.arrayList[i];
			}
		}
		
		public NumberList sub(int startIndex, int endIndex) {
			NumberList newNumberList = new NumberList();
			for (int i = startIndex; i<= endIndex; i++) {
				newNumberList.update(i, this.arrayList[i]);
			}
			return newNumberList;
		}
		
		public class NumberListTest{
			

			public static void main(String[] args) {
				ProjectFour projectFour = new ProjectFour();
				NumberList numberList = projectFour.new NumberList();
				System.out.println(numberList);
				// do some stuff with the different methods within the NumberList class.
			}
		}
	}
	
	
	
	
	
}
