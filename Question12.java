public class Question12 {
    static void compression(String str) {
        StringBuilder newstr = new StringBuilder();
        int count = 1;
        for(int i =1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                newstr.append(str.charAt(i-1));
                newstr.append(count);
                count=1;
            }
        }
        newstr.append(str.charAt(str.length()-1));
        newstr.append(count);
        System.out.println(newstr);
    }

    public static void main(String[] args) {
        String str = "aaabbbccc";
        compression(str);
    }
}
