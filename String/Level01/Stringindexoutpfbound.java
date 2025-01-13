public  class Stringindexoutpfbound {
    public static void generateIndexOfBoundException(String s){
        char x = s.charAt(5);
    }
    public static void handleIndexOfBoundException(String s){
        try{
            char x = s.charAt(5);
            System.out.println(x);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("String Index Out of bound exception");
        }
    }
    public static void main(String[] args){
        String s= "abc";
//        System.out.println("Generating a index out of bound exception ");
//        generateIndexOfBoundException(s);
        System.out.println("Handling the exception usig try catch");
        handleIndexOfBoundException(s);
    }
}