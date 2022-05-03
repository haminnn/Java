
public class HashMap_wordFind {
	public String word;
	public String mean;
	
	public HashMap_wordFind(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HashMap_wordFind) {
			HashMap_wordFind wordfind = (HashMap_wordFind) obj;
			return (mean.equals(wordfind.mean));
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return word.hashCode() + mean.hashCode();
	}
	
	@Override
	public String toString() {
		return "단어 : " + word + ",  " + "의미" + mean;
	}

}
