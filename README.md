## Overview

The project includes a method to merge two sorted arrays into one sorted array and the corresponding unit tests to ensure its correctness. The `merge` method takes two sorted arrays and merges them in-place into the first array.

# Merge Sorted Arrays

This repository contains the implementation and unit tests for merging two sorted arrays into one sorted array.


## Problem
https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
### Merge Method

The `merge` method in `MergeSortedArrays` class takes two sorted arrays `nums1` and `nums2` and their respective sizes `m` and `n`. It merges `nums2` into `nums1` in-place, ensuring that `nums1` remains sorted.

There are two integer arrays nums1 and nums2, sorted in increasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in increasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

### Prerequisites


- IntelliJ or any other IDE
- Java Development Kit (JDK) 8 or higher
- Junit 5

  
  ## Setup and Running the Tests

Running JUnit Tests in IntelliJ IDEA

1-Open IntelliJ IDEA.

2-Make a Java code and test files.

3-Mark the Test Directory:

4- Right-click on your test directory (e.g., src/test/java).

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

Test Class setUp & cleanUp:
setUp method with @BeforeAll annotation to run setup before all tests.
cleanUp method with @AfterAll annotation to run cleanup after all tests.

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
### Test Result
<img width="1441" alt="Screenshot 2024-07-21 at 11 45 36 PM" src="https://github.com/user-attachments/assets/7f54b8f3-e5e9-4a99-9b42-a5b2bd08638f">

### Test Coverage
<img width="755" alt="Screenshot 2024-07-21 at 11 45 05 PM" src="https://github.com/user-attachments/assets/d6c1eb67-a3ab-44a8-85da-6dd726634534">


### YouTube Link

https://youtu.be/ujRe50OmgOE
