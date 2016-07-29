public class Solution {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int m = nums1.length;

		return 0d;
	}

	int[] getMediansSortedArraysInterval(int[] nums, int nums_start,
			int nums_end) {
		int length = nums_end - nums_start + 1;
		int mid_index = (nums_start + nums_end) / 2;

		int[] medians = new int[] {};
		if (length % 2 != 0) {
			medians[0] = nums[mid_index];
		} else {
			medians[0] = nums[mid_index];
			medians[1] = nums[mid_index + 1];
		}

		return medians;
	}

	double findMedianSortedArraysInterval(int[] nums1, int[] nums2,
			int nums1_start, int nums1_end, int nums2_start, int nums2_end) {

		int length1 = nums1_end - nums1_start + 1;
		int length2 = nums2_end - nums2_start + 1;

		int[] longarray;
		int[] shortarray;

		int longarray_start, longarray_end, longarray_length;
		int shortarray_start, shortarray_end, shortarray_length;

		if (length1 >= length2) {
			longarray = nums1;
			longarray_start = nums1_start;
			longarray_end = nums1_end;
			longarray_length = length1;

			shortarray = nums2;
			shortarray_start = nums2_start;
			shortarray_end = nums2_end;
			shortarray_length = length2;
		} else {
			longarray = nums2;
			longarray_start = nums2_start;
			longarray_end = nums2_end;
			longarray_length = length2;

			shortarray = nums1;
			shortarray_start = nums1_start;
			shortarray_end = nums1_end;
			shortarray_length = length1;
		}

		if (shortarray_length == 1 && longarray_length > 1) {
			int[] median_longarray = getMediansSortedArraysInterval(longarray,
					longarray_start, longarray_end);
			if (median_longarray.length ==2) {
				if (shortarray[shortarray_start] > median_longarray[0] && shortarray[shortarray_start] < median_longarray[1]) {
					return sho
				}
			}
		}

		return 0d;
	}
}
