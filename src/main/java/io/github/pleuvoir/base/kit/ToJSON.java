package io.github.pleuvoir.base.kit;

import com.alibaba.fastjson.JSON;

public interface ToJSON {

	default String toJSON(){
		return JSON.toJSONString(this);
	}
}
