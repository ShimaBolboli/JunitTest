package com.MergeAssertNumber;

import org.junit.jupiter.api.*;

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

    @Nested
    @DisplayName("Empty Array Tests")
    class EmptyArrayTests {
        @Test
        @DisplayName("Test merging with nums1 empty")
        void testMergeEmptyNums1() {
            int[] nums1 = {0, 0, 0};
            int m = 0;
            int[] nums2 = {2, 5, 6};
            int n = 3;
            int[] expected = {2, 5, 6};
            MergeSortedArrays.merge(nums1, m, nums2, n);
            Assertions.assertArrayEquals(expected, nums1);
        }

        @Test
        @DisplayName("Test merging with nums2 empty")
        void testMergeEmptyNums2() {
            int[] nums1 = {1, 2, 3};
            int m = 3;
            int[] nums2 = {};
            int n = 0;
            int[] expected = {1, 2, 3};
            MergeSortedArrays.merge(nums1, m, nums2, n);
            Assertions.assertArrayEquals(expected, nums1);
        }

        @Test
        @DisplayName("Test merging with both arrays empty")
        void testMergeBothEmpty() {
            int[] nums1 = {0};
            int m = 0;
            int[] nums2 = {};
            int n = 0;
            int[] expected = {0};
            MergeSortedArrays.merge(nums1, m, nums2, n);
            Assertions.assertArrayEquals(expected, nums1);
        }
    }

    @Nested
    @DisplayName("All Elements In One Array Tests")
    class AllElementsInOneArrayTests {
        @Test
        @DisplayName("Test merging with all elements in nums1")
        void testMergeAllElementsInNums1() {
            int[] nums1 = {1, 2, 3, 4, 5, 6};
            int m = 6;
            int[] nums2 = {};
            int n = 0;
            int[] expected = {1, 2, 3, 4, 5, 6};
            MergeSortedArrays.merge(nums1, m, nums2, n);
            Assertions.assertArrayEquals(expected, nums1);
        }

        @Test
        @DisplayName("Test merging with all elements in nums2")
        void testMergeAllElementsInNums2() {
            int[] nums1 = {0, 0, 0, 0, 0, 0};
            int m = 0;
            int[] nums2 = {1, 2, 3, 4, 5, 6};
            int n = 6;
            int[] expected = {1, 2, 3, 4, 5, 6};
            MergeSortedArrays.merge(nums1, m, nums2, n);
            Assertions.assertArrayEquals(expected, nums1);
        }
    }

    @Nested
    @DisplayName("Single Element Tests")
    class SingleElementTests {
        @Test
        @DisplayName("Test merging with single element in nums2")
        void testMergeSingleElement() {
            int[] nums1 = {0};
            int m = 0;
            int[] nums2 = {1};
            int n = 1;
            int[] expected = {1};
            MergeSortedArrays.merge(nums1, m, nums2, n);
            Assertions.assertArrayEquals(expected, nums1);
        }
    }

    @Nested
    @DisplayName("Duplicate Elements Tests")
    class DuplicateElementsTests {
        @Test
        @DisplayName("Test merging with duplicate elements")
        void testMergeDuplicates() {
            int[] nums1 = {1, 2, 2, 0, 0, 0};
            int m = 3;
            int[] nums2 = {2, 2, 3};
            int n = 3;
            int[] expected = {1, 2, 2, 2, 2, 3};
            MergeSortedArrays.merge(nums1, m, nums2, n);
            Assertions.assertArrayEquals(expected, nums1);
        }
    }

    @Nested
    @DisplayName("Mixed Elements Tests")
    class MixedElementsTests {
        @Test
        @DisplayName("Test merging with all elements smaller in nums2")
        void testMergeAllElementsSmaller() {
            int[] nums1 = {5, 6, 7, 0, 0, 0};
            int m = 3;
            int[] nums2 = {1, 2, 3};
            int n = 3;
            int[] expected = {1, 2, 3, 5, 6, 7};
            MergeSortedArrays.merge(nums1, m, nums2, n);
            Assertions.assertArrayEquals(expected, nums1);
        }

        @Test
        @DisplayName("Test merging with all elements larger in nums2")
        void testMergeAllElementsLarger() {
            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int m = 3;
            int[] nums2 = {5, 6, 7};
            int n = 3;
            int[] expected = {1, 2, 3, 5, 6, 7};
            MergeSortedArrays.merge(nums1, m, nums2, n);
            Assertions.assertArrayEquals(expected, nums1);
        }

    }
}
