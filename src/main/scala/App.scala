import scala.io.StdIn
object App {
  def main(args: Array[String]): Unit = {
    var firstString = "Hello, Scala!"

//    Выводим  Hello, Scala!
    println(firstString)

//    Выводим  Hello, Scala! в нижнем регистре
    println(firstString.toLowerCase)

//    Выводим  Hello, Scala! наоборот
    println(firstString.reverse)

//      Выводим  Hello, Scala! без восклицательного знака
    println(firstString.replace("!", ""))

//    Выводим Hello, Scala! с добавлением goodbye
    var secondString = " and goodbye python!"
    println(firstString.replace("!", "") + secondString)

//    Вычисляем ежемесячный оклад сотрудника после вычета налогов
//    println("Введите годовой доход в тыс.руб.:")
//    val salarYear = scala.io.StdIn.readLine.toInt
//    println("Премия в процентах от оклада:")
//    val prize = scala.io.StdIn.readLine.toFloat
//    println("Компенсация питания в тыс.руб.:")
//    val eatCompensation = scala.io.StdIn.readLine.toInt
//    val oklad = (salarYear + salarYear * prize/100 + eatCompensation)*0.87 / 12
//    println(s"Ежемесячный оклад сотрудника после вычета налогов в тыс.руб.: $oklad")

    val salaryList = List(100, 150, 200, 80, 120, 75)
    val middleSalary = salaryList.sum / salaryList.size
//    println(middleSalary)
//    for (n <- 0 until salaryList.size)
//      {
//        var m = n + 1
//        var zp = salaryList(n)
//        var differenceSalary = 100*(salaryList(n)-middleSalary)/middleSalary
//        println(s"зарплата сотрудника № $m отличается от средней на $differenceSalary %")
//      }

    println("Введите номер сотрудника для поощрения или наказания:")
    val numberEmployee = scala.io.StdIn.readLine.toInt - 1
    println("Введите сумму поощрения, или штрафа с минусом:")
    val sumEmployee = scala.io.StdIn.readLine.toInt
    val newSumEmployee = salaryList(numberEmployee) + sumEmployee
    val newSalaryList = salaryList.updated(numberEmployee, newSumEmployee)
//    println(newSalaryList)
    println("Самая высокая ЗП: ")
    println(newSalaryList.max)
    println("Самая низкая ЗП: ")
    println(newSalaryList.min)

    var newSalaryList2 =  newSalaryList :+ 350 :+ 90
    println(newSalaryList2)
    var sortedSalaryList =  newSalaryList2.sorted
    println(sortedSalaryList)

    var sortedSalaryList1: List[Int] =  List()
    for (numEmpl <- sortedSalaryList)
      {
        if (numEmpl <= 130)
        {
          sortedSalaryList1 = sortedSalaryList1 :+ numEmpl
        }
      }
    sortedSalaryList1 = sortedSalaryList1 :+ 130
    for (numEmpl <- sortedSalaryList) {
      if (numEmpl > 130) {
        sortedSalaryList1 = sortedSalaryList1 :+ numEmpl
      }
    }
    println(sortedSalaryList1)

    println("Введите минимальную сумму зарплаты уровня middle:")
    val minMiddle = scala.io.StdIn.readLine.toInt
    println("Введите максимальную сумму зарплаты уровня middle:")
    val maxMiddle = scala.io.StdIn.readLine.toInt
    for (numEmpl <- 0 until sortedSalaryList1.size)
      {
        if ((sortedSalaryList1(numEmpl) >= minMiddle) && (sortedSalaryList1(numEmpl) <= maxMiddle)) {
          println("Номер сотрудника с зарплатой уровня middle: ")
          println(numEmpl+1)
        }
      }

    var raiseSalaryList: List[Double] =  List()
    for (numEmpl <- sortedSalaryList1){
      raiseSalaryList = raiseSalaryList :+ numEmpl*1.07
    }
    println(raiseSalaryList)
  }
}
