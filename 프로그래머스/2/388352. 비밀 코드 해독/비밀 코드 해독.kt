class Solution {
    fun solution(n: Int, q: Array<IntArray>, ans: IntArray): Int {
        var answer: Int = 0
        
        for(s1 in 1 .. n - 4) {
            for(s2 in s1 + 1 .. n - 3) {
                for(s3 in s2 + 1 .. n - 2) {
                    for(s4 in s3 + 1 .. n - 1) {
                        for(s5 in s4 + 1 .. n) {
                            var isSatisfied = true
                            for((i, av) in ans.withIndex()) {
                                var count = 0
                                for(qv in q[i]) {
                                    if(qv == s1 || qv == s2 || qv == s3 || qv == s4 || qv == s5) {
                                        count++
                                    }
                                }
                                if(count != av) {
                                    isSatisfied = false
                                    break
                                } 
                            }
                            if(isSatisfied) {
                                answer++
                            }
                        }
                    }
                }
            }
        }
        
        return answer
    }
}