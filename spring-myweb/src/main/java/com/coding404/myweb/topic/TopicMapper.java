package com.coding404.myweb.topic;

import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.command.TopicVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TopicMapper {
    int topicRegist(TopicVO topicVO);
    List<TopicVO> getList(String topicWriter);
    TopicVO getDetail(long TopicId);
    int topicUpdate(TopicVO topicVO);
    int topicDelete(long topicId);
}
