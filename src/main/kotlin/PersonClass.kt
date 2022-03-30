class PersonClass internal constructor(firstName:String,lastName:String) {
    init {
        println("Name is $firstName $lastName")
    }

    constructor(firstName:String,lastName:String, age:Int) : this(firstName, lastName) {
        println("Name is $firstName $lastName and Age is $age")
    }
}

fun main(args:Array<String>){
    // Primary Constructor
    val person1=PersonClass("Rahul","Gite")
    // Secondary Constructor
    val person2=PersonClass("Rahul","Gite",5)

}