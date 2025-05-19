public class Question9StringToInteger{
    public static int convertStringToInt(String str){
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        String str ="558";
        int result = convertStringToInt(str);
        System.out.println("converted integer"+"-"+result);
    }
}
