class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        var answer: Int = 0
        val (year1, month1, day1) = date1.toList()
        val (year2, month2, day2) = date2.toList()
        
        if(year1 < year2) {
            answer = 1
        } else if(year1 > year2) {
            answer = 0
        } else {
            if(month1 < month2) {
                answer = 1
            } else if(month1 > month2) {
                answer = 0
            } else {
                if(day1 < day2) {
                    answer = 1
                } else {
                    answer = 0
                }
            }
        }
        
        return answer
    }
}