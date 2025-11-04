package com.coding404.myweb.command;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TopicVO {
    private Long topicId;
    private String topicTitle;
    private String topicContent;
    private String topicWriter;
    private LocalDateTime topicRegdate;
    private LocalDateTime topicUpdatedate;
    private Integer topicHit;
}
