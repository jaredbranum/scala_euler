println((1 until 1000).foldLeft(0) { (sum, current_value) =>
  if(current_value % 3 == 0 || current_value % 5 == 0) current_value + sum else sum
})