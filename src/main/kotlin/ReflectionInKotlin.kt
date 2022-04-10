class ReflectionInKotlin {
}

fun main() {
    var obj=ReflectionInKotlin();
    var kClass=obj.javaClass.kotlin;
    println("Simple name: "+kClass.simpleName)
}