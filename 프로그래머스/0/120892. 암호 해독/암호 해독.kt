class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        var clist = cipher.map{ it.toString() }
        
        for(i in code - 1 .. clist.size - 1 step code) {
            answer += clist[i]
        }
        
        return answer
    }
}