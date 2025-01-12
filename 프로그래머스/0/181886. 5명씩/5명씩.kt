class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for(i in 0 .. names.size - 1 step 5) {
            answer += names[i]
        }
        
        return answer
    }
}