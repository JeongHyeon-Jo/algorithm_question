class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for((i, v) in strArr.withIndex()){
            if(i % 2 == 0) {
                answer += v.toLowerCase()
            } else {
                answer += v.toUpperCase()
            }
        }
        
        return answer
    }
}