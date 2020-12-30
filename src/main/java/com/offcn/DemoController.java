package com.offcn;

import com.offcn.po.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class DemoController {
    @RequestMapping("/hello")
    public String asyHello(){
        return "欢迎光临";
    }

    /*
    获取一个车
     */
    @RequestMapping("/findOne")
    public Car findOne(){

        Car car=new Car(1,"宝马1",800001.0,new Date());

        return  car;
    }
    @RequestMapping("/findAll")
    public List<Car> findAll(){
        List<Car> list=new ArrayList<>();
        Car car1=new Car(1,"宝马1",800001.0,new Date());
        Car car2=new Car(2,"宝马2",800002.0,new Date());
        Car car3=new Car(3,"宝马3",800003.0,new Date());
        Car car4=new Car(4,"宝马4",800004.0,new Date());
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        return  list;
    }

    /**
     * 新增分支方法
     */
    public void fenzhi(){
        System.out.println("我是分支");
    }
}
