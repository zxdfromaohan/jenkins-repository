package com.daily.daily.yd.service.impl;

import com.daily.daily.yd.entity.BankCodeCopy;
import com.daily.daily.yd.mapper.BankCodeCopyMapper;
import com.daily.daily.yd.service.BankCodeCopyService;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 银行代码表 服务实现类
 * </p>
 *
 * @author zxd
 * @since 2021-06-02
 */
@Service
public class BankCodeCopyServiceImpl extends ServiceImpl<BankCodeCopyMapper, BankCodeCopy> implements BankCodeCopyService {

	@Autowired
	private BankCodeCopyMapper BankCodeCopyMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateBankCodeCopy(String alias) throws Exception {
		UpdateWrapper<BankCodeCopy> updateWrapper = new UpdateWrapper<BankCodeCopy>();
		updateWrapper.set("bc_alias_bankCode", alias);
		updateWrapper.eq("bc_bankCode", "0322");
		BankCodeCopyMapper.update(null, updateWrapper);
		
//		UpdateWrapper<BankCodeCopy> updateWrapper1 = new UpdateWrapper<BankCodeCopy>();
//		updateWrapper.set("bc_alias_bankCode", alias);
//		updateWrapper.eq("bc_bankCo", "0322");
//		BankCodeCopyMapper.update(null, updateWrapper1);
		throw new Exception();
	}

}
