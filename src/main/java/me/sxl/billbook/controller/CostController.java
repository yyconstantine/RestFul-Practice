package me.sxl.billbook.controller;

import lombok.extern.slf4j.Slf4j;
import me.sxl.billbook.config.PropertyConfig;
import me.sxl.billbook.model.CostDTO;
import me.sxl.billbook.model.CostVO;
import me.sxl.billbook.model.common.Result;
import me.sxl.billbook.model.common.SuccessEnum;
import me.sxl.billbook.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author songxianglong
 * @date 2019/10/14 11:28
 */
@RestController
@Slf4j
public class CostController {

    private CostService costService;

    private PropertyConfig propertyConfig;

    @Autowired
    public void setCostService(CostService costService) {
        this.costService = costService;
    }

    @Autowired
    public void setPropertyConfig(PropertyConfig propertyConfig) {
        this.propertyConfig = propertyConfig;
    }

    @GetMapping("/hello")
    public Result hello() {
        log.info("Result from properties >> {}", propertyConfig.getTEST_DATA());
        return Result.ok(SuccessEnum.GLOBAL_SEARCH_SUCCESS);
    }

    @GetMapping("/cost/{userId}")
    public Result<List<CostVO>> costList(@PathVariable Integer userId) {
        return null;
    }

    @PostMapping("/cost")
    public Result addCost(@Validated @RequestBody CostDTO costDTO) {
        return null;
    }

    @PutMapping("/cost/{costId}")
    public Result editCost(@PathVariable Integer costId, @RequestBody CostDTO costDTO) {
        return null;
    }

    @DeleteMapping("/cost/{costId}")
    public Result delCost(@PathVariable Integer costId) {
        return null;
    }

}
