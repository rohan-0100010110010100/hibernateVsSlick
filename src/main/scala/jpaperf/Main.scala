package jpaperf

import slickperf.MySqlConnection
import exec.JPA


object Main {
  def main(args: Array[String]) {
    MySqlConnection.inSchema(run())
  }

  def run():Unit = {
    JPAInsert.run
    JPAQuery.run
  }
}
