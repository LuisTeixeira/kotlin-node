package com.lfmteixeira.common

actual class Console: IConsole {

    actual override fun println(s: String) {
        console.log(s)
    }

}