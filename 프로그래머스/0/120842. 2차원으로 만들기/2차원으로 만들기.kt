class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        var start = 0
        var index = 0
        
        while(true) {
            var end = start + n - 1
            var row = IntArray(n)
            for(i in start .. end) {
                row[index] = num_list[i]
                index++
            }
            answer = answer.plus(row)
            start += n
            index = 0
            if(start >= num_list.size) { break }
        }
        
        return answer
    }
}