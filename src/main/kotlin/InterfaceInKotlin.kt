interface InterfaceInKotlin {
    var name:String;
    fun start(){
        println("Started")
    }
    fun stop(){
        println("Stop")
    }
    fun getInt():Int;
}

class Car:InterfaceInKotlin{
    override var name: String="Tesla";
    override fun getInt(): Int {
        return 100;
    }
}

fun main(array: Array<String>){
    var car=Car();
    car.start();
    car.stop();
    println(car.getInt());
}