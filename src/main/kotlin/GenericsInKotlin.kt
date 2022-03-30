fun main(args:Array<String>){
    var maxInt:Int=max(10,20);
    var maxLong:Long=max(10000L,200000L);
    var maxByte:Byte=max((-128).toByte(),(127).toByte());
    var maxString:String=max("Rahul","Gite");

    println(maxInt);
    println(maxLong);
    println(maxByte);
    println(maxString);
}

fun <T:Comparable<T>> max(p1: T, p2: T): T {
    val result=p1.compareTo(p2);
    return if(result>0) p1 else p2;
}




