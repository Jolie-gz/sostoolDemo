package com.seg.sostool.controller;

import com.seg.sostool.dao.back.BackMapper;
import com.seg.sostool.dao.primary.PrimaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName MyController
 * @Description TODO
 * @Author gongzhe
 * @Date 2019/9/9 17:10
 **/
@RestController
public class MyController {
    @Autowired
    private PrimaryMapper primaryMapper;

    @Autowired
    private BackMapper backMapper;

    @RequestMapping("/all")
    public void findAll(){
        List<Map<String, Object>> users1 = primaryMapper.findAll();
        List<Map<String, Object>> users2 = backMapper.findAll();
    }

}
