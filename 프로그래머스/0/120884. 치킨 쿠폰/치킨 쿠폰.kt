class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = 0
        var coupon = chicken
        
        while(coupon >= 10) {
            var temp = coupon / 10
            answer += temp
            coupon += temp
            coupon -= (temp * 10)
        }
        
        return answer
    }
}