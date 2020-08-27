
***** 数据优化方式 *****


MYSQL的执行计划:依据执行计划进行sql优化

 explain select * from table  <展示执行计划>
 参数如下:
1:id
2:select_type
3:table
4:type
5:possible_key
6:key
7:key_len
8:ref
9:row
10:Extra

1:id表示select操作表的顺序
    (1):id相同,执行顺序从上向下;
    (2):id不同,如果是子查询,id的序列号会递增,id的值优化加载大;
    (3):id相同,id不同,先看大数,再看相同数,<从上向下>

2:select_type
    (1):SIMPLE 简单的查询,不包含子查询或者UNION
    (2):PRIMARY 子查询的最外层
    (3):SUBQUERY seleict 或者where列表包含子查询
    (4):DERIVED 衍生表,本身不存在
    (5):UNION
    (6):UNION RESULT

3:table 表示表名

4:type 显示的是访问类型
排序:(好>到>坏)
system>const>eq_ref>ref>rang>index>ALL
    (1):system,只有一条数据
    (2):const,通过索引一次就找到<id=>
    (3):eq_ref,主键和唯一索引关联
    (4):ref,非唯一索引查询<联合索引>
    (5):rang,范围查询 between 和 in
    (6):index,全表扫描,查询列全为索引
    (7):ALL,全表扫描

5:possible_key 预测索引
6:key 实实在在索引
7:key_len
    (1):长度相关        字符集长度
    (2):字符集  UTF-8 *3 3倍
    (3):是否未null +1
字符集类型的,长度越长越好;数值类型越短越好.

算法:
    字符:3*长度+1(null+1,非null不加) varchar+2
    数值:+4(int)

8:ref 显示那个索引被使用了

9:row
10:额外字段







