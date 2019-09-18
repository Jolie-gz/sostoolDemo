package com.seg.sostool.dao.back;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BackMapper
 * @Description TODO
 * @Author gongzhe
 * @Date 2019/9/9 16:35
 **/
@Mapper
public interface BackMapper {
    List<Map<String, Object>> findAll();
}
