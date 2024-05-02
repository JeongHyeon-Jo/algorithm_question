class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var sum: Int = 0
        if(n > 0 && n <= 1000){
           for (i: Int in 1..n){
               if(i%2 == 0){
                   sum += i
               }
           }

           answer = sum
        }
        else{
            println("제한사항을 지키시오. 0 < n ≤ 1000")
        }
        return answer
    }
}