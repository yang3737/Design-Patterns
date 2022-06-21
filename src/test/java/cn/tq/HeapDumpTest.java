package cn.tq;

import java.util.ArrayList;
import java.util.List;

public class HeapDumpTest {
    static class OOMClass{}

    public static void main(String[] args) {
        List<OOMClass> set = new ArrayList<>();
        while (true){
            set.add(new OOMClass());
        }
    }
}
