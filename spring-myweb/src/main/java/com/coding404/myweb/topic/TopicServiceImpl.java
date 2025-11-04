package com.coding404.myweb.topic;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.product.ProductMapper;
import com.coding404.myweb.util.Criteria;
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
    public List<TopicVO> getList(Criteria cri) {
        return topicMapper.getList(cri);
    }

    @Override
    public int getTotal(Criteria cri) {
        return topicMapper.getTotal(cri);
    }

    @Override
    public TopicVO getDetail(long TopicId) {
        return topicMapper.getDetail(TopicId);
    }

    @Override
    public int topicUpdate(TopicVO topicVO) {
        return topicMapper.topicUpdate(topicVO);
    }

    @Override
    public int topicDelete(long topicId) {
        return topicMapper.topicDelete(topicId);
    }
}
