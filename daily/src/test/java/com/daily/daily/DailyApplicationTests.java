package com.daily.daily;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.daily.daily.util.ReadFileUtil;
import com.daily.daily.yd.entity.BankCodeCopy;
import com.daily.daily.yd.entity.BankEntity;
import com.daily.daily.yd.mapper.BankCodeCopyMapper;
import com.daily.daily.yd.service.BankCodeCopyService;

@SpringBootTest
class DailyApplicationTests {

//	@Autowired
//	private BankCodeCopyMapper BankCodeCopyMapper;
//	
//	@Autowired
//	private BankCodeCopyService bankCodeCopyService;
//	
////	@Test
//	void contextLoads() {
//		List<BankEntity> parseArray = JSON.parseArray(ReadFileUtil.readJsonFile("backList.json"),BankEntity.class);
//		for (BankEntity bankEntity : parseArray) {
//			String bankName = bankEntity.getBankName();
//			if(StringUtils.isNotBlank(bankName) && bankName.length()>4 && bankName.contains("中国")) {
//				bankName = bankName.substring(2, bankName.length());
//			}
//			UpdateWrapper<BankCodeCopy> updateWrapper = new UpdateWrapper<BankCodeCopy>();
//			updateWrapper.set("bc_alias_bankCode", bankEntity.getBankCode());
//			updateWrapper.like("bc_bankName", bankName);
//			BankCodeCopyMapper.update(null, updateWrapper);
//		}
//	}
//	
//	
//	@Test
//	void transcationTest() throws Exception {
//		bankCodeCopyService.updateBankCodeCopy("55555");
//	}
     
}
