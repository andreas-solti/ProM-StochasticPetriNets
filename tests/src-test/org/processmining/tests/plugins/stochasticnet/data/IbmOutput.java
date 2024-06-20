package org.processmining.tests.plugins.stochasticnet.data;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Transient;

@Root(strict=false)
public class IbmOutput extends IbmNode{

	@Transient
	public String getNodeName(){
		return "output";
	}
}
