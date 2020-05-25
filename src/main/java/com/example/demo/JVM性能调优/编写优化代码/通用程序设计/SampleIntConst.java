package com.example.demo.JVM性能调优.编写优化代码.通用程序设计;

/**
 * Created by 李泽阳 on 2020/5/22 18:25
 */
public class SampleIntConst {
    /**
     * todo 类描述：自定义int常量
     * 缺点:
     * 1、易于编写错误
     * 2、不宜于获取名称
     * 3、修改常量数值，如不编译其他类无法加载
     */
    //order
    private final static int ORDER_STATE_UNPAY = 0;//未支付
    private final static int ORDER_STATE_PID = 1;//已支付
    private final static int ORDER_STATE_TIMOUT = 2;//连接超时


    //goods
    private final static int GOODS_LOG_READY = 0;//准备发货
    private final static int GOODS_LOG_TRANSPORT = 1;//物流中
    private final static int GOODS_LOG_ARRIVED = 2;//已发货

    //枚举内自动排序的，0，1，2，3...
    public enum order {UNPAY, PID, TIMOUT}

    public enum goods {READY, TRANSPORT, ARRIVED}

    public static void main(String[] args) {
        //获取值.ordinal()
        System.out.println(order.UNPAY.ordinal());
        //获取参数名称.
        System.out.println(order.PID);
        System.out.println(order.TIMOUT);

    }

}
