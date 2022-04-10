data class Student(var name: String, var age: Int);
fun getStudents(): List<Student> {
    return listOf(
        Student("Rahul", 5),
        Student("Gite", 10)
    )
}

fun main() {
    val student =getStudents();
    val combos=student.map { a-> a.name+" : "+ a.age }
    println("Combos : "+combos)
    println("The Oldest Student: ${student.maxByOrNull { it.age }}")

    val studentWithLongestName= student.filter { it.name.length>4 }
    println("Student with longest name : "+ studentWithLongestName)
}