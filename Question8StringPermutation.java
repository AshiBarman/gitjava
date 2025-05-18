public class Question8StringPermutation{
    public static void main(String[] args) {
        String str = "abcd";
        generatePermutations("",str);
    }
    static void generatePermutations(String prefix,String remaining){
        if(remaining.length()==0){
            System.out.println(prefix);
        }
        else{
            for(int i =0;i<remaining.length();i++){
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0,i)+remaining.substring(i+1);
                generatePermutations(newPrefix,newRemaining);
            }
        }
    }
}
