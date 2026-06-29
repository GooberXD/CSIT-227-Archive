public interface EncryptionAlgorithm {
    public String encrypt(String plaintext);
}

public abstract class Encryptor {
    public void writeToDisk(String plaintext, String filename) {
        EncryptionAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
        String cyphertext = encryptionAlgorithm.encrypt(plaintext);
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {
            outputStream.write(cyphertext.getBytes());
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract EncryptionAlgorithm getEncryptionAlgorithm();
}

public class Sha256CEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String plaintext) {
        return DigestUtils.sha256Hex(plaintext);
    }
}

public class Sha512EncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String plaintext) {
        return DigestUtils.sha512Hex(plaintext);
    }
}

public class Sha256Encryptor extends Encryptor {
    @Override
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return new Sha256CEncryptionAlgorithm();
    }
}

public class Sha512Encryptor extends Encryptor {
    @Override
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return new Sha512EncryptionAlgorithm();
    }
}
