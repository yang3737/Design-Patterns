package cn.tq;

public class MinorTest {
    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }

    private static final int _1MB = 1024 * 1024;
    /**
     * VM参数:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 */
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4; allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    public static void testPretenureSizeThreshold() { byte[] allocation;
        allocation = new byte[7 * _1MB]; //直接分配在老年代中
    }

}
