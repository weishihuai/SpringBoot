package com.wsh.repository;

import com.wsh.entity.DemoInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wsh on 2017/12/6.
 *
 * @version 1.0
 */
public interface DemoInfoRepository extends JpaRepository<DemoInfo,Long>{
}
