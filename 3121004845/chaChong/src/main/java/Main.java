import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
//        "E:\\代码\\java\\chaChong\\src\\main\\java\\text\\orig.txt"
//        "E:\\代码\\java\\chaChong\\src\\main\\java\\text\\orig_0.8_add.txt"
//        "E:\\代码\\java\\chaChong\\src\\main\\java\\text\\orig_0.8_del.txt"
//        "E:\\代码\\java\\chaChong\\src\\main\\java\\text\\orig_0.8_dis_1.txt"
//        "E:\\代码\\java\\chaChong\\src\\main\\java\\text\\orig_0.8_dis_10.txt"
//        "E:\\代码\\java\\chaChong\\src\\main\\java\\text\\orig_0.8_dis_15.txt"
        String str1=read.readTxt(args[0]);
        String str2=read.readTxt(args[1]);
        String str3=read.readTxt(args[2]);
        String str4=read.readTxt(args[3]);
        String str5=read.readTxt(args[4]);
        String str6=read.readTxt(args[5]);
        String str7=args[6];
        String simhash1=SimHash.getsimhash(str1);
        String simhash2=SimHash.getsimhash(str2);
        String simhash3=SimHash.getsimhash(str3);
        String simhash4=SimHash.getsimhash(str4);
        String simhash5=SimHash.getsimhash(str5);
        String simhash6=SimHash.getsimhash(str6);
        double similarity2=Hamming.getsimilarity(simhash1,simhash2);
        double similarity3=Hamming.getsimilarity(simhash1,simhash3);
        double similarity4=Hamming.getsimilarity(simhash1,simhash4);
        double similarity5=Hamming.getsimilarity(simhash1,simhash5);
        double similarity6=Hamming.getsimilarity(simhash1,simhash6);
        read.writeTxt(similarity2,str7);
        read.writeTxt(similarity3,str7);
        read.writeTxt(similarity4,str7);
        read.writeTxt(similarity5,str7);
        read.writeTxt(similarity6,str7);
        System.exit(0);
    }
}