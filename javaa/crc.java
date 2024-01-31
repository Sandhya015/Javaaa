public class crc {

    public static void main(String[] args) {
        
        byte[] data = "Hello, CRC!".getBytes();

       
        int generator = 0b1101;

        int calculatedCRC = calculateCRC(data, generator);

        
        System.out.println("Calculated CRC: " + Integer.toHexString(calculatedCRC));
    }

    private static int calculateCRC(byte[] data, int generator) {
        int crc = 0;

        for (byte b : data) {
            crc ^= b; 

            
            for (int i = 0; i < 8; i++) {
                if ((crc & 0x01) != 0) {
                    crc = (crc >>> 1) ^ generator;  
                } else {
                    crc >>>= 1;  
                }
            }
        }

        return crc;
    }
}
