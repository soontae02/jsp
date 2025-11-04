package com.coding404.myweb.topic;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.product.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("topicService")
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicMapper topicMapper;

    @Override
    public int topicRegist(TopicVO topicVO) {
        return topicMapper.topicRegist(topicVO);
    }

    @Override
    public List<TopicVO> getList(String topicWriter) {
        return topicMapper.getList(topicWriter);
    }

    @Override
    public TopicVO getDetail(long TopicId) {
        return null;
    }

    @Override
    public int topicUpdate(TopicVO topicVO) {
        return 0;
    }

    @Override
    public int topicDelete(long topicId) {
        return 0;
    }
}
