package io.choerodon.wiki.domain.service;

import java.io.IOException;

/**
 * Created by Zenger on 2018/7/3.
 */
public interface IWikiSpaceWebHomeService {

    int createSpace1WebHome(String param1, String xmlParam);

    int createSpace2WebHome(String param1, String param2, String xmlParam);

    int createSpace3WebHome(String param1, String param2, String param3, String xmlParam);
}
