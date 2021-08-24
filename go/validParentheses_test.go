package main

// https://leetcode.com/problems/valid-parentheses/

import (
	"testing"
)

type ValidParenthesesTestData struct {
	value    string
	expected bool
}

var ValidParenthesesTests = []ValidParenthesesTestData{
	{
		"()", true,
	},
	{
		"()[]{}", true,
	},
	{
		"(]", false,
	},
	{
		"([)]", false,
	},
	{
		"{[]}", true,
	},
	{
		"]", false,
	},
}

func TestValidParentheses(t *testing.T) {
	for _, data := range ValidParenthesesTests {
		var answer = ValidParentheses(data.value)
		if answer != data.expected {
			t.Error(
				"For", data.value,
				"expected", data.expected,
				"got", answer,
			)
		}
	}
}
