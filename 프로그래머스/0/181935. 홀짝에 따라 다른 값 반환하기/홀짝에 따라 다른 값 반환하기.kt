class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var count = 0
        if(n % 2 == 0){
            while(count <= n){
                answer += (count * count)
                count += 2
            }
        } else {
            count = 1
            while(count <= n){
                answer += count
                count += 2
            }
        }
        return answer
    }
}