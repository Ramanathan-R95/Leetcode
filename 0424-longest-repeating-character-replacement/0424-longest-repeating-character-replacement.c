int characterReplacement(char* s, int k) {
    int result=0;
    int maxFreq=0;
    char *l=s;
    char *r=s;
    int freq[26]={0};
    while(*r != NULL){
        freq[*r -'A']++;
        if(freq[*r -'A'] > maxFreq)  maxFreq = freq[*r -'A'];
        if(r-l+1 - maxFreq <= k) result=( r-l+1 > result)? r-l+1:result;
        else{
            freq[*l -'A']--;
            l++;
        }
        r++;



    }
    return result;
    
}