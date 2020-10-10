package com.example.demo.java开发手册.编程规约;

/**
 * @description：命名风格
 * @author by 李泽阳 @on 2020/8/31 11:14
 */
public class 命名风格 {
    /**
     * FIXME：01[强制] 代码命名不可以"下划线或美元符号开始"，也不可以此为结束
     * 正例：
     * 反例：_name/ __name/ $name/ name_/ name__/ name$
     *
     * FIXME：02[强制] 代码命名禁止拼音英文混合以及纯拼音
     * 正例：name/ page/ dictionaries/
     * 反例：daZhe[打折]/ waHaHa[哇哈哈]
     *
     * FIXME：03[强制] 类名采用大驼峰，一下情况例外DO/BO/DTO/VO/AO/PO/UID
     * 正例：userDTO/ XmlService/ TcpUdpDeal/ TaPromotion
     * 反例：userDto/ XMLService/ TCPUDPDeal/ TAPromotion
     *
     * FIXME：04[强制] 方法名、参数名、成员变量、局部变量、全部采用"小驼峰"风格
     * 正例：
     * 反例：
     *
     * FIXME：05[强制] 常量命名全部大写，单词间采用下划线隔离，力求语义完整
     * 正例：MAX_STOCK_COUNT
     * 反例：MAX_COUNT/ Min_Stock_Count
     *
     * FIXME：06[强制] 抽象类以Abstract或Base开头；异常类以Exception结束；测试类以类名加Test结束
     * 正例：
     * 反例：
     *
     * FIXME：07[强制] POJO类中的布尔变量不可加is前缀，否则框架解析会引起序列化错误
     * 说明：表达是否的值采用is_xxx命名，在resultMap设置is_xxx到xxx的映射
     * 反例：定义基本数据类型Boolean isDeleted的属性，方法也为isDeleted，PRC框架反向解析对应属性名称为deleted，导致属性获取不到，进而抛出异常
     *
     * FIXME：08[强制] 包名统一小写，点分割之间只有一个自然语义单词；包名统一使用单数
     */
}
