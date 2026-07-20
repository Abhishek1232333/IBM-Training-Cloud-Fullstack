package java03;

public class Exception {
    public static void main(String[] args) {
        try{
            int a=5;
            if(a==5){
                throw new CustomException("Custom exception occurred");
            };
        }
        catch(CustomException e){
            System.out.println("Error:"+e.getMessage());
        }
        finally{
            System.out.println("End of the code execution");
        }
    }
}

class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
    public CustomException(String message, Throwable cause) {
    super(message, cause);
}

}
