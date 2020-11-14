package manager.common;
public class Pager{
	// 第几页
	private Integer currentPage;
	// 每页多少行
	private Integer pageSize;
	// 需要计算的是其实行和结束行是多少
	private Integer startIndex;
	// 需要计算的结束行
	private Integer endIndex;
    //获取
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartIndex() {
		startIndex=(currentPage-1)*pageSize;
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getEndIndex() {
		endIndex=currentPage*pageSize;
		return endIndex;
	}

	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}
}
