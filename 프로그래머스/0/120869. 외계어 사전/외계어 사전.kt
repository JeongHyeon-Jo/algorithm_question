class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = 0
        var df = dic
        for(s in spell) {
            df = df.filter { a ->
                a.count{ b ->
                    b.toString() == s
                } == 1
            }.toTypedArray()
        }
        
        if(df.size > 0) answer = 1 else answer = 2
        
        return answer
    }
}