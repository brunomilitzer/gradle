package com.brunomilitzer.groovy

class Patient {
    def firstName, lastName, age
    static hospitalCode = "44AF"

    void setFirstName(firstName) {
        if (firstName == null) throw new IllegalArgumentException("First Name cannot be null")
        this.firstName = firstName
    }

    void setLastName(lastName) {
        if (lastName == null) throw new IllegalArgumentException("Last Name cannot be null")
        this.lastName = lastName
    }

    static void display() {
        println hospitalCode
    }
}

p = new Patient(firstName: 'Bruno', lastName: 'Militzer', age: 43)
println p.firstName + " " + p.lastName + " " + p.age

p.setFirstName("Vanessa")
p.setLastName("de Garcez")
println p.firstName + " " + p.lastName + " " + p.age
Patient.display()