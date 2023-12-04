class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String newStr = new String(wordArr);
            if(!map.containsKey(newStr)){
                map.put(newStr, new ArrayList<>());
            }
            map.get(newStr).add(word);
        }

        return new ArrayList<>(map.values());
    }
}