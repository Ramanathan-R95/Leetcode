void moveZeroes(int* nums, int numsSize) {
    int l=0;
    int r=0;
    int t;
    while (l < numsSize){
        if (*(nums+l)==0)
            break;
        l++;
    }
    r=l+1;
    while ( r < numsSize){
        if (*(nums+r)!=0){
            t=*(nums+r);
            *(nums+r)=*(nums+l);
            *(nums+l)=t;
            l++;


        }
        r++;


    }
    
}