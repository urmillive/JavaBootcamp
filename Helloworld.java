class Teacher {
    Teacher(){
        System.out.println("Teacher Constructor");
    }   

    public void teach(){
        System.out.println("Teaching");
    }
}

class Helloworld{
    public static void ram(String[] args){
        System.out.println("'ram ram'");
    }

    public static void main(String[] Strings){
        System.out.println("Hello World");
        Teacher obj = new Teacher();
        ram(Strings);
        obj.teach();
    }
}