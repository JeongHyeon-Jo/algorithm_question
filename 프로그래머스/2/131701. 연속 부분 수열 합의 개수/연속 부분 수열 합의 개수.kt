class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        val eleList = mutableListOf<Int>()
        var size = elements.size
        var leng = 1
        
        while(leng <= size) {
            for(i in elements.indices) {
                var sum = 0
                for(l in 1 .. leng) {
                    if(i + l <= size) {
                        sum += elements[i + l - 1]    
                    } else {
                        sum += elements[i + l - 1 - size]   
                    }
                }
                eleList.add(sum)
            }
            leng++
        }
        
        answer = eleList.distinct().size
        
        return answer
    }
}