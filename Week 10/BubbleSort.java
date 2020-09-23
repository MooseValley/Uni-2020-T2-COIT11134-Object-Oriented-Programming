/*
*** Bubble Sort

Student TODO:
* Write Java code to do this sort (convert above pseudo code)
* Maybe get it working for an array of ints
* Change to String
* Make it generic ...  compareTo ...
<T extends Comparable>


Example:

    10  5  15  45  56  7  18  22  6
     5  10 15  45   7  56  18  22  6
     5  10 15  7   45  18  56   6  22

Pseudo Code

array arr
bool swap = true;

while (swap == true)
{
   swap = false

   for k = 0; k < arr.length - 1; k++
      if (arr[k] > arr[k+1])
         temp = arr[k]
         arr[k] = arr[k+1]
         arr[k+1] = temp
         swap = true
}

*/
