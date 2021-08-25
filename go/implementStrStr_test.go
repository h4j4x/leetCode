package main

// https://leetcode.com/problems/implement-strstr/

import (
	"testing"
)

type ImplementStrStrTestData struct {
	value    string
	needle   string
	expected int
}

var ImplementStrStrTests = []ImplementStrStrTestData{
	{
		"hello", "ll", 2,
	},
	{
		"aaaaa", "bba", -1,
	},
	{
		"", "", 0,
	},
	{
		"a123word", "word", 4,
	},
	{
		"a123word", "123", 1,
	},
	{
		"mississippi", "issip", 4,
	},
	{
		"", "a", -1,
	},
}

func TestImplementStrStr(t *testing.T) {
	for _, data := range ImplementStrStrTests {
		var answer = ImplementStrStr(data.value, data.needle)
		if answer != data.expected {
			t.Error(
				"For", data.value, "-", data.needle,
				"expected", data.expected,
				"got", answer,
			)
		}
	}
}
