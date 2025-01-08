class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var intHash = HashMap<Int, Int>()
        var changeNum1: Int = 0
        var changeNum2: Int = 0
        var tempValue: Int = 0
        val changeList = MutableList(arr.size) { 0 }
        
        for((i, v) in arr.withIndex()){
            intHash[i] = v
        }
        
        for(q in queries.indices){
            changeNum1 = queries[q][0]
            changeNum2 = queries[q][1]
            
            tempValue = intHash[changeNum1]!!
            intHash[changeNum1] = intHash[changeNum2]!!
            intHash[changeNum2] = tempValue
        }
        
        intHash.forEach { index, arrval ->
            changeList[index] = arrval
        }
        
        
        return changeList.toIntArray()
    }
}