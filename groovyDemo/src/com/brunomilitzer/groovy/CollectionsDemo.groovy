package com.brunomilitzer.groovy

LinkedList l = [1, 2, 3]
println l
println l.class

l << 4

println l

l = l+[5,6,7]

println l

l = l-[3,5]

println l

l.each {println it}
l.reverseEach {print it}
l.eachPermutation {println it}

TreeSet s = ['java', 'js', 'python', 'js'] as Set
println s
println s.class

m = [courseName:'Gradle', raiting: 5, price: 20]
println(m)
m.forEach { k, v ->
    println k
    println v
}
println m.courseName
println m['courseName']
println m.get('courseName')

m.review = "It's awesome"
println m.review