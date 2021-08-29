package main

// https://leetcode.com/problems/valid-parentheses/

func ValidParentheses(s string) bool {
	var opening = []int{'(', '{', '['}
	var closing = []int{')', '}', ']'}
	var tags = []int{}
	for index := range s {
		var tag = int(s[index])
		if openingIndex := sliceIndex(opening, tag); openingIndex >= 0 {
			tags = append(tags, tag)
		} else {
			var closingIndex = sliceIndex(closing, tag)
			var lastIndex = len(tags) - 1
			if lastIndex < 0 {
				return false
			}
			var openingIndex = sliceIndex(opening, tags[lastIndex])
			if closingIndex != openingIndex {
				return false
			}
			tags = append(tags[:lastIndex], tags[lastIndex+1:]...)
		}
	}
	return len(tags) == 0
}

func sliceIndex(arr []int, value int) int {
	for index, a := range arr {
		if a == value {
			return index
		}
	}
	return -1
}
