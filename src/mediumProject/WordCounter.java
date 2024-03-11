package mediumProject;

public class WordCounter {
	String text;
	int[] frequencies;
	
	public enum Keyword {
		FOX, QUICK, LAZY, BROWN, CAT;
	}
	
	public WordCounter(String text) {
		this.frequencies = new int[Keyword.values().length];
		this.setText(text);
	}
	
	private int[] keywordFrequency() {
		String[] splitText = this.text.split(" ");
		for (String word : splitText) {
			for (Keyword keyword:Keyword.values()) {
				if (word.equalsIgnoreCase(keyword.toString())) {
					this.frequencies[keyword.ordinal()]++;
				}
			}
		}
		return this.frequencies;
	}
	
	public void setText(String text) {
		this.text = text;
		setFrequencies();
	}
	
	public String getText() {
		return this.text;
	}
	
	private void setFrequencies() {
		this.frequencies = keywordFrequency();
	}
	
	public int[] getFrequencies() {
		return this.frequencies;
	}
	
	@Override
	public String toString() {
		String data = "";
		for (int x = 0; x < this.frequencies.length; x++) {
			data = data + Keyword.values()[x].toString() + ": " + this.frequencies[x] + " ";
		}
		return data + "\n";
	}
}
