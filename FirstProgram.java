class HelloWorld{
    public static void config()
    {
        System.out.println("This is config");
    }
    public static void main(String[] args){
        System.out.println("Hello world");

        secondProgram obj = new secondProgram();
        obj.show();
        config();

        Thirdprogram obj1 = new Thirdprogram();
        obj1.hey();

    }
}