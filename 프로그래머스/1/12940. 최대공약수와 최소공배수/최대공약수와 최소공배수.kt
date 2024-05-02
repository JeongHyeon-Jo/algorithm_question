class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        var co = if(n > m) n else m
        
        // 최대 공약수
        if(n > m) {
            for(i in n downTo 1){
                if(n % i == 0 && m % i == 0){
                    answer += i
                    break
                }
            }
        } else {
            for(i in m downTo 1){
                if(n % i == 0 && m % i == 0){
                    answer += i
                    break
                }
            }
        }
        
        //최소 공배수
        while(true){
            if(co % n == 0 && co % m == 0){
                answer += co
                break
            }
            co++
        }
        
        return answer
    }
}