import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(textModifier(getUser()));
        }
    public static String textModifier(String inputText){

        inputText = deleteSpace(inputText);

        inputText = swap(inputText, '-');

        inputText = changePlus(inputText);

        inputText = sum(inputText);

        return inputText;
    }
    private static String getUser (){
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        scanner.close();
        return inputText;
    }
    private static String deleteSpace(String text){
    String[] delete = text.split("\\s+");
    StringBuilder newStr = new StringBuilder(delete[0]);
    for (int i=1; i<delete.length; i++) {
        newStr.append(" ").append(delete[i]);
    }
    return newStr.toString();
    }

    private static String swap(String text, char minus){
    StringBuilder sb = new StringBuilder();
    char[] charArray = text.toCharArray();
    for (int i=0; i<=charArray.length-1; i++) {
        if (charArray[i] == minus && i <=charArray.length-1){
            sb.append(charArray[i+1]);
            sb.append(charArray[i-1]);
            i++;
        }else {
            if (i<charArray.length-1&&charArray[i+1]!='-'){
                sb.append(charArray[i]);
            }else if (i== charArray.length-1){
                sb.append(charArray[i]);
            }
        }
    }
    return sb.toString();


}
private static String changePlus(String text){
    char[] charArray = text.toCharArray();
    StringBuilder newStr = new StringBuilder();
    for (int i=0; i<charArray.length; i++){
        if(charArray[i]=='+'){
            newStr.append('!');
        }
        newStr.append(charArray[i]);
    }
    return newStr.toString();
}

private static String sum(String text){
    char[] charArray = text.toCharArray();
    int result = 0;
    for (int i=0; i<charArray.length; i++){
        if (charArray[i]=='1'){
            result += 1;
        }
        if (charArray[i]=='2'){
            result += 2;
        }
        if (charArray[i]=='3'){
            result += 3;
        }
        if (charArray[i]=='4'){
            result += 4;
        }
        if (charArray[i]=='5'){
            result += 5;
        }
        if (charArray[i]=='6'){
            result += 6;
        }
        if (charArray[i]=='7'){
            result += 7;
        }
        if (charArray[i]=='8'){
            result += 8;
        }
        if (charArray[i]=='9'){
            result += 9;
        }
    }
    StringBuilder newStr = new StringBuilder();
    for (int i=0; i<charArray.length; i++){
        if (valid(charArray [i])){
            newStr.append(charArray[i]);
        }
    }
    if (result>0){
        return newStr.append(' ').append(result).toString();
    }
    return newStr.toString();
}
private static boolean valid(Character c) {
    if (Character.isLetter(c) || c.equals('!') || c.equals(' ') || c.equals(',') || c.equals('.')) {
        return true;
    }
    return false;
}


}




