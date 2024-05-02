class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 0
        
        if(angle > 0 && angle < 90){
            answer = 1
        }
        else if(angle == 90){
            answer = 2
        }
        else if(angle > 90 && angle < 180){
            answer = 3
        }
        else if(angle == 180){
            answer = 4
        }
        else {
            println("제한 사항 밖입니다. (0 < angle ≤ 180)")
        }
        
        
        return answer
    }
}