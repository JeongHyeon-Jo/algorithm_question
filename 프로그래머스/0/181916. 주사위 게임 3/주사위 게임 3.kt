import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0
        var numList = mutableListOf<Int>(a, b, c, d)
        var numSet = numList.toMutableSet().toMutableList()
        var temp = 0

        when(numSet.size){
            1 -> answer = 1111 * a
            2 -> {
                var tripleList = numSet.filter{ n -> numList.count{ it == n } == 3 }.toList()
                if(tripleList.size != 0){
                    var oneList = numSet.filter{ n -> numList.count{ it == n } == 1 }.toList()
                    answer = (10 * tripleList[0] + oneList[0]) * (10 * tripleList[0] + oneList[0])
                } else{
                    answer = (numSet[0] + numSet[1]) * abs(numSet[0] - numSet[1])
                }
            }
            3 -> {
                var soloList = numSet.filter{ n -> numList.count{ it == n } == 1 }.toList()
                answer = soloList[0] * soloList[1]
            } 
            4 -> answer = numList.minOrNull() ?: 0
        }
        
        return answer
    }
}