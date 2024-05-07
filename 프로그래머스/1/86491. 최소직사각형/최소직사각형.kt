class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var l = 0
        var s = 0
        var lmax = 0
        var smax = 0 
        for(w in sizes.indices){
            if(sizes[w][0] > sizes[w][1]) {l = sizes[w][0]; s = sizes[w][1]}
            else {l = sizes[w][1]; s = sizes[w][0]}
            if(l > lmax) lmax = l
            if(s > smax) smax = s
        }
        
        answer = lmax * smax
        
        return answer
    }
}