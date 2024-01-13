public class HexEncoder {
    public String encodeToHex(String text) {
        StringBuilder hexChars = new StringBuilder();
        for (char ch : text.toCharArray()) {
            hexChars.append(String.format("%02", (int)ch));
        }

        return hexChars.toString();
    }
}

