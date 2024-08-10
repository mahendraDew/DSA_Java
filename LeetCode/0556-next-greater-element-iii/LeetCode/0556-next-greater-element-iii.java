class Solution {
    public int nextGreaterElement(int n) {
        String nStr = Integer.toString(n);  
        char[] arr = nStr.toCharArray();
        
        int i = arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        
        if(i == -1){
            return -1;
        }

        int k = arr.length-1;
        while(arr[k] <= arr[i]){
            k--;
        }

        char temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j<= i; j++){
            sb.append(arr[j]);
        }
        for(int j = arr.length-1; j>i; j--){
            sb.append(arr[j]);
        }

        long ans = Long.parseLong(sb.toString());
        if(ans > Integer.MAX_VALUE){
            return -1;
        }
        return (int)ans;
    }
}