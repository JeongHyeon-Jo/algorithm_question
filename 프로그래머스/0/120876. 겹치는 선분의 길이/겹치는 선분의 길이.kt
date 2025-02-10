class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer: Int = 0
        var narr = emptyArray<String>()
        
        for(i in lines.indices) {
            var start = lines[i][0]
            var end = lines[i][1]
            for(j in start until end) {
                narr = narr.plus("${j},${j+1}")
            }
        }
        
        var filt = narr.filter{ a -> narr.count{ b -> a == b } >= 2 }.distinct()
        
        answer = filt.size
        
        return answer
    }
}