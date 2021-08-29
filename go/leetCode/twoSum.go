package main

// https://leetcode.com/problems/two-sum/

func TwoSum(nums []int, target int) []int {
	for firstIndex, firstValue := range nums {
		var offset int = firstIndex + 1
		if offset < len(nums) {
			for secondIndex, secondValue := range nums[offset:] {
				if sum := firstValue + secondValue; sum == target {
					return []int{
						firstIndex, secondIndex + offset,
					}
				}
			}
		}
	}
	return []int{}
}
