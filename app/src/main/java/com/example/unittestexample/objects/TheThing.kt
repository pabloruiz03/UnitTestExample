package com.example.unittestexample.objects

class TheThing {

    fun methodA(): Boolean {
        return true
    }

    /***
     * Takes in an array and returns the longest word
     */
    fun methodB(x: Array<String>): String {
        if (x.isEmpty()) {
            return ""
        }

        var longestWord = x[0]
        for (word in x) {
            if (word.length > longestWord.length) {
                longestWord = word
            }
        }

        return longestWord
    }

    fun multiplyXY(x: Int, y: Int): Int {
        return x * y
    }
}