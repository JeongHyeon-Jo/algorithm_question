class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var nlist = num_list
        var l = nlist.size
        
        if(nlist[l-1] > nlist[l-2]){
            answer = nlist.plus(nlist[l-1] - nlist[l-2])
        } else {
            answer = nlist.plus(nlist[l-1] * 2)
        }
        
        return answer
    }
}