package me.importtao.myssm.service;

import org.springframework.stereotype.Service;

/**
 * @author importtao
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: TODO
 * @date ${date} ${time}
 */
@Service
public class AopS {
    public String selectTest(){
        System.out.println("AopS.selectTest");
        return "hello word";
    }
}
