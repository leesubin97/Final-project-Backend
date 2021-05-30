package bit.com.a.dto;

public class AdPagingParam {

	// 페이징 처리시 필요한 파라미터
	
	private String choice;
	private String search;
	
	
	private int page;
	private int start;
	private int end;
	
	public AdPagingParam() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public AdPagingParam(String choice, String search, int page, int start, int end) {
		super();
		this.choice = choice;
		this.search = search;
		this.page = page;
		this.start = start;
		this.end = end;
	}



	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}



	@Override
	public String toString() {
		return "AdPagingParam [choice=" + choice + ", search=" + search + ", page=" + page + ", start=" + start
				+ ", end=" + end + "]";
	}

	
	
	
}
