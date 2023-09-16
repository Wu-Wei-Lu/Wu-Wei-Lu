import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class HammingTest {

    @Test
    void getdistance() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String str1=read.readTxt("E:\\代码\\java\\chaChong\\src\\main\\java\\text\\test1.txt");
        String str2=read.readTxt("E:\\代码\\java\\chaChong\\src\\main\\java\\text\\test2.txt");
        String simhash1=SimHash.getsimhash(str1);
        String simhash2=SimHash.getsimhash(str2);
        int distance=Hamming.getdistance(simhash1,simhash2);
        System.out.println("距离："+distance);
    }

    @Test
    void getsimilarity() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String str1=read.readTxt("E:\\代码\\java\\chaChong\\src\\main\\java\\text\\test1.txt");
        String str2=read.readTxt("E:\\代码\\java\\chaChong\\src\\main\\java\\text\\test2.txt");
        String simhash1=SimHash.getsimhash(str1);
        String simhash2=SimHash.getsimhash(str2);
        double similarity=Hamming.getsimilarity(simhash1,simhash2);
        System.out.println("相似度："+similarity);
    }
}