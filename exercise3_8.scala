// Databricks notebook source
val insurance = spark.read.format("csv")
.option("header", "true")
.option("inferSchema", "true")
.load("/FileStore/tables/insurance.csv")
 display(insurance)

// COMMAND ----------

insurance.printSchema()
//val dataDf = insurance.toDF()
//print((dataDf.count(), dataDf.columns.length))

// COMMAND ----------

insurance.createOrReplaceTempView("records")

// COMMAND ----------

// MAGIC %sql
// MAGIC SELECT COUNT(*) FROM records

// COMMAND ----------

// MAGIC %sql
// MAGIC SELECT sex,COUNT(sex) FROM records GROUP BY sex

// COMMAND ----------

// MAGIC %sql
// MAGIC SELECT sex,COUNT(sex) FROM records WHERE smoker=='yes' GROUP BY sex 

// COMMAND ----------

// MAGIC %sql
// MAGIC SELECT region,SUM(charges) as sum_charge FROM records GROUP BY region ORDER BY sum_charge DESC
