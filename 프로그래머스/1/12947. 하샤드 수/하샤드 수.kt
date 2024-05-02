class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = 0
        var num: Int = x
        
        while (num != 0){
            sum += num % 10
            num /= 10
        }
        
        if(x % sum == 0){
            answer = true
            println("x는 하샤드 수입니다.")
        } else {
            answer = false
            println("x는 하샤드 수가 아닙니다.")
        }
        
        
        return answer
    }
}