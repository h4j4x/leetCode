package main

// https://leetcode.com/problems/two-sum/

import (
	"testing"
)

type TestData struct {
	values   []int
	target   int
	expected []int
}

var tests = []TestData{
	{
		[]int{2, 7, 11, 15}, 9, []int{0, 1},
	},
	{
		[]int{3, 2, 4}, 6, []int{1, 2},
	},
	{
		[]int{3, 3}, 6, []int{0, 1},
	},
}

func TestTwoSum(t *testing.T) {
	for _, data := range tests {
		var answer = TwoSum(data.values, data.target)
		if !equal(answer, data.expected) {
			t.Error(
				"For", data.values,
				"expected", data.expected,
				"got", answer,
			)
		}
	}
}

func equal(a, b []int) bool {
	if len(a) != len(b) {
		return false
	}
	for i, v := range a {
		if v != b[i] {
			return false
		}
	}
	return true
}
