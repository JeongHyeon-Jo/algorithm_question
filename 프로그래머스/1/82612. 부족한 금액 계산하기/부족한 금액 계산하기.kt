class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var bill = 0L
        
        for(i in 1..count){
            bill += (price * i).toLong()
        }
        
        if(money >= bill) answer = 0L
        else answer = (bill - money).toLong()
        
        return answer
    }
}