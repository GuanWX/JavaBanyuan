package club.banyuan.Tool;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/15 11:00 上午
 */
public class LOCK {
    // 用户锁，对用户数据增加 修改 删除时要竞争该锁
    public static final Object USERLOCK = new Object();
    public static final Object PROVIDERLOCK = new Object();
    public static final Object BILLLOCK = new Object();
}
