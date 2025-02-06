class Solution {
    fun solution(s: String): String {
        var answer: String = ""
        var sarr = s.toCharArray()
        var sset = sarr.toSet()
        var sfilter = sset.filter{ a -> sarr.count{ b -> b == a } == 1 }.toTypedArray().sortedArray()
        
        answer = sfilter.joinToString("")
        
        return answer
    }
}