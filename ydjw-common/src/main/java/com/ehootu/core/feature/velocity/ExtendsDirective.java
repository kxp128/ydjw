package com.ehootu.core.feature.velocity;

import org.apache.velocity.runtime.directive.Parse;

public class ExtendsDirective extends Parse {

	@Override
	public String getName() {
		return "extends";
	}

}
