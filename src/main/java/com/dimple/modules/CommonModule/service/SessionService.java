package com.dimple.modules.CommonModule.service;

import com.dimple.modules.BackStageModule.SystemMonitor.bean.UserOnline;

import java.util.List;

/**
 * @author : Dimple
 * @version : 1.0
 * @class : SessionService
 * @description :
 * @date : 01/09/19 20:53
 */
public interface SessionService {
    List<UserOnline> getOnlineAdminList();

    List<UserOnline> getOnlineNormalList();

    List<UserOnline> getOnlineList();

    boolean forceLogout(String[] sessionId);
}
