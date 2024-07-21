package com.MergeAssertNumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeAssertNumberTest {

    @BeforeEach
    void setUp() {
        System.out.println("Starting a new unit test");
        System.out.println("--------------------------");
    }

    @AfterEach
    void afterEach() {
        System.out.println("A unit test is complete");
    }


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

    @Test
    void testMergeEmptyNums2() {
        int[] nums1 = {1, 2, 3};
        int m = 3;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1, 2, 3};
        MergeSortedArrays.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMergeBothEmpty() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {0};
        MergeSortedArrays.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMergeAllElementsInNums1() {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int m = 6;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1, 2, 3, 4, 5, 6};
        MergeSortedArrays.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMergeAllElementsInNums2() {
        int[] nums1 = {0, 0, 0, 0, 0, 0};
        int m = 0;
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int n = 6;
        int[] expected = {1, 2, 3, 4, 5, 6};
        MergeSortedArrays.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMergeSingleElement() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        MergeSortedArrays.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMergeDuplicates() {
        int[] nums1 = {1, 2, 2, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 2, 3};
        int n = 3;
        int[] expected = {1, 2, 2, 2, 2, 3};
        MergeSortedArrays.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMergeAllElementsSmaller() {
        int[] nums1 = {5, 6, 7, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;
        int[] expected = {1, 2, 3, 5, 6, 7};
        MergeSortedArrays.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMergeAllElementsLarger() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {5, 6, 7};
        int n = 3;
        int[] expected = {1, 2, 3, 5, 6, 7};
        MergeSortedArrays.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
}