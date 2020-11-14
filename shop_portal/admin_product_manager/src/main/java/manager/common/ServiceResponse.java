package manager.common;

public class ServiceResponse<T> {
	private T result;
	private String status;
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
