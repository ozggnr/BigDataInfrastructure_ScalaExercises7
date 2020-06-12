// Databricks notebook source
//find sum of the numbers divisible by 4 and sum of the squares of the numbers divisible by 3 and less than 20
val numbers = (1 to 45).toList
println(numbers.filter(_ % 4 == 0).sum)
val alist = numbers.filter((x:Int)=> x %3 == 0 && x < 20 )
println(alist)


// COMMAND ----------

def square(a:Int): Int = { a * a}
println(alist.map(x => square(x)))
println(alist.map(x => square(x)).sum)

// COMMAND ----------

//maximum function
def maxfunc(a:Int, b:Int): Int = {
  val maxlist = List(a,b)
  maxlist.max
}


// COMMAND ----------

def get_max(x:Int,y:Int,f:(Int,Int) => Int) : Int = {
  f(x,y)
}

// COMMAND ----------

println(get_max(7,15,maxfunc))

// COMMAND ----------


