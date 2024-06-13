class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var round = 1
        var a_group = (a+1) / 2
        var b_group = (b+1) / 2
        
        while(a_group != b_group){
            a_group = (a_group + 1) / 2
            b_group = (b_group + 1) / 2
            round++
        }
        
        answer = round
        
        return answer
    }
}