package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AreaDao {
    /**
     * List all areas
     * @return areaList
     */
    List<Area> queryArea();
}
