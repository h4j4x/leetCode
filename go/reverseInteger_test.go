package main

// https://leetcode.com/problems/reverse-integer/

import (
	"testing"
)

type ReverseIntegerTestData struct {
	value    int
	expected int
}

var ReverseIntegerTests = []ReverseIntegerTestData{
	{
		123, 321,
	},
	{
		-123, -321,
	},
	{
		120, 21,
	},
	{
		0, 0,
	},
	{
		1534236469, 0,
	},
}

func TestReverseInteger(t *testing.T) {
	for _, data := range ReverseIntegerTests {
		var answer = ReverseInteger(data.value)
		if answer != data.expected {
			t.Error(
				"For", data.value,
				"expected", data.expected,
				"got", answer,
			)
		}
	}
}
