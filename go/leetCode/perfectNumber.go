package main

// https://leetcode.com/problems/perfect-number/

func CheckPerfectNumber(num int) bool {
	var sum int = 1
	for i := 2; (i * i) < num; i++ {
		if num%i == 0 {
			sum += i
			if i*i != num {
				sum += num / i
			}
		}
	}
	return num > 1 && sum == num
}
