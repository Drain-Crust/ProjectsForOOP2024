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
	
	public class Book{
		private String bookTitle;
		private String authorName;
		private boolean borrowed;
		
		public Book(String bookTitle, String authorName) {
			this.setBookTitle(bookTitle);
			this.setAuthorName(authorName);
			this.setBorrowed(false);
		}
		
		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}
		
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		
		public void setBorrowed(boolean borrowed) {
			this.borrowed = borrowed;
		}
		
		public String getBookTitle() {
			return this.bookTitle;
		}
		
		public String getAuthorName() {
			return this.authorName;
		}
		
		public boolean getBorrowed() {
			return this.borrowed;
		}
		
		public String toString() {
			return this.bookTitle + " by " + this.authorName + " is borrowed " + borrowed; 
		}
	}
	
	public class Library{
		private Book[] books;
		private int defaultCapacity = 2;
		
		public Library(int capacity) {
			this.books = new Book[(capacity = (capacity < 1) ? this.defaultCapacity : capacity)];
		}
		
		public String toString() {
			String library = "Contents of the library\n";
			for (int i = 0; i < this.books.length; i++) {
				library += (i+1) + ". " + this.books[i] + "\n";
			}
			return library;
		}
		
		public boolean addBook(Book book) {
			for (int i =0; i < this.books.length; i++) {
				if (this.books[i] == null) {
					this.books[i] = book;
					return true;
				}
			}
			return false;
		}
		
		public Book borrow(String title) {
			for (Book i: this.books) {
				if (title.equals(i.getBookTitle())) {
					i.borrowed = true;
					return i;
				}
			}
			return null;
		}
	}
	
	public class LibraryApp{
		public static void main(String[] args)
		{
			ProjectFour projectFour = new ProjectFour();
			ProjectFour.Library library = projectFour.new Library(5);
			library.addBook(projectFour.new Book("The Lord of the Rings", "J. R. R. Tolkien"));
			library.addBook(projectFour.new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling"));
			library.addBook(projectFour.new Book("1984", "George Orwell"));
			library.addBook(projectFour.new Book("Where the Wild Things Are", "Maurice Sendak"));
			library.addBook(projectFour.new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
			System.out.println(library);
			
			Book aBook = library.borrow("1984");
			System.out.println("Book borrowed: " + aBook);
		}
	}
	
	public class Purchase {
		private String itemName;
		private double itemPrice;
		
		public Purchase(String itemName, double itemPrice) {
			this.setItemName(itemName);
			this.setItemPrice(itemPrice);
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public double getItemPrice() {
			return itemPrice;
		}

		public void setItemPrice(double itemPrice) {
			this.itemPrice = itemPrice;
		}
	}
	
	public class Basket{
		private Purchase[] purchase;
		private int nPurchases;
		private int defaultCapacity = 10;
		
		public Basket(int n) {
			this.purchase = new Purchase[(n = (n < 1) ? this.defaultCapacity : n)];
		}
		
		public void addPurchase(Purchase p) {
			for (Purchase item: this.purchase) {
				if (item == null) {
					item = p;
					this.nPurchases++;
				}
			}
		}
		
		public int getNPurchases() {
			return this.nPurchases;
		}
		
		public Purchase getMostExpensive() {
			Purchase mostExpensive = this.purchase[0];
			for (Purchase item: this.purchase) {
				if (mostExpensive.getItemPrice() < item.getItemPrice()) {
					mostExpensive = item;
				}
			}
			return mostExpensive;
		}
		
		public Purchase[] getPurchases() {
			return this.purchase;
		}
		
		public double total() {
			double sum = 0;
			for (Purchase item: this.purchase) {
				sum += item.getItemPrice();
			}
			return sum;
		}
		
		public void printReceipt() {
			for (Purchase item: this.purchase) {
				System.out.println(String.format("%.2f", item.getItemPrice()));
			}
			System.out.println(total());
		}
	}
	
	public class BasketApp{
		public static void main(String[] args) {
			ProjectFour projectFour = new ProjectFour();
			ProjectFour.Basket basket = projectFour.new Basket(20);
			System.out.println(basket);
			// do something with Basket methods.
		}
	}
	
	public class Matrix{
		private int[][] matrix = new int[2][2];
		
		public Matrix() {
			this.matrix[0][0] = 1;
			this.matrix[1][1] = 1;
			
			this.matrix[0][1] = 0;
			this.matrix[1][0] = 0;
		}
		
		private boolean isValid(int i, int j) {
			return (i < 2 && j < 2)? true : false;
		}
		
		public int read(int i, int j) {
			return (isValid(i, j) == true) ? this.matrix[i][j]: null;
		}
		
		public void write(int i,int j,int value) {
			this.matrix[i][j] = (isValid(i, j) == true) ? value: this.matrix[i][j];
		}
		
		public void scale(int c) {
			for (int j = 0; j < this.matrix.length; j++) {
				for (int i = 0; i < this.matrix[j].length; i++) {
					this.matrix[j][i] *= c;
				}
			}
		}
		
		public Matrix add(Matrix m) {
			Matrix z = new Matrix();
			for (int i = 0; i < this.matrix.length; i++) {
				for (int j = 0; j < this.matrix[j].length; j++) {
					z.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
				}
			}
			return z;
		}
		
		public Matrix mult(Matrix m) {
			Matrix z = new Matrix();
			for (int i = 0; i < this.matrix.length; i++) {
				z.matrix[i][0] = this.matrix[i][0] * m.matrix[0][0] + this.matrix[i][1] * m.matrix[1][0];
				z.matrix[i][1] = this.matrix[i][0] * m.matrix[0][1] + this.matrix[i][1] * m.matrix[1][1];
			}
			return z;
		}
	}
}
