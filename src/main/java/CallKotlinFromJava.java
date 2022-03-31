public class CallKotlinFromJava {
    public static void main(String[] args) {
        KotlinClassForJava obj=new KotlinClassForJava("Rahul",5);
        // Kotlin automatically create setter and getters for its properties
        obj.setAge(10);
        obj.setName("Gite");
        System.out.println("New Name :"+obj.getName()+",New Age :"+obj.getAge());

        Integer maxInt=GenericsInKotlinKt.max(25,50);
        System.out.println("Max is :"+maxInt);
    }
}
