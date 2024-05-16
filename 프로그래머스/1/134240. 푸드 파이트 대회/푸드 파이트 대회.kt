class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var count = 0
        
        for((i, v) in food.withIndex()){
            if(i == 0) continue
            if(v / 2 == 0) continue
            else {
                while(count < (v / 2)) {
                    answer += i
                    ++count
                }
            }
            count = 0
        }
        
        var temp: String = answer.toCharArray().reversed().joinToString("")
        
        answer = answer + "0" + temp
        
        return answer
    }
}