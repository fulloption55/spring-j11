package com.theerut.springj11.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Builder
public class Pagination {
    @NotNull
    @Min(1)
    @JsonProperty("page_index")
    private Integer pageIndex;

    @Min(1)
    @NotNull
    @JsonProperty("record_per_page")
    private Integer recordPerPage;

    @JsonProperty("total_record")
    private Long totalRecord;

    public static PaginationBuilder builder(int pageIndex, int recordPerPage) {
        return new PaginationBuilder()
                .pageIndex(pageIndex)
                .recordPerPage(recordPerPage);
    }
}
