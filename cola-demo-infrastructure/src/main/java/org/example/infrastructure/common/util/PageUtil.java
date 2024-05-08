package org.example.infrastructure.common.util;

import com.alibaba.cola.dto.PageResponse;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.experimental.UtilityClass;

import java.util.function.Function;
import java.util.stream.Collectors;

@UtilityClass
public class PageUtil {

    /**
     * 将 mybatis plus分页对象转换为 cola分页对象
     * @param page   mybatis plus 分页对象
     * @param mapper 映射器
     * @return {@link PageResponse }<{@link Target }>
     */
    public static <Target, source> PageResponse<Target> toColaPageResponse(Page<source> page, Function<? super source, ? extends Target> mapper) {
        PageResponse<Target> response = new PageResponse<>();
        response.setSuccess(true);
        response.setData(page.getRecords().stream().map(mapper).collect(Collectors.toList()));
        response.setTotalCount(Math.toIntExact(page.getTotal()));
        response.setPageSize(response.getPageSize());
        response.setPageIndex(response.getPageIndex());
        return response;
    }
}
