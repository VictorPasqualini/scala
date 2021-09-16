import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

/*
 * Complete the 'solve' function below.
 * The function accepts following parameters:
 *  1. DOUBLE meal_cost
 *  2. INTEGER tip_percent
 *  3. INTEGER tax_percent
 */

object Result {
    def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {
        val tip = meal_cost * (tip_percent / 100.00)
        val tax = meal_cost * (tax_percent / 100.00)
        val total_cost = meal_cost + tip + tax
        
        print(total_cost.round)
    }
}

object Solution {
    def main(args: Array[String]) {
        val meal_cost = StdIn.readLine.trim.toDouble
        val tip_percent = StdIn.readLine.trim.toInt
        val tax_percent = StdIn.readLine.trim.toInt

        Result.solve(meal_cost, tip_percent, tax_percent)
    }
}
