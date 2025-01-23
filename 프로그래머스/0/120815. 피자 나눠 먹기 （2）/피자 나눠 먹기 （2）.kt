class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var pizza = 1
        
        while(true) {
            if(pizza * 6 % n == 0) { break }
            pizza++
        }
        
        answer = pizza
        
        return answer
    }
}