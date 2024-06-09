class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var direction: String = ""; var distance: Int = 0
        var x_loc = 0; var y_loc = 0;
        val y = park.size
        val x = park[0].length
        var map = Array(y ,{i -> Array<String>(x, { j -> park[i].substring(j .. j)})})
        var poss: Boolean = false

        for(i in map.indices){
            for(j in map[i].indices){
                if(map[i][j] == "S"){
                    x_loc = j; y_loc = i
                }
            }
        }
        
        for(r in routes){
            direction = r.split(" ").first()
            distance = r.split(" ").last().toInt()
            when(direction){
                "E" -> {
                    for(e in 1 .. distance){
                        if(x_loc + distance < x){
                            if(map[y_loc][x_loc+e] == "X"){ poss = false; break }
                            else{ poss = true }
                        } else { poss = false; break }
                    }
                    if(poss){ x_loc += distance; poss = false }
                }
                "W" -> {
                    for(w in 1 .. distance){
                        if(x_loc - distance >= 0){
                            if(map[y_loc][x_loc-w] == "X"){ poss = false; break }
                            else{ poss = true }
                        } else { poss = false; break }
                    }
                    if(poss){ x_loc -= distance; poss = false }
                }
                "N" -> {
                    for(n in 1 .. distance){
                        if(y_loc - distance >= 0){
                            if(map[y_loc-n][x_loc] == "X"){ poss = false; break }
                            else{ poss = true }
                        } else { poss = false; break }
                    }
                    if(poss){ y_loc -= distance; poss = false }
                }
                else -> {
                    for(s in 1 .. distance){
                        if(y_loc + distance < y){
                            if(map[y_loc+s][x_loc] == "X"){ poss = false; break }
                            else{ poss = true }
                        } else { poss = false; break }
                    }
                    if(poss){ y_loc += distance; poss = false }
                }
            }
        }
        
        answer += y_loc
        answer += x_loc
        
        return answer
    }
}