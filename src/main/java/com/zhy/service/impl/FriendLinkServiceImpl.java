package com.zhy.service.impl;

import com.zhy.constant.CodeType;
import com.zhy.mapper.FriendLinkMapper;
import com.zhy.model.FriendLink;
import com.zhy.service.FriendLinkService;
import com.zhy.utils.DataMap;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhangocean
 * @Date: 2019/5/16 17:09
 * Describe:
 */
@Service
@Slf4j
public class FriendLinkServiceImpl implements FriendLinkService {
	private static final Logger log = LoggerFactory.getLogger(FriendLinkServiceImpl.class);
    @Autowired
    FriendLinkMapper friendLinkMapper;

    @Override
    public DataMap addFriendLink(FriendLink friendLink) {
        int id = friendLinkMapper.findIsExistByBlogger(friendLink.getBlogger());
        try {
            if(id == 0){
                friendLinkMapper.save(friendLink);
                return DataMap.success(CodeType.ADD_FRIEND_LINK_SUCCESS)
                        .setData(friendLink.getId());
            } else {
                return DataMap.fail(CodeType.FRIEND_LINK_EXIST);
            }
        } catch (Exception e){
            log.error("add friend link exception", e);
            return DataMap.fail(CodeType.ADD_FRIEND_LINK_EXCEPTION);
        }
    }

    @Override
    public DataMap getAllFriendLink() {
        List<FriendLink> links = friendLinkMapper.getAllFriendLink();
        return DataMap.success().setData(links);
    }

    @Override
    public DataMap updateFriendLink(FriendLink friendLink, int id) {
        try {
            friendLinkMapper.updateFriendLink(friendLink, id);
            return DataMap.success(CodeType.UPDATE_FRIEND_LINK_SUCCESS);
        } catch (Exception e){
            log.error("update friend link exception", e);
            return DataMap.fail(CodeType.UPDATE_FRIEND_LINK_EXCEPTION);
        }
    }

    @Override
    public DataMap deleteFriendLink(int id) {
        try {
            friendLinkMapper.deleteFriendLinkById(id);
            return DataMap.success(CodeType.DELETE_FRIEND_LINK_SUCCESS);
        } catch (Exception e){
            log.error("delete friend link exception", e);
            return DataMap.fail(CodeType.DELETE_FRIEND_LINK_EXCEPTION);
        }
    }

    @Override
    public DataMap getFriendLink() {
        List<FriendLink> links = friendLinkMapper.getAllFriendLink();
        return DataMap.success().setData(links);
    }
}
