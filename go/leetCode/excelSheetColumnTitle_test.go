package main

// https://leetcode.com/problems/excel-sheet-column-title/

import (
	"testing"
)

type ExcelSheetColumnTitleTestData struct {
	value    int
	expected string
}

var ExcelSheetColumnTitleTests = []ExcelSheetColumnTitleTestData{
	{
		1, "A",
	},
	{
		26, "Z",
	},
	{
		27, "AA",
	},
	{
		28, "AB",
	},
	{
		52, "AZ",
	},
	{
		701, "ZY",
	},
	{
		2147483647, "FXSHRXW",
	},
}

func TestExcelSheetColumnTitle(t *testing.T) {
	for _, data := range ExcelSheetColumnTitleTests {
		var answer = ExcelSheetColumnTitle(data.value)
		if answer != data.expected {
			t.Error(
				"For", data.value,
				"expected", data.expected,
				"got", answer,
			)
		}
	}
}
