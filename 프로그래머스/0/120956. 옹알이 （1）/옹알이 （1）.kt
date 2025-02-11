class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        
        for(b in babbling) {
            var temp = b
            if(temp.contains("aya")) {
                temp = temp.replace("aya", "☆")
            }
            if(temp.contains("ye")) {
                temp = temp.replace("ye", "☆")
            }
            if(temp.contains("woo")) {
                temp = temp.replace("woo", "☆")
            }
            if(temp.contains("ma")) {
                temp = temp.replace("ma", "☆")
            }
            if(temp.replace("☆", "") == "") {
                answer++
            }
        }
        
        return answer
    }
}