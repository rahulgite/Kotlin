
data class OperatorOverloading(var x: Int, var y: Int) {
    operator fun plus( other: OperatorOverloading): OperatorOverloading {
        return OperatorOverloading(x + other.x, y + other.y);
    }
}

fun overload(){
    val o1=OperatorOverloading(10,20);
    val o2=OperatorOverloading(30,40);
    val ans=o1+o2;
    println(ans);
}

fun main(args:Array<String>) {
overload();
}