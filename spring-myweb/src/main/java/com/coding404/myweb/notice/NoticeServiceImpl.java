package com.coding404.myweb.notice;

import com.coding404.myweb.command.NoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public int noticeRegist(NoticeVO noticeVO) {
        return noticeMapper.noticeRegist(noticeVO);
    }
}
