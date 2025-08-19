class Solution {
    fun validBrackets(s: String): Boolean {
        var sOCount = 0; var mOCount = 0; var lOCount = 0
        var sCCount = 0; var mCCount = 0; var lCCount = 0
        var isSOpen = false; var isMOpen = false; var isLOpen = false
        var lastList = mutableListOf<Char>()
        for(st in s) {
            when(st) {
                '(' -> {
                    sOCount++
                    lastList.add('(')
                }
                ')' -> {
                    if(sOCount > sCCount && lastList.last() == '(') {
                        lastList.removeAt(lastList.size - 1)
                        sCCount++
                    } else {
                        return false   
                    }
                }
                '{' -> {
                    mOCount++
                    lastList.add('{')
                }
                '}' -> {
                    if(mOCount > mCCount && lastList.last() == '{') {
                        lastList.removeAt(lastList.size - 1)
                        mCCount++
                    } else {
                        return false   
                    }
                }
                '[' -> {
                    lOCount++
                    lastList.add('[')
                }
                ']' -> {
                    if(lOCount > lCCount && lastList.last() == '[') {
                        lastList.removeAt(lastList.size - 1)
                        lCCount++
                    } else {
                        return false   
                    }
                }
            }
        }
        if(sOCount != sCCount) return false
        if(mOCount != mCCount) return false
        if(lOCount != lCCount) return false
        return true
    }
    
    fun lotateLeft(str: String): String = if(str.length > 0) str.substring(1) + str.take(1) else str
    
    fun solution(s: String): Int {
        var answer: Int = 0
        var count = 0
        var sStr = s
        
        while(count < sStr.length) {
            sStr = lotateLeft(sStr)
            
            if(validBrackets(sStr)) {
                answer++
            }
            
            count++
        }
        
        return answer
    }
}