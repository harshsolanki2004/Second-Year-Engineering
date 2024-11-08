To complete this lab, I first unzipped the lab1 files using the command 
unzip /home/courses/coe428/lab1/lab1.zip

And then I followed the steps in the lab guide. I implemented a sorting algorithm in the mySort.c file, I used the sorting algorithm pseudocode from the lecture slides. However, I changed the j=2 to j=1 because the pseudocode in the lecture slides was created with the array index starting at 1. Since in C the array index starts at 0, I modified the pseudocode so that it’s correct syntax and it follows the C array index numbering.

When I ran the code, it printed out the hardcoded array in the sortMain.c file.

For part 2 of the lab, I learned how the cmdline arguments work from page 8 of the lab manual. From the output, I learned that parameters in the sortMain.c and sortMain2.c file are argc and argv[]. argc is the number of cmdlines which are separated by spaces in terminal. And argv[] is the entire cmdline as an array where each array index is separated by a space. I applied the knowledge to the new implementation of the sortMain2.c file.

For example, if I write the command testSort 4 3 2 1, argc will be 5, and argv[] would be [testSort, 4, 3, 2, 1]. For part two of the lab, we had to make the code sort any inputted array of numbers. So in the sortMain2.c file, I made it so that if argc = 1, then it prints out the hardcoded array [10, 20, 30, 40]. And if argc>1 then it assigns each command to the d[] array and sends it to the mySort.c file to sort it and prints the sorted array. This was done by making nDataItems (the parameter of the mySort.c file) 1 less than argc because “testSort” is not meant to be sorted. And a loop is created so that the cmdline arguments after “testSort” are converted to integers and then assigned to the d[] array.


Questions:

1.  I would create the mySort() function with two parameters, int d[] and int size. In the function, I would call the betterSort() function as such betterSort(d, 0, size-1); the mySort function calls the betterSort function and since its parameters are the first and last index of the array, it can be written as 0, and the array length -1.
