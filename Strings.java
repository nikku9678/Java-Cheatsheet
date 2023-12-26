public class Strings {
    public static void main(String[] args) {
        String []s = {"Nikku","Vishal","Ayush"};
        
        char x='k';
        System.out.println(s[0].indexOf(x)); // return -1 if x not found else return index of x.


        // StringBuffer in Java
        String str="hello";
        StringBuffer sb= new StringBuffer(str);
        System.out.println(sb.reverse());
        System.out.println(new StringBuffer("Nikku").reverse());

    }
}
