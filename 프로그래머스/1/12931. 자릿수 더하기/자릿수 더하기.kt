class Solution {
    fun check_limit(num: Int): Boolean{
        return if(num > 0 && num <= 100_000_000) true else false
    }
    
    fun solution(n: Int): Int {
        var answer = 0
        var sum = 0
        var temp = 0
        var num: Int = n
        if(check_limit(n)){
            while (num != 0){
                temp = num / 10
                sum += num % 10
                num = temp
            }
            answer = sum
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println("출력 : $answer")

        return answer
    }
}