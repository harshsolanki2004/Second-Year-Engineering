For lab3 of coe428, we were told to implement to sorting algorithms, insertion sort and merge sort.

Both algorithms were taught in lectures and the lab manual also teaches how to implement the algorithms with respect to the metrics.c file.

For example instead of comparing two values in an array with a[1] < a[2], we can just use the myCompare function that returns the difference
between the two integers, and if the difference is less than 0, that means that a[1] is less than a[2] and both elements need to be swapped. 
A my swap function is also given in the metrics file. 

There's an additional myCopy function in the metrics file that is used in the merge sort implementation. There is a temporary array created 
to merge the divided arrays, and the myCopy function is used to transfer the elements in the temporary array into the original array and 
be outputted.

To implement the insertion sort algorithm, I used the pseudocode from the lecture slides and implemented it with respect to the metrics 
functions. since the insertion sort takes parameters for the first index, and the last index, I used those variables instead of a[0] and 
a[a.length-1]. the output of the code showed the sorted array and it shows the number of times an array element was swapped, or copied or 
compared so that we can calculate the time complexity based on that. The best case foe insertion sort is when the array is already sorted 
and it's time complexity is O(n) because there are no swaps or copies made. The worst case is when the array is given in decreasing order, 
and its time complexity is O(n^2) because the number of swaps, compares, and copies add up to the square of the input value. For example 
if I enter an array [5,4,3,2,1], the number of swaps is 10, the number of compares is 10, and the number of copies is 5. The total is 
25, which is 5^2.

Similarly, to implement the merge sort algorithm I used the lecture slides and implemented it with respect to the metrics functions. 
However for the merge function I struggled to implement it using the pseudo code so I ended up learning it through a YouTube video that 
explains how the merge method compares indexes from two sub arrays and puts them into a temporary array and finally the temporary array is
transferred back into the original array. The time complexity of the mergeSort algorithm is O(nlogn), this is because the division of the 
array into sub arrays until there are n number of single-index arrays is the time complexity of logn and when the sub arrays are sorted back, 
the time complexity is n. both time complexities are multiplied because the merge function is used for all sub arrays. 
