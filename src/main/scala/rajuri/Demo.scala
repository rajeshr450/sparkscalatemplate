package rajuri

import org.apache.spark.sql.SparkSession

object Demo extends App {

  //  Logger.getLogger("org").setLevel(Level.ERROR)

  val spark = SparkSession
    .builder()
    .master("local[1]")
    .appName("test")
    .getOrCreate()

  println("hello world")

}
