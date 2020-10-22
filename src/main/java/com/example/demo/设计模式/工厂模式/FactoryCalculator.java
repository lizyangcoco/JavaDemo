package com.example.demo.设计模式.工厂模式;

import com.example.demo.project.异常.BusinessException;
import com.example.demo.设计模式.工厂模式.简单工厂模型_计算器.*;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * @author by 李泽阳 @on 2020/10/22 16:47
 * @description:计算器简单工厂模型
 */
public class FactoryCalculator {
    private static Logger logger = Logger.getLogger(String.valueOf(FactoryCalculator.class));

    // 需求：实现一个计算器

    /**
     * 计算器 初版（已将业务和逻辑分开，典型的controller service 分层
     *
     * @param NumberA 数1
     * @param NumberB 数2
     * @param operate 计算符号
     * @return
     */
    public BigDecimal calculator1(BigDecimal NumberA, BigDecimal NumberB, String operate) {
        /**
         * fixme 存在问题
         *  1、扩展性差，再添加算法，需要重新编译代码
         *  2、完成一次计算，计算机需要做三次无用功
         *  3、除数为0，没做判断
         *  4、当一个计算逻辑出问题，影响其他整个计算核心
         */
        String add = "+";
        String subtract = "-";
        String multiply = "*";
        String divide = "/";
        BigDecimal result = new BigDecimal(0);
        // 加
        if (add.equals(operate)) {
            result = NumberA.add(NumberB);
        }
        // 减
        if (subtract.equals(operate)) {
            result = NumberA.subtract(NumberB);
        }
        // 乘
        if (multiply.equals(operate)) {
            result = NumberA.multiply(NumberB);
        }
        // 除
        if (divide.equals(operate)) {
            result = NumberA.divide(NumberB);
        }
        logger.info("计算结果是：" + result);
        return result;
    }

    /**
     * 计算器 改进2
     *
     * @param NumberA 数1
     * @param NumberB 数2
     * @param operate 计算符号
     * @return
     */
    public BigDecimal calculator2(BigDecimal NumberA, BigDecimal NumberB, String operate) {
        /**
         * fixme 存在问题
         *  1、扩展性差，再添加算法，需要重新编译代码
         *  2、当一个计算逻辑出问题，影响其他整个计算核心
         *  3、面向过程编程，而非面向对象编程
         *  4、新增或修改一个算法，就必须拿到全部到计算方法
         */
        BigDecimal result = new BigDecimal(0);

        switch (operate) {
            case "+":
                result = NumberA.add(NumberB);
                break;
            case "-":
                result = NumberA.subtract(NumberB);
                break;
            case "*":
                result = NumberA.multiply(NumberB);
                break;
            case "/":
                if (NumberB.intValue() != 0) {
                    result = NumberA.divide(NumberB);
                } else {
                    throw new BusinessException(-1, "被除数不可为0!");
                }
                break;
            default:
                break;
        }
        logger.info("计算结果是：" + result);
        return result;
    }

    /**
     * fixme mvc分层
     *  封装
     *  controller 层只在意传入的参数，不关心计算逻辑
     *  service层 只在意计算逻辑，不关心客户传入数据问题
     *
     */


    /**
     * 计算器 改进3
     *
     * @param operateType 计算符号
     * @return
     */
    public static Operate calculator3(String operateType) {
        /**
         * fixme 存在问题
         *  1、创建类比较多
         */
        Operate operate = null;

        switch (operateType) {
            case "+":
                operate = new OperateAdd();
                break;
            case "-":
                operate = new OperateSubtract();
                break;
            case "*":
                operate = new OperateMultiply();
                break;
            case "/":
                operate = new OperateDivide();
                break;
            default:
                break;
        }
        return operate;
    }

    /**
     * 工厂调用方
     */
    public static void main(String[] args) {
        Operate operate = calculator3("+");
        operate.setNumberA(new BigDecimal(10));
        operate.setNumberB(new BigDecimal(99));
        operate.getResult();
        logger.info("计算结果为：" + operate.getResult());
    }
    /**
     * fixme
     *  简单工厂模型心得：
     *  概念：就是生成对象的地方
     *  作用：根据类型不同生成不同的调用对象，不关心业务，根据条件创建对象
     *  调用方不需要知道创建那个对象，只需要给出条件，工厂根据条件创建对象
     *
     *
     */

}
