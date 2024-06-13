class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        var size = arr.size
        while(true){
            answer++
            if(size == arr.filter{ answer % it == 0 }.size) {
                break
            }
        }
        
        return answer
    }
}