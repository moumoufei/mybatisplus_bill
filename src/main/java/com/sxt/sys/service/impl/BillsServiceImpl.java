package com.sxt.sys.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxt.sys.domain.Bills;
import com.sxt.sys.mapper.BillsMapper;
import com.sxt.sys.service.BillsService;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.vo.BillsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 某某飞
 * @since 2019-04-25
 */
@Service
public class BillsServiceImpl extends ServiceImpl<BillsMapper, Bills> implements BillsService {

    @Autowired
    private BillsMapper billsMapper;

    @Override
    public DataGridView queryAllBill(BillsVo billsVo) {
        IPage<Bills> page = new Page<>(billsVo.getPage(),billsVo.getLimit());
        List<Bills> rows = this.billsMapper.queryAllBill(billsVo);
        return new DataGridView(page.getTotal(),rows);
    }
}
