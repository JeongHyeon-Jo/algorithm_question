class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 123456789
        var sum: Int = 0
        
        if(absolutes.size == signs.size){
            for (i in 0..(signs.size-1)){
                if(signs[i] == true){
                    sum += absolutes[i]
                } else if (signs[i] == false) {
                    sum -= absolutes[i]
                }
            }
            answer = sum
        } else {
            println("두 배열의 크기가 다릅니다.")
        }
        
        return answer
    }
}