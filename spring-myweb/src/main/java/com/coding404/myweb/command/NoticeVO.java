package com.coding404.myweb.command;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NoticeVO {
    private long NoticeId;
    private String noticeProd;
    private String noticeWriter;
    private String noticeName;
    private String noticeTitle;
    private String noticeContent;
    private String noticeYn;
    private String noticeRegdate;
}
