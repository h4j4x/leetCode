package main

// https://leetcode.com/problems/perfect-number/

import (
	"testing"
)

type CheckPerfectNumberTestData struct {
	value    int
	expected bool
}

var CheckPerfectNumberTests = []CheckPerfectNumberTestData{
	{
		6, true,
	},
	{
		496, true,
	},
	{
		8128, true,
	},
	{
		1, false,
	},
	{
		2, false,
	},
}

func TestCheckPerfectNumber(t *testing.T) {
	for _, data := range CheckPerfectNumberTests {
		var answer = CheckPerfectNumber(data.value)
		if answer != data.expected {
			t.Error(
				"For", data.value,
				"expected", data.expected,
				"got", answer,
			)
		}
	}
}
