package manager.common;

import lombok.Data;

@Data
public class ServiceResponse<T> {
	private T result;
	private String status;
}
