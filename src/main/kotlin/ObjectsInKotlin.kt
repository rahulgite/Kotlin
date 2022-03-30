object MyObject{
    var a=20;
    var b=30;
    fun add(){
        println("Addition is ${a+b}")
    }
}

fun main(array: Array<String>){
    // Named Object
    MyObject.add();
    // Direct Object
    val add=object{
        var a=20;
        var b=30;
        fun add(){
            println("Addition is ${a+b}")
        }
    }
    add.a=5
    add.b=5
    add.add();
}