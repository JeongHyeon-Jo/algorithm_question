class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n - lost.size
        var lolist = lost.sortedArray().toMutableList()
        var relist = reserve.toMutableList()
        
        for(j in lolist){
            if(relist.contains(j)){
                answer++
                relist.remove(j)
                lolist = lolist.filter{ it != j }.toMutableList()
            }
        }
        
        for(i in lolist){
            if(relist.contains(i-1)){
                answer++
                relist.remove(i-1)
            } else if(relist.contains(i+1)){
                answer++
                relist.remove(i+1)
            }
        }
        
        return answer
    }
}