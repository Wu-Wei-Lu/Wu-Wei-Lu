import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class readTest {
    @Test
    void readTxt() {
//        路径正常，读取成功
        String str=read.readTxt("E:\\代码\\java\\chaChong\\src\\main\\java\\text\\test1.txt");
        System.out.println(str);
    }

    @Test
    void writeTxt() {
//        路径正常，写入成功
        String str="E:\\代码\\java\\chaChong\\src\\main\\java\\text\\testrecord.txt";
        read.writeTxt(0.56,str);
    }

    @Test
    void readbadTxt() {
//        路径错误，读取错误
        String str=read.readTxt("E:\\代码\\java\\chaChong\\src\\main\\java\\text\\testnone00.txt");
        System.out.println(str);
    }
    @Test
    void writebadTxt() {
//        路径错误，写入错误
        String str="E:\\代码\\java\\chaChong\\src\\main\\java\\text\\testnone.txt";
        read.writeTxt(0.56,str);
    }
}