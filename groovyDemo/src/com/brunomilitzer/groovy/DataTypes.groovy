package com.brunomilitzer.groovy

//def a = 10
float a = 10.24f

println a
println a.class

s = 'hello'
println s

name = "Bruno"
s = "hello ${name}"
print s

// Multiple lines
s = '''
All the power is with in you.
You can do anything and everything
'''
println s

emailPattern=/[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+/
println emailPattern.class
print "test@gmail.com" ==~ emailPattern