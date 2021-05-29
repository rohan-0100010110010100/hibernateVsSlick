package slickperf


object Main {
  def main(args: Array[String]) {
    MySqlConnection inSchema run
  }

  def run() {
    SlickInsert.run
    SlickQuery.run
  }
}
