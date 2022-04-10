fun sequences() {
    val student = getStudents();
    val sqStudent = student.drop(1).take(1).toList();
    println("Student Sequence :" + sqStudent)

    val numbers = generateSequence(100) { it + 1 }
    println("Numbers:"+numbers.drop(5).take(20).toList())

    val squares = generateSequence(1) {it+1  }.map { it*it }
    println("Square:"+squares.take(5).toList())

    val evenSquares=squares.filter { it%2==0 }
    println("Even Square:"+evenSquares.take(5).toList())

    val fibo= generateSequence(1 to 1){it.second to it.first +it.second}.map { it.first }
    println("Fibonacci: "+fibo.take(5).toList())
}
fun main() {
    sequences()
}

/*
Output
Student Sequence :[Student(name=Gite, age=10)]
Numbers:[105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124]
Square:[1, 4, 9, 16, 25]
Even Square:[4, 16, 36, 64, 100]
Fibonacci: [1, 1, 2, 3, 5]
 */