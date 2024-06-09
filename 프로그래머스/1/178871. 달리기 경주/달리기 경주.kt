class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var answer= Array<String>(players.size,{""})
        var rank = HashMap<Int,String>()
        var player = HashMap<String,Int>()

        for((i, v) in players.withIndex()){
            rank[i] = v
            player[v] = i
        }
        
        callings.forEach {
            val winer = it
            val winerrank = player[it]!!-1

            val loser = rank[winerrank]!!
            val loserrank = winerrank+1

            player[winer] = winerrank
            rank[winerrank] = winer

            player[loser] = loserrank
            rank[loserrank] = loser
        }
        rank.forEach {
            answer[it.key] = it.value
        }
        
        
        return answer
    }
}