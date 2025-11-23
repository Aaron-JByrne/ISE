package filereading;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadClassFileHeader {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java ReadClassFileHeader <path-to-class-file>");
            return;
        }

        String filePath = args[0];
        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] header = new byte[8]; // read first 8 bytes
            byte[] methodCount = new byte[2];
            int bytesRead = fis.read(header);
            int bytesRead2 = fis.read(methodCount, 6, 2);

            if (bytesRead == -1) {
                System.out.println("File is empty.");
                return;
            }

            if (bytesRead2 == -1) {
                System.out.println("File is too short.");
                return;
            }

            System.out.println("First " + bytesRead + " bytes of " + filePath + ":");
            for (int i = 0; i < bytesRead; i++) {
                System.out.printf("%02X ", header[i]);
            }
            System.out.println();

            System.out.println("Method count: " + (methodCount[0] << 8) + methodCount[1]);

            // Optionally, verify the magic number
            if (header[0] == (byte)0xCA && header[1] == (byte)0xFE &&
                    header[2] == (byte)0xBA && header[3] == (byte)0xBE) {
                System.out.println("Valid .class file (magic number detected).");
            } else {
                System.out.println("Not a valid .class file (magic number missing).");
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
