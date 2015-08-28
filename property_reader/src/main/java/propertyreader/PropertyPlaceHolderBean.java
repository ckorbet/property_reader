package propertyreader;

public class PropertyPlaceHolderBean {
	
	private String property1;
	private String property2;
	private String property3;
	private String property4;
	private String property5;
	
	public PropertyPlaceHolderBean() {
		// Default constructor
	}
	
	public PropertyPlaceHolderBean(final String prop1,
								   final String prop2, 
								   final String prop3, 
								   final String prop4, 
								   final String prop5) {
		this.property1 = prop1;
		this.property2 = prop2;
		this.property3 = prop3;
		this.property4 = prop4;
		this.property5 = prop5;
	}

	@Override
	public final String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PropertyPlaceHolderBean [property1=");
		builder.append(property1);
		builder.append(", property2=");
		builder.append(property2);
		builder.append(", property3=");
		builder.append(property3);
		builder.append(", property4=");
		builder.append(property4);
		builder.append(", property5=");
		builder.append(property5);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((property1 == null) ? 0 : property1.hashCode());
		result = prime * result + ((property2 == null) ? 0 : property2.hashCode());
		result = prime * result + ((property3 == null) ? 0 : property3.hashCode());
		result = prime * result + ((property4 == null) ? 0 : property4.hashCode());
		result = prime * result + ((property5 == null) ? 0 : property5.hashCode());
		return result;
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PropertyPlaceHolderBean other = (PropertyPlaceHolderBean) obj;
		if (property1 == null) {
			if (other.property1 != null)
				return false;
		} else if (!property1.equals(other.property1))
			return false;
		if (property2 == null) {
			if (other.property2 != null)
				return false;
		} else if (!property2.equals(other.property2))
			return false;
		if (property3 == null) {
			if (other.property3 != null)
				return false;
		} else if (!property3.equals(other.property3))
			return false;
		if (property4 == null) {
			if (other.property4 != null)
				return false;
		} else if (!property4.equals(other.property4))
			return false;
		if (property5 == null) {
			if (other.property5 != null)
				return false;
		} else if (!property5.equals(other.property5))
			return false;
		return true;
	}

	public final String getProperty1() {
		return property1;
	}

	public final void setProperty1(final String property1) {
		this.property1 = property1;
	}

	public final String getProperty2() {
		return property2;
	}

	public final void setProperty2(final String property2) {
		this.property2 = property2;
	}

	public final String getProperty3() {
		return property3;
	}

	public final void setProperty3(final String property3) {
		this.property3 = property3;
	}

	public final String getProperty4() {
		return property4;
	}

	public final void setProperty4(final String property4) {
		this.property4 = property4;
	}

	public final String getProperty5() {
		return property5;
	}

	public final void setProperty5(final String property5) {
		this.property5 = property5;
	}	

}