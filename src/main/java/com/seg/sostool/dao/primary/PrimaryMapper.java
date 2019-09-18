package com.seg.sostool.dao.primary;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName PrimaryMapper
 * @Description TODO
 * @Author gongzhe
 * @Date 2019/9/9 16:58
 **/
@Mapper
public interface PrimaryMapper {

    List<Map<String, Object>> findAll();
}
