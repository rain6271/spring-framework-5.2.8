package org.springframework.zpr.bean.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScope implements Scope {
	ThreadLocal<Object> local = new ThreadLocal<>();
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		if (local.get() != null) {
			return local.get();
		} else {
			Object object = objectFactory.getObject();
			local.set(object);
		}
		return local.get();
	}

	@Override
	public Object remove(String name) {
		Object o = local.get();
		local.remove();
		return o;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {

	}

	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}

	@Override
	public String getConversationId() {
		return null;
	}
}
