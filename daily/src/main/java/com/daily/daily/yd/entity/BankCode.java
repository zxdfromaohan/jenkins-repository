package com.daily.daily.yd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 银行代码表
 * </p>
 *
 * @author zxd
 * @since 2021-06-02
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class BankCode implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "bc_id", type = IdType.AUTO)
      private Long bcId;

      /**
     * 银行代码
     */
      @TableField("bc_bankCode")
    private String bcBankcode;

      /**
     * 银行名称
     */
      @TableField("bc_bankName")
    private String bcBankname;


}
