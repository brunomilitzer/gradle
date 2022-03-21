package com.brunomilitzer.groovy

c = { n = 2->
    println("Closures are super simple")
    println(n % 2 == 0 ? "even": "odd")
}

c.call()

4.times {n->println n}
4.times {println it }