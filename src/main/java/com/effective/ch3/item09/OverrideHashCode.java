package com.effective.ch3.item09;

public class OverrideHashCode {

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this.hashCode() == obj.hashCode()) {
			return true;
		} else {
			return super.equals(obj);
		}
	}

}
