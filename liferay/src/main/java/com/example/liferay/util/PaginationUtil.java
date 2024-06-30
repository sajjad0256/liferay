package com.example.liferay.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PaginationUtil {

    public static Pageable getPageable(int page, int size) {
        return PageRequest.of(page, size);
    }
}
