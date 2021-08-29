package main

// https://leetcode.com/problems/maximum-subarray/

import (
	"testing"
)

type MaximumSubarrayTestData struct {
	values   []int
	expected int
}

var MaximumSubarrayTests = []MaximumSubarrayTestData{
	{
		[]int{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6,
	},
	{
		[]int{1}, 1,
	},
	{
		[]int{5, 4, -1, 7, 8}, 23,
	},
	{
		[]int{-4, -2, -1}, -1,
	},
}

func TestMaximumSubarray(t *testing.T) {
	for _, data := range MaximumSubarrayTests {
		var answer = MaximumSubarray(data.values)
		if answer != data.expected {
			t.Error(
				"For", data.values,
				"expected", data.expected,
				"got", answer,
			)
		}
	}
}
