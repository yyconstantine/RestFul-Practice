package me.sxl.billbook.service.impl;

import lombok.extern.slf4j.Slf4j;
import me.sxl.billbook.dao.CostDao;
import me.sxl.billbook.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author songxianglong
 * @date 2019/10/14 11:29
 */
@Service
@Slf4j
public class CostServiceImpl implements CostService {

    private CostDao costDao;

    @Autowired
    public void setCostDao(CostDao costDao) {
        this.costDao = costDao;
    }
}
