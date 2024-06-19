<?php
$num = array(
        array(1, 7, 8, 2),
        array(5, 94, 75, 1), 
        array(67, 90, 12, 10),
        array(6,5, 2, 98),
        array(7, 11, 10, 3));
   
 //  initializing total sum to 0   
 $totalSum = 0;
 
 /*using the for each loop to iterate the sub arrays of the $num array and using the array_sum() function to find the sum of the subarrays and add it to the total sum which was initially set to 0*/
 foreach($num as $subNum){
     $totalSum += array_sum($subNum);
 }

 // Finding the average of the num array
 $average = $totalSum / count($num);
 
 // printing out the total sum and average of the num array
echo "The total sum of the arrays is: ".$totalSum."\n";
echo "The average of the array is: ".$average;
?>