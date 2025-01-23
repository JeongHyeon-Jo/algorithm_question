class Solution {
    fun solution(money: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var americano = money / 5500
        var left = money - americano * 5500
        
        answer = answer.plus(americano)
        answer = answer.plus(left)
        
        return answer
    }
}