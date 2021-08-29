package main

// https://leetcode.com/problems/maximum-subarray/

func MaximumSubarray(nums []int) int {
	var sum = 0
	var maxSum = -9223372036854775808
	for _, value := range nums {
		sum += value
		if sum > maxSum {
			maxSum = sum
		}
		if sum < 0 {
			sum = 0
		}
	}
	return maxSum
}
