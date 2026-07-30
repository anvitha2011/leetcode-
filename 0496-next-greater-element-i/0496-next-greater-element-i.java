class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            int ar[] = new int[nums1.length];
            int x = 0;
          
              for(int i = 0; i < nums1.length; i++) {
                  int a = 0;
       
                for(int j=0 ; j<nums2.length ; j++){
                    if(nums1[i]==nums2[j]) {
                       a = j;
                   break;
                 }  
            }
            int  max = -1;
            for(int k=a+1 ; k<nums2.length ; k++){
                if(nums2[k] > nums2[a]  ){
                max = nums2[k];
                break;
            }
            }

    
            ar[i] = max;
           
        }


        return ar;
    }
}