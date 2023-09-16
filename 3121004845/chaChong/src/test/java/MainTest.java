import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String str1=read.readTxt("E:\\代码\\java\\chaChong\\src\\main\\java\\text\\test1.txt");
        String str2=read.readTxt("E:\\代码\\java\\chaChong\\src\\main\\java\\text\\test2.txt");
        String simhash1=SimHash.getsimhash(str1);
        String simhash2=SimHash.getsimhash(str2);
        double similarity2=Hamming.getsimilarity(simhash1,simhash2);
        read.writeTxt(similarity2,"E:\\代码\\java\\chaChong\\src\\main\\java\\text\\testrecord.txt");
        System.exit(0);
    }
}