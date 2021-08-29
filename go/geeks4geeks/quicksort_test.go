package main

import (
	"testing"
)

type QuickSortTestData struct {
	value    []int
	expected []int
}

var QuickSortTests = []QuickSortTestData{
	{
		[]int{
			7, 9, -23, -50, 10, 0,
		},
		[]int{
			-50, -23, 0, 7, 9, 10,
		},
	},
}

func TestQuickSort(t *testing.T) {
	for _, data := range QuickSortTests {
		var answer = QuickSort(data.value)
		if ArrayNotEquals(answer, data.expected) {
			t.Error(
				"Expected", data.expected,
				"got", answer,
			)
		}
	}
}

func ArrayNotEquals(arr1 []int, arr2 []int) bool {
	if len(arr1) != len(arr2) {
		return true
	}
	for i, v := range arr1 {
		if v != arr2[i] {
			return true
		}
	}
	return false
}
