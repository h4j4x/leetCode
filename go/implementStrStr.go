package main

// https://leetcode.com/problems/implement-strstr/

func ImplementStrStr(haystack string, needle string) int {
	var needleLen = len(needle)
	if needleLen == 0 {
		return 0
	}
	var haystackLen = len(haystack)
	var haystackIndex = -1
	var needleIndex = 0
	var index = -1
	for {
		index += 1
		if index >= haystackLen {
			break
		}
		if haystack[index] == needle[needleIndex] {
			if haystackIndex < 0 {
				haystackIndex = index
			}
			needleIndex += 1
			if needleIndex >= needleLen {
				return haystackIndex
			}
		} else {
			if haystackIndex >= 0 {
				index = haystackIndex
			}
			haystackIndex = -1
			needleIndex = 0
		}
	}
	return -1
}
