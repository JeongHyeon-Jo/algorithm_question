class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        var avalue = a
        var bvalue = b
        
        for(i in 2 .. b) {
            while(avalue % i == 0 && bvalue % i == 0) {
                avalue /= i
                bvalue /= i
            }
        }
        
        while(bvalue % 2 == 0 || bvalue % 5 == 0) {
            if(bvalue % 2 == 0) bvalue /= 2
            if(bvalue % 5 == 0) bvalue /= 5
        }
        
        if(bvalue == 1) answer = 1 else answer = 2
        
        return answer
    }
}