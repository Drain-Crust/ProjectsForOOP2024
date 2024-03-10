package mediumProject;

public enum Keyword {
	FOX(0), QUICK(0), LAZY(0), BROWN(0), CAT(0);
	private int frequencies;
	
	private Keyword(int frequencies) {
		this.setFrequencies(frequencies);
	}
	
	public int getFrequencies() {
		return this.frequencies;
	}
	
	public void setFrequencies(int frequencies) {
		this.frequencies = frequencies;
	}
	
	public String toString() {
		return this.name().toLowerCase() + ": " + this.getFrequencies();
	}
}
