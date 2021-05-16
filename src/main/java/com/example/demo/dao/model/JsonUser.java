package com.example.demo.dao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author by 李泽阳 @on 2021/3/21 21:41
 * @description:
 */
@Table(name = "json_user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JsonUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    @Column(name = "id")
    private Integer id;

    /**
     * 测试字段
     */
    @Column(name = "t_var")
    private String tVar;

    /**
     * 是否删除
     */
    @Column(name = "has_delete")
    private Integer hasDelete;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private LocalDateTime updateTime;


}
