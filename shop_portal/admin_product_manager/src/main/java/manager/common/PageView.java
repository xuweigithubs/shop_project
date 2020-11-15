package manager.common;

import lombok.Data;

@Data
public class PageView<T> {
	private T rows;
	private Integer total;
}
