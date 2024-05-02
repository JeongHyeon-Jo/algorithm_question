class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var count: Int = 0
        
        for (now in left .. right){
            for(i in 1 .. now) {
                if (now % i == 0) { ++count }
            }
            
            if(count % 2 == 0) {
                answer += now
            } else {
                answer -= now
            }
            count = 0
        }
        
        return answer
    }
}