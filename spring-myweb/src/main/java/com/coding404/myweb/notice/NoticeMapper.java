package com.coding404.myweb.notice;

import com.coding404.myweb.command.NoticeVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {
    int noticeRegist(NoticeVO noticeVO);
}
