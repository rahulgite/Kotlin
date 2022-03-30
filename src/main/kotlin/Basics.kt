fun main(args: Array<String>) {
    println("Hello, World")

    //Type Inference
    val asentence = "I'm a string"
    val myPi = 3.14
    val myAnswer = 42

    var mvDouble = 1.999
    var mvFloat = 1.9F
    var myLong = 123123122L
    var mvInt = 199
    var mvShort: Short = 12
    var myBvte: Byte = 127
    val alongNumber = 123 - 456789
    val thesameNumber = 123456789

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
    println("***** if in single line *****");

    val lowest = if (10 < 20) 10 else 20
    println("Lowest is $lowest");

    println("***** if with block *****");
    var tempInDegreeCelsius = 40;
    var enableAC = if (tempInDegreeCelsius >= 40) {
        true;
    } else {
        false;
    }

    println("AC Enabled : $enableAC")

    //When

    val order=20;

    //with arguments
    println("***** When with arguments *****");

    when(order){
        0 -> println("Zero Order");
        in 1..10 -> println("Small Order");
        else -> println("Huge Order");
    }
    //without arguments
    println("***** When without arguments *****");

    when{
        order<10 -> println("Small Orders");
        order>=10 -> println("Huge Order")
    }

    //Loops- While
    println("***** While Loop *****");

    var x=0
    while(x <30){
        println("$x");
        x+=3;
    }
    println("***** Do While Loop *****");

    do{
        println("$x");
        x-=3;
    }while (x>0);

    //For loop - Classic for loop dosent exits in kotlin e.g for(i=0;i<10;i++){}
    // range
    println("***** For loop with Integer range *****");

    for(no in 1..10){ //no is immutable -cant change it value in block
        println(no);
    }
    // string
    println("***** For loop with String *****");

    for(ch in "RAHUL"){
        println(ch);
    }
    //for with external index
    println("***** for with external index *****");

    var idx=0;

    for(no in 10.rangeTo(20).step(2)){
        print("${++idx}) $no,")
    }

    //for with internal index
    println("\n***** for with internal index *****");
    for((index,no) in 10.rangeTo(20).step(2).withIndex()){
        print("${index + 1}) $no,");
    }
    println("*****  *****");
    println("\n***** for Array using indices property *****");
    var myArray= arrayOf(10,20,30,40,50)
    for(item in myArray.indices){
        println("Item at ${item} is ${myArray[item]}");
    }
    //Functions
    println("***** Function *****");
    println("Addition normal function ${add1(10,20)}");
    println("Addition single line function function ${add2(10,20)}");
    println("Addition single line function compact function ${add3(10,20)}");
    println("Addition with default parameter value function ${add4()}");
    println("Addition with default parameter value function with named parameter ${add4(param2 = 30)}");
}

fun add1(param1: Int, param2: Int): Int {
    return param1+param2;
}

fun add2(param1: Int, param2: Int): Int = param1 + param2;

fun add3(param1: Int, param2: Int) = param1 + param2;

fun add4(param1: Int=10, param2: Int=20) = param1 + param2;





