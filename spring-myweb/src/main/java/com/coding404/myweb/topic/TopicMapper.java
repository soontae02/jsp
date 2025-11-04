package com.coding404.myweb.topic;

import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.util.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TopicMapper {
    int topicRegist(TopicVO topicVO);
    List<TopicVO> getList(Criteria cri);
    int getTotal(Criteria cri);
    TopicVO getDetail(long TopicId);
    int topicUpdate(TopicVO topicVO);
    int topicDelete(long topicId);
}
