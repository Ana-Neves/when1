 fun pagamento(): Unit {
    println("Digit the total of the account: ")
    val totalOfPurchase = readLine()!!.toFloat()
    println("Choose the type of payment\n1 - in cash\n2 - on term(30 Dias)\n3 - in installments")

    when (readLine()!!.toInt()) {
        1 -> println("The total value in cash is: ${totalOfPurchase - ((totalOfPurchase * 10) / 100)}")
        2 -> println("The total value on term (30 dias) is: ${totalOfPurchase + ((totalOfPurchase * 3) / 100)}")
        3 -> println("The total value in installments is ${totalOfPurchase + ((totalOfPurchase * 1.5) / 100)}")
        else -> println("Payment form is invalid!!!")
    }
}


