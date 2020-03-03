public class Main {
    public static void main(String[] args) {
       CharsNambers charsNambers= new Scrable();
       CharsNambers reduce= new ReduceScrable();

       int valiuChars=charsNambers.sumChars("dupa");
        System.out.println(valiuChars);
        int valiuReducer=reduce.sumChars("dupa");
        System.out.println(valiuReducer);
    }
}
