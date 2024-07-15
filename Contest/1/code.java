//https://leetcode.com/contest/weekly-contest-406/problems/lexicographically-smallest-string-after-a-swap/

class code{
    public String getSmallestString(String s) {
        char[] c = s.toCharArray();
        for(int i = 0 ; i<c.length-1 ; i++){
            if(c[i] > c[i+1] && checkParity(c[i]-'0',c[i+1]-'0')){
                swap(c , i , i+1);
                break;
            }
        }
        return new String(c);
    }

    public boolean checkParity(int x,int y){
        if(x % 2 == 0 && y % 2 == 0 || x % 2 != 0 && y % 2 != 0)
            return true;
        return false;
    }

    public void swap(char[] arr,int x , int y){
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}