package labGuessGame;

import java.io.*;

public final class FileUtilities {

    public static void writeObjectToFile(Serializable object, String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
        }
        catch (Exception e) {
            System.out.println("File write error" + e);
        }
    }

    public static Object readObjectFromFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                return ois.readObject();
            }
        }
        catch (Exception e) {
            System.out.println("File read error" + e);
        }
        return null;
    }
}
