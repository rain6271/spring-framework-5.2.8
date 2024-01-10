package org.springframework.zpr.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author WangYu
 * @date 2023/11/29 16:37
 */
@Component
public class OrderService {

	@Autowired
	public OrderService(C c, D d) {
		System.out.println(c);
		System.out.println(d);
	}
}
