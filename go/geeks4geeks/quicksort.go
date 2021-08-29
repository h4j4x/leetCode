package main

func QuickSort(unsorted []int) []int {
	var length = len(unsorted)
	if length < 2 {
		return unsorted
	}
	var sorted = make([]int, length)
	copy(sorted, unsorted)
	DoQuickSort(sorted, 0, length)
	return sorted
}

func DoQuickSort(arr []int, low int, high int) {
	if low < high {
		var pi = QuickSortPartition(arr, low, high)
		DoQuickSort(arr, low, pi-1)
		DoQuickSort(arr, pi+1, high)
	}
}

func QuickSortPartition(arr []int, low int, high int) int {
	var pivot = low - 1
	var pivotValue = arr[high-1]
	for i := low; i < high; i++ {
		if arr[i] <= pivotValue {
			pivot += 1
			arr[i], arr[pivot] = arr[pivot], arr[i]
		}
	}
	pivot += 1
	arr[high-1], arr[pivot] = arr[pivot], arr[high-1]
	return pivot
}
