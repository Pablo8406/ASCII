public class Scrable implements CharsNambers {


    @Override
    public  int sumChars(String text) {
        String upperText= text.toUpperCase();
        int value=0;
        for (int i=0; i<upperText.length(); i++){
            value+=  upperText.charAt(i);
        }
        return value;
    }
}
