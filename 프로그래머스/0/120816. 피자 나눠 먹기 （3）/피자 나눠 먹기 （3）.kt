class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
        var pizza = 1
        
        while(true) {
            if(pizza * slice >= n) { break }
            pizza++
        }
        
        answer = pizza
        
        return answer
    }
}