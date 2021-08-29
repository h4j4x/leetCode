package main

// https://leetcode.com/problems/reverse-integer/

import (
	"math"
)

func ReverseInteger(x int) int {
	if x == 0 {
		return 0
	}
	var min float64 = math.Pow(-2, 31)
	var max float64 = math.Pow(2, 31) - 1
	var x64 = float64(x)
	if x64 < min || x64 > max {
		return 0
	}
	var y float64 = 0.0
	for {
		y *= 10
		y += float64(x % 10)
		if y < min || y > max {
			return 0
		}
		x /= 10
		if x == 0 {
			break
		}
	}
	return int(y)
}
