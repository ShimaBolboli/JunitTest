## Overview

The project includes a method to merge two sorted arrays into one sorted array and the corresponding unit tests to ensure its correctness. The `merge` method takes two sorted arrays and merges them in-place into the first array.

# Merge Sorted Arrays

This repository contains the implementation and unit tests for merging two sorted arrays into one sorted array.

## Table of Contents

- [Overview](#overview)
- [Problem](#problem)
- [Prerequisites](#Prerequisites)
- [Setup and Running the Tests](#Setup and Running the Tests)
- [Project Structure](#Project Structure)
- [Unit Tests](#Unit Tests)
 


## Problem

### Merge Method

The `merge` method in `MergeSortedArrays` class takes two sorted arrays `nums1` and `nums2` and their respective sizes `m` and `n`. It merges `nums2` into `nums1` in-place, ensuring that `nums1` remains sorted.

There are two integer arrays nums1 and nums2, sorted in increasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in increasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

### Prerequisites

- Java Development Kit (JDK) 8 or higher
  
  ## Setup and Running the Tests

Running JUnit Tests in IntelliJ IDEA

1-Open IntelliJ IDEA.
2-Make a Java code and test files.
3-Mark the Test Directory:
4- Right-click on your test directory (e.g., src/test/java).
Select Mark Directory as -> Test Sources Root.
Ensure your test class is located in the test directory you marked as Test Sources Root.
5-Write Your JUnit Test Class
6-Run the Tests
7-View Test Results, After running the tests, the results will be displayed in the Run tool window.
It will show which tests passed and which failed, along with error messages or stack traces.

## Project Structure

```
MergeSortedArrays/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── MergeAssertNumber/
│                   ├── MergeSortedArrays.java
│   └── test/
│       └── java/
│           └── com/
│               └── MergeAssertNumber/
│                   └── MergeAssertNumberTest.java
│
└── README.md
```

- `MergeSortedArrays.java`: Contains the implementation of the merge algorithm.
- `MergeAssertNumberTest.java`: Contains the unit tests for `MergeSortedArrays`.


### Unit Tests

The unit tests for the `merge` method are located in `MergeAssertNumberTest.java`. These tests cover various scenarios including:

- Merging when `nums1` is empty.
- Merging when `nums2` is empty.
- Merging when both arrays are empty.
- Merging when all elements are in `nums1`.
- Merging when all elements are in `nums2`.
- Merging arrays with duplicates.
- Merging arrays where elements in `nums2` are smaller or larger than elements in `nums1`.


Example of a unit test:

```java
@Test
void testMergeEmptyNums1() {
    int[] nums1 = {0, 0, 0};
    int m = 0;
    int[] nums2 = {2, 5, 6};
    int n = 3;
    int[] expected = {2, 5, 6};
    MergeSortedArrays.merge(nums1, m, nums2, n);
    assertArrayEquals(expected, nums1);
}
```
![image](https://github.com/user-attachments/assets/a6b6e0b1-b01d-4fc7-af77-bf954705bc38)
