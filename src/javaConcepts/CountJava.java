package javaConcepts;

public class CountJava {
    public static void main(String[] args) {
        String str= "Kac defa java geceyor ki java sayisini javada say";
        String[] strArray = str.split(" ");

        int counter = 0;
        for( String each : strArray){
            if(each.toLowerCase().contains("java")){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
