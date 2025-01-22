class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var lcm = 1; var gcd = if(denom1 > denom2 ) denom1 else denom2
        var temp = 0
        var child1 = 0; var child2 = 0
        
        while(true) {
            if(denom1 % gcd == 0 && denom2 % gcd == 0) break
            gcd--
        }
        lcm = denom1 * denom2 / gcd
        
        temp = lcm / denom1
        child1 = numer1 * temp
        
        temp = lcm / denom2
        child2 = numer2 * temp
        
        var childL = child1 + child2
        var parrL = lcm
        var count = parrL
        
        while(count > 1) {
            if(childL % count == 0 && parrL % count == 0) {
                childL = childL / count
                parrL = parrL / count
            }
            count --
        }
        
        answer += childL
        answer += parrL
        
        
        return answer
    }
}