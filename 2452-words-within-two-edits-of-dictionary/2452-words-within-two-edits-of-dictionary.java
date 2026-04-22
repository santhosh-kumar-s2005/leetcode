class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
		List<String> ans = new ArrayList<>(queries.length);
		for (String query : queries) {
			if (match(query, dictionary)) {
				ans.add(query);
			}
		}
		return ans;
	}

	private boolean match(String query, String[] dictionary) {
		for (String word : dictionary) {
			int cnt = 0;
			for (int i = 0; i < query.length(); i++) {
				if (query.charAt(i) != word.charAt(i)) {
					cnt++;
					if (cnt > 2) {
						break;
					}
				}
			}
			if (cnt <= 2) {
				return true;
			}
		}
		return false;
	}
}