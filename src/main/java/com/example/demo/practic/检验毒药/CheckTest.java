package com.example.demo.practic.检验毒药;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author by 李泽阳 @on 2020/11/5
 * @description:
 */
public class CheckTest {


    /**
     * 实景测试：
     * <p>
     * 条件1、1000个空瓶子，999个无毒，1个有毒
     * 条件2、10只小白鼠
     * 条件3、无限制的试管
     * <p>
     * 要求：寻找出有毒药的瓶子编号
     */

    /**
     * 初始化测试数据
     */
    private static ParamsBo initParams() {
        Integer bottleNum = 100000, mouseNum = 1000;
        ParamsBo paramsBo = new ParamsBo();

        // 初始化瓶子
        List<Bottle> bottleList = new ArrayList<>(bottleNum);
        // 随机设置有毒瓶子编号
        int baneNum = new Random().nextInt(100000) + 1;
        for (int i = 0; i < bottleNum; i++) {
            Bottle bottle = new Bottle();
            if (i == baneNum) {
                bottle.setBane(true);
            }
            bottle.setCode(i + 1);
            bottleList.add(bottle);
        }

        // 初始化小白鼠
        List<Mouse> mouseList = new ArrayList<>(mouseNum);
        for (int i = 0; i < mouseNum; i++) {
            Mouse mouse = new Mouse();
            mouseList.add(mouse);
        }
        paramsBo.setBottleList(bottleList);
        paramsBo.setMouseList(mouseList);
        return paramsBo;
    }


    /**
     * 实现思路：oneByOne
     * 一个小白鼠一个个比较
     */
    private static Integer oneByOne() {
        ParamsBo paramsBo = initParams();

        Integer code = 0;
        Mouse mouse = paramsBo.getMouseList().get(0);
        for (Bottle bottle : paramsBo.getBottleList()) {
            mouse.tryBane(bottle.getBane());
            // 如果小白鼠死亡中止实验
            if (!mouse.getLive()) {
                code = bottle.getCode();
                break;
            }
        }
        return code;
    }

    /**
     * 实现思路：二分查找法
     * 1000瓶子2组，2个小白鼠来试
     * <p>
     * 结果：
     * 第一次：500瓶，死一只小老鼠
     * 第二次：250瓶，死一只
     * 第三次：125瓶，死一只
     * 第四次：62、63
     * 第五次：31、32
     * 第六次：15、16
     * 第七次：7、8
     * 第八次：3、4
     * 第九次：1、2
     * 第十次：1
     * <p>
     * 最好结果9只小白鼠可得到结果，最坏10次
     */
    private static Integer binarySearch() {
        ParamsBo paramsBo = initParams();
        List<Mouse> mouseList = paramsBo.getMouseList();
        List<Bottle> bottleList = paramsBo.getBottleList();

        Integer code;
        List<?> list = groupByBisection(bottleList);
        while (true) {
            // 有毒的瓶子
            if (list.size() == 1) {
                /**
                 * fixme 最后采用了排除法，可对最后一个小白鼠进行准确性校验
                 */
                Bottle baneBottle = (Bottle) list.get(0);
                code = baneBottle.getCode();
                break;
            }

            // 分别获取两个试管
            Tube tube1 = new Tube(), tube2 = new Tube();
            List<Bottle> bottleList1 = (List<Bottle>) list.get(0);
            List<Bottle> bottleList2 = (List<Bottle>) list.get(1);
            // 吸管进行吸毒提取
            bottleList1.stream().forEach(bottle -> tube1.absorb(bottle.getBane()));
            bottleList2.stream().forEach(bottle -> tube2.absorb(bottle.getBane()));

            // 获取一个存活列表内的小白鼠
            Mouse mouse0;
            mouse0 = mouseList.stream().filter(mouse -> mouse.getLive().equals(true)).collect(Collectors.toList()).get(0);
            // 试毒
            mouse0.tryBane(tube1.getBane());

            // 如果小白鼠死亡，此试管有毒，二分进行验证
            if (!mouse0.getLive()) {
                list = bottleList1;
            } else {
                list = bottleList2;
            }
            // 反复调用找到有毒试剂为止
            list = groupByBisection(list);

        }
        return code;
    }

    /**
     * 二分法划分数组
     */
    private static List<?> groupByBisection(List<?> list) {
        if (list.size() == 1) {
            return list;
        }
        List<Object> result = new ArrayList<>(10);
        // 二分起始坐标
        int startBound = 0;
        // 二分终止坐标
        int endBound = list.size();
        // 二分中间坐标
        int curIn;
        // 数组长度
        int length = list.size();
        // 偶数对半分
        if (length % 2 == 0) {
            curIn = list.size() / 2;
            // 奇数
        } else {
            curIn = (list.size() - 1) / 2;
        }
        List<?> list1 = list.subList(startBound, startBound + curIn);
        List<?> list2 = list.subList(startBound + curIn, endBound);
        result.add(list1);
        result.add(list2);
        return result;
    }


    public static void main(String[] args) {

        long sTimePZhao = System.currentTimeMillis();
        Integer code1 = oneByOne();
        long eTimePZhao = System.currentTimeMillis();
        System.out.println("oneByOne__有毒瓶子编号为：：" + code1);
        System.out.println("oneByOne的时间查询节点为：：" + (eTimePZhao - sTimePZhao));

        long sTimeCG = System.currentTimeMillis();
        Integer code2 = binarySearch();
        long eTimeCG = System.currentTimeMillis();
        System.out.println("chenGaoCan__有毒瓶子编号为：：" + code2);
        System.out.println("chenGaoCan__的时间查询节点为：：" + (eTimeCG - sTimeCG));

    }
}
