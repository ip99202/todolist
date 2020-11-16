package com.ip99202.timeline.dto;

import com.ip99202.timeline.domain.Memo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemoSaveRequestDto {
    private String name;
    private String content;

    @Builder
    public MemoSaveRequestDto(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public Memo toEntity() {
        return Memo.builder()
                .name(name)
                .content(content)
                .build();
    }
}
