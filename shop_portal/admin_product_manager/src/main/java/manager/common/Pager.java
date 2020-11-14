package manager.common;

public class Pager{
	// 第几页
	private Integer page;
	// 每页多少行
	private Integer rows;
	// 需要计算的是其实行和结束行是多少
	private Integer startIndex;
	// 需要计算的结束行
	private Integer endIndex;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getStartIndex() {
		startIndex=(page-1)*rows;
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getEndIndex() {
		endIndex=page*rows;
		return endIndex;
	}

	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

}
