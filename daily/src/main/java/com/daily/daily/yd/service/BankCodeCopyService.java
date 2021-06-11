package com.daily.daily.yd.service;

import com.daily.daily.yd.entity.BankCodeCopy;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 银行代码表 服务类
 * </p>
 *
 * @author zxd
 * @since 2021-06-02
 */
public interface BankCodeCopyService extends IService<BankCodeCopy> {

	void updateBankCodeCopy(String alias) throws Exception;
}
