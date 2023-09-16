import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.corpus.occurrence.TermFrequency;
import com.hankcs.hanlp.mining.word.TermFrequencyCounter;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
public class SimHash {
    public static String gethash(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest=MessageDigest.getInstance("SHA-1");
        byte[] hash=str.getBytes("UTF-8");
        return new BigInteger(1,hash).toString(2);
    }
    public static String getsimhash(String str) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        TermFrequencyCounter counter=new TermFrequencyCounter();
        counter.add(str);

        int[] listhash=new int[128];
        String stringhash;
        int stringfrequency=0;
        for(TermFrequency keyword:counter){
//          得到hash值
            stringhash=gethash(keyword.getTerm());
            int x=stringhash.length();
//          hash值位数不够,补全
            if(stringhash.length()<128){
                for (int i=0;i<128-x;i++){
                    stringhash+='0';
                }
            }
//          得到词频
            int p=stringhash.length();
            stringfrequency=keyword.getFrequency();
//          加权 求和
            for(int i=0;i<128;i++) {
                if (stringhash.charAt(i) == '1') {
                    listhash[i] += stringfrequency;
                } else {
                    listhash[i] -= stringfrequency;
                }
            }

        }
        String simhash="";
//      降维
        for(int i=0;i<128;i++){
            if(listhash[i]>0)
                simhash+='1';
            else simhash+='0';
        }
        return simhash;
    }
}
