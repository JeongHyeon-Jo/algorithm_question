class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var af = arr.filter{ it % divisor == 0}.sorted()
        
        if(af.size == 0){
            af += -1 
        }
        
        var answer: IntArray = af.toIntArray()
        
        return answer
    }
}