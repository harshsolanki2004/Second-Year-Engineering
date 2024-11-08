Suppose that towers(5, 2, 3) is invoked

1. How will the first recursive call to towers() be invoked? Answer this
question in the form: towers(x, y, z) where you give the actual values to the
three parameters.

When towers(5, 2, 3) is invoked, the parameters for the towers method are n, from, dest. towers(4, 2, 1) will be called where x = n-1, from = from, and dest = spare.

2. How many recursive calls to towers() will be made before this first recursive
call actually returns to the initial invocation?

	including the initial call to towers, there will be 5 recursive calls to towers() made before it returns a
	
	to break it down:
	towers(5,2,3) is called. 2 is from and 3 is dest and 1 is spare. The next call uses parameters (n-1, from, spare)
	towers(4,2,1) is called. When this is called, the number of disks to be moved are decreased by 1, and the spare and dest have swapped
	towers(3,2,3) Is called. When this is called, the number of disks to be moved are decreased by 1 again, and the spare and dest have been swapped
	towers(2,2,1) is called. when this is called, the number of disks to be moved are decreased by 1 again, and the spare and dest have been swapped.
	towers(1,2,3) is called. When this is called, the number of disks have been decreased by 1 again, a the spare and dest have been and this is the base case, which moves one disk from tower 2 to tower 3. And it completes the towers call by moving one disk from 2 to 3. Now the recursive function goes back and completes the remaining recursive calls one by one.
	towers(0,2,1) is also called, however it is disregarded because n cannot be equal to 0

3. Once towers(5, 2, 3) has invoked its first recursive call to towers() and this
invocation has returned, what will be printed to stdout? (i.e. What actual
move will be made by towers(5, 2, 3) ?)

	as written in the question above, the base case for towers(5, 2, 3) is towers(1, 2, 3). So the first line to be printed out in stdout will be 

	2	3

4. How will the second recursive call to towers() be invoked? Answer this
question in the form: towers(x, y, z) where you give the actual values to the
three parameters.

	the second recursive call will be based on the first recursive call which was towers(4, 2, 1) now the new x value is n-1-1 = 3, the from remains the same and the dest is now the spare. So the x = 3, y= 2, z = 3


Question:
Suppose that towers(8, 1, 2) is invoked. How many lines will be printed to stdout?

The number of lines is the number of minimum moves required to move a certain number of disks from one tower to another. I have searched online and the function is (2^n)-1. For example in the lab manual, there are 7 moves required to move 3 disks from one tower to another. If this is done for 8 disks, the number of lines printed out to stdout will be the number of moves it takes to move 8 disks from one tower to another. (2^8)-1 = 255 lines will be printed out in stdout.
