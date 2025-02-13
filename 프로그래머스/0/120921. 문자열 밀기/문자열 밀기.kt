class Solution {
    fun solution(A: String, B: String): Int {
        var answer: Int = - 1
        var Aarr = A.toCharArray()
        
        for(i in 0 .. Aarr.size) {
            if(Aarr.joinToString("") == B) {
                answer = i
                break
            } else {
                var temp = Aarr[Aarr.size - 1]
                for(j in Aarr.size - 1 downTo 0) {
                    if(j == 0) {
                        Aarr[0] = temp
                    } else {
                        Aarr[j] = Aarr[j - 1]
                    }
                }
            }
        }
        
        return answer
    }
}