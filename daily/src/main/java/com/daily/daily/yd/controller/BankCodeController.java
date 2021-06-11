package com.daily.daily.yd.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daily.daily.yd.mapper.BankCodeMapper;

/**
 * <p>
 * 银行代码表 前端控制器
 * </p>
 *
 * @author zxd
 * @since 2021-06-02
 */
@RestController
@RequestMapping("/yd")
public class BankCodeController {

	@Autowired
	private BankCodeMapper BankCodeMapper;
	
	@GetMapping("/bank")
	public String getBankInfo() {
		Integer count = BankCodeMapper.selectCount(null);
		System.out.println(count);
		return count.toString();
	}
}

