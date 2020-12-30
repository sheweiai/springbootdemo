package com.offcn.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

//使用一下注解之前还要下载lombok的插件，不然无效
//@Setter//使用注解提供set方法（提前导入lombok的依赖）
//@Getter//使用注解提供get方法
@Data //=@Setter+@Getter
@AllArgsConstructor//全参构造器
@NoArgsConstructor//无惨构造器
public class Car {
    private Integer id;
    private String name;
    private Double price;
    //设置时间格式和时区（东8区）
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;
}
