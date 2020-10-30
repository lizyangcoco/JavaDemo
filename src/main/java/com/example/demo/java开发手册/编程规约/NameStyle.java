package com.example.demo.java开发手册.编程规约;

/**
 * @description：命名风格
 * @author by 李泽阳 @on 2020/8/31 11:14
 */
public class NameStyle {
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
     *
     *
     * fixme:09[强制] 避免在子父类的成员变量，不同代码块命名相同。
     *
     * fixme:10[强制] 杜绝完全不规范的缩写，避免望文不知义。
     * 反例：：AbstractClass“缩写”命名成AbsClass；condition“缩写”命名成 condi
     *
     * fixme:11[强制] 代码自解释目标，任何自定义元素，使用完整的单词组合
     * 正例：jdk原子类命名为：atomic
     * 反例：int a 命名随意
     *
     *
     *
     *
     * fixme：12[建议] 表示类型的名词都一般在，单词的结尾
     * 正例：startTime / workQueue / nameList / TERMINATED_THREAD_COUNT
     * 反例：startedAt / QueueOfWork / listName / COUNT_TERMINATED_THREAD
     *
     * fixme：13[建议] 具有设计模式，命名体现具体模式
     * 正例：public class OrderFactory;  public class LoginProxy;
     *
     *
     * fixme：14[建议] 接口类中的方法和属性不加任何修饰符号（public也不加）保持代码整洁
     * 正例：接口方法签名 void commit();
     * 反例：接口方法定义 public abstract void f();
     *
     * fixme：15[强制] 对于service和dao类，基于soa理念，暴漏出来的一定是接口，内部实现类用Impl实现
     * 正例：：CacheServiceImpl 实现 CacheService 接口
     * [建议]如果是形容能力的接口名称，取对应的形容词为接口名
     * 正例：AbstractTranslator 实现 Translatable 接口
     *
     * fixme：16[建议] 枚举类加Enum后缀，成员类全部大写
     * 正例：枚举名字为ProcessStatusEnum的成员名称：SUCCESS / UNKNOWN_REASON
     *
     * fixme：18[参考] 各层命名规约
     * A)service/DAO 层方法命名规范
     *  1、获取单个对象    前缀 get
     *  2、获取多个对象    前缀 list
     *  3、获取统计方法    前缀 count
     *  4、插入数据方法    前缀 save/insert
     *  5、删除数据方法    前缀 remove/delete
     *  6、修改数据方法    前缀 update
     * B)领域模型命名规约
     * 1、数据对象：xxxDO，xxx为数据表名
     * 2、数据传输对象：xxxDTO，xxx为业务相关命名
     * 3、展示对象：xxxVO，xxx一般为网页名称
     * 4、POJO是DO/DTO/BO/VO统称，禁止命名xxxPOJO
     *
     *
     *
     * FIXME:二：常量定义
     * fixme：01[强制]：不允许任何魔法值（未经允许预先定义的常量）
     * 反例：String key = "Id#taobao_" + tradeId;
     * cache.put(key, value); // 缓存 get 时，由于在代码复制时，漏掉下划线，导致缓存击穿而出现问题
     *
     * fixme：02[推荐] 不使用常量类维护所有常量，按功能进行维护归类
     * 正例：缓存相关常量放在类 CacheConst下；系统配置相关常量放在类 ConfigConst下
     *
     * fixme：03[推荐] 常量复用层，五层：跨应用共享常量、应用内共享常量、子工程内共享、包内共享常量、类内共享常量
     * 1) 跨应用共享常量：放置在二方库中，通常是 client.jar 中的constant 目录下
     * 2) 应用内共享常量：放置在一方库中，通常是子模块中的constant 目录下
     *
     * 反例：
     *
     * fixme：04[推荐]
     *
     *
     * FIXME:三：代码格式
     * fixme：01[强制] 如果是大括号内为空，则简洁写成{}即可，大括号中间无需换行和空格，如果非空代码则：
     * 1、左大括号不换行，
     * 2、左大括号后换行
     * 3、右括号前换行
     * 4、右大括号后还有else等代码则不换行；表示终止得右大括号必须换行
     *
     * fixme：02[强制] 注释得双斜线与注释内容之间有且仅有一个空格
     * 正例：
     * // 这是示例注释，请注意在双斜线之后有一个空格
     * String param = new String();
     *
     * fixme：03[强制] 单个方法得总行数不超过80行
     * 正例：代码逻辑分清红花和绿叶，个性和共性，绿叶逻辑单独出来成为额外方法，使主干代码更加清晰； 共性逻辑抽取成为共性方法，便于复用和维护。
     *
     *
     */

























}
