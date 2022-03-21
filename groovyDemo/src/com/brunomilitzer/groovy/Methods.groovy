package com.brunomilitzer.groovy

int product(int x = 3, int y) {
    return x * y;
}

println product(5, 2)
result = product 10
println result

void display(Map productDetails) {
    println productDetails.name
    println productDetails.price
}

display([name: 'Galaxy S20', price: 1000])
display(name: 'Galaxy S20', price: 1200)
display price: 1500, name: 'Galaxy S20'