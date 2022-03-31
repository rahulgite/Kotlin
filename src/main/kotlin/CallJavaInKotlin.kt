fun main(args:Array<String>){
    val obj= JavaClassForKotlin("Rahul",5);
    println(obj.toString());

    // We can set values if class have setter
    // Property is considered as var
    obj.name="Gite"

    // We can't set values if class does not have setter,
    // The Property is considered as val

    //obj.age=6
    println(obj.toString());
}