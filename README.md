# Improved-Quick-Sort
We implemented quick sort and insertion sort individually. An array of 10000 random natural integers was generated using Random class in java.util package. An input K from the
user was taken which decided the upper limit on the value of random integers generated. Values of K were taken as k=100, k=1000, k= 10000 and k=100000 in our experiment. This array was
appended in a file to make it easy to track the elements later. Next, we start the actual sorting by making a call to quicksort function. As quick sort proceeded, it partitioned the array into smaller
arrays in each recursion level. On reaching a threshold M for the size of subarray, we call the insertion sort function instead of further partitioning of the array using partition logic of
quicksort. We want to find the optimal value of this M, when size of the array, and K the upper limit of the value of the elements in the array was fixed. For this, we accept a range from user in
which they suspect the value of M will be. We run a loop within this range, and try to find the optimal value of M for which the modified quicksort performs the best. Performance of the
algorithm was decided based on number of key comparisons and key assignments done by the algorithm while sorting the given array of 10000 natural numbers.
Counters for comparisons and assignments were maintained in the quicksort logic. We determined optimum value of M, for different values of K, by running a loop for each value of M
in the provided range. We stop the loop at the ith iteration, where we find that number of key assignments and key comparisons made are greater than that of in the (i-1)th iteration. This way
we find the optimal value of M which is nothing but (i-1).
