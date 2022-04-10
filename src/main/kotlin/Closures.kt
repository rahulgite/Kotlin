fun closureMaker():()->Unit{
    var num=0;
    return {println(num++)}
}

fun main() {
    val counter1=closureMaker();
    val counter2=closureMaker();

    counter1();
    counter1();
    counter1();
    counter2();
    counter2();
    counter1();
}

/*
Output
0
1
2
0
1
3
 */