package com.project.ad.sender;

import com.project.ad.mysql.dto.MySqlRowData;

/**
 * @Description:
 * @Author: ChengChuanQiang
 * @Date: 2019/5/21 23:00
 */
public interface ISender {

    /**
     * @param rowData
     */
    void sender(MySqlRowData rowData);
}
