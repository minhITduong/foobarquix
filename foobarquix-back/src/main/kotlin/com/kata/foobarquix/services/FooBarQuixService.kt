package com.kata.foobarquix.services

import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        var result = ""
        var inputString = inputNumber.toString()

        result = checkNumberDivisableByThree(inputNumber, result)

        result = checkNumberDivisableByFive(inputNumber, result)

        result = checkDigitsContainThreeOrFiveOrSeven(inputString, result)

        if (result.isEmpty()) result = inputString

        return result
    }

    fun checkNumberDivisableByThree(inputNumber: Int, result: String): String {
        var output=result
        if (inputNumber % 3 == 0)
            output+= "Foo"
        return output
    }

    fun checkNumberDivisableByFive(inputNumber: Int, result: String): String {
        var output=result
        if (inputNumber % 5 == 0)
            output+= "Bar"
        return output
    }

    fun checkDigitsContainThree(inputString: String, result: String): String {
        var output=result
        for (c in inputString) {
            when (c) {'3' -> output+="Foo"}
        }
        return output
    }
    fun checkDigitsContainThreeOrFiveOrSeven(inputString: String, result: String): String {
        var output=result
        for (c in inputString) {
            when (c) {'3' -> output+="Foo"}
            when (c) {'5' -> output+="Bar"}
            when (c) {'7' -> output+="Quix"}
        }
        return output
    }

}