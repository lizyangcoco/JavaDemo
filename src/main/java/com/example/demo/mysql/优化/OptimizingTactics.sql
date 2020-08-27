

***** mysql的优化策略方案  *****




开启慢查询检查sql语句:优化sql语句



策略一:尽量全值匹配
    select * from table where a='',and b='',and c='';
        a,b,c全部为索引全查询速度快于只查a
    select * from table where a='';

策略二:最佳左前缀原则
    select * from table where a='',and b='',and c='';
    查询排序,联合主键a必须在开始第一个,中间不可间断
    select * from table where b='';
    select * from table where b='',c='';


策略三:不在索引列做任何操作
    select * from table where a='',
    不做操作,下面慢
    select * from table where left(a,1)='';

策略四:查询范围条件放在索引最后 索引顺序
    select * from table where a>'',and b='',and c='';
    这里的范围是指,索引的范围

策略五:多使用覆盖索引,index
    全索引查询

策略六:不等于经常导致索引失效,慎用
    select * from table where a!='';
    导致索引失效


策略七:NULL/is not null 注意使用
    is null?, is not null?
    当索引不为null,全部失效
    当索引为null,is null 不失效,is not null 失效

策略八:字符匹配,like匹配方式
    索引失效
    select * from table where a like('% %');
    索引失效
    select * from table where a like('% ');
    索引不失效,在最后面匹配不失效
    select * from table where a like(' %');

策略九:字符类型加引号
    字符串类型不加单引号索引失效
    select * from table where a=a;
    不失效
    select * from table where a='a';

策略十:or 改为 NUION 效率高
    select * from table where a='' or b='';
    修改为union
    select * from table where a='';
    union
    select * from table where b='';







