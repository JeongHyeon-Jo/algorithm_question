class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        var i = 0
        var j = 0
        var k = 0
        var temp = mutableListOf<Int>() 
        
        for(a in commands.indices){
            i = commands[a][0] - 1
            j = commands[a][1] - 1
            k = commands[a][2] - 1
            for(b in i .. j){
                temp.add(array[b])
            }
            temp.sort()
            answer += temp[k]
            temp.clear()
        }
        
        return answer
    }
}