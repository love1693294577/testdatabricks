// Databricks notebook source
import com.typesafe.config.ConfigFactory
val path = ConfigFactory.load().getString("java.io.tmpdir")

println(s"\nHive JARs are downloaded to the path: $path \n")

// COMMAND ----------

// MAGIC %sh
// MAGIC cp  -r /local_disk0/tmp /dbfs/

// COMMAND ----------

// MAGIC %sh
// MAGIC ls  -r /local_disk0/tmp/

// COMMAND ----------

// MAGIC %sh
// MAGIC cp -r /dbfs/hive_metastore_jars/*   /databricks/hive_metastore_jars/

// COMMAND ----------

// MAGIC %sh 
// MAGIC 
// MAGIC ls -r  /databricks/hive_metastore_jars

// COMMAND ----------

// MAGIC %sh
// MAGIC 
// MAGIC rm -r /databricks/hive_metastore_jars/hive_metastore_jars

// COMMAND ----------

// MAGIC %sh
// MAGIC du -h /

// COMMAND ----------

// MAGIC %sh
// MAGIC ssh  10.139.64.5

// COMMAND ----------

