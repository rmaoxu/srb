package com.hyxs.srb.core.controller.admin;


import com.hyxs.srb.common.expection.Assert;
import com.hyxs.srb.common.result.R;
import com.hyxs.srb.common.result.ResponseEnum;
import com.hyxs.srb.core.pojo.entity.IntegralGrade;
import com.hyxs.srb.core.service.IIntegralGradeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author rmaoxu
 * @since 2021-09-01
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {

    @Resource
    private IIntegralGradeService integralGradeService;

    @ResponseBody
    @GetMapping("/list")
    public R listAll(){
        log.info("loginfo");
        log.warn("warn");
        log.error("error");
        List<IntegralGrade> list = integralGradeService.list();
        return R.success().data("list",list).message("获取列表成功");
    }

    @DeleteMapping("/remove/{id}")
    public R removeById(@PathVariable Long id){
        boolean result = integralGradeService.removeById(id);
        if (result){
            return R.success().message("删除成功");
        }
        else{
            return R.error().message("删除失败");
        }
    }
    @PostMapping("/save")
    public R save(@RequestBody IntegralGrade integralGrade){
        Assert.notNull(integralGrade.getBorrowAmount(), ResponseEnum.BORROW_AMOUNT_NULL_ERROR);
        boolean result = integralGradeService.save(integralGrade);
        if (result){
            return R.success().message("保存成功");
        }else {
            return R.error().message("保存失败");
        }
    }

    @GetMapping("/get/{id}")
    public R getById(@PathVariable Long id){

        IntegralGrade integralGrade = integralGradeService.getById(id);
        if (integralGrade!=null){
            return R.success().data("record",integralGrade);
        }else {
            return R.error().message("数据获取失败");
        }
    }

    @PutMapping("/update")
    public R updateById(@RequestBody IntegralGrade integralGrade){
        boolean result = integralGradeService.updateById(integralGrade);
        if (result){
            return R.success().message("更新成功");
        }else {
            return R.error().message("更新失败");
        }
    }
}

