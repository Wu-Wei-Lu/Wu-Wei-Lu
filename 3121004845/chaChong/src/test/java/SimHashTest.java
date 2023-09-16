import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class SimHashTest {

    @org.junit.jupiter.api.Test
    void gethash() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String[] string={"一个","深刻","真正","作家","永远","只为","内心","写作"};
        for(String s:string){
            String hash= SimHash.gethash(s);
            System.out.println("hash长度："+hash.length());
            System.out.println("hash值："+hash);
        }
    }

    @org.junit.jupiter.api.Test
    void getsimhash() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String string="\n" + "迟来的勇气比永不到来的勇气要好，但毕竟不是真正的勇气，更像是混合着悔恨的复仇。 " +
                "或许世人道你轻狂，可你本就年少啊！ " +
                "我对你这么好 你却总这样不冷不热的 可我毫无办法 谁叫一开始主动的人是我 偶尔也会想想 当我终于消失在追逐你的长途里 某个夜里你的手机微微一震 你会不会恍然地以为还是我给你的温柔";
        String simhash=SimHash.getsimhash(string);
        System.out.println("simhash长度："+simhash.length());
        System.out.println("simhash值："+simhash);
    }
}