package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {

    Page<Blog> findAllByCategoryId(Long id, Pageable pageable);

    Page<Blog> findAllByTitleContains(String title, Pageable pageable);

}
