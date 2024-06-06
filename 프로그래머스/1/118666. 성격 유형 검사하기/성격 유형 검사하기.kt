class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        var R = 0; var T = 0
        var C = 0; var F = 0
        var J = 0; var M = 0
        var A = 0; var N = 0
        var temp = ""
        var no = ""; var yes = ""
        
        for(i in 0 .. survey.size-1){
            temp = survey[i]
            no = temp.substring(0 .. 0)
            yes = temp.substring(1 .. 1)
            when(choices[i]){
                1 -> { when(no){
                    "R" -> R+=3; "T" -> T+=3; "C" -> C+=3; "F" -> F+=3
                    "J" -> J+=3; "M" -> M+=3; "A" -> A+=3; else -> N+=3
                } }
                2 -> { when(no){
                    "R" -> R+=2; "T" -> T+=2; "C" -> C+=2; "F" -> F+=2
                    "J" -> J+=2; "M" -> M+=2; "A" -> A+=2; else -> N+=2
                 } }
                3 -> { when(no){
                    "R" -> R++; "T" -> T++; "C" -> C++; "F" -> F++
                    "J" -> J++; "M" -> M++; "A" -> A++; else -> N++
                 } }
                4 -> {  }
                5 -> { when(yes){
                    "R" -> R++; "T" -> T++; "C" -> C++; "F" -> F++
                    "J" -> J++; "M" -> M++; "A" -> A++; else -> N++
                 } }
                6 -> { when(yes){
                    "R" -> R+=2; "T" -> T+=2; "C" -> C+=2; "F" -> F+=2
                    "J" -> J+=2; "M" -> M+=2; "A" -> A+=2; else -> N+=2
                 } }
                7 -> { when(yes){
                    "R" -> R+=3; "T" -> T+=3; "C" -> C+=3; "F" -> F+=3
                    "J" -> J+=3; "M" -> M+=3; "A" -> A+=3; else -> N+=3
                 } }
                else -> { println("${i+1}번선택지를 선택하시오") }
            }
        }
        
        if(R >= T) answer += "R" else answer += "T"
        if(C >= F) answer += "C" else answer += "F"
        if(J >= M) answer += "J" else answer += "M"
        if(A >= N) answer += "A" else answer += "N"
        
        return answer
    }
}