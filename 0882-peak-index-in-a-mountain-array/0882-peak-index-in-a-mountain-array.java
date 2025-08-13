class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int m;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            m=(s+e)/2;
            if(arr[m] > arr[m+1] && arr[m] > arr[m-1]) return m;
            else if (arr[m] < arr[m+1]) s=m+1;
            else e=m-1;
        }
        return -1;

        
    }
}