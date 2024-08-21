class Solution {
    public boolean canTransform(String start, String end) {
        if(!start.replace("X","").equals(end.replace("X",""))) return false;
        if(start.length()>end.length() || end.length()>start.length()) return false;
        
		
        ArrayList<Integer> lstart = new ArrayList<>(); 
        ArrayList<Integer> lend = new ArrayList<>(); 
        ArrayList<Integer> rstart = new ArrayList<>(); 
        ArrayList<Integer> rend = new ArrayList<>(); 

        for(int i=0;i<start.length();i++){
            if(start.charAt(i)=='L') lstart.add(i);
            if(start.charAt(i)=='R') rstart.add(i);
		
        }

        for(int i=0;i<end.length();i++){
            if(end.charAt(i)=='L') lend.add(i);
            if(end.charAt(i)=='R') rend.add(i);

        }
        
		//For L
        int i=0,j=0;
        while(i<lstart.size() && j<lend.size()){
            if (lend.get(j)>lstart.get(i)) return false;    
            i++;
            j++;
        }
        
		//For R
        i=0;j=0;
         while(i<rstart.size() && j<rend.size()){
            if (rend.get(j)<rstart.get(i)) return false;  
             i++;
             j++;
        }
        
        return true;
    }
}