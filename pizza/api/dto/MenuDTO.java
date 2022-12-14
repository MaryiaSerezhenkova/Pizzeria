package pizza.api.dto;

import java.util.List;
import pizza.api.IMenuRow;

public class MenuDTO {

	private String name;
	private boolean enabled;

	private List<IMenuRow> items;

	public MenuDTO(String name, boolean enabled) {

		this.name = name;
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public List<IMenuRow> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "Menu{" + "name='" + name + '\'' + ", enabled=" + enabled + '}';
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
