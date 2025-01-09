class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var temp = 0
        
        for(i in l..r){
            var iarr = i.toString().toCharArray()
            temp = iarr.filter{ it == '5' || it == '0' }.size
            if(iarr.size == temp) answer += i
        }
        
        if(answer.size == 0) answer += -1
        
        return answer
    }
}