class Solution {
    fun solution(strArr: Array<String>): Int {
        var answer: Int = 0
        var lengthArr = strArr.map { it.length }.toIntArray()
        var maxCount = 0
        var temp = 0
        
        for(c in 1 .. 30) {
            temp = lengthArr.count{ it == c }
            if(maxCount <= temp) {
                maxCount = temp
                answer = maxCount
            }
        }
        
        return answer
    }
}