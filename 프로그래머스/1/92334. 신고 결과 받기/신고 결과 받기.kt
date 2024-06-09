class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val dis_rep = report.distinct()
        var rep_cnt = HashMap<String,Int>()
        var id_cnt = HashMap<String,Int>()
        var name = ""; var target = ""
        var temp1 = 0; var temp2 = 0
        
        for(id in id_list){
            id_cnt[id] = 0
            rep_cnt[id] = 0
        }
        
        for(rt in dis_rep){
            target = rt.split(" ").last()
            temp1 = rep_cnt[target]!! + 1
            rep_cnt[target] = temp1
        }
        
        for(re in dis_rep){
            name = re.split(" ").first()
            target = re.split(" ").last()
            temp1 = rep_cnt[target]!!
            if(temp1 >= k){
                temp2 = id_cnt[name]!! + 1
                id_cnt[name] = temp2
            }
        }
        
        for(il in id_list){
            temp1 = id_cnt[il]!!
            answer += temp1
        }
        
        return answer
    }
}