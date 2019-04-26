package com.sxt.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sxt.sys.domain.Bills;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.vo.BillsVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 某某飞
 * @since 2019-04-25
 */
public interface BillsService extends IService<Bills> {

    DataGridView queryAllBill(BillsVo billsVo);
}
