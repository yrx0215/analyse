package com.jnshu.miku.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author wangziping
 * @since 2019-03-04
 */
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("account")
    private String account;

    @TableField("password")
    private String password;

    @TableField("name")
    private String name;

    @TableField("qq")
    private Long qq;

    @TableField("type")
    private String type;

    @TableField("school")
    private String school;

    @TableField("online")
    private Long online;

    @TableField("from_know")
    private String fromKnow;

    @TableField("create_at")
    private Long createAt;

    @TableField("wish")
    private String wish;

    @TableField("glory_brother")
    private Integer gloryBrother;

    @TableField("img")
    private String img;

    @TableField(exist = false)
    private List<Rule> rule;


}
