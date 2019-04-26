package com.sxt.sys.controller;


import com.sxt.sys.service.BillsService;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.utils.ResultObj;
import com.sxt.sys.vo.BillsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 某某飞
 * @since 2019-04-25
 */
@RestController
@RequestMapping("/sys/bills")
public class BillsController {

    @Autowired
    private BillsService billsService;

    /**
     * 加载记账列表
     */
    @RequestMapping("loadAllBill")
    public DataGridView loadAllBill(BillsVo billsVo){
        /*IPage<Bills> page = new Page<>(billsVo.getPage(),billsVo.getLimit());
        QueryWrapper<Bills> wrapper = new QueryWrapper<>();
        wrapper.lambda()
                .eq(Bills::getTypeid,billsVo.getTypeid())
                .or()
                .ge(Bills::getTime,billsVo.getStartTime())
                .or()
                .le(Bills::getTime,billsVo.getEndTime());
        IPage<Bills> iPage = null;
        iPage = this.billsService.page(page,null);
        if(null!=billsVo.getTypeid()){
            iPage = this.billsService.page(page,wrapper);
        }
        if(null!=billsVo.getStartTime()){
            iPage = this.billsService.page(page,wrapper);
        }
        if(null!=billsVo.getEndTime()){
            iPage = this.billsService.page(page,wrapper);
        }
        return new DataGridView(page.getTotal(),iPage.getRecords());*/
        return this.billsService.queryAllBill(billsVo);
    }


    @RequestMapping("addBill")
    public ResultObj addBills(BillsVo billsVo){
        try {
            this.billsService.save(billsVo);
            return ResultObj.addOk();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.addError();
        }
    }


    @RequestMapping("updateBill")
    public ResultObj updateBills(BillsVo billsVo){
        try {
            this.billsService.updateById(billsVo);
            return ResultObj.updateOk();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.updateError();
        }
    }



    @RequestMapping("deleteBill")
    public ResultObj deleteBills(BillsVo billsVo){
        try {
            this.billsService.removeById(billsVo.getId());
            return ResultObj.deleteOk();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.deleteError();
        }
    }

}

