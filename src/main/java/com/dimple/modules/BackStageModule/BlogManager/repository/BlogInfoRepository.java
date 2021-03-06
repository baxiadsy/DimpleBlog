package com.dimple.modules.BackStageModule.BlogManager.repository;

import com.dimple.modules.BackStageModule.BlogManager.bean.BlogInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Dimple
 * @version : 1.0
 * @class : BlogInfoRepository
 * @description :
 * @date : 12/27/18 16:49
 */
@Repository
public interface BlogInfoRepository extends JpaRepository<BlogInfo, Integer> {

    BlogInfo findByBlogId(Integer id);

}
