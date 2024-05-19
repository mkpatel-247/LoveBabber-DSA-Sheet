// Problem Link: https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
function permute(str, l, r, uniqueStr){
    if(l==r){
        if(!str.includes(uniqueStr)){
            uniqueStr.add(str);
        }
        return;
    } else {
        for(let i=l; i<=r; i++){
            str = swap(str, l, i);
            permute(str, l+1, r, uniqueStr);
        }
    }
}
function swap(str, i, j){
    let arr = str.split("");
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr.join("");
}

class Solution {
    find_permutation(S){
        //code here
        let ansArray = [];
        let uniquePermute = new Set();
        permute(S, 0, S.length-1, uniquePermute);
        for(let item of uniquePermute) 
          ansArray.push(item);
        return ansArray.sort();
    }
}
