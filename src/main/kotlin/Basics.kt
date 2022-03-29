fun main(args:Array<String>){
    println("Hello, World")

    //Type Inference
    val asentence = "I'm a string"
    val myPi = 3.14
    val myAnswer=42
    
    var mvDouble = 1.999
    var mvFloat= 1.9F
    var myLong= 123123122L
    var mvInt= 199
    var mvShort: Short = 12
    var myBvte: Byte = 127
    val alongNumber = 123-456789
    val thesameNumber= 123456789

    // Specify type to avoid ambugity

    var aString: String
    val aDouble: Double
    val aInt: Int


    //I am end of line comment
/*
I am a block comment
*/
/*
fun meaninglessFunc(){
    /*
    I am a nested comment, Java gives error for nested Comments
     */
     }
 */

    // If - control flow

    val lowest= if (10 < 20) 10 else 20
    print("Lowest is $lowest");
}