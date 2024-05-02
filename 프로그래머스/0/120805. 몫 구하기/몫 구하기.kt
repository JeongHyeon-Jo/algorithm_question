class Solution {
    fun limit(num: Int): Boolean{
        var permission: Boolean = true
        if(num < 0) permission = false
        if(num > 100) permission = false
        
        return permission
    }
    
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if(limit(num1) && limit(num2))
            answer = num1 / num2
        
        return answer
    }
}