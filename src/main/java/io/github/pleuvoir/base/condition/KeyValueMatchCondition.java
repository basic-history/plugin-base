package io.github.pleuvoir.base.condition;

import org.springframework.context.annotation.Condition;

public interface KeyValueMatchCondition extends Condition {

	String key();

	String value();
}
