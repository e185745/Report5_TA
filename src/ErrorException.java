public class ErrorException{
    public static void main(String[] args) throws Exception {
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException exception){
            System.out.println(exception.getMessage());
            System.out.println("NullPointerExceptionが発生しました");
        }
    }
}