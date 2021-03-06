package myzd.domain.request;

import lombok.Data;

import java.util.List;


@Data
public class PagedResult<T> {
  private List<T> list;
  private Integer size;
  private Integer pageSize;
  private Integer page;
}
