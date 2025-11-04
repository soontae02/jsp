package com.coding404.myweb.topic;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.util.Criteria;

import java.util.List;

public interface TopicService {
    int topicRegist(TopicVO topicVO);
    List<TopicVO> getList(Criteria cri);
    int getTotal(Criteria cri);
    TopicVO getDetail(long TopicId);
    int topicUpdate(TopicVO topicVO);
    int topicDelete(long topicId);
}
