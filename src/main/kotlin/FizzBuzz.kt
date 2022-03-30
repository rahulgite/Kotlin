fun main(args:Array<String>){
    for(no in 1.rangeTo(185)){
        when{
            no%3==0 && no%5==0 -> println("$no is Fizz Buzz");
            no%3==0  -> println("$no is Fizz");
            no%5==0 -> println("$no is Buzz");
        }
    }
}