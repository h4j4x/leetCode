package main

// https://leetcode.com/problems/excel-sheet-column-title/

func ExcelSheetColumnTitle(columnNumber int) string {
	var alphabetLen = 26
	var number = ""
	for {
		columnNumber -= 1
		var digit = columnNumber % alphabetLen
		columnNumber /= alphabetLen
		number = string(byte(digit+65)) + number
		if columnNumber == 0 {
			break
		}
	}
	return number
}
