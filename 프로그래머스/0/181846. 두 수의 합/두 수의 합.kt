class Solution {
    fun solution(a: String, b: String): String {
        var answer: String = ""
        var alist = a.map{ it }.reversed()
        var blist = b.map{ it }.reversed()
        var result = mutableListOf<Int>()
        var max = if(alist.size >= blist.size) alist.size else blist.size
        var min = if(alist.size >= blist.size) blist.size else alist.size
        var type = if(alist.size > blist.size) "a" else "b"
        var temp = 0; var next = 0
        var aInt = 0; var bInt = 0
        
        for(i in 0 .. max - 1) {
            if(i < min) {
                aInt = alist[i].toString().toInt()
                bInt = blist[i].toString().toInt()
                if(next == 0) { temp = aInt + bInt }
                else { temp = aInt + bInt + 1 }
                if(temp >= 10) {
                    temp -= 10
                    next = 1
                } else {
                    next = 0
                }
                result.add(temp)
            } else {
                if(type == "a") {
                    aInt = alist[i].toString().toInt()
                    if(next == 0) { temp = aInt }
                    else {
                        temp = aInt + 1
                        next = 0
                    }
                } else {
                    bInt = blist[i].toString().toInt()
                    if(next == 0) { temp = bInt }
                    else {
                        temp = bInt + 1
                        next = 0
                    }
                }
                if(temp >= 10) {
                    temp -= 10
                    next = 1
                } else {
                    next = 0
                }
                result.add(temp)
            }
        }
        
        if(next == 1) { result.add(1) }
        
        answer = result.reversed().joinToString("")
        
        return answer
    }
}