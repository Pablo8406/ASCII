public class ReduceScrable implements CharsNambers{
    @Override
    public int sumChars(String text) {
        String upperText= text.toUpperCase();
        int value = upperText.chars().reduce(0, (x, y) -> x + y);
        return value;
    }
}
