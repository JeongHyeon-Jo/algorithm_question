class Solution {
    fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {
        var answer: Int = 0
        
        for(n in 0 until schedules.size) {
            var isGift = true
            val hopeTime = schedules[n]
            val deadLine = 
                if((hopeTime + 10) % 100 >= 60) { hopeTime + 100 - 60 + 10 }
                else { hopeTime + 10 }
            for(s in 0 .. 6) {
                if(startday + s == 6 || startday + s == 7 || startday + s == 13) continue
                val daylog = timelogs[n][s]
                if(daylog > deadLine) {
                    isGift = false
                    break
                }
            }
            if(isGift) {
                answer++
            }
        }
        return answer
    }
}