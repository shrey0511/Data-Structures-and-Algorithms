

public class code {
    public static void main(String[] args) {
        
    }   
    
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int element:nums1){
            set1.add(element);
        }
        for(int element:nums2){
            if(set1.contains(element)){
                set2.add(element);
            }
        }

        int[] result = new int[set2.size()];
        int i = 0;
        for(int element:set2){
            result[i]=element;
            i++;
        }
        return result;
    }
}
