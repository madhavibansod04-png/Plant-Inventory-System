package com.plantInventory.app.dto.common;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageResponse<T> {
	
	//fields
	private List<T> content;
	private int page;
	private int size;
	private long totalElements;
	private int totalPages;
	
	// default constructor
	public PageResponse() {}
	
	//parameterized constructor to manually create a PageResponse
	public PageResponse(List<T> content, int page, int size, long totalElements, int totalPages) {
		this.content = content;
		this.page = page;
		this.size = size;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
	}
	
	//factory method to build a pageResponse directly from a Spring data page<T>
	public static <T> PageResponse<T> from(Page<T> pageData){
		return new PageResponse<>(
				pageData.getContent(),
				pageData.getNumber(),
				pageData.getSize(),
				pageData.getTotalElements(),
				pageData.getTotalPages()
				);
	}

	//getter and setter
	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

}
