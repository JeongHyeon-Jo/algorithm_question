class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"
        var tempin1 = 0
        var tempin2 = 0
        
        for(v in goal){
            if(cards1.contains(v)){
                if(tempin1 == cards1.indexOf(v)){
                    tempin1++
                } else { answer = "No"; break }
            }
            else if(cards2.contains(v)){
                if(tempin2 == cards2.indexOf(v)){
                    tempin2++
                } else { answer = "No"; break }
            } else { answer = "No"; break }
        }
        
        return answer
    }
}