/*
 * CrudType.java  v1.00  2011-12-21
 * Peoject	sungard-smartcard-bccsvr
 * Copyright (c) 2011 Sungard.China.HE
 *
 * Filename	:	CrudType.java  v1.00 2011-12-21
 * Project	: 	sungard-smartcard-bccsvr
 * Copyight	:	Copyright (c) 2011 Sungard.China.HE
 */
package com.offke.core.common.util;

/**
 * 数据库操作类型.
 * <p/>
 * A 增
 * <p/>
 * U 改
 * <p/>
 * D 删除
 * <p/>
 * Q 查询
 * <p/>
 * Other 其它
 * <p/>
 * DA 批量删除
 * <p/>
 * V 审核
 * <p/>
 * UA 批量修改
 * <p/>
 * I 导入 <br>
 * DETAIL 查看详情
 * <p/>
 * B 绑定
 * <p/>
 * R 拒绝
 * <p/>
 * REVOKE 撤销
 *
 * @author <a href="mailto:jianggl88@gmail.com">蒋根亮</a>
 * @version v1.00
 * @since 1.00 2011-12-21
 */
public enum CrudType {

    A, U, D, DETAIL, Q, Other, DA, V, UA, I, B, R, REVOKE

}