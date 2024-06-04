class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        var smap = s.map{ it.toInt() }
        var skmap = skip.map{ it.toInt() }.toList().sorted()
        var comlist = mutableListOf<Int>()
        var temp = 0
        
        for(sm in smap){
            temp = sm + index
            for(sk1 in skmap){
                if(sk1 > sm && sk1 <= temp) { temp++ }
            }
            while(temp > 122) { 
                temp -= 26 
                for(sk2 in skmap){
                    if(sk2 <= temp) { temp++ }
                }
            }
            comlist.add(temp)
        }
        
        answer = comlist.map{ it.toChar() }.joinToString("")
        
        return answer
    }
}