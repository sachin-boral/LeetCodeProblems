package leetCode75DayChallenge;

public class MergeStringAlternatley {
	public static void main(String[] args) {
		mergeAlternately("abcd", "pq");
	}

	public static String mergeAlternately(String s1, String s2) {
		StringBuffer mergedString = new StringBuffer();
		int minLen = Math.min(s1.length(), s2.length());

		for (int i = 0; i < minLen; i++) {
			mergedString.append(s1.charAt(i)).append(s2.charAt(i));
		}

		if (s1.length() > s2.length()) {
			mergedString.append(s1.substring(minLen));
		} else {
			mergedString.append(s2.substring(minLen));
		}

		return mergedString.toString();
	}
}
