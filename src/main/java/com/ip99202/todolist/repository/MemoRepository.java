package com.ip99202.todolist.repository;

import com.ip99202.todolist.domain.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedDateDesc();
}
