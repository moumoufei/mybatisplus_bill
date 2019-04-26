package com.sxt.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sxt.sys.domain.Bills;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 某某飞
 * @since 2019-04-25
 */
@Component
public interface BillsMapper extends BaseMapper<Bills> {


    List<Bills> queryAllBill(Bills bills);
}
