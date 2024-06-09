class Solution {
    
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var to_list = today.split(".")
        var tyear = to_list[0].toInt()
        var tmonth = to_list[1].toInt()
        var tday = to_list[2].toInt()
        var terms_list = mutableListOf<String>()
        
        for(t in terms){
            terms_list.add(t.split(" ").first())
            terms_list.add(t.split(" ").last())
        }
        
        for((i, p) in privacies.withIndex()){
            var pri_list = p.split(" ")
            var date_list = pri_list[0].split(".")
            var year = date_list[0].toInt()
            var month = date_list[1].toInt()
            var day = date_list[2].toInt()
            
            month += terms_list[terms_list.indexOf(pri_list[1]) + 1].toInt()
            if(month > 12) { month -= 12; year += 1 }
            
            if((12 * 28 * tyear + 28 * tmonth + tday) - (12 * 28 * year + 28 * month + day) >= 0){
                answer += i + 1
            }
        }
        
        return answer
    }
}