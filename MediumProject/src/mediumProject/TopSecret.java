package mediumProject;

public class TopSecret {
	private String text;
	
	public TopSecret(String text) {
		this.setTopSecret(text);
	}
	
	public String getTopSecret() {
		return this.text;
	}
	
	public void setTopSecret(String text) {
		this.text = text;
	}
	
	private String underscores(int numUnderScores) {
		String underScores = "";
		for (int x = 0; x<numUnderScores;x++) {
			underScores = underScores.concat("_");
		}
		return underScores;
	}
	
	public TopSecret redact(String[] theRedactedWords) {
		for (int x = 0; x < theRedactedWords.length; x++) {
			for (int z = 0; z < this.text.length()-theRedactedWords[x].length(); z++) {
				if(this.text.substring(z,z + theRedactedWords[x].length()).equalsIgnoreCase(theRedactedWords[x])) {
					String subStringOne = this.text.substring(0, z);
					String subStringTwo = this.text.substring(z + theRedactedWords[x].length(), this.text.length());
					String toConcatonate = underscores(theRedactedWords[x].length());
					this.text = subStringOne + toConcatonate + subStringTwo;
				}
			}
		}
		return new TopSecret(this.text);
	}
	
	public String toString() {
		return this.text;
	}
}
